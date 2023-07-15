/*
LeetCode 1 : **Two Sum**
Difficulty : Easy

**Problem Statement**
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Solution Approach: HashMap
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for(int i = 0; i < nums.length ; i++){
            if(map.containsKey(( target -nums[i] ))){
                ans[0] = map.get(target -nums[i]);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i] , i);
        }
        return ans;
    }
}