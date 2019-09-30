
public class Count_Array_Number {
	public static void main(String[] arg)
	{
		int[] num = {1,2,3,4,1,2,4,3,2,1,2,3};
		int count[] = new int[4];
		
		for(int i =0 ; i < num.length;i++)
		{
			count[num[i]-1]+=1;
			//System.out.println(num[i]);
		}
		
		
		for(int i = 0; i<count.length;i++)
		{
			System.out.println(i+1+"ÀÇ °¹¼ö´Â"+count[i]);
		}
		
	}

}
