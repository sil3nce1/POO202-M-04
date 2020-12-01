

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Enigma3 extends JPanel {
		
		private Enigma enigma;
		public boolean isRight;
	/**
	 * Create the panel.
	 */
	public Enigma3() {
		this.setEnigma();
		enigma.setDefuse(false);
		setBackground(new Color(0, 255, 255));
		setLayout(null);
		
		JLabel lblMariaCorreMais = new JLabel("S\u00EDlvia corre mais r\u00E1pido do que Maria.");
		lblMariaCorreMais.setForeground(new Color(0, 128, 0));
		lblMariaCorreMais.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblMariaCorreMais.setBounds(62, 62, 296, 31);
		add(lblMariaCorreMais);
		
		JLabel lblMariaCorreMais_1 = new JLabel("Maria corre mais r\u00E1pido do que Ana. ");
		lblMariaCorreMais_1.setForeground(new Color(178, 34, 34));
		lblMariaCorreMais_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		lblMariaCorreMais_1.setBounds(62, 27, 296, 31);
		add(lblMariaCorreMais_1);
		
		JLabel lblAnaCorreMais = new JLabel("Ana corre mais r\u00E1pido do que S\u00EDlvia.");
		lblAnaCorreMais.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblAnaCorreMais.setBounds(62, 102, 296, 31);
		add(lblAnaCorreMais);
		
		JLabel lblSeAsDuas = new JLabel("Se as duas primeiras senten\u00E7as s\u00E3o verdadeiras, a terceira \u00E9:");
		lblSeAsDuas.setForeground(new Color(138, 43, 226));
		lblSeAsDuas.setFont(new Font("Sylfaen", Font.BOLD, 16));
		lblSeAsDuas.setBounds(15, 128, 461, 53);
		add(lblSeAsDuas);
		
		JRadioButton rdbtnVerdadeira = new JRadioButton("Verdadeira");
		rdbtnVerdadeira.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnVerdadeira.setForeground(new Color(255, 0, 0));
		rdbtnVerdadeira.setBounds(62, 178, 136, 29);
		add(rdbtnVerdadeira);
		
		JRadioButton rdbtnFalsa = new JRadioButton("Falsa");
		rdbtnFalsa.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnFalsa.setForeground(new Color(0, 255, 127));
		rdbtnFalsa.setBounds(205, 178, 91, 29);
		add(rdbtnFalsa);
		
		JRadioButton rdbtnIncerta = new JRadioButton("Incerta");
		rdbtnIncerta.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnIncerta.setBounds(303, 178, 91, 29);
		add(rdbtnIncerta);
		
		
		ButtonGroup bg = new ButtonGroup();
		bg.add( rdbtnVerdadeira);
		bg.add(rdbtnFalsa);
		bg.add(rdbtnIncerta);
		
		JLabel lblNewLabel = new JLabel("Armado");
		lblNewLabel.setBounds(360, 11, 48, 14);
		add(lblNewLabel);
		
		
		JButton btnDesativar = new JButton("Desarmar");
		btnDesativar.setForeground(new Color(255, 0, 0));
		btnDesativar.setBackground(Color.YELLOW);
		btnDesativar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnFalsa.isSelected()) {
					right();
					serializeObject();
					
					lblNewLabel.setText("Desarmado");
				}else {
					wrong();
					serializeObject();
				}
			}});
		btnDesativar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDesativar.setBounds(45, 235, 363, 29);
		add(btnDesativar);
		
		

	}
	
	public void serializeObject() {
		try {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("enigma3.ser"));
		oos.writeObject(this.enigma);
		}catch(IOException z) {
			z.printStackTrace();
		}
	}
	
	
	
	public void setIsRight(boolean t) {
		
		this.isRight = t;
	}
	
	public void setEnigma() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("enigma3.ser"));
			this.enigma = (Enigma) ois.readObject();
		}catch(IOException z){
			z.printStackTrace();
		}catch(ClassNotFoundException z) {
			z.printStackTrace();
		}
	}
	public void wrong() {
		this.enigma.IncrementWrongAnsweres();
	}
	public void right() {
		this.enigma.IncrementRightAnsweres();
	}
	
	

}