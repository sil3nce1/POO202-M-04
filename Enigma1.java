package Intregavel2;

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

public class Enigma1 extends JPanel {
	private JRadioButton rdbtnVerdadeiro;
	private JRadioButton rdbtnFalso;
	private JRadioButton rdbtnNãoFazSentido;
	private JRadioButton rdbtnNãoFazSentido_1;
	private JRadioButton rdbtnFalso_1;

	/**
	 * Create the panel.
	 */
	public Enigma1() {
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
		lblEnigna1.setBounds(149, 35, 155, 20);
		add(lblEnigna1);
		
		rdbtnVerdadeiro = new JRadioButton("Verdadeiro");
		rdbtnVerdadeiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnVerdadeiro.isSelected())
				   rdbtnFalso.setSelected(false);
				   rdbtnNãoFazSentido.setSelected(false);
			}
		});
		rdbtnVerdadeiro.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
			}
		});
		rdbtnVerdadeiro.setForeground(new Color(0, 0, 139));
		rdbtnVerdadeiro.setFont(new Font("Baskerville Old Face", Font.BOLD, 11));
		rdbtnVerdadeiro.setBounds(84, 89, 155, 29);
		add(rdbtnVerdadeiro);
		
		rdbtnFalso_1 = new JRadioButton("Falso");
		rdbtnFalso_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnFalso.isSelected())
					   rdbtnVerdadeiro.setSelected(false);
					   rdbtnNãoFazSentido.setSelected(false);
				
			}
			
		});
		rdbtnFalso_1.setForeground(new Color(0, 255, 0));
		rdbtnFalso_1.setFont(new Font("Sitka Banner", Font.BOLD, 23));
		rdbtnFalso_1.setBounds(319, 132, 155, 29);
		add(rdbtnFalso_1);
		
		rdbtnNãoFazSentido_1 = new JRadioButton("N\u00E3o faz sentido");
		rdbtnNãoFazSentido_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNãoFazSentido.isSelected())
					   rdbtnFalso.setSelected(false);
					   rdbtnVerdadeiro.setSelected(false);
			}
		});
		rdbtnNãoFazSentido_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
			}
		});
		rdbtnNãoFazSentido_1.setFont(new Font("Stencil", Font.PLAIN, 23));
		rdbtnNãoFazSentido_1.setBounds(46, 181, 249, 29);
		add(rdbtnNãoFazSentido_1);
		
		Button button = new Button("Desativar");
		button.setBounds(26, 228, 438, 44);
		add(button);

	}
}
