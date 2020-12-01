


import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JRadioButtonMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.io.*;

public class Enigma1 extends JPanel {
	private JRadioButton rdbtnVerdadeiro;
	private JRadioButton rdbtnFalso;
	private JRadioButton rdbtnNãoFazSentido;
	private JRadioButton rdbtnNãoFazSentido_1;
	private JRadioButton rdbtnFalso_1;
	private Enigma enigma;
	public boolean isRight;

	/**
	 * Create the panel.
	 */
	public Enigma1() {
		this.setEnigma();
		enigma.setDefuse(false);
		addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
			}
		});
		setToolTipText("");
		setLayout(null);
		
		JLabel lblEnigna1 = new JLabel("3\t+ 4 = 7 se, e somente se, 7 n\u00E3o \u00E9 um n\u00FAmero primo.");
		lblEnigna1.setForeground(new Color(255, 0, 0));
		lblEnigna1.setFont(new Font("Baskerville Old Face", Font.BOLD, 7));
		lblEnigna1.setBounds(56, 106, 155, 20);
		add(lblEnigna1);
		
		rdbtnVerdadeiro = new JRadioButton("Verdadeiro");
		rdbtnVerdadeiro.setForeground(new Color(0, 0, 139));
		rdbtnVerdadeiro.setFont(new Font("Baskerville Old Face", Font.BOLD, 11));
		rdbtnVerdadeiro.setBounds(46, 73, 155, 29);
		add(rdbtnVerdadeiro);
		
		rdbtnFalso_1 = new JRadioButton("Falso");
		rdbtnFalso_1.setForeground(new Color(0, 255, 0));
		rdbtnFalso_1.setFont(new Font("Sitka Banner", Font.BOLD, 23));
		rdbtnFalso_1.setBounds(262, 101, 155, 29);
		add(rdbtnFalso_1);
		
		rdbtnNãoFazSentido_1 = new JRadioButton("N\u00E3o faz sentido");
		rdbtnNãoFazSentido_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
			}
		});
		rdbtnNãoFazSentido_1.setFont(new Font("Stencil", Font.PLAIN, 23));
		rdbtnNãoFazSentido_1.setBounds(24, 146, 249, 29);
		add(rdbtnNãoFazSentido_1);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnVerdadeiro);
		bg.add(rdbtnFalso_1);
		bg.add(rdbtnNãoFazSentido_1);
		
		JLabel lblNewLabel = new JLabel("Armado");
		lblNewLabel.setBounds(330, 24, 48, 14);
		add(lblNewLabel);
		
	
		
		JButton btnNewButton = new JButton("Desarmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnFalso_1.isSelected()) {
					right();
					serializeObject();
					
					lblNewLabel.setText("Desarmado");
				}else {
					wrong();
					serializeObject();
				}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(Enigma1.class.getResource("/Imagens/MicrosoftTeams-image.png")));
		btnNewButton.setBounds(56, 214, 316, 54);
		add(btnNewButton);
		
		

	}
	
	
	public void serializeObject() {
		try {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("enigma1.ser"));
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
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("enigma1.ser"));
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
