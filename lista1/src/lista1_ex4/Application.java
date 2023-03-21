package lista1_ex4;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Application extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application frame = new Application();
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
	public Application() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("/");
		btnNewButton_1.setBounds(30, 127, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("x");
		btnNewButton_2.setBounds(30, 172, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.setBounds(30, 83, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("+");
		btnNewButton_3.setBounds(30, 39, 89, 23);
		contentPane.add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setBounds(179, 104, 167, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(179, 147, 167, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	
	

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
			int x =Integer.parseInt(textField.getText())-Integer.parseInt(textField_1.getText());
					JOptionPane.showMessageDialog(null, x);
			
			}
		});
	
	
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
			float x =Integer.parseInt(textField.getText())/Integer.parseInt(textField_1.getText());
					JOptionPane.showMessageDialog(null, x);
			
			}
		});
	
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
			int x =Integer.parseInt(textField.getText())*Integer.parseInt(textField_1.getText());
					JOptionPane.showMessageDialog(null, x);
			
			}
		});
	
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
			int x =Integer.parseInt(textField.getText())+Integer.parseInt(textField_1.getText());
					JOptionPane.showMessageDialog(null, x);
			
			}
		});
	
	
	
	
	}
}
