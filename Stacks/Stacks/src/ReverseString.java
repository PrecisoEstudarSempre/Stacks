import java.util.Scanner;

class ReverseString {
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		String sourceString = reverseString.getSourceString();					//recupero a string fornecida pelo usuário
		char[] charArray = sourceString.toCharArray();							//transformo a string para um array de char
		Stack stack = new Stack(sourceString.length());							//crio a pilha do mesmo tamanho que a string

		for(int i=0;i<charArray.length;i++){
			try{
				stack.push(charArray[i]);										//empilho as letras na pilha
			} catch (FullStackException e) {
				e.printStackTrace();											//caso algum erro aconteça exibo a pilha de restreio de exceção e aborto o programa.
				System.exit(1);
			}
		}

		try{
			System.out.println("Topo: " + stack.peek());						//exibo o valor do topo da pilha
		} catch (EmptyStackException e) {
			e.printStackTrace();												//caso algum erro aconteça exibo a pilha de restreio de exceção e aborto o programa.
			System.exit(1);
		}
		
		System.out.print("String reversa: ");
		while(!stack.isEmpty()){
			try{				
				System.out.print(stack.pop());									//desempilho as letras da pilha e vou exibindo os valores.
			} catch (EmptyStackException e) {
				e.printStackTrace();											//caso algum erro aconteça exibo a pilha de restreio de exceção e aborto o programa.
				System.exit(1);
			}
		}
	}

	public String getSourceString(){
		Scanner input = new Scanner(System.in);									//crio uma referência para leitura de dados vindo pelo console.
		System.out.print("Informe a string: ");
		return input.nextLine();												//recupero o que foi digitado e retorno
	}
}