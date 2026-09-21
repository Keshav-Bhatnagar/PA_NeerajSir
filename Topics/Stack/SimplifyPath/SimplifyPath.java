class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();

        path = path.replaceAll("/+", "/");
        String[] s = path.split("/");

        for (String ss : s) {

            if (ss.equals("..")) {
                if (!st.isEmpty())
                    st.pop();
            }
            else if (ss.equals("") || ss.equals(".")) {
                continue;
            }
            else {
                st.push(ss);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (String dir : st) {
            sb.append("/").append(dir);
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }
}