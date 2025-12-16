# Binary Search Tree Implementation

This project implements a **Binary Search Tree (BST)** in Java with standard operations and several advanced methods for analyzing tree properties.   It demonstrates tree traversals, node counting, balance checking, and structural analysis.

## Overview

The program: 
1. Creates a Binary Search Tree with generic type support. 
2. Implements standard BST operations: add, remove, search, and traversals.
3. Provides advanced analysis methods: 
   - Print all leaf nodes
   - Count interior nodes
   - Find the root's successor
   - Check if the tree is a full binary tree
   - Check if the tree is balanced

This project showcases recursive algorithms, tree traversal techniques, and structural tree analysis. 

## Features

### Standard BST Operations
- **`add(T element)`**: Inserts an element while maintaining BST property.  
- **`remove(T element)`**: Removes an element from the tree.
- **`contains(T element)`**: Checks if an element exists in the tree. 
- **`get(T element)`**:  Retrieves an element from the tree.
- **`size()`**: Returns the total number of nodes. 
- **`isEmpty()`**: Checks if the tree is empty. 

### Tree Traversals
- **Preorder**: Root → Left → Right
- **Inorder**: Left → Root → Right (sorted order for BST)
- **Postorder**: Left → Right → Root

### Advanced Analysis Methods
- **`printLeafNodes()`**: Prints all leaf nodes (nodes with no children).
- **`countInterior()`**: Counts all interior nodes (nodes with at least one child).
- **`getRootSuccessor()`**: Finds and prints the in-order successor of the root. 
- **`isFullBinaryTree()`**: Checks if every node has either 0 or 2 children. 
- **`isBalanced()`**: Checks if the height difference between left and right subtrees is ≤ 1 for all nodes.

## File Breakdown

- **`BSTDriver.java`** (or `Main.java`): Main driver program to test BST functionality. 
- **`BST.java`**: Implements the Binary Search Tree with all standard and advanced operations.
- **`BSTNode.java`**: Represents a node in the BST with left and right child references.
- **`BSTInterface.java`**: Interface defining the contract for BST operations.  

## Example Output

```text
Print leaf nodes:
1 3 6 

Number of interior nodes:
3

Root successor: 
Successor of root: 5

Full binary tree(true/false):
false

Balanced binary tree(true/false):
true
```

### Tree Structure (for the example)
```
      4
     / \
    2   5
   / \   \
  1   3   6
```

**Analysis of the tree:**
- **Leaf nodes**: 1, 3, 6 (nodes with no children)
- **Interior nodes**: 4, 2, 5 (3 nodes with at least one child)
- **Root successor**: 5 (smallest value in right subtree)
- **Full binary tree**: false (node 5 has only a right child, not 0 or 2 children)
- **Balanced**: true (height difference ≤ 1 for all nodes)

## Skills Demonstrated

- **Binary Search Tree Implementation**: 
  - Maintaining BST property during insertions and deletions. 
  - Efficient searching using binary search principles. 

- **Recursive Algorithms**: 
  - Tree traversals (preorder, inorder, postorder).
  - Counting nodes and analyzing tree structure.

- **Tree Analysis**:
  - Identifying leaf and interior nodes.
  - Finding successor nodes using in-order traversal logic.
  - Checking structural properties (full, balanced).

- **Generic Programming**:
  - Using Java generics with `Comparable` constraint for type flexibility. 

- **Algorithm Design**:
  - Height-based balance checking.
  - Recursive structural validation.

## How to Run

1. Ensure Java is installed on your system. 
2.  Compile the files:
   ```bash
   javac BSTDriver.java BST. java BSTNode.java BSTInterface.java
   ```
3. Run the program:
   ```bash
   java BSTDriver
   ```

## Insights

This project demonstrates:
1. The efficiency of Binary Search Trees for ordered data operations (O(log n) average case).
2. How recursive algorithms naturally map to tree structures.
3. The importance of balance in maintaining BST performance.
4. Practical methods for analyzing tree properties and structure. 

### Key Concepts

- **Full Binary Tree**: Every node has either 0 or 2 children. 
- **Balanced Tree**: For every node, the height difference between left and right subtrees is at most 1.
- **Leaf Node**: A node with no children. 
- **Interior Node**: A node with at least one child. 
- **Successor**: The next node in sorted order (smallest node in right subtree).

---

This project provides comprehensive experience with Binary Search Tree implementation and demonstrates advanced tree analysis techniques essential for understanding data structures. 
