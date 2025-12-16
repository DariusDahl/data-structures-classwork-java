/**
 *  COSC2100 - Fall Semester 2023
 *  Assignment #1 - GenerateEmails.java
 *  This program will read in a file containing customer data and generate an email for each customer.
 *  @author - Darius Dahl
 */

package Homework_1;

// Import java.io and java.util for functionality.
import java.io.*;
import java.util.*;

public class GenerateEmails {

    public static void main(String[] args) throws IOException {

        /*
         * Create a File object for the input file.The input file being the given
         * "customers.txt" file that was provided.
         */
        File inputFile = new File("customers.txt");

        /*
         * Create a Scanner object to read the input file. The input file being the
         * given "customers.txt" file that was provided.
         */
        Scanner scanner = new Scanner(inputFile);

        /*
         * Create an array to store the customer data. Drawback from this method is that
         * there is a limit to the number of customers that can be stored.
         */
        Customer[] customers = new Customer[100];

        // Set the customerCount variable to 0 so that the count will start at 01.
        int customerCount = 0;

        /*
         * Start a while loop to read through the input file. This code will read
         * through the input file
         * line by line and execute until there are no line left. Each line contains the
         * customer ID,
         * name, points balance, and expiry date. This code will split the line into
         * tokens and store
         * the tokens in an array of Strings.
         */
        while (scanner.hasNextLine()) {
            // Read a line from the file.
            String line = scanner.nextLine();

            // Split the line into the customer ID, name, points balance, and expiry date.
            String[] tokens = line.split("\t");

            /*
             * This code will create a new Customer object for each customer. This code
             * calls on the Customer class to get and set the customer ID, name, points
             * balance, and
             * expiry date. This code reads in the information from the "customer.txt" file.
             * This code
             * then writes the email to each customer using the for loop.
             */
            Customer customer = new Customer();
            customer.setCustID(tokens[0]);
            customer.setName(tokens[1]);
            customer.setPoints(Integer.parseInt(tokens[2]));
            customer.setExpiryDate(tokens[3]);

            // Add the customer to the array.
            customers[customerCount] = customer;
            customerCount++;
        }

        /*
         * Create a FileWriter object for each customer. This code will write the email
         * to each
         * customer using the for loop.
         */
        for (int i = 0; i < customerCount; i++) {
            int emailNumber = i + 1;
            String emailNum = String.format("%02d", emailNumber);
            File outputFile = new File("Email" + emailNum + "_" + customers[i].getCustID() + ".txt");
            FileReader fileReader = new FileReader("template.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            String emailContent = "";
            while ((line = bufferedReader.readLine()) != null) {
                emailContent += line + "\n";

                // Replace the <<placeholders>> from the "template.txt" with the customer data using the 
                // getter functions.
                emailContent = emailContent.replaceAll("<<CustID>>", customers[i].getCustID());
                emailContent = emailContent.replaceAll("<<Name>>", customers[i].getName());
                emailContent = emailContent.replaceAll("<<Points>>", String.valueOf(customers[i].getPoints()));
                emailContent = emailContent.replaceAll("<<ExpiryDate>>", customers[i].getExpiryDate());
            }

            //	Write the email to the file. This is using the email template from the "template.txt" file.
            FileWriter fileWriter = new FileWriter(outputFile);
            fileWriter.write(emailContent);
            fileWriter.close();
            /*
             * Close the file writer. This is a necessary step in writing the file,
             * otherwise the file
             * will not save for each customer every time the while loop iterates.
             */
        }

    }
}

/*
 * The customer class uses getters and setters to store the customer data for
 * each individual customer.
 * The customer class uses variables custID, name, points, and expiryDate to
 * store the customer ID, name,
 * points balance, and expiry date from each customer from the "customers.txt"
 * file.
 */
class Customer {

	// Instance variables for CustID, name, points, and expiryDate.
    public String custID;
    public String name;
    public int points;
    public String expiryDate;

    // Returns the value of the custID variable for each customer object.
    public String getCustID() {
        return custID;
    }

    // Sets the value of the custID variable for each customer object.
    public void setCustID(String custID) {
        this.custID = custID;
    }

    // Returns the value of the name variable for each customer object.
    public String getName() {
        return name;
    }

    // Sets the value of the name variable for each customer object.
    public void setName(String name) {
        this.name = name;
    }

    // Returns the value of the points variable for each customer obbject.
    public int getPoints() {
        return points;
    }

    // Sets the value of the points variable for each customer object.
    public void setPoints(int points) {
        this.points = points;
    }

    /*
     * Take the date of last purchase from the "customers.txt" file and convert it
     * to a string array. The program then adds one to the year counter and converts
     * the variable to an expiration date for the points, while keeping the original
     * formatting.
     */
    public String getExpiryDate() {
        String thisExpiryDate = expiryDate;
        String[] parts = thisExpiryDate.split("-");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]) + 1;
        String newExpiryDate = String.format("%02d-%02d-%04d", day, month, year);
        return newExpiryDate;
    }

    // Sets the value of the points variable for each customer object.
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
