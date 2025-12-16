# Linked List Implementation

This project provides a Java-based implementation of a **Singly Linked List**, a dynamic data structure where elements (nodes) are connected via pointers. It demonstrates essential Linked List operations including node addition, retrieval, and traversal.

## Overview

A Linked List is a sequential data structure where nodes contain data and reference the next node in the sequence. This project focuses on implementing and working with singly linked lists, showcasing fundamental operations and structures.

### Features

- **Node Addition**:
  - Adds nodes to the end of the Linked List dynamically.
  - Links nodes via the `next` pointer.
- **Node Retrieval**:
  - Retrieves data from a specific index.
  - Handles edge cases such as out-of-bound indices.
- **Traversal**:
  - Iterates through the Linked List and prints all stored values.

### File Breakdown

- **`LinkedList.java`**:
  - Implements the core operations for adding, retrieving, and traversing nodes.
- **`Node.java`**:
  - Represents individual list elements with `info` (data) and `next` (pointer).

### Example Usage

#### Add Nodes to the Linked List:
```java
Linked_List myLinkedList = new Linked_List();
for (int i = 0; i < 10; i++) {
    myLinkedList.addNode(new Node((i + 1) * 10));
}
```

#### Print All Nodes:
```text
10
20
30
...
100
```

#### Retrieve Specific Node:
```java
Node tempNode = myLinkedList.getNodeAt(5);
System.out.println("5th Node: " + tempNode.info);
```
```text
5th Node: 60
```

### Skills Demonstrated

- **Dynamic Memory Management**:
  - Efficient handling of sequential data with dynamic node addition.
- **Pointer Manipulation**:
  - Linking nodes via `next` to form a sequence.
- **Error Handling**:
  - Validating indices during node retrieval.

### How to Run

1. Ensure Java is installed on your system.
2. Compile the files:
   ```bash
   javac LinkedList.java Node.java
   ```
3. Run the program:
   ```bash
   java LinkedList
   ```

### Future Extensions

- Implement removeNode functionality for dynamic node deletion.
- Extend functionality to support doubly linked list and circular linked list variants.

---

This project provides a hands-on introduction to one of the most fundamental data structures in computer science.
