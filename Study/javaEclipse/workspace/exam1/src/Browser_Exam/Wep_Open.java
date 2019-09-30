package Browser_Exam;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;


public class Wep_Open {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Browser_Exam_Frame frame = new Browser_Exam_Frame();
		String temp = null;
		
		
		temp = frame.Exame_frame();
		
		URI webRUI = null;	//try���� webURI�� ���� �� �ʱ�ȭ ������� �Ʒ����� ��밡��
		try {
			webRUI = new URI(temp);	//URI�� String�� �־� �ִ� �۾��̶� ����ó���� ����� ������
		} catch (URISyntaxException e1) {	
			//URISyntaxException : ���ڿ��� URI�� �Ľ��Ҽ� ������ ����ó���� �߻���Ű�� Ŭ����
			//URISyntaxExceprion : "URI��������"��� ��
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NullPointerException e2)
		{
			System.exit(0);	//WebURI���� NULL�� ���մٸ� �ý����� ����
		}

		try {
			Desktop.getDesktop().browse(webRUI);	//DesktopŬ������ ����ũ���ɰ� ��ȣ�ۿ��� �����ϰ���
			//Desktop.getDesktop() : ����ũž�� desktop�ν��Ͻ��� �������±������ �̰��� ����Ͽ� ���� ����ũž�� �⺻ �������� �����Ű�ų�, ������ ���۰���
		}catch(IOException e)
		{
			System.out.println("hello world");
			e.printStackTrace();	//�����޼����� �����
		}
	}

}
