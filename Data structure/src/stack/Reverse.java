package stack;

import java.util.Stack;

public class Reverse {
	
	private Stack<Character> stack = new Stack();
	
	public Reverse() {
		
	}
	
	public void reverse(String word) {
		Stack<Character> tmp = new Stack();
		for(int i = 0; i <= word.length(); i++) {
			stack.push(word.charAt(i));
			System.out.println(stack);
			tmp.push(stack.pop());
			System.out.println(tmp);
		}
		
	}
	
}

	
