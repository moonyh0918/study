
public class Unicode_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		for(num = 0 ;num <10000;num++)
		{
			if(num % 20 == 0)
				System.out.println();
			System.out.print((char)num + "(" + num + ") ");
			
		}
	}

}
