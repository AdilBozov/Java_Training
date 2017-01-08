package _StacksAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> indexesStack = new Stack<Integer>();
		
		String mathExpression = "1 + (4 * (2 + 3) ^ 40 * (20 + 1) ^ 64)";
		char[] arraysExpression =mathExpression.toCharArray();
		
		System.out.println(Arrays.toString(arraysExpression));
		
	for (int i = 0; i <arraysExpression.length; i++) {
	 if(arraysExpression[i] == '('){
		 indexesStack.push(i);
	 }else if (arraysExpression[i] == ')') {
		
		System.out.println(Arrays.copyOfRange(arraysExpression, indexesStack.pop(), i + 1));
	}
	}

	}

}
