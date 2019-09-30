import java.util.Scanner;

public class Array_parseint_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String[] st_array = new String[3];
		
		
		System.out.println("사칙연산을 입력해주세요");
		st_array[0] = sc.next();
		st_array[1] = sc.next();
		st_array[2] = sc.next();
				
		int num1 = Integer.parseInt(st_array[0]);
		char op = st_array[1].charAt(0);
		int num2 = Integer.parseInt(st_array[2]);
		
		int result = 0;
		
		switch (op) {
		
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 + num2;
			break;
		case '*':
			result = num1 + num2;
			break;
		case '/':
			result = num1 + num2;
			break;
			
		}
		
		System.out.println("결과 : " + result);
		

	}

}
