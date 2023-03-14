package exercicio1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Application extends JFrame {

	private JPanel contentPane;
	private JTextField campo_texto_num;
	private JTextField textField;

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

		campo_texto_num = new JTextField();
		campo_texto_num.setBounds(171, 61, 86, 20);
		contentPane.add(campo_texto_num);
		campo_texto_num.setColumns(10);
		List<Integer> nums = new ArrayList<>();

		JButton botao_cadastro = new JButton("Cadastrar");
		botao_cadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int num = Integer.parseInt(campo_texto_num.getText());

				nums.add(num);
				campo_texto_num.setText(null);

			}
		});
		botao_cadastro.setBounds(60, 166, 89, 23);
		contentPane.add(botao_cadastro);

		JButton btnNewButton_1 = new JButton("Exibir" + "");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer n_pares = 0;

				for (Integer n : nums) {
					

					if (n % 2 == 0)
						n_pares++;

			
				
				}
				textField.setText(""+n_pares);
			}

		});
		btnNewButton_1.setBounds(257, 166, 89, 23);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("Insira um número:");
		lblNewLabel.setBounds(85, 64, 93, 14);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(171, 92, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1  = new JLabel("Resultado:");
		lblNewLabel_1.setBounds(118, 95, 52, 14);
		contentPane.add(lblNewLabel_1);
	}
}
