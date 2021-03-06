


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

public class Enigma041 extends JPanel {
	private JRadioButton rdbtnVerdadeiro;
	private JRadioButton rdbtnFalso;
	private JRadioButton rdbtnN�oFazSentido;
	private JRadioButton rdbtnN�oFazSentido_1;
	private JRadioButton rdbtnFalso_1;
	private Enigma04 enigma;

	/**
	 * Create the panel.
	 */
	public Enigma041(Enigma04 e) {
		this.setEnigma(e);
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
		lblEnigna1.setBounds(35, 85, 155, 20);
		add(lblEnigna1);
		
		rdbtnVerdadeiro = new JRadioButton("Verdadeiro");
		rdbtnVerdadeiro.setForeground(new Color(0, 0, 139));
		rdbtnVerdadeiro.setFont(new Font("Baskerville Old Face", Font.BOLD, 11));
		rdbtnVerdadeiro.setBounds(24, 38, 155, 29);
		add(rdbtnVerdadeiro);
		
		rdbtnFalso_1 = new JRadioButton("Falso");
		rdbtnFalso_1.setForeground(new Color(0, 255, 0));
		rdbtnFalso_1.setFont(new Font("Sitka Banner", Font.BOLD, 23));
		rdbtnFalso_1.setBounds(177, 59, 155, 29);
		add(rdbtnFalso_1);
		
		rdbtnN�oFazSentido_1 = new JRadioButton("N\u00E3o faz sentido");
		rdbtnN�oFazSentido_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
			}
		});
		rdbtnN�oFazSentido_1.setFont(new Font("Stencil", Font.PLAIN, 23));
		rdbtnN�oFazSentido_1.setBounds(6, 123, 249, 29);
		add(rdbtnN�oFazSentido_1);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnVerdadeiro);
		bg.add(rdbtnFalso_1);
		bg.add(rdbtnN�oFazSentido_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Enigma041.class.getResource("/Imagens/armadosim.jpg")));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setBounds(244, 11, 33, 33);
		add(lblNewLabel);
		
	
		
		JButton btnNewButton = new JButton("Desarmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnFalso_1.isSelected()) {
					lblNewLabel.setIcon(new ImageIcon(Enigma041.class.getResource("/Imagens/desarmadosim.png")));
					right();
				
					
					lblNewLabel.setText("Desarmado");
				}else {
				
					wrong();
					
				}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(Enigma041.class.getResource("/Imagens/MicrosoftTeams-image.png")));
		btnNewButton.setBounds(16, 159, 316, 54);
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
