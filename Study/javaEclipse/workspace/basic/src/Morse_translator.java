import java.util.Scanner;

public class Morse_translator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String temp = new String();
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		String morse_table[] = new String[] {"`－","－```","－`－`","－``","`","``－`","````","``","`－－－",
				"－`－","－`－","`－``","－－","－`","－－－","`－－`","－－`－","`－`","```",
				"－","``－","```－","`－－","－``－","－`－－","－－``"};
		
		System.out.println("모스부호로 바꿀 영문자를 입력하세여");
		temp = sc.nextLine();
		
		temp=temp.toUpperCase();
		
		for(int i =0 ; i<temp.length();i++) {
			result+=morse_table[temp.charAt(i)-'A'];	
			//temp의 i 번째 잇는 문자의 int값 을 반환한뒤 대문자 'A'의 int값 을 빼준다면 알파벳 몇 번째 숫자인지 판단할수 있음 
		}
		
		System.out.println("morse:"+ result);
	}

}
