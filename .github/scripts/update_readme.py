import os
import re

ROOT_DIR = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
README_PATH = os.path.join(ROOT_DIR, "README.md")
TOPICS_DIR = os.path.join(ROOT_DIR, "Topics")

# Regex to find links in the README
PROBLEM_REGEX = re.compile(r"\|\s*\[(.*?)\]\((Topics/[^/]+/[^/]+)\)\s*\|\s*(.*?)\s*\|")

def main():
    if not os.path.exists(README_PATH):
        print("README.md not found.")
        return

    with open(README_PATH, "r", encoding="utf-8") as f:
        content = f.read()

    # Learn existing problem names and difficulties from README
    known_problems = {}
    for match in PROBLEM_REGEX.finditer(content):
        display_name = match.group(1).strip()
        rel_path = match.group(2).strip().replace('\\', '/')
        difficulty = match.group(3).strip()
        known_problems[rel_path] = (display_name, difficulty)

    topics = {}
    
    if os.path.exists(TOPICS_DIR):
        for category in sorted(os.listdir(TOPICS_DIR)):
            cat_path = os.path.join(TOPICS_DIR, category)
            if not os.path.isdir(cat_path): continue
            
            topics[category] = []
            for problem_folder in sorted(os.listdir(cat_path)):
                prob_path = os.path.join(cat_path, problem_folder)
                if not os.path.isdir(prob_path): continue
                
                rel_path = f"Topics/{category}/{problem_folder}"
                
                if rel_path in known_problems:
                    display_name, difficulty = known_problems[rel_path]
                else:
                    display_name = problem_folder
                    difficulty = "Medium" 
                    prob_readme = os.path.join(prob_path, "README.md")
                    if os.path.exists(prob_readme):
                        with open(prob_readme, "r", encoding="utf-8") as pf:
                            p_content = pf.read()
                            diff_match = re.search(r"<h3>Difficulty:\s*(.*?)</h3>", p_content, re.IGNORECASE)
                            if diff_match: difficulty = diff_match.group(1).strip()
                
                topics[category].append((display_name, rel_path, difficulty))

    # Calculate total unique problems
    unique_problems = set()
    for cat, problems in topics.items():
        for prob in problems:
            unique_problems.add(prob[1].split('/')[-1])
    total_count = len(unique_problems)

    # Rebuild README
    new_readme = []
    new_readme.append('<div align="center">')
    # Sleek Animated Typing SVG
    new_readme.append('  <a href="https://git.io/typing-svg"><img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=500&size=24&pause=1000&color=2196F3&center=true&vCenter=true&width=435&lines=Data+Structures+%26+Algorithms;Solving+LeetCode+Problems;Java+Solutions" alt="Typing SVG" /></a>')
    new_readme.append('  <br/><br/>')
    new_readme.append('  <img src="https://upload.wikimedia.org/wikipedia/commons/1/19/LeetCode_logo_black.png" height="80" alt="LeetCode Logo"/>')
    new_readme.append('  <br/><br/>')
    new_readme.append(f'  <img src="https://img.shields.io/badge/Problems%20Solved-{total_count}-blue?style=for-the-badge&logo=leetcode" alt="Problems Solved">')
    new_readme.append('  <img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png" width="100%">')
    new_readme.append('</div>')
    new_readme.append('<br/>')
    new_readme.append('')

    # Table of Contents (Grid format)
    new_readme.append('## 📑 Table of Contents')
    new_readme.append('<table>')
    
    categories = list(topics.keys())
    cols = 3
    for i in range(0, len(categories), cols):
        new_readme.append('  <tr>')
        for j in range(cols):
            if i + j < len(categories):
                cat = categories[i + j]
                # Creating a clean anchor link target
                anchor = cat.lower().replace(' ', '-')
                new_readme.append(f'    <td><a href="#{anchor}">{cat}</a></td>')
            else:
                new_readme.append('    <td></td>')
        new_readme.append('  </tr>')
    new_readme.append('</table>')
    new_readme.append('<br/>')
    new_readme.append('')

    # Category Tables
    for category, problems in topics.items():
        new_readme.append(f'## {category}')
        new_readme.append('| Problem | Difficulty |')
        new_readme.append('| ------- | ---------- |')
        for display_name, rel_path, difficulty in problems:
            new_readme.append(f'| [{display_name}]({rel_path}) | {difficulty} |')
        new_readme.append('')

    with open(README_PATH, "w", encoding="utf-8") as f:
        f.write("\n".join(new_readme))
    
    print(f"Successfully generated LIVE README with {total_count} unique problems!")

if __name__ == "__main__":
    main()
