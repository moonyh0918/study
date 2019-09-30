package wordbook;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.TextArea;

import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;

public class WordbookFrame extends JFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordbookFrame frame = new WordbookFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WordbookFrame() {
		 DefaultListModel model = new DefaultListModel<String>();
		 
		setTitle("wordbook");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 0;
		getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setModel(new DefaultListModel<String>() {
			String[] values = new String[] {"hello", "world"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridwidth = 4;
		gbc_list.insets = new Insets(0, 0, 0, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 1;
		getContentPane().add(list, gbc_list);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = textField.getText();
				model.addElement(textField.getText());

			}
		});
	}

}
