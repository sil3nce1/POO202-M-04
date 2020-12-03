

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
import java.io.*;

public class Enigma042 extends JPanel  {
	
	private Enigma04 enigma;
	
	/**
	 * Create the panel.
	 */
	public Enigma042(Enigma04 e) {
		this.setEnigma(e);
		enigma.setDefuse(false);
		setBackground(new Color(255, 20, 147));
		setForeground(new Color(255, 0, 255));
		setLayout(null);
		
		JLabel lblQuantosBolosPosso = new JLabel("Quantos hambuguers posso comer com a barriga vazia?");
		lblQuantosBolosPosso.setForeground(new Color(255, 0, 255));
		lblQuantosBolosPosso.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuantosBolosPosso.setBounds(-2, 11, 342, 38);
		add(lblQuantosBolosPosso);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Apenas um");
		rdbtnNewRadioButton.setFont(new Font("Stencil", Font.PLAIN, 16));
		rdbtnNewRadioButton.setForeground(new Color(107, 142, 35));
		rdbtnNewRadioButton.setBounds(140, 150, 200, 29);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Todos que eu conseguir");
		rdbtnNewRadioButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 10));
		rdbtnNewRadioButton_1.setForeground(new Color(128, 0, 0));
		rdbtnNewRadioButton_1.setBounds(140, 118, 200, 29);
		add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("At\u00E9 que tiver hambuguers");
		rdbtnNewRadioButton_2.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnNewRadioButton_2.setForeground(new Color(46, 139, 87));
		rdbtnNewRadioButton_2.setBounds(140, 86, 200, 29);
		add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("N\u00E3o tem hamburguer na aula ");
		rdbtnNewRadioButton_3.setFont(new Font("Showcard Gothic", Font.PLAIN, 10));
		rdbtnNewRadioButton_3.setBounds(140, 182, 200, 29);
		add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Apenas os que eu gosto");
		rdbtnNewRadioButton_4.setForeground(new Color(0, 255, 127));
		rdbtnNewRadioButton_4.setFont(new Font("Impact", Font.PLAIN, 16));
		rdbtnNewRadioButton_4.setBounds(140, 214, 200, 29);
		add(rdbtnNewRadioButton_4);
		
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2 );
		bg.add(rdbtnNewRadioButton_3);
		bg.add(rdbtnNewRadioButton_4);
		
		
		
		
		JLabel lblNewLabel = new JLabel("Armado");
		lblNewLabel.setIcon(new ImageIcon(Enigma042.class.getResource("/Imagens/armadosim.jpg")));
		lblNewLabel.setBounds(297, 46, 33, 37);
		add(lblNewLabel);
		
		
		JButton btnNewButton = new JButton("Desarmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					lblNewLabel.setIcon(new ImageIcon(Enigma042.class.getResource("/Imagens/desarmadosim.png")));
					right();
					
					
					lblNewLabel.setText("Desarmado");
				}else {
					wrong();
					
				}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(Enigma042.class.getResource("/Imagens/hamburger1.jpg")));
		btnNewButton.setBounds(8, 46, 102, 193);
		add(btnNewButton);
		
	}
	
	
	
	public void setEnigma(Enigma04 e) {
		this.enigma = e;
	}
	public void wrong() {
		this.enigma.IncrementWrongAnsweres();
	}
	public void right() {
		this.enigma.IncrementRightAnsweres();
	}
	
	
		
}


