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

		}

		System.out.println("morse:"+ result);
	}

}
