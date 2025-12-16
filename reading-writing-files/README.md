# Generate Customer Emails

This project demonstrates file I/O operations in Java by reading customer data from a file and generating personalized email messages for each customer based on a template.

## Overview

The program: 
1. Reads customer data from an input file (`customers.txt`).
2. Parses each line to extract customer ID, name, reward points, and last purchase date.
3. Reads an email template (`email_template.txt`) with placeholder values.
4. Replaces placeholders with actual customer data.
5. Generates individual email files for each customer with a specific naming convention.

This project highlights file reading, string manipulation, and automated content generation. 

## Features

- **File Input Processing**:
  - Reads tab-separated customer data from `customers.txt`.
  - Parses customer ID, name, points, and last purchase date. 

- **Template-Based Email Generation**:
  - Uses `email_template.txt` with placeholders (`<<CustID>>`, `<<Name>>`, `<<Points>>`, `<<ExpiryDate>>`).
  - Dynamically replaces placeholders with customer-specific information.

- **Expiry Date Calculation**:
  - Automatically calculates the expiry date by adding one year to the last purchase date.

- **Automated File Creation**:
  - Generates individual email files with naming format: `Email01_6621.txt`, `Email02_9900.txt`, etc.

## File Breakdown

- **`customers.txt`**: Input file containing customer data (ID, name, points, last purchase date).
- **`email_template.txt`**: Email template with placeholder values to be replaced.
- **`GenerateEmails.java`**: Main program that processes customer data and generates email files.
- **`Customer` class**: Encapsulates customer data with getters and setters for ID, name, points, and expiry date.

## Example Input Files

### `customers.txt`
```text
6621	Manuel	74	11-1-2022
9900	Zola	2523	05-10-2022
4534	King	529	10-24-2022
...
6098	Dean	1589	06-11-2022
6299	Manuel	1533	09-20-2022
4033	Kourtney	1397	05-4-2022
```

### `email_template.txt`
```text
Customer ID: <<CustID>>
Dear <<Name>>,

As of today, you have <<Points>> reward points. Use them online or at a store near you before they expire on <<ExpiryDate>>. 

Thank you for being a loyal customer.
Store Manager
```

## Example Output

### `Email01_6621.txt`
```text
Customer ID: 6621
Dear Manuel,

As of today, you have 74 reward points. Use them online or at a store near you before they expire on 11-01-2023.

Thank you for being a loyal customer.
Store Manager
```

### `Email02_9900.txt`
```text
Customer ID: 9900
Dear Zola,

As of today, you have 2523 reward points. Use them online or at a store near you before they expire on 05-10-2023.

Thank you for being a loyal customer.
Store Manager
```

## Skills Demonstrated

- **File I/O Operations**:
  - Reading from input files using `Scanner` and `BufferedReader`.
  - Writing to output files using `FileWriter`.

- **String Manipulation**: 
  - Parsing tab-separated values. 
  - Replacing template placeholders with dynamic data.

- **Date Processing**:
  - Calculating expiry dates by adding one year to the last purchase date.

- **Object-Oriented Design**:
  - Encapsulating customer data in a `Customer` class with getters and setters.

## How to Run

1. Ensure Java is installed on your system. 
2. Place `customers.txt` and `email_template.txt` in the same directory as the Java file.
3. Compile the file:
   ```bash
   javac GenerateEmails.java
   ```
4. Run the program:
   ```bash
   java GenerateEmails
   ```
5. Check the directory for generated email files (`Email01_6621.txt`, `Email02_9900.txt`, etc.).

## Insights

This project demonstrates:
1.  Practical applications of file I/O for automating business tasks.
2. Template-based content generation for personalized communications.
3. Object-oriented programming principles for managing structured data. 

---

This project provides foundational knowledge in file handling and automated report generation, essential skills for real-world applications.
