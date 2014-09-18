package calculatorProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

//주어진 문자열을 차례대로 없애준다. 없애는 과정을 출력하여라
public class Test2 {
	public static void main(String[] args) {
		String str = "abcdefg";
		char[] str2 = new char[str.length()];
		
		for(int i=0; i<str.length(); i++){
			str2[i] = str.charAt(i);
		}
		
		Stack<Character> list = new Stack<Character>();
		for(int i=0; i<str2.length; i++){
			list.push(str2[i]);
		}
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.pop());
		}
	}
}
