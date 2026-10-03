import os
import re

ROOT_DIR = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
README_PATH = os.path.join(ROOT_DIR, "README.md")
TOPICS_DIR = os.path.join(ROOT_DIR, "Topics")

# Regex to find links in the README: | [0001 - TwoSum](Topics/Array/TwoSum) | Easy |
PROBLEM_REGEX = re.compile(r"\|\s*\[(.*?)\]\((Topics/[^/]+/[^/]+)\)\s*\|\s*(.*?)\s*\|")

# Cool Emojis for categories to make it feel alive!
CATEGORY_EMOJIS = {
    "Array": "🧱", "BackTracking": "🔙", "Backtracking": "🔙", "BinarySearch": "🔍",
    "BitManipulation": "0️⃣", "DynamicProgramming": "⚡", "Greedy": "🤑",
    "HashTable": "🗄️", "LinkedList": "🔗", "Math": "🧮",
    "SlidingWindow": "🪟", "Sorting": "🔄", "Stack": "🥞",
    "String": "🧵", "Tree": "🌲", "TwoPointers": "✌️"
}

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
    all_problems = [] # For recently solved tracking
    
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
                # Store modification time to find "Recently Solved"
                mtime = os.path.getmtime(prob_path)
                all_problems.append((mtime, display_name, rel_path, difficulty))

    # Calculate total unique problems
    unique_problems = set()
    for cat, problems in topics.items():
        for prob in problems:
            unique_problems.add(prob[1].split('/')[-1])
    total_count = len(unique_problems)

    # Rebuild README
    new_readme = []
    new_readme.append('<div align="center">')
    # Awesome Hacker GIF Banner
    new_readme.append('  <img src="https://raw.githubusercontent.com/abhisheknaiidu/abhisheknaiidu/master/code.gif" width="100%" alt="Coding Animation"/>')
    new_readme.append('  <br/><br/>')
    new_readme.append('  <img src="https://upload.wikimedia.org/wikipedia/commons/1/19/LeetCode_logo_black.png" height="80" alt="LeetCode Logo"/>')
    new_readme.append('  <br/><br/>')
    new_readme.append(f'  <img src="https://img.shields.io/badge/Problems%20Solved-{total_count}-blue?style=for-the-badge&logo=leetcode" alt="Problems Solved">')
    new_readme.append('  <img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png" width="100%">')
    new_readme.append('</div>')
    new_readme.append('<br/>')
    
    # 🔥 Recently Solved Section
    new_readme.append('## 🔥 Recently Solved')
    new_readme.append('Here are the latest problems I have tackled:')
    new_readme.append('')
    new_readme.append('| Problem | Difficulty |')
    new_readme.append('| ------- | ---------- |')
    # Sort all problems by modified time (descending) and take top 3
    recent = sorted(all_problems, key=lambda x: x[0], reverse=True)[:3]
    for _, disp, rel, diff in recent:
        new_readme.append(f'| [{disp}]({rel}) | {diff} |')
    new_readme.append('')

    # Table of Contents
    new_readme.append('## 📑 Table of Contents')
    for category in topics.keys():
        anchor = category.lower().replace(' ', '-')
        emoji = CATEGORY_EMOJIS.get(category, "🔹")
        new_readme.append(f'- [{emoji} {category}](#{anchor})')
    new_readme.append('')

    # Category Tables with Emojis
    for category, problems in topics.items():
        emoji = CATEGORY_EMOJIS.get(category, "🔹")
        new_readme.append(f'## {emoji} {category}')
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
