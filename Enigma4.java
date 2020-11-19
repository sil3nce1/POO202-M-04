package Intregavel2;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class Enigma4 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Enigma4() {
		setBackground(Color.YELLOW);
		setForeground(Color.MAGENTA);
		setLayout(null);
		
		JLabel lblSeDeusExiste = new JLabel("Se Deus existe, ent\u00E3o a vida tem significado.");
		lblSeDeusExiste.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSeDeusExiste.setBounds(71, 16, 388, 20);
		add(lblSeDeusExiste);
		
		JLabel lblAFormalizaoCorreta = new JLabel("A infer\u00EAncia se baseia-se em:");
		lblAFormalizaoCorreta.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAFormalizaoCorreta.setBounds(71, 121, 349, 27);
		add(lblAFormalizaoCorreta);
		
		JLabel lblDeusExiste = new JLabel("Portanto, a vida tem significado.");
		lblDeusExiste.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDeusExiste.setForeground(new Color(255, 0, 0));
		lblDeusExiste.setBounds(71, 85, 320, 20);
		add(lblDeusExiste);
		
		JLabel lblDeusExiste_1 = new JLabel("Deus existe.");
		lblDeusExiste_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDeusExiste_1.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		lblDeusExiste_1.setBounds(71, 49, 320, 20);
		add(lblDeusExiste_1);
		
		JRadioButton rdbtnModusPonens = new JRadioButton("Modus Ponens");
		rdbtnModusPonens.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnModusPonens.setForeground(new Color(128, 0, 128));
		rdbtnModusPonens.setBounds(71, 164, 155, 29);
		add(rdbtnModusPonens);
		
		JRadioButton rdbtnModusTollens = new JRadioButton("Modus Tollens");
		rdbtnModusTollens.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnModusTollens.setForeground(new Color(0, 0, 205));
		rdbtnModusTollens.setBounds(226, 164, 155, 29);
		add(rdbtnModusTollens);
		
		JButton btnDesativar = new JButton("Desativar");
		btnDesativar.setIcon(new ImageIcon(Enigma4.class.getResource("/Imagens/anginho.jpg")));
		btnDesativar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDesativar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDesativar.setBounds(73, 220, 332, 69);
		add(btnDesativar);

	}

}