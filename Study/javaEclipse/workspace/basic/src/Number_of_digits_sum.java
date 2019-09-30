
public class Number_of_digits_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 42345;
		int sum = 0;
		
		while(num/10>0)
		{
			sum+=num%10;
			num=num/10;
			
		}
		sum+=num;
		
		System.out.println(sum);
	}

}
