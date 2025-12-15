# Array Stack Implementation

This project provides an implementation of a stack data structure using arrays in Java. It demonstrates the core functionalities of a stack and adheres to an interface-based design for modularity.

## Overview

A stack is a Last-In-First-Out (LIFO) data structure that allows elements to be added and removed in a specific order. This implementation focuses on an array-based approach to provide efficient and organized stack operations.

### Features

- **Fixed Capacity**: The stack has a maximum size of 10 elements (although this can be changed within the code in Stack.java by setting CAPACITY to whatever you want).
- **Core Stack Operations**:
  - `push` - Add an element to the top of the stack.
  - `pop` - Remove the top element from the stack.
  - `top` - Retrieve the value of the top element without removing it.
- **Validation Methods**:
  - `isEmpty` - Check if the stack is empty.
  - `isFull` - Check if the stack is full.
- **Error Handling**:
  - Prevents pushing into a full stack or popping from an empty stack.

### File Breakdown

- **`Main.java`**: Contains the driver code to interact with the stack through user prompts.
- **`Stack.java`**: Implements the core stack operations and validation methods.
- **`StackInterface.java`**: Defines the contract (interface) for stack operations.

### Example Usage

After running `Main.java`, you can interact with the stack via the terminal by choosing any of the available operations:
```text
Choose a function: push / pop / top / isEmpty / isFull / DONE: isEmpty
true

Choose a function: push / pop / top / isEmpty / isFull / DONE: push
Enter a number to add to the stack: 5
Current top is: 5
```

### Skills Demonstrated

- **Object-Oriented Programming**:
  - Encapsulation: The `Stack` class keeps internal data secure and accessible only via defined methods.
  - Interfaces: `StackInterface` promotes modularity and flexibility in future implementations.
- **Error Handling**:
  - Edge cases are managed smoothly with validation methods like `isEmpty` and `isFull`.
- **Data Structures Concepts**:
  - Understand and implement a LIFO data structure using arrays.

### How to Run

1. Ensure Java is installed on your system.
2. Compile the files:
   ```bash
   javac Main.java
   ```
3. Run the program:
   ```bash
   java Main
   ```
4. Interact with the stack via terminal prompts.

---

This project is a simple yet effective introduction to array-based data structures and practical Java programming concepts.
