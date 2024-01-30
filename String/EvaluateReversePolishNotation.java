class Solution {
    public int evalRPN(String[] tokens) {
        int[] stack = new int[(tokens.length + 1) / 2];
        int top = 0;
        for (String token : tokens) {
            char curr = token.charAt(0);
            if (curr == '+') {
                int b = stack[--top];
                int a = stack[--top];
                stack[top++] = a + b;
            } else if (curr == '-' && token.length() == 1) {
                int b = stack[--top];
                int a = stack[--top];
                stack[top++] = a - b;
            } else if (curr == '*') {
                int b = stack[--top];
                int a = stack[--top];
                stack[top++] = a * b;
            } else if (curr == '/') {
                int b = stack[--top];
                int a = stack[--top];
                stack[top++] = a / b;
            } else {
                stack[top++] = Integer.parseInt(token);
            }
        }
        return stack[0];
    }
}
