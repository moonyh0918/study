package exam1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class inputstreamEx {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		FileInputStream fils = new FileInputStream("src/exam1/helloworld");
		Scanner scan = new Scanner(fils);
		
		String printcode = scan.nextLine();
		
		System.out.print(printcode);
		
	}

}
