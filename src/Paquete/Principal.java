package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtClave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 230);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Spy Agency Laser", Font.PLAIN, 23));
		lblLogin.setBounds(173, 11, 126, 25);
		contentPane.add(lblLogin);
		
		JLabel lblUsuario = new JLabel("Usuario : ");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblUsuario.setBounds(73, 68, 79, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblClave = new JLabel("Contrase\u00F1a : ");
		lblClave.setForeground(Color.WHITE);
		lblClave.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblClave.setBounds(73, 109, 93, 14);
		contentPane.add(lblClave);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(157, 66, 142, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtClave = new JPasswordField();
		txtClave.setBounds(157, 107, 142, 20);
		contentPane.add(txtClave);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBackground(Color.ORANGE);
		btnIngresar.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		btnIngresar.setForeground(Color.DARK_GRAY);
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char[] clave = txtClave.getPassword();
				String claveFinal = new String(clave);
				
				if(txtUsuario.getText().equals("Danny") && claveFinal.equals("12345") ) {
					dispose();
					JOptionPane.showMessageDialog(null, "Bienvenid@ al Sistema","Ingresaste",
					JOptionPane.INFORMATION_MESSAGE);
					
					Logeo l = new Logeo();
					l.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrectos","Error",
					JOptionPane.ERROR_MESSAGE);
					
					txtUsuario.setText("");
					txtClave.setText("");
					txtUsuario.requestFocus();
				}
				
			}
		});
		btnIngresar.setBounds(210, 138, 89, 31);
		contentPane.add(btnIngresar);
	}
}
