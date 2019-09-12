package animalsRandom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class ChooseAnimals {
	
	String ruta = "src/img/";
	public JFrame frame;
	private JButton boton;

	
	public ChooseAnimals() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 102, 102));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel imagen = new JLabel("");
		imagen.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(0, 204, 204), new Color(255, 51, 255), new Color(255, 51, 255), new Color(51, 204, 255)));
		imagen.setBackground(new Color(0, 102, 102));
		imagen.setBounds(28, 37, 182, 176);
		frame.getContentPane().add(imagen);
		
		boton = new JButton("START GAME");
		boton.setBorderPainted(false);
		boton.setBorder(null);
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tiro = 1 + (int)(Math.random()*7);
				
				ImageIcon img1 = new ImageIcon(ruta + tiro + ".png");
				Icon i = new ImageIcon(img1.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));
				imagen.setIcon(i);
			}
		});
		
		boton.setForeground(new Color(255, 255, 255));
		boton.setFont(new Font("Monospaced", Font.BOLD, 19));
		boton.setBackground(new Color(0, 102, 153));
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boton.setBounds(250, 90, 155, 40);
		frame.getContentPane().add(boton);
	
		
		
		
		
	}
}
