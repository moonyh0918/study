package exam1;

import java.util.Scanner;

public class not_loop_sum{
	
	public static void main(String[] args){
		int starttemp = 0 , endtemp = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 숫자 사이의 합을 구합니다.");
		
		System.out.println("시작 정수 입력");
		starttemp = sc.nextInt();
		System.out.println("끝 정수 입력");
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
			System.out.print("양의 정수가 아닙니다.");
		}
		
		System.out.println("결과  : ");
		System.out.print(sum);
		
		
	}
	
	
	
	

}
