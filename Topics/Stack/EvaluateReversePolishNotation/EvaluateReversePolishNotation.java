class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String s : tokens) {

            if (!s.equals("+") && !s.equals("-") &&
                !s.equals("*") && !s.equals("/")) {

                st.push(Integer.parseInt(s));
                continue;
            }

            int a = st.pop();
            int b = st.pop();

            char operand = s.charAt(0);

            int result = help(a, b, operand);

            st.push(result);
        }

        return st.pop();
    }

    public int help(int a, int b, char operand) {
        if (operand == '+') return b + a;
        if (operand == '-') return b - a;
        if (operand == '*') return b * a;
        return b / a;
    }
}
