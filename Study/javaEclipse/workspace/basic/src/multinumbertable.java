import java.awt.*;

public class multinumbertable{
	
	public static void main(String[] args){
		
		int seednumber,cyclenumber;	//�������� ���� ���� 2�� ����
		
		for(seednumber=1;seednumber<10;seednumber++)	//1��~9�ܽ���
		{
			for(cyclenumber=1;cyclenumber<10;cyclenumber++)	//1-9���� ������
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