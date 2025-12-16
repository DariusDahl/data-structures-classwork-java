# Sort and Merge ArrayLists

This project demonstrates sorting and merging multiple `ArrayLists` in Java.  It uses the **Bubble Sort** algorithm to sort three separate lists and then merges them into a single sorted list.

## Overview

The program:
1. Generates three `ArrayLists` (`A`, `B`, and `C`) with random integer values. 
2. Sorts each `ArrayList` using the Bubble Sort algorithm.
3. Merges the three sorted lists into one combined sorted `ArrayList`.

This project highlights list manipulation, sorting algorithms, and merging techniques. 

## Features

- **Random Data Generation**:
  - Initializes `ArrayLists` with random integers (0-499).
  - Customizable sizes for each list (`P`, `Q`, `R`).

- **Bubble Sort Implementation**:
  - Sorts each `ArrayList` in ascending order using the Bubble Sort algorithm.
  - Simple and effective for small to medium datasets. 

- **Merging Sorted Lists**:
  - Combines three sorted `ArrayLists` into a single sorted list.
  - Uses pointer-based traversal to efficiently merge elements.

## File Breakdown

- **`MergeSortedArrayLists. java`**: Contains the main logic for generating, sorting, and merging the `ArrayLists`.

## Example Output

```text
Before sorting:
A: [256, 378, 310, 4, 418, 330, 105, 191, 266, 373]
B: [460, 111, 283, 39, 377, 172, 217, 326, 416, 352, 21, 150, 281, 203, 390, 233, 131, 66, 148, 315, 345, 353, 44, 408, 29]
C: [486, 11, 211, 113, 261, 361, 487, 384, 404, 333, 282, 103, 139, 158, 474, 43, 309, 89, 269, 480, 488, 282, 229, 255, 233, 351, 44, 340, 13, 57, 345, 451, 485, 404, 211, 443, 79, 99, 367, 210, 313, 406, 85, 260, 291, 178, 177, 247, 3, 479]

After sorting:
A: [4, 105, 191, 256, 266, 310, 330, 373, 378, 418]
B:  [21, 29, 39, 43, 44, 59, 66, 73, 76, 83, 95, 106, 111, 131, 148, 150, 172, 178, 192, 203, 204, 210, 210, 217, 233]
C: [3, 3, 8, 11, 13, 25, 35, 43, 44, 55, 57, 66, 70, 79, 85, 86, 89, 97, 99, 103, 113, 119, 139, 146, 158, 163, 176, 177, 178, 181, 201, 210, 211, 211, 216, 219, 219, 229, 233, 234, 247, 250, 255, 260, 261, 261, 268, 269, 282, 282]

Merged List:
[3, 3, 4, 8, 11, 13, 21, 25, 29, 35, 39, 43, 43, 44, 44, 55, 57, 59, 66, 66, 70, 73, 76, 79, 83, 85, 86, 89, 95, 97, 99, 103, 105, 106, 111, 113, 119, 131, 139, 146, 148, 150, 158, 163, 172, 176, 177, 178, 178, 181, 191, 192, 201, 203, 204, 210, 210, 210, 211, 211, 216, 217, 219, 219, 229, 233, 233, 234, 234, 243, 247, 250, 255, 256, 260, 261, 261, 266, 268, 269, 281, 282, 282, 283, 291, 295, 296, 297, 300, 307, 308, 309, 310, 313, 314, 315, 320, 320, 326, 329, 330, 333, 340, 340, 343, 343, 345, 345, 346, 348, 351, 352, 353, 356, 361, 367, 369, 373, 376, 377, 378, 380, 383, 384, 390, 390, 397, 397, 398, 404, 404, 406, 408, 408, 411, 413, 416, 418, 421, 422, 435, 441, 443, 449, 451, 460, 460, 461, 473, 474, 479, 480, 480, 485, 486, 487, 488, 488, 491, 492]
```

## Skills Demonstrated

- **Sorting Algorithms**: 
  - Implements Bubble Sort to order elements in ascending order. 

- **List Manipulation**: 
  - Generates, sorts, and merges multiple `ArrayLists`.

- **Algorithm Efficiency**: 
  - Demonstrates merging of pre-sorted lists using pointer-based traversal.

## How to Run

1. Ensure Java is installed on your system. 
2. Compile the file:
   ```bash
   javac MergeSortedArrayLists.java
   ```
3. Run the program:
   ```bash
   java MergeSortedArrayLists
   ```

## Insights

This project demonstrates: 
1. The simplicity and effectiveness of Bubble Sort for small datasets. 
2. Efficient merging techniques for combining multiple sorted lists.
3. Practical applications of `ArrayList` manipulation in Java.

---

This project provides foundational knowledge of sorting and merging operations, essential for understanding more complex algorithms.
