class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String t : tokens) {
            if (t.equals("+") || t.equals("-") || 
                t.equals("*") || t.equals("/")) {
                int b = st.pop();   
                int a = st.pop();
                int result = 0;
                switch (t) {
                    case "+": result = a + b; break;
                    case "-": result = a - b; break;
                    case "*": result = a * b; break;
                    case "/": result = a / b; break;
                }
                st.push(result);
            } else {
                st.push(Integer.parseInt(t));
            }
        }
        return st.pop();
    }
}