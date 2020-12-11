package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import entities.Aluno;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class CadastrarAluno extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCep;
	private JTextField txtAltura;
	private JTextField txtPeso;
	private JTextField txtMatricula;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarAluno frame = new CadastrarAluno();
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
	public CadastrarAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 346, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCadastro.setBounds(125, 0, 89, 49);
		contentPane.add(lblCadastro);
		
		JLabel lblAluno = new JLabel("Aluno:");
		lblAluno.setBounds(153, 48, 46, 14);
		contentPane.add(lblAluno);
		
		JLabel lblNome = new JLabel("Nome Completo:");
		lblNome.setBounds(41, 107, 104, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(41, 123, 247, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setBounds(41, 60, 104, 14);
		contentPane.add(lblMatricula);
		
		txtMatricula = new JTextField();
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(41, 76, 247, 20);
		contentPane.add(txtMatricula);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(41, 190, 104, 14);
		contentPane.add(lblCep);
		
		txtCep = new JTextField();
		txtCep.setColumns(10);
		txtCep.setBounds(41, 206, 247, 20);
		contentPane.add(txtCep);

		JLabel lblIdade = new JLabel("Data de Nascimento");
		lblIdade.setBounds(41, 237, 123, 14);
		contentPane.add(lblIdade);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(41, 284, 104, 14);
		contentPane.add(lblAltura);

		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(41, 300, 247, 20);
		contentPane.add(txtAltura);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(41, 331, 104, 14);
		contentPane.add(lblPeso);
		
		txtPeso = new JTextField();
		txtPeso.setColumns(10);
		txtPeso.setBounds(41, 347, 247, 20);
		contentPane.add(txtPeso);
		
		JPanel panel = new JPanel();
		panel.setBounds(41, 403, 247, 33);
		contentPane.add(panel);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(41, 378, 104, 14);
		contentPane.add(lblSexo);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				Aluno aluno = new Aluno();
				aluno.setGenero('M');
			}
		});
		panel.add(rdbtnMasculino);
		
		JRadioButton rdFeminino = new JRadioButton("Feminino");
		rdFeminino.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				Aluno aluno = new Aluno();
				aluno.setGenero('F');
			}
		});
		buttonGroup.add(rdFeminino);
		panel.add(rdFeminino);
	
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			Aluno aluno = new Aluno();
			
			public void actionPerformed(ActionEvent arg0) {
				aluno.setCodigo_Pessoa(Integer.parseInt(txtMatricula.getText())); 
				aluno.setNome_Completo(txtNome.getText());
				aluno.setCep(txtCep.getText());
				//pessoa.setData_Nascimento(Date(txtDataNascimento.getText()));
				aluno.setAltura(Float.parseFloat(txtAltura.getText()));
				aluno.setPeso(Float.parseFloat(txtPeso.getText()));
				
				
			}
		});
		btnCadastrar.setBounds(41, 462, 247, 49);
		contentPane.add(btnCadastrar);
		
		JFormattedTextField formattedTextDate = new JFormattedTextField();
		formattedTextDate.setBounds(41, 253, 247, 20);
		contentPane.add(formattedTextDate);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(41, 160, 257, 20);
		contentPane.add(textField);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(41, 145, 36, 14);
		contentPane.add(lblCpf);

		
	}
}
