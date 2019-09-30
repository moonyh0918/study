package exam1;
import javax.swing.*;


public class swing_exam {
	
	public static void main(String[] arg) {
	
	int answer = (int)(Math.random()*100)+1;	//1-100»çÀÌÀÇ ÀÓÀÇ °ª 
	int input = 0;	//»ç¿ëÀÚ ÀÔ·Â¹Ş´Â °ø°£
	String temp ="";	//»ç¿ëÀÚ ÀÔ·ÂÀ» ÀúÀåÇÒ ÀÓ½Ã°ø°£
	int count = 0;	//½Ãµµ È½¼ö Ä«¿îÆÃ
	
	
	do {
		count++;	//ÈÜ¼ö Ä«¿îÆÃ
		temp = JOptionPane.showInputDialog("1-100»çÀÌÀÇ ¼ıÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä."
				+"³¡³»·Á¸é -1À» ÀÔ·ÂÇÏ¼¼¿ä.");
		
		if(temp==null || temp.equals("-1")) break;	//null°ªÀÌ°Å³ª -1ÀÏ°æ¿ì ¹İº¹¹®À» ¹ş¾î³²
		
		System.out.println("ÀÔ·Â°ª : " + temp);
		
		input = Integer.parseInt(temp);
		
		if(answer <input) {
			System.out.println("´õ ÀÛÀº ¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		}else if(answer >input)
		{
			System.out.println("´õ Å« ¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		}
		else
		{
			System.out.println("¸Â­Ÿ½À´Ï´Ù.");
			System.out.println("½ÃµµÈ½¼ö´Â " + count + "¹ø ÀÔ´Ï´Ù.");
			break;
		}
		
	}while(true);
	}
}
