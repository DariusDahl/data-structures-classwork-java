# Array Bounded Queue Implementation

This project provides a Java-based implementation of an **Array Bounded Queue**, a fixed-capacity FIFO (First-In-First-Out) data structure. It demonstrates essential queue operations, exception handling, and dynamic array manipulation.

## Overview

A queue is a FIFO data structure where elements are added to the rear and removed from the front. This implementation focuses on managing a queue with a bounded size using arrays.

### Features

- **Enqueue Operation**:
  - Adds elements to the rear of the queue.
  - Ensures that the queue does not exceed its maximum size.

- **Dequeue Operation**:
  - Removes elements from the front of the queue.
  - Handles underflow conditions when attempting to dequeue from an empty queue.

- **Validation Methods**:
  - `isEmpty`: Checks if the queue is empty.
  - `isFull`: Checks if the queue is full.

- **Capacity Management**:
  - Fixed size queue with default capacity set to 100 elements (can be adjusted dynamically).

### File Breakdown

- **`ArrayBoundedQueue.java`**:
  - Implements the queue operations and validation methods.
- **`QueueInterface.java`**:
  - Defines the core methods for queue manipulation.
- **`QueueOverflowException.java`**:
  - Exception class that handles overflow conditions.
- **`QueueUnderflowException.java`**:
  - Exception class that handles underflow conditions.
- **`Main.java`**:
  - Provides a simple interactive console program to test enqueue, dequeue, and validation methods.

### Example Usage

#### Enqueue and Dequeue:
```text
Enter a command: (enqueue, dequeue, isEmpty, isFull, quit)
enqueue
Enter an element to enqueue: 5
Enter a command: (enqueue, dequeue, isEmpty, isFull, quit)
dequeue
Dequeued element: 5
```

#### Validation:
```text
Enter a command: (enqueue, dequeue, isEmpty, isFull, quit)
isEmpty
Is the queue empty? true
isFull
Is the queue full? false
```

### Skills Demonstrated

- **Array Management**:
  - Circular array manipulation to manage queue indices (`front` and `rear`).
- **Exception Handling**:
  - Custom implementation of overflow and underflow exceptions.
- **Interactive Programming**:
  - Console-based user interaction to simulate queue usage.

### How to Run

1. Ensure Java is installed on your system.
2. Compile the files:
   ```bash
   javac ArrayBoundedQueue.java QueueOverflowException.java QueueUnderflowException.java Main.java
   ```
3. Run the program:
   ```bash
   java Main
   ```
4. Interact with the queue via the terminal.

### Future Extensions

- Implement a dynamic resizing mechanism for the queue.
- Add support for priority queues.

---

This project provides hands-on experience with queue structures and emphasizes exception handling and modular programming principles.
