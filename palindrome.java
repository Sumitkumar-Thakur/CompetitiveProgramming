LeetCode 9 : **Palindrome Number**
Difficulty : Easy

**Problem Statement**

Given an integer x, return true if x is a 
palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Solution Approach: Math
*/

class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0 , n = x;
        if (x < 0  )
            return false;
            while(n > 0){
                sum = sum*10 + n%10;
                n = n/10;
            }
    return (x == sum);
      }
}