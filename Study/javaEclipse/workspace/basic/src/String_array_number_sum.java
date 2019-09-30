
public class String_array_number_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  str = "12345678910";
		int sum= 0;
		
		for(int i =0; i < str.length() ; i++)
		{
			int temp = str.charAt(i);
			
			if(temp>47 && temp<58)
				sum+=temp-48;
			
			System.out.println(str.charAt(i)+"  int : " + temp);
		}
		
		System.out.println(sum);

	}

}
