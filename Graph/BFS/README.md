# BFS of Graph

## Problem Statement

Given a directed graph. The task is to do Breadth First Traversal of this graph starting from 0.
Note: One can move from node u to node v only if there's an edge from u to v. Find the BFS traversal of the graph starting from the 0th vertex, from left to right according to the input graph. Also, you should only take nodes directly or indirectly connected from Node 0 in consideration.

## Example

### Example 1:

**Input:**
V = 5, E = 4
adj = {{1,2,3},{},{4},{},{}}

**Output:**
0 1 2 3 4

**Explanation:**
0 is connected to 1 , 2 , 3.
2 is connected to 4.
so starting from 0, it will go to 1 then 2
then 3. After this 2 to 4, thus bfs will be
0 1 2 3 4.

### Example 2:

**Input:**
V = 3, E = 2
adj = {{1,2},{},{}}

**Output:**
0 1 2

**Explanation:**
0 is connected to 1 , 2.
so starting from 0, it will go to 1 then 2,
thus bfs will be 0 1 2. 

## Constraints

- 1 ≤ V, E ≤ 10^4

## Approach

The code uses a Queue to perform Breadth-First Search (BFS) starting from node 0. It maintains a boolean array to keep track of visited nodes. The BFS traversal is then returned as an ArrayList.
