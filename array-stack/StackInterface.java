package Stack;

//Data type integer --> int
//Array type container (elements will be held in an array)
public interface StackInterface {
		
	//Transformers
	public boolean push(int val);	
	public boolean pop();
	
	//Observers
	public int top();	
	public boolean isEmpty();
	public boolean isFull();
	
}
