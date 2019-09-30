package Bingo;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Bingo.Binggo_Board.Listener;
import exam1.swing_exam;

public class Bingo_in_game extends JFrame {
	int location = 0;
	int[] rand_number = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int[] pick_number = new int[9];
	String player_number;

	JButton number_Box1 = new JButton();
	JButton number_Box2 = new JButton();
	JButton number_Box3 = new JButton();
	JButton number_Box4 = new JButton();
	JButton number_Box5 = new JButton();
	JButton number_Box6 = new JButton();
	JButton number_Box7 = new JButton();
	JButton number_Box8 = new JButton();
	JButton number_Box9 = new JButton();

	JLabel next_number = new JLabel("선택한 숫자 : ");
	JLabel player_pickJLabel = new JLabel();

	//
	public void start_bingo(int[] number) {

		int temp = 0, locationtemp = 0;

		pick_number = number;

		for (int i = 0; i < number.length; i++)
			System.out.println(pick_number[i]);

		System.out.print("랜덤값");
		for (int i = 0; i < rand_number.length; i++) {
			locationtemp = (int) (Math.random() * 8);
			temp = rand_number[locationtemp];
			rand_number[locationtemp] = rand_number[i];
			rand_number[i] = temp;
		}

		for (int i = 0; i < rand_number.length; i++) {
			System.out.println(rand_number[i]);
		}

		JButton next_button = new JButton("진행");

		number_Box1.setText(Integer.toString(number[0]));
		number_Box2.setText(Integer.toString(number[1]));
		number_Box3.setText(Integer.toString(number[2]));
		number_Box4.setText(Integer.toString(number[3]));
		number_Box5.setText(Integer.toString(number[4]));
		number_Box6.setText(Integer.toString(number[5]));
		number_Box7.setText(Integer.toString(number[6]));
		number_Box8.setText(Integer.toString(number[7]));
		number_Box9.setText(Integer.toString(number[8]));

		setTitle("bingo");
		setLayout(new GridBagLayout());

		GridBagConstraints gbc1 = new GridBagConstraints();
		Panel empty1 = new Panel();
		Panel empty2 = new Panel();
		Panel empty3 = new Panel(); // 빈공간용 판넬

		gbc1.weightx = 0.05;

		gbc1.gridx = 0;
		gbc1.gridy = 0;
		gbc1.gridwidth = 3;
		gbc1.gridheight = 1;
		add(empty1, gbc1);

		gbc1.gridx = 0;
		gbc1.gridy = 0;
		gbc1.gridwidth = 1;
		gbc1.gridheight = 4;
		add(empty3, gbc1);

		gbc1.gridx = 4;
		gbc1.gridy = 0;
		gbc1.gridwidth = 1;
		gbc1.gridheight = 4;
		add(empty2, gbc1);

		///////////////////////////// 위와 양옆 여백

		gbc1.weightx = 0.3;
		gbc1.weighty = 0.4;

		gbc1.fill = GridBagConstraints.BOTH;

		gbc1.gridx = 1;
		gbc1.gridy = 1;
		gbc1.gridwidth = 1;
		gbc1.gridheight = 1;
		add(number_Box1, gbc1);

		gbc1.gridx = 2;
		gbc1.gridy = 1;
		gbc1.gridwidth = 1;
		gbc1.gridheight = 1;
		add(number_Box2, gbc1);

		gbc1.gridx = 3;
		gbc1.gridy = 1;
		gbc1.gridwidth = 1;
		gbc1.gridheight = 1;
		add(number_Box3, gbc1);

		gbc1.gridx = 1;
		gbc1.gridy = 2;
		gbc1.gridwidth = 1;
		gbc1.gridheight = 1;
		add(number_Box4, gbc1);

		gbc1.gridx = 2;
		gbc1.gridy = 2;
		gbc1.gridwidth = 1;
		gbc1.gridheight = 1;
		add(number_Box5, gbc1);

		gbc1.gridx = 3;
		gbc1.gridy = 2;
		gbc1.gridwidth = 1;
		gbc1.gridheight = 1;
		add(number_Box6, gbc1);

		gbc1.gridx = 1;
		gbc1.gridy = 3;
		gbc1.gridwidth = 1;
		gbc1.gridheight = 1;
		add(number_Box7, gbc1);

		gbc1.gridx = 2;
		gbc1.gridy = 3;
		gbc1.gridwidth = 1;
		gbc1.gridheight = 1;
		add(number_Box8, gbc1);

		gbc1.gridx = 3;
		gbc1.gridy = 3;
		gbc1.gridwidth = 1;
		gbc1.gridheight = 1;
		add(number_Box9, gbc1);

		gbc1.weightx = 0.1;
		gbc1.weighty = 0.01;

		gbc1.fill = GridBagConstraints.HORIZONTAL;
		gbc1.ipady = 0;
		gbc1.insets = new Insets(10, 0, 0, 0);
		gbc1.gridx = 1;
		gbc1.gridwidth = 3;
		gbc1.gridy = 4;
		add(next_number, gbc1);

		gbc1.fill = GridBagConstraints.HORIZONTAL;
		gbc1.ipady = 0;
		gbc1.insets = new Insets(10, 0, 0, 0);
		gbc1.gridx = 1;
		gbc1.gridwidth = 3;
		gbc1.gridy = 5;
		add(player_pickJLabel, gbc1);

		gbc1.weightx = 0.01;
		gbc1.weighty = 0.01;

		gbc1.fill = GridBagConstraints.HORIZONTAL;
		gbc1.ipady = 0; // 컴포넌트간의 높이나 넓이를 맞추기위한 빈공간 삽입수치
		gbc1.insets = new Insets(10, 0, 0, 0);
		gbc1.gridx = 4; // 해당 컴포넌트가 위치한 격자무늬 번호
		gbc1.gridwidth = 1; // 해당 컴포넌트가 차지할 격자무늬 행수
		gbc1.gridy = 5;
		add(next_button, gbc1);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		// this.setResizable(false);

		next_button.addActionListener(new Listener());
		number_Box1.addActionListener(new number_Listener());
		number_Box2.addActionListener(new number_Listener());
		number_Box3.addActionListener(new number_Listener());
		number_Box4.addActionListener(new number_Listener());
		number_Box5.addActionListener(new number_Listener());
		number_Box6.addActionListener(new number_Listener());
		number_Box7.addActionListener(new number_Listener());
		number_Box8.addActionListener(new number_Listener());
		number_Box9.addActionListener(new number_Listener());
	}

	class number_Listener implements ActionListener { // 숫자 버튼 누를 때

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			player_number = e.getActionCommand();// 이 액션과 관련된 명령 문자열을 반환
			next_number.setText("선택한 숫자 : " + player_number);
			// 이미 선택한 숫자인지 검사하는 함수추가

		}

	}

	class Listener implements ActionListener { // 진행버튼누를때
		// 순서 : 플레이어가 선택한숫자 확인-플레이어가 선택한 숫자 빙고판에 표시 - 빙고 확인 - randnumber쪽 숫자 지워줌 -
		// randnumber숫자 빙고판에서 표시

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			if (player_number == null) {
				JOptionPane.showMessageDialog(null, "숫자를 선택해 주세요", "에러", JOptionPane.ERROR_MESSAGE);
			} else {
				coloring_board(Integer.valueOf(player_number)); // 플레이어가 선택한 숫자 색칠
				delete_number(Integer.valueOf(player_number));// 플레이어가 선택한 숫자 randnumber에서 지워주기
				player_number = null;

				coloring_board_computer();

				bingo_check(pick_number);
				print_bingo_message(bingo_check(pick_number));
				
				System.out.println(bingo_check(rand_number));
			}

		}

	}
	
	
	public void coloring_board_computer() {	//컴퓨터가 픽한 숫자 색칠
		if (rand_number[location] == 0) {	
			for(int j=location;j<rand_number.length;j++) {
				if(rand_number[j]==0)
					location+=1;
				else
					break;
			}
			
			coloring_board(rand_number[location]);
		} else {
			coloring_board(rand_number[location]);
		}
	}

	public void coloring_board(int number) { // 맞은 숫자 색칠하기

		for (int i = 0; i < pick_number.length; i++) {
			if (pick_number[i] == number) {
				switch (i) {
				case 0:
					number_Box1.setBackground(Color.red);
					number_Box1.setEnabled(false);
					pick_number[i] = 0;
					break;
				case 1:
					number_Box2.setBackground(Color.red);
					number_Box2.setEnabled(false);
					pick_number[i] = 0;
					break;
				case 2:
					number_Box3.setBackground(Color.red);
					number_Box3.setEnabled(false);
					pick_number[i] = 0;
					break;
				case 3:
					number_Box4.setBackground(Color.red);
					number_Box4.setEnabled(false);
					pick_number[i] = 0;
					break;
				case 4:
					number_Box5.setBackground(Color.red);
					number_Box5.setEnabled(false);
					pick_number[i] = 0;
					break;
				case 5:
					number_Box6.setBackground(Color.red);
					number_Box6.setEnabled(false);
					pick_number[i] = 0;
					break;
				case 6:
					number_Box7.setBackground(Color.red);
					number_Box7.setEnabled(false);
					pick_number[i] = 0;
					break;
				case 7:
					number_Box8.setBackground(Color.red);
					number_Box8.setEnabled(false);
					pick_number[i] = 0;
					break;
				case 8:
					number_Box9.setBackground(Color.red);
					number_Box9.setEnabled(false);
					pick_number[i] = 0;
					break;
				}
			}
		}
		
		
		
		
	}

	public int bingo_check(int[] pick_number) { // 현재 플레이어 빙고수 체크
		int bingo = 0;

		if (pick_number[0] == 0 && pick_number[1] == 0 && pick_number[2] == 0) {
			bingo++;
		}
		if (pick_number[3] == 0 && pick_number[4] == 0 && pick_number[5] == 0) {
			bingo++;
		}
		if (pick_number[6] == 0 && pick_number[7] == 0 && pick_number[8] == 0) {
			bingo++;
		}
		if (pick_number[0] == 0 && pick_number[4] == 0 && pick_number[8] == 0) {
			bingo++;
		}
		if (pick_number[2] == 0 && pick_number[4] == 0 && pick_number[6] == 0) {
			bingo++;
		}
		if (pick_number[0] == 0 && pick_number[3] == 0 && pick_number[6] == 0) {
			bingo++;
		}
		if (pick_number[1] == 0 && pick_number[4] == 0 && pick_number[7] == 0) {
			bingo++;
		}
		if (pick_number[2] == 0 && pick_number[5] == 0 && pick_number[8] == 0) {
			bingo++;
		}
		
		return bingo;

	}

	public void delete_number(int number) { // 유저가 선택한 숫자 제거
		for (int i = 0; i < rand_number.length; i++) {
			if (rand_number[i] == number) {
				rand_number[i] = 0;
			}
		}
		
		
	}

	public void print_bingo_message(int bingo) {	//진행버튼 누를시 메시지 출력
		if (bingo > 2) {
			JOptionPane.showMessageDialog(null, bingo + "빙고 입니다. \n 축하드립니다.", "빙고", JOptionPane.ERROR_MESSAGE);
			System.exit(2);

		} else {
			JOptionPane.showMessageDialog(null,"컴퓨터는 "+rand_number[location]+"선택햇습니다. \n"+ +bingo + "빙고 입니다.", "빙고", JOptionPane.WARNING_MESSAGE);
			rand_number[location]=0;
			location++;
		
		}
		


	}

}
