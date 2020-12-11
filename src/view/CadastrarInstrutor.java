package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import entities.Instrutor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class CadastrarInstrutor extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCEP;
	private JTextField txtCPF;
	private JTextField txtMatricula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarInstrutor frame = new CadastrarInstrutor();
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
	
	
	public CadastrarInstrutor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastrar");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(123, 11, 83, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Instrutor");
		lblNewLabel_1.setBounds(133, 31, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setBounds(36, 60, 83, 14);
		contentPane.add(lblMatricula);
		
		txtMatricula = new JTextField();
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(36, 75, 257, 20);
		contentPane.add(txtMatricula);
		
		
		JLabel lblNome = new JLabel("Nome Completo:");
		lblNome.setBounds(36, 106, 115, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(36, 121, 257, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(36, 152, 36, 14);
		contentPane.add(lblCep);
		
		txtCEP = new JTextField();
		txtCEP.setColumns(10);
		txtCEP.setBounds(36, 167, 257, 20);
		contentPane.add(txtCEP);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(36, 198, 36, 14);
		contentPane.add(lblCpf);
		
		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(36, 213, 257, 20);
		contentPane.add(txtCPF);
		
		JLabel lblIdade = new JLabel("Data de Nascimento:");
		lblIdade.setBounds(36, 244, 127, 14);
		contentPane.add(lblIdade);
		
		JFormattedTextField txtData = new JFormattedTextField();
		txtData.setBounds(36, 269, 257, 20);
		contentPane.add(txtData);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(36, 302, 36, 14);
		contentPane.add(lblSexo);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Instrutor instrutor = new Instrutor();
			
			instrutor.setCodigo_Pessoa(Integer.parseInt(txtMatricula.getText()));
			instrutor.setNome_Completo(txtNome.getText());
			instrutor.setCep(txtCEP.getText());
			instrutor.setCep(txtCPF.getText());
			//instrutor.setData_Nascimento(txtData.getText());
			
			
			
			}
		});
		btnNewButton.setBounds(79, 393, 176, 33);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(36, 327, 257, 33);
		contentPane.add(panel);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Masculino");
		rdbtnNewRadioButton_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				Instrutor instrutor = new Instrutor();
				instrutor.setGenero('M');
			}
		});
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Feminino");
		rdbtnNewRadioButton.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				Instrutor instrutor = new Instrutor();
				instrutor.setGenero('F');
			}
		});
		panel.add(rdbtnNewRadioButton);
	}
}
