# Linked Stack Implementation

This project implements a **Linked Stack** data structure in Java with additional functionality to access and remove elements from the bottom of the stack.  It demonstrates how to find the largest element in a stack by iteratively comparing and removing smaller elements.

## Overview

The program: 
1. Prompts the user to specify the number of elements in the stack. 
2. Fills the stack with randomly generated integers (0-99).
3. Compares the top and bottom elements of the stack. 
4. Removes the smaller element (either from the top or bottom).
5. Repeats until only one element remains—the largest element in the original stack.

This project showcases linked list-based stack implementation, custom stack operations, and algorithmic problem-solving. 

## Features

- **Linked Stack Structure**:
  - Implements a stack using linked nodes (`LLNode`).
  - Supports standard stack operations: `push`, `pop`, `top`, `isEmpty`, `isFull`.

- **Extended Stack Operations**:
  - `bottom()`: Returns the bottom-most element of the stack.
  - `popFromBottom()`: Removes the bottom-most element from the stack.
  - `size()`: Returns the number of elements in the stack. 
  - `toString()`: Provides a string representation of the stack contents.

- **Largest Element Finder**:
  - Iteratively compares top and bottom elements.
  - Removes the smaller element until only the largest remains. 

- **Exception Handling**:
  - Custom exceptions for stack overflow (`StackOverflowException`) and underflow (`StackUnderflowException`).

## File Breakdown

- **`Driver.java`**: Main program that creates the stack, fills it with random integers, and finds the largest element.
- **`NewLinkedStack.java`**: Implements the linked stack with extended operations.
- **`LLNode.java`**: Represents a node in the linked list with generic type support.
- **`NewStackInterface.java`**: Interface defining stack operations.
- **`StackOverflowException.java`**: Custom exception for stack overflow conditions.
- **`StackUnderflowException.java`**: Custom exception for stack underflow conditions. 

## Example Output

```text
Enter the number of elements in the stack: 10
Initial stack contents: [34, 87, 80, 24, 13, 15, 66, 11, 87, 29]
Stack contents after removing an element: [34, 87, 80, 24, 13, 15, 66, 11, 87]
Stack contents after removing an element: [87, 80, 24, 13, 15, 66, 11, 87]
Stack contents after removing an element: [80, 24, 13, 15, 66, 11, 87]
Stack contents after removing an element: [24, 13, 15, 66, 11, 87]
Stack contents after removing an element: [13, 15, 66, 11, 87]
Stack contents after removing an element:  [15, 66, 11, 87]
Stack contents after removing an element: [66, 11, 87]
Stack contents after removing an element: [11, 87]
Stack contents after removing an element: [87]
The largest element in the stack is: 87
```

## Skills Demonstrated

- **Linked List Implementation**:
  - Building a stack using linked nodes rather than arrays. 

- **Custom Data Structure Operations**:
  - Implementing `bottom()` and `popFromBottom()` methods not typically found in standard stack implementations.

- **Algorithm Design**:
  - Finding the maximum element through iterative comparison and removal.

- **Exception Handling**:
  - Managing edge cases with custom overflow and underflow exceptions.

- **Generic Programming**:
  - Using Java generics (`<T>`) for type flexibility.

## How to Run

1. Ensure Java is installed on your system.
2. Compile the files:
   ```bash
   javac Driver.java NewLinkedStack.java LLNode.java NewStackInterface. java StackOverflowException. java StackUnderflowException.java
   ```
3. Run the program:
   ```bash
   java Driver
   ```
4. Enter the number of elements when prompted. 

## Insights

This project demonstrates:
1. How linked lists can be used to implement dynamic stack structures without fixed capacity constraints.
2. The versatility of stack operations beyond standard push/pop functionality.
3. An algorithmic approach to finding the maximum element using comparative removal. 

---

This project provides hands-on experience with advanced stack implementations and algorithm design using linked data structures.
