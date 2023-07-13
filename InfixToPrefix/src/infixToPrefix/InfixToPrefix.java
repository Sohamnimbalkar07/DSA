package infixToPrefix;
import java.util.Stack;

public class InfixToPrefix {

	public static int pre(char operator)
	{
		switch (operator) {
		case '$': return 3;
		case '*': return 2;
		case '/': return 2;
		case '%': return 2;
		case '+': return 1;
		case '-': return 1;
		}
		return 0;
	}
	
public static String infixToPrefix(String infix)
{
		Stack<Character> s = new Stack<Character>();
		StringBuilder Pre = new StringBuilder();
		
		for(int i = infix.length()-1;i>=0;i--)
		{   char sym = infix.charAt(i);
			if(Character.isDigit(sym))
			{
				Pre.append(sym);
			}
			else if(sym == ')')
			{
					s.push(sym);
			}
			else if(sym == '(')
			{   while(s.peek() != ')')
			{
				Pre.append(s.pop());
			}
			s.pop();
			}
			
			else
			{
				if(!s.isEmpty() && pre(s.peek()) > pre(sym))
				{
					Pre.append(s.pop());
				}
				s.push(sym);
			}
			
			
		}
		while(!s.isEmpty())
		{
			Pre.append(s.pop());
		}
		
		return Pre.reverse().toString();
}

	public static void main(String[] args) {
		String infix = "5+9-4*(8-6/2)+1$(7-3)";
		String Prefix = infixToPrefix(infix);   //// "+-+59*4-8/62$1-73"
		System.out.println("Prefix :" + Prefix);

	}
}
