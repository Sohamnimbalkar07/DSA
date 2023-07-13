package infixToPostfix;
import java.util.Stack;

public class InfixToPostfix {

	public static int pri(char operator)
	{
		switch(operator)
		{

		case '$': return 3;
		case '*': return 2;
		case '/': return 2;
		case '%': return 2;
		case '+': return 1;
		case '-': return 1;
		}
		return 0;
		
	}
	
	public static String infixToPostfix(String infix) {
		Stack<Character> s = new Stack<Character>();
		StringBuilder Post= new StringBuilder();
		for(int i = 0;i < infix.length();i++)
		{   char sym = infix.charAt(i);
			if(Character.isDigit(sym))
			{   
				Post.append(sym);
			}
			else if(sym == '(')
			{
				s.push(sym);
			}
			
			else if(sym == ')')
			{   while (s.peek() != '(')
			{
				Post.append(s.pop());
			}
			s.pop();
			}
			
			else
			{   
				while(!s.isEmpty() && pri(s.peek()) >= pri(sym))
				{
					Post.append(s.pop());
				}
				s.push(sym);
				
			}
		}
		
		while(!s.isEmpty())
		{
			Post.append(s.pop());
		}
		return Post.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String infix = "5+9-4*(8-6/2)+1$(7-3)";
		
		//Postfix = 59+4862/-*-173-$+
		
		String postfix = infixToPostfix(infix);
		System.out.println("Postfix : " + postfix);
	}
}
