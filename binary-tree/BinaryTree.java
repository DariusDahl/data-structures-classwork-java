package BinaryTree;

import java.util.*;

public class BinaryTree {

    public static boolean findBoolean(ArrayList<Integer> A, int p, int N, int t) {
        // Base case
        if (p >= N) {
            return false;
        }
        // t is what you are checking for. If t exists in the ArrayList(binary tree),
        // then return true
        if (A.get(p) == t) {
            return true;
        }
        boolean r1 = findBoolean(A, 2 * p + 1, N, t);
        boolean r2 = findBoolean(A, 2 * p + 2, N, t);
        return r1 || r2;
    }

    public static int sumInt(ArrayList<Integer> A, int p, int N) {
        // Base case
        if (p >= N) {
            return 0;
        }
        int result = A.get(p);
        int leftSum = sumInt(A, 2 * p + 1, N);
        int rightSum = sumInt(A, 2 * p + 2, N);
        // Should return the sum
        return result + leftSum + rightSum;
    }

    // Find the order of a binary tree (Pre-Order / In-Order / Post-Order)
    public static void order(int p, int N, String orderType) {
        // Base case
        if (p >= N) {
            return;
        }
        // Pre-Order has you print before calling the recursive functions
        if (orderType.equals("Pre-Order")) {
            System.out.println(p);
        }
        order(2 * p + 1, N, orderType);
        // In-Order has you print in between calling the recursive functions
        if (orderType.equals("In-Order")) {
            System.out.println(p);
        }
        order(2 * p + 2, N, orderType);
        // Post-Order has you print after calling the recursive functions
        if (orderType.equals("Post-Order")) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        int p = 0;
        int NOrder = 7;

        Scanner input = new Scanner(System.in);
        System.out.println("Order Types: Pre-Order / In-Order / Post-Order");
        // Pre-Order: 0, 1, 3, 4, 2, 5, 6
        // In-Order: 3, 1, 4, 0, 5, 2, 6
        // Post-Order: 3, 4, 1, 5, 6, 2, 0

        System.out.print("Enter the order type that you want: ");
        String orderType = input.nextLine();

        // Finds the order of a binary tree in either pre-order, in-order, or post-order
        // Check comments in order() method to see which will call on which ordering
        // type
        order(p, NOrder, orderType);
        System.out.println();

        // Define some variables used for findBoolean() method
        Random random = new Random();
        int NArrayListSize = random.nextInt(11) + 20;
        ArrayList<Integer> A = new ArrayList<Integer>(NArrayListSize);

        // Generate random numbers in the ArrayList
        for (int i = 0; i < NArrayListSize; i++) {
            A.add(random.nextInt(100) + 1);
        }

        System.out.print("Enter the integer that you want to check for in the ArrayList: ");
        int t = input.nextInt();

        // found checks if an element you want exists in the pre-defined ArrayList, if
        // it does, it returns true
        boolean found = findBoolean(A, p, NArrayListSize, t);
        System.out.println("Is " + t + " in ArrayList?: " + found);
        System.out.println();
        System.out.println("Original ArrayList: " + A + "\n");

        // Sort the ArrayList using a for-loop and if-statements.
        for (int i = 0; i < A.size() - 1; i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if (A.get(i) > A.get(j)) {
                    int temp = A.get(i);
                    A.set(i, A.get(j));
                    A.set(j, temp);
                }
            }
        }
        System.out.println("Sorted ArrayList: " + A + "\n");
        int sum = sumInt(A, p, NArrayListSize);
        System.out.println("The sum of the elements in the ArrayList is: " + sum);
    }
}
