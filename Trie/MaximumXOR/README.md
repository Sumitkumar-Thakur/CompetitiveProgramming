# Maximum XOR of Two Numbers in an Array

## Problem Statement

Given an integer array nums, return the maximum result of nums[i] XOR nums[j], where 0 <= i <= j < n.

## Examples

Example 1:

Input: nums = [3,10,5,25,2,8]
Output: 28
Explanation: The maximum result is 5 XOR 25 = 28.

Example 2:

Input: nums = [14,70,53,83,49,91,36,80,92,51,66,70]
Output: 127

## Constraints

- 1 <= nums.length <= 2 * 10^5
- 0 <= nums[i] <= 2^31 - 1

## Approach

The code uses a Trie (Prefix Tree) data structure to efficiently search for the maximum XOR value. Here's a breakdown of the approach:

1. **Trie Implementation:**
   - The Trie is implemented using two classes - `Node` and `Trie`.
   - `Node` represents a node in the Trie, containing an array of two links (0 and 1) and a flag.
   - `Trie` contains the root node and provides methods for inserting elements into the Trie and finding the maximum XOR.

2. **Inserting Elements into Trie:**
   - The `insertElement` method in the `Trie` class is used to insert an integer into the Trie.
   - For each number, it traverses the Trie from the root to the leaf, creating new nodes if necessary. The Trie essentially stores the binary representation of each number.

3. **Finding Maximum XOR:**
   - The `getMax` method in the `Trie` class is used to find the maximum XOR for a given number.
   - It traverses the Trie from the most significant bit (MSB) to the least significant bit (LSB) of the given number.
   - At each bit position, it checks if there is an opposite bit in the Trie. If yes, it updates the result by setting the corresponding bit to 1 and continues the traversal; otherwise, it follows the path with the same bit.

4. **Main Function:**
   - The `Solution` class contains the `findMaximumXOR` function, which utilizes the Trie.
   - It initializes a Trie and inserts all numbers from the array into it.
   - Then, for each number in the array, it calls `getMax` on the Trie, updating the maximum XOR value if a greater value is found.

5. **Result:**
   - The final result is the maximum XOR value found during the traversal.

### Time Complexity:
- The time complexity of inserting all elements into the Trie is O(N * 2 + N * 2), where N is the number of elements in the array, and 2 is the average length of the binary representation of the elements.
- The time complexity of finding the maximum XOR for each element is O(N * 2).

### Space Complexity:
- The space complexity is O(N * 2) for storing the Trie.

This approach is not only efficiently but makes up for industry standards, so definetly follow this approach in your interview.
