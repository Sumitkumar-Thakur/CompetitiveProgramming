# Implement Trie (Prefix Tree)

## Problem Statement

A trie (pronounced as "try") or prefix tree is a tree data structure used to efficiently store and retrieve keys in a dataset of strings. There are various applications of this data structure, such as autocomplete and spellchecker.

### Implement the Trie class:

- `Trie()`: Initializes the trie object.
- `void insert(String word)`: Inserts the string word into the trie.
- `boolean search(String word)`: Returns true if the string word is in the trie (i.e., was inserted before), and false otherwise.
- `boolean startsWith(String prefix)`: Returns true if there is a previously inserted string word that has the prefix prefix, and false otherwise.

## Example

```java
Trie trie = new Trie();
trie.insert("apple");
trie.search("apple");   // return True
trie.search("app");     // return False
trie.startsWith("app"); // return True
trie.insert("app");
trie.search("app");     // return True

## Constraints

-1 <= word.length, prefix.length <= 2000
-word and prefix consist only of lowercase English letters.
-At most 3 * 10^4 calls in total will be made to insert, search, and startsWith.

## Approach

### Trie Data Structure
-A trie is a tree-like structure where each node represents a character in a word.
-The root node represents an empty string, and each child node corresponds to a unique character.
-A boolean flag in each node denotes the end of a word.
### Insert Operation
-To insert a word, traverse the trie character by character.
-Create nodes for characters that are not present, updating the traversal pointer accordingly.
-Set the end-of-word flag for the final character.
### Search Operation
-Traverse the trie character by character.
-If any character is not found, the word is not present.
-Check the end-of-word flag for the last character.
### StartsWith Operation
-Similar to the search operation but doesn't require the end-of-word check.
-It returns true if the prefix is found, indicating the presence of words starting with the given prefix.
### Time Complexity
-The time complexity for each operation is O(L), where L is the length of the word or prefix.
-### Space Complexity
-The space complexity is O(N * M), where N is the number of words, and M is the average length of the words.
