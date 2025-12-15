package Stack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Stack myStack = new Stack();
		
//		//Initially no values in stack
//		System.out.println("Current top is: " + myStack.top());
		
		Scanner function = new Scanner(System.in);
		System.out.print("Choose a function: push / pop / top / isEmpty / isFull / DONE: ");
		String choiceFunction = function.next();
		
        while (!choiceFunction.equals("DONE")) {

            switch (choiceFunction) {
                case "push":
                    Scanner num = new Scanner(System.in);
                    System.out.print("Enter a number to add to the stack: ");
                    int choiceNum = num.nextInt();
                    if (myStack.isFull() != true) {
                        myStack.push(choiceNum);
                        System.out.println("Current top is: " + myStack.top());
                    } else {
                        System.out.println("ERROR: Stack is full");
                        break;
                    }
                    break;
                case "pop":
                    if (myStack.isEmpty() != true) {
                        myStack.pop();
                        System.out.println("Current top is: " + myStack.top());
                    } else {
                        System.out.println("ERROR: Stack is empty");
                        break;
                    }
                    break;
                case "top":
                    if (myStack.isEmpty() != true) {
                        System.out.println("Current top is: " + myStack.top());
                    } else {
                        System.out.println("ERROR: Stack is empty");
                        break;
                    }
                    break;
                case "isEmpty":
                    System.out.println(myStack.isEmpty());
                    break;
                case "isFull":
                    System.out.println(myStack.isFull());
                    break;
                default:
                    System.out.println("Invalid function");
                    break;
            }

            System.out.print("Choose a function: push / pop / top / isEmpty / isFull / DONE: ");
            choiceFunction = function.next();
        }

        function.close();
    }
		
}

		//add values to stack
		//myStack.push(10);
		//myStack.push(20);
		
		//System.out.println("Current top is: " + myStack.top());
		
		//remove value from stack
		//myStack.pop();
		//System.out.println("Current top is: " + myStack.top());

//		for (int i = 0; i < myStack.CAPACITY - 1; i++) {
//			myStack.push(i);
//			System.out.println("Current top is: " + myStack.top());
//		}

