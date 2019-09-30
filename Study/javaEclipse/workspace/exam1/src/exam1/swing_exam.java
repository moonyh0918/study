package exam1;
import javax.swing.*;


public class swing_exam {
	
	public static void main(String[] arg) {
	
	int answer = (int)(Math.random()*100)+1;	//1-100사이의 임의 값 
	int input = 0;	//사용자 입력받는 공간
	String temp ="";	//사용자 입력을 저장할 임시공간
	int count = 0;	//시도 횟수 카운팅
	
	
	do {
		count++;	//휫수 카운팅
		temp = JOptionPane.showInputDialog("1-100사이의 숫자를 입력하세요."
				+"끝내려면 -1을 입력하세요.");
		
		if(temp==null || temp.equals("-1")) break;	//null값이거나 -1일경우 반복문을 벗어남
		
		System.out.println("입력값 : " + temp);
		
		input = Integer.parseInt(temp);
		
		if(answer <input) {
			System.out.println("더 작은 수를 입력하세요");
		}else if(answer >input)
		{
			System.out.println("더 큰 수를 입력하세요");
		}
		else
		{
			System.out.println("맞췃습니다.");
			System.out.println("시도횟수는 " + count + "번 입니다.");
			break;
		}
		
	}while(true);
	}
}
