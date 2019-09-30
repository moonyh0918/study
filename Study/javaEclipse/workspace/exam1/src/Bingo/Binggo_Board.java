package Bingo;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Binggo_Board extends JFrame{
	int[] number = new int[9];
	
	JTextField text_Box1 = new JTextField("1");
	JTextField text_Box2 = new JTextField("2");
	JTextField text_Box3 = new JTextField("3");
	JTextField text_Box4 = new JTextField("4");
	JTextField text_Box5 = new JTextField("5");
	JTextField text_Box6 = new JTextField("6");
	JTextField text_Box7 = new JTextField("7");
	JTextField text_Box8 = new JTextField("8");
	JTextField text_Box9 = new JTextField("9");
	
	JButton number_Box1 = new JButton();
	JButton number_Box2 = new JButton();
	JButton number_Box3 = new JButton();
	JButton number_Box4 = new JButton();
	JButton number_Box5 = new JButton();
	JButton number_Box6 = new JButton();
	JButton number_Box7 = new JButton();
	JButton number_Box8= new JButton();
	JButton number_Box9 = new JButton();
	
	public void bingo_frame() {
		
		JButton start_button = new JButton("시작");
		JLabel bingo_info = new JLabel("1-9중에 중복 없이 입력해주세요");	
		//텍스트 필드와 버튼
		
		setTitle("bingo");
		setLayout(new GridBagLayout());
		
		GridBagConstraints gbc1 = new GridBagConstraints();
		Panel empty1 = new Panel();
		Panel empty2 = new Panel();
		Panel empty3 = new Panel();	//빈공간용 판넬
		
		gbc1.weightx = 0.05;
		
		gbc1.gridx = 0;
		gbc1.gridy = 0;
        gbc1.gridwidth = 3;
        gbc1.gridheight = 1;
        add(empty1,gbc1);
       
        gbc1.gridx = 0;
		gbc1.gridy = 0;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 4;
        add(empty3,gbc1);
        
        gbc1.gridx = 4;
		gbc1.gridy = 0;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 4;
        add(empty2,gbc1);
        
        
       
        /////////////////////////////위와 양옆 여백
        
        gbc1.weightx = 0.3;
		gbc1.weighty = 0.4;
		
		gbc1.fill = GridBagConstraints.BOTH;
		
		gbc1.gridx = 1;
		gbc1.gridy = 1;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        text_Box1.setHorizontalAlignment(text_Box1.CENTER);	//텍스트의 위치를 어느 위치에서 시작하는지 설정(center)
        add(text_Box1,gbc1);
        
        gbc1.gridx = 2;
		gbc1.gridy = 1;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        text_Box2.setHorizontalAlignment(text_Box2.CENTER);
        add(text_Box2,gbc1);
        
        gbc1.gridx = 3;
		gbc1.gridy = 1;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        text_Box3.setHorizontalAlignment(text_Box3.CENTER);
        add(text_Box3,gbc1);
        
        gbc1.gridx = 1;
		gbc1.gridy = 2;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        text_Box4.setHorizontalAlignment(text_Box4.CENTER);
        add(text_Box4,gbc1);
        
        gbc1.gridx = 2;
		gbc1.gridy = 2;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        text_Box5.setHorizontalAlignment(text_Box5.CENTER);
        add(text_Box5,gbc1);
        
        gbc1.gridx = 3;
		gbc1.gridy = 2;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        text_Box6.setHorizontalAlignment(text_Box6.CENTER);
        add(text_Box6,gbc1);
        
        gbc1.gridx = 1;
		gbc1.gridy = 3;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        text_Box7.setHorizontalAlignment(text_Box7.CENTER);
        add(text_Box7,gbc1);
        
        gbc1.gridx = 2;
		gbc1.gridy = 3;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        text_Box8.setHorizontalAlignment(text_Box8.CENTER);
        add(text_Box8,gbc1);
        
        gbc1.gridx = 3;
		gbc1.gridy = 3;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        text_Box9.setHorizontalAlignment(text_Box9.CENTER);
        add(text_Box9,gbc1);
        
        
        
        
        gbc1.weightx = 0.1;
		gbc1.weighty = 0.01;
        
        gbc1.fill= GridBagConstraints.HORIZONTAL;
		gbc1.ipady=0;
		gbc1.insets=new Insets(10,0,0,0);
		gbc1.gridx=1;
		gbc1.gridwidth=3;
		gbc1.gridy=4;
        add(bingo_info,gbc1);
        
        gbc1.weightx = 0.01;
		gbc1.weighty = 0.01;
		
		gbc1.fill= GridBagConstraints.HORIZONTAL;
		gbc1.ipady=0;	//컴포넌트간의 높이나 넓이를 맞추기위한 빈공간 삽입수치
		gbc1.insets=new Insets(10,0,0,0);
		gbc1.gridx=4;	//해당 컴포넌트가 위치한 격자무늬 번호
		gbc1.gridwidth=1;	//해당 컴포넌트가 차지할 격자무늬 행수
		gbc1.gridy=5;
        add(start_button,gbc1);
        

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,600);
        setVisible(true);
        setLocationRelativeTo(null);
        this.setResizable(false);

        start_button.addActionListener(new Listener());
        
	}
	
	class Listener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(e.getActionCommand());
			
			number[0]=Integer.parseInt(text_Box1.getText());
			number[1]=Integer.parseInt(text_Box2.getText());
			number[2]=Integer.parseInt(text_Box3.getText());
			number[3]=Integer.parseInt(text_Box4.getText());
			number[4]=Integer.parseInt(text_Box5.getText());
			number[5]=Integer.parseInt(text_Box6.getText());
			number[6]=Integer.parseInt(text_Box7.getText());
			number[7]=Integer.parseInt(text_Box8.getText());
			number[8]=Integer.parseInt(text_Box9.getText());
			
		
				if(check_num(number)) {
					Bingo_in_game next_game = new Bingo_in_game();
					removeAll();
					setVisible(false);
					next_game.start_bingo(number);
				}
					
			
		}
		
	}
	
	
	public boolean check_num(int[] number) {	//숫자 검사
		for(int i=0; i<number.length;i++)
		{
			for(int j=i+1;j<number.length;j++) {
				if(number[i]>9)
				{
					System.out.println("9보다 큽니다.");
					return false;
				}
				else if(number[i]<1)
				{
					System.out.println("1보다 작습니다.");
					return false;
				}
				else if(number[i]==number[j])
				{
					System.out.println("중복된 숫자가 있습니다.");
					return false;
				}
			}
		}
		return true;
	}
	
	
}
