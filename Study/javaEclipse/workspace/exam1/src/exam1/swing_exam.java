package exam1;
import javax.swing.*;


public class swing_exam {
	
	public static void main(String[] arg) {
	
	int answer = (int)(Math.random()*100)+1;	//1-100������ ���� �� 
	int input = 0;	//����� �Է¹޴� ����
	String temp ="";	//����� �Է��� ������ �ӽð���
	int count = 0;	//�õ� Ƚ�� ī����
	
	
	do {
		count++;	//�ܼ� ī����
		temp = JOptionPane.showInputDialog("1-100������ ���ڸ� �Է��ϼ���."
				+"�������� -1�� �Է��ϼ���.");
		
		if(temp==null || temp.equals("-1")) break;	//null���̰ų� -1�ϰ�� �ݺ����� ���
		
		System.out.println("�Է°� : " + temp);
		
		input = Integer.parseInt(temp);
		
		if(answer <input) {
			System.out.println("�� ���� ���� �Է��ϼ���");
		}else if(answer >input)
		{
			System.out.println("�� ū ���� �Է��ϼ���");
		}
		else
		{
			System.out.println("�­����ϴ�.");
			System.out.println("�õ�Ƚ���� " + count + "�� �Դϴ�.");
			break;
		}
		
	}while(true);
	}
}
