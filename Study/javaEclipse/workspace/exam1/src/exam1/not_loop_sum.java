package exam1;

import java.util.Scanner;

public class not_loop_sum{
	
	public static void main(String[] args){
		int starttemp = 0 , endtemp = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� ������ ���� ���մϴ�.");
		
		System.out.println("���� ���� �Է�");
		starttemp = sc.nextInt();
		System.out.println("�� ���� �Է�");
		endtemp =sc.nextInt();
		
		
		if(starttemp > 0)
		{
			if((starttemp% 2 == 0 && endtemp%2 ==0)||(starttemp% 2 != 0 && endtemp%2 !=0))
				//sum = temp + temp *(temp/2-1)+temp/2;
				sum = starttemp*endtemp - starttemp * starttemp + starttemp 
				+ ((endtemp-starttemp)/2)*(endtemp-starttemp+1);	
			else
				//sum = temp + temp *(temp/2);
				sum = starttemp*endtemp - starttemp * starttemp + starttemp 
					+ ((endtemp-starttemp)/2)*(endtemp-starttemp+1)+(endtemp-starttemp+1)/2;
		}
		
		else
		{
			System.out.print("���� ������ �ƴմϴ�.");
		}
		
		System.out.println("���  : ");
		System.out.print(sum);
		
		
	}
	
	
	
	

}
