package calculatorProject;

import java.util.Arrays;


public class Test {
	public static void main(String[] args) {
		String s1 = "3 * 5 + 9 / 3";
		calculator(s1);
	}
	
	public static void calculator(String s1){
		String regax = "";
				String [] str = new String[s1.length()];
		if(s1.contains(" ")){
			regax = " ";
			str = s1.split(regax,10); 
		}
		
		int result = Integer.parseInt(str[0]);
		//숫자에 연산부호가 있으면 그 연산부호로 실제 계산을 하면 된다.
		
		for(int i=0; i<str.length; i++){
			if(str[i].contains("*")){
				 result  *= Integer.parseInt(str[i+1]);
			}else if(str[i].contains("-")){
				result -= Integer.parseInt(str[i+1]);
			}else if(str[i].contains("+")){
				result += Integer.parseInt(str[i+1]);
			}else if(str[i].contains("/")){
				result /= Integer.parseInt(str[i+1]);
			}
		}
		System.out.println(result);
	}
}
