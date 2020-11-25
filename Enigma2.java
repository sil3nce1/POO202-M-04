package Modulo_Completo;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;

public class Enigma2 extends JPanel {
	
	
	
	/**
	 * Create the panel.
	 */
	public Enigma2() {
		setBackground(new Color(255, 20, 147));
		setForeground(new Color(255, 0, 255));
		setLayout(null);
		
		JLabel lblQuantosBolosPosso = new JLabel("Quantos hambuguers posso comer com a barriga vazia?");
		lblQuantosBolosPosso.setForeground(new Color(255, 0, 255));
		lblQuantosBolosPosso.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblQuantosBolosPosso.setBounds(15, 28, 487, 38);
		add(lblQuantosBolosPosso);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Apenas um");
		rdbtnNewRadioButton.setFont(new Font("Stencil", Font.PLAIN, 16));
		rdbtnNewRadioButton.setForeground(new Color(107, 142, 35));
		rdbtnNewRadioButton.setBounds(144, 163, 155, 29);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Todos que eu conseguir");
		rdbtnNewRadioButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		rdbtnNewRadioButton_1.setForeground(new Color(128, 0, 0));
		rdbtnNewRadioButton_1.setBounds(144, 120, 308, 29);
		add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("At\u00E9 que tiver hambuguers");
		rdbtnNewRadioButton_2.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnNewRadioButton_2.setForeground(new Color(46, 139, 87));
		rdbtnNewRadioButton_2.setBounds(144, 78, 263, 29);
		add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("N\u00E3o tem hamburguer na aula de POO");
		rdbtnNewRadioButton_3.setFont(new Font("Showcard Gothic", Font.PLAIN, 16));
		rdbtnNewRadioButton_3.setBounds(144, 200, 358, 29);
		add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Apenas os que eu gosto");
		rdbtnNewRadioButton_4.setForeground(new Color(0, 255, 127));
		rdbtnNewRadioButton_4.setFont(new Font("Impact", Font.PLAIN, 16));
		rdbtnNewRadioButton_4.setBounds(144, 240, 223, 29);
		add(rdbtnNewRadioButton_4);
		
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2 );
		bg.add(rdbtnNewRadioButton_3);
		bg.add(rdbtnNewRadioButton_4);
		
		
		
		
		JLabel lblNewLabel = new JLabel("Armado");
		lblNewLabel.setBounds(347, 11, 48, 14);
		add(lblNewLabel);
		
		
		JButton btnNewButton = new JButton("Desarmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReasoningLogic enigma2 = new ReasoningLogic();
				enigma2.IncrementActivations();
				if(rdbtnNewRadioButton.isSelected()) {
					enigma2.IncrementRightAnsweres();
					lblNewLabel.setText("Desarmado");
				}else {
					enigma2.IncrementWrongAnsweres();
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(Enigma2.class.getResource("/Imagens/hamburger1.jpg")));
		btnNewButton.setBounds(15, 77, 110, 202);
		add(btnNewButton);
		
	
		
		

	}
}
