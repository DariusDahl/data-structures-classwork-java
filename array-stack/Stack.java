package Stack;

public class Stack implements StackInterface {	
	protected final int CAPACITY = 10;
	private final int ERROR = -999999999;
	
	//Containers
	//Data type = int
	int[] elements;
	
	//Keep track of top index
	int topIndex;
	
	public Stack() {
		elements = new int[CAPACITY];
		topIndex = -1;
		//-1 = empty
	}
		
	@Override
	public boolean push(int val) {
		if (isFull()) {
			System.out.println("ERROR: Stack is full!");
			return false;
		}
		else {
			topIndex++;
			elements[topIndex] = val;
			return true;
		}
	}

	@Override
	public boolean pop() {
		if (isEmpty()) {
			System.out.println("ERROR: Stack is empty!");
			return false;
		}
		else {
			topIndex--;
			return true;
		}
	}

	@Override
	public int top() {
		if (isEmpty()) {
			System.out.println("ERROR: Stack is empty!");
			return ERROR;
		}
		else {
			return elements[topIndex];
		}
	}

	@Override
	public boolean isEmpty() {
		if (topIndex < 0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isFull() {
		if (topIndex >= CAPACITY - 1) {
			return true;
		}
		else {
			return false;
		}
	}

}
