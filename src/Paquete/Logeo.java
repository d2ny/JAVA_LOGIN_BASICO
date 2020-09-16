package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Logeo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logeo frame = new Logeo();
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
	public Logeo() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Danny\\Desktop\\277209.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreso = new JLabel("Sistema Principal");
		lblIngreso.setForeground(Color.WHITE);
		lblIngreso.setFont(new Font("Vivaldi", Font.BOLD, 37));
		lblIngreso.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreso.setBounds(64, 11, 295, 84);
		contentPane.add(lblIngreso);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.WHITE);
		menuBar.setBackground(Color.BLACK);
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuBar.setToolTipText("Menu");
		menuBar.setBounds(0, 0, 74, 29);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Opciones");
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.setForeground(Color.WHITE);
		mnNewMenu.setBackground(Color.BLACK);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mntmNewMenuItem.setBackground(Color.BLACK);
		mntmNewMenuItem.setForeground(Color.WHITE);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Principal p = new Principal();
				p.setVisible(true);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("C:\\Users\\Danny\\Desktop\\d2ny.site\\img\\tech-red.jpg"));
		lblFondo.setBounds(0, 0, 444, 271);
		contentPane.add(lblFondo);
	}
}
