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

	JLabel next_number = new JLabel("������ ���� : ");
	JLabel player_pickJLabel = new JLabel();

	//
	public void start_bingo(int[] number) {

		int temp = 0, locationtemp = 0;

		pick_number = number;

		for (int i = 0; i < number.length; i++)
			System.out.println(pick_number[i]);

		System.out.print("������");
		for (int i = 0; i < rand_number.length; i++) {
			locationtemp = (int) (Math.random() * 8);
			temp = rand_number[locationtemp];
			rand_number[locationtemp] = rand_number[i];
			rand_number[i] = temp;
		}

		for (int i = 0; i < rand_number.length; i++) {
			System.out.println(rand_number[i]);
		}

		JButton next_button = new JButton("����");

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
		Panel empty3 = new Panel(); // ������� �ǳ�

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

		///////////////////////////// ���� �翷 ����

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
		gbc1.ipady = 0; // ������Ʈ���� ���̳� ���̸� ���߱����� ����� ���Լ�ġ
		gbc1.insets = new Insets(10, 0, 0, 0);
		gbc1.gridx = 4; // �ش� ������Ʈ�� ��ġ�� ���ڹ��� ��ȣ
		gbc1.gridwidth = 1; // �ش� ������Ʈ�� ������ ���ڹ��� ���
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

	class number_Listener implements ActionListener { // ���� ��ư ���� ��

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			player_number = e.getActionCommand();// �� �׼ǰ� ���õ� ��� ���ڿ��� ��ȯ
			next_number.setText("������ ���� : " + player_number);
			// �̹� ������ �������� �˻��ϴ� �Լ��߰�

		}

	}

	class Listener implements ActionListener { // �����ư������
		// ���� : �÷��̾ �����Ѽ��� Ȯ��-�÷��̾ ������ ���� �����ǿ� ǥ�� - ���� Ȯ�� - randnumber�� ���� ������ -
		// randnumber���� �����ǿ��� ǥ��

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			if (player_number == null) {
				JOptionPane.showMessageDialog(null, "���ڸ� ������ �ּ���", "����", JOptionPane.ERROR_MESSAGE);
			} else {
				coloring_board(Integer.valueOf(player_number)); // �÷��̾ ������ ���� ��ĥ
				delete_number(Integer.valueOf(player_number));// �÷��̾ ������ ���� randnumber���� �����ֱ�
				player_number = null;

				coloring_board_computer();

				bingo_check(pick_number);
				print_bingo_message(bingo_check(pick_number));
				
				System.out.println(bingo_check(rand_number));
			}

		}

	}
	
	
	public void coloring_board_computer() {	//��ǻ�Ͱ� ���� ���� ��ĥ
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

	public void coloring_board(int number) { // ���� ���� ��ĥ�ϱ�

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

	public int bingo_check(int[] pick_number) { // ���� �÷��̾� ����� üũ
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

	public void delete_number(int number) { // ������ ������ ���� ����
		for (int i = 0; i < rand_number.length; i++) {
			if (rand_number[i] == number) {
				rand_number[i] = 0;
			}
		}
		
		
	}

	public void print_bingo_message(int bingo) {	//�����ư ������ �޽��� ���
		if (bingo > 2) {
			JOptionPane.showMessageDialog(null, bingo + "���� �Դϴ�. \n ���ϵ帳�ϴ�.", "����", JOptionPane.ERROR_MESSAGE);
			System.exit(2);

		} else {
			JOptionPane.showMessageDialog(null,"��ǻ�ʹ� "+rand_number[location]+"�����޽��ϴ�. \n"+ +bingo + "���� �Դϴ�.", "����", JOptionPane.WARNING_MESSAGE);
			rand_number[location]=0;
			location++;
		
		}
		


	}

}
