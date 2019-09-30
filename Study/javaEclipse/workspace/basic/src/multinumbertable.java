import java.awt.*;

public class multinumbertable{
	
	public static void main(String[] args){
		
		int seednumber,cyclenumber;	//구구단을 위한 숫자 2개 선언
		
		for(seednumber=1;seednumber<10;seednumber++)	//1단~9단시작
		{
			for(cyclenumber=1;cyclenumber<10;cyclenumber++)	//1-9까지 곱해줌
			{
				System.out.print(cyclenumber + "*" + seednumber + "=" + seednumber*cyclenumber );
				if(seednumber*cyclenumber>9)
					System.out.print("    ");
				else
					System.out.print("     ");
			}
			System.out.println();
		}
		
	}
}