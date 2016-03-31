import java.util.Scanner;

class ReverseString {
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();		
		String sourceString = reverseString.getSourceString();
		char[] charArray = sourceString.toCharArray();
		Stack stack = new Stack(sourceString.length());

		for(int i=0;i<charArray.length;i++){
			try{
				stack.push(charArray[i]);
			} catch (FullStackException e) {
				e.printStackTrace();
				System.exit(1);
			}
		}

		System.out.print("String reversa: ");

		while(!stack.isEmpty()){
			try{				
				System.out.print(stack.pop());
			} catch (EmptyStackException e) {
				e.printStackTrace();
				System.exit(1);
			}
		}
	}

	public String getSourceString(){
		Scanner input = new Scanner(System.in);
		System.out.print("Informe a string: ");
		return input.nextLine();
	}
}