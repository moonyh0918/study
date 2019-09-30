import java.util.Scanner;

public class naer_multiples_of_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("정수 입력");
		num = sc.nextInt();
		
		if(num%5==0) {
			if((num/5)%2==0) {
				System.out.println(num);
			}
			else {
				System.out.println((num/10)*10 + " or " + (num/10+1)*10);
			}
		}
		else if(num%10>5)
			System.out.println((num/10+1)*10);
		else if(num%10<5)
			System.out.println(num/10*10);

	}

}
