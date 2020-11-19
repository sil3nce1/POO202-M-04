package Intregavel2;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Enigma3 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Enigma3() {
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
		
		JButton btnDesativar = new JButton("Desativar");
		btnDesativar.setForeground(new Color(255, 0, 0));
		btnDesativar.setBackground(Color.YELLOW);
		btnDesativar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDesativar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDesativar.setBounds(45, 235, 363, 29);
		add(btnDesativar);

	}

}