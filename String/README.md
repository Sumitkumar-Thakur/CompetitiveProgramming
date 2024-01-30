# Evaluate Reverse Polish Notation

## Problem Statement

You are given an array of strings `tokens` that represents an arithmetic expression in Reverse Polish Notation.

Evaluate the expression. Return an integer that represents the value of the expression.

**Note:**
- The valid operators are '+', '-', '*', and '/'.
- Each operand may be an integer or another expression.
- The division between two integers always truncates toward zero.
- There will not be any division by zero.
- The input represents a valid arithmetic expression in reverse polish notation.
- The answer and all the intermediate calculations can be represented in a 32-bit integer.

## Example

### Example 1:

**Input:**
`tokens = ["2","1","+","3","*"]`

**Output:**
`9`

**Explanation:**
((2 + 1) * 3) = 9

### Example 2:

**Input:**
`tokens = ["4","13","5","/","+"]`

**Output:**
`6`

**Explanation:**
(4 + (13 / 5)) = 6

### Example 3:

**Input:**
`tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]`

**Output:**
`22`

**Explanation:**
((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22

## Constraints

- 1 ≤ tokens.length ≤ 10^4
- tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].

## Approach

1. **Initialize Stack:**
   - Create an integer array `stack` to simulate a stack to store intermediate results during the evaluation.
   - Initialize `top` to keep track of the top of the stack.

    ```java
    int[] stack = new int[(tokens.length + 1) / 2];
    int top = 0;
    ```

2. **Iterate Through Tokens:**
   - Loop through each token in the `tokens` array.

    ```java
    for (String token : tokens) {
        // ...
    }
    ```

3. **Check if Token is an Operator or Operand:**
   - Extract the first character of the token to determine if it is an operator.
   - If it is an operator, perform the corresponding operation on the top two elements of the stack and update the stack.
   - If it is an operand, parse the integer from the token and push it onto the stack.

    ```java
    char curr = token.charAt(0);
    if (curr == '+') {
        // Addition operation
    } else if (curr == '-' && token.length() == 1) {
        // Subtraction operation
    } else if (curr == '*') {
        // Multiplication operation
    } else if (curr == '/') {
        // Division operation
    } else {
        // Operand, parse integer and push onto stack
    }
    ```

4. **Return Result:**
   - After iterating through all tokens, the final result is present at the top of the stack.

    ```java
    return stack[0];
    ```
