package sunbeam;
import java.util.*;
public class ParenthesisBalancing {

	public static boolean isBalanced(String expr) {
		Stack<Character> s = new Stack<Character>();
		String open = "({[", close = ")]}";
		//1. traverse expression from left to right
		for(int i = 0; i < expr.length(); i++) {
			char sym = expr.charAt(i);
			//2. if opening ( is found, push on stack
			if(open.indexOf(sym) != -1)
				s.push(sym);
			//3. if closing ) is found, 
			else if(close.indexOf(sym) != -1) {
				// if stack is empty (some opening is less)
				if(s.empty())
					return false;
				// pop one from stack
				char pop = s.pop();
				// compare if they are matching. if yes, continue.
				if(close.indexOf(sym) != open.indexOf(pop))
					return false;
				// if not matching, return false
			}
		}
		//4. when whole expression is done, if stack is empty, return true else return false.
		return s.isEmpty();
	}
	
	public static void main(String[] args) {
		String infix = "5+9-4*(8-6/2)+1$(7-3)";
	
		boolean balanced = isBalanced(infix);
		System.out.println("Balanced : " + balanced);
	}
}
