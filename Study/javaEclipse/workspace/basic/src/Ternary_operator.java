import java.util.Scanner;
public class Ternary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("���� �Է�");
		num = sc.nextInt();
		
		System.out.println((num==0)? 0 : (num>0)? "���": "����");
		

	}

}
