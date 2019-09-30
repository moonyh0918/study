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
		
		URI webRUI = null;	//try전에 webURI를 선언 후 초기화 시켜줘야 아래에서 사용가능
		try {
			webRUI = new URI(temp);	//URI에 String을 넣어 주는 작업이라 예외처리를 해줘야 동작함
		} catch (URISyntaxException e1) {	
			//URISyntaxException : 문자열을 URI로 파싱할수 없을떄 예외처리를 발생시키는 클래스
			//URISyntaxExceprion : "URI구문예외"라는 뜻
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NullPointerException e2)
		{
			System.exit(0);	//WebURI값에 NULL이 들어가잇다면 시스템을 종료
		}

		try {
			Desktop.getDesktop().browse(webRUI);	//Desktop클래스는 데스크톱기능과 상호작용을 가능하게함
			//Desktop.getDesktop() : 데스크탑의 desktop인스턴스를 가져오는기능으로 이것을 사용하여 현재 데스크탑의 기본 브라우저를 실행시키거나, 파일을 조작가능
		}catch(IOException e)
		{
			System.out.println("hello world");
			e.printStackTrace();	//에러메세지를 띄워줌
		}
	}

}
