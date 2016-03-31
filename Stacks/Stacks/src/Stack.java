class Stack {
	
	private char[] items;
	private int counter;
	private int size;

	public Stack(int size){
		items = new char[size];
		this.size = size;
		counter = 0;
	}

	public void push(char item) throws FullStackException{
		if(isFull()){
			throw new FullStackException();
		}
		items[counter] = item;
		counter++;
	}

	public char pop() throws EmptyStackException{
		if(isEmpty()){
			throw new EmptyStackException("Can't remove. Stack is empty.");
		}	
		counter--;
		char item = items[counter];		
		return item;
	}

	public boolean isEmpty(){
		return counter == 0;
	}

	public boolean isFull(){
		return counter == size;
	}

	public char peek() throws EmptyStackException{
		if(isEmpty()){
			throw new EmptyStackException("Can't remove. Stack is empty.");
		}
		return items[counter];
	}
}