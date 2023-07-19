LeetCode <> : **Count Negative Numbers in a Sorted Matrix**
Difficulty : Easy

**Problem Statement**
Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

Example 1:
Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.

Example 2:
Input: grid = [[3,2],[1,0]]
Output: 0

Solution Approach: 
*/

class Solution {
    public int countNegatives(int[][] grid) {
        int negative = 0;
        int j = 0;
        int columns = grid[0].length;
        int i = grid.length - 1;
        while(i >= 0 && j < columns){
                if(grid[i][j] < 0){
                    i--;
                    negative += columns - j;
                    j = 0;
                }
                else j++;
            
        }
        return negative;
    }
}