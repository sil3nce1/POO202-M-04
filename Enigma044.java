


import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;

public class Enigma044 extends JPanel {

		private Enigma04 enigma;
		
	/**
	 * Create the panel.
	 */
	public Enigma044(Enigma04 e) {
		this.setEnigma(e);
		enigma.setDefuse(false);
		setBackground(Color.YELLOW);
		setForeground(Color.MAGENTA);
		setLayout(null);
		
		JLabel lblSeDeusExiste = new JLabel("Se Deus existe, ent\u00E3o a vida tem significado.");
		lblSeDeusExiste.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblSeDeusExiste.setBounds(0, 18, 255, 20);
		add(lblSeDeusExiste);
		
		JLabel lblAFormalizaoCorreta = new JLabel("A infer\u00EAncia se baseia-se em:");
		lblAFormalizaoCorreta.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAFormalizaoCorreta.setBounds(0, 110, 349, 27);
		add(lblAFormalizaoCorreta);
		
		JLabel lblDeusExiste = new JLabel("Portanto, a vida tem significado.");
		lblDeusExiste.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDeusExiste.setForeground(new Color(255, 0, 0));
		lblDeusExiste.setBounds(10, 79, 320, 20);
		add(lblDeusExiste);
		
		JLabel lblDeusExiste_1 = new JLabel("Deus existe.");
		lblDeusExiste_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDeusExiste_1.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		lblDeusExiste_1.setBounds(10, 48, 176, 20);
		add(lblDeusExiste_1);
		
		JRadioButton rdbtnModusPonens = new JRadioButton("Modus Ponens");
		rdbtnModusPonens.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnModusPonens.setForeground(new Color(128, 0, 128));
		rdbtnModusPonens.setBounds(0, 132, 155, 29);
		add(rdbtnModusPonens);
		
		JRadioButton rdbtnModusTollens = new JRadioButton("Modus Tollens");
		rdbtnModusTollens.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnModusTollens.setForeground(new Color(0, 0, 205));
		rdbtnModusTollens.setBounds(157, 132, 155, 29);
		add(rdbtnModusTollens);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnModusPonens);
		bg.add(rdbtnModusTollens);
		
		JLabel lblNewLabel = new JLabel("Armado");
		lblNewLabel.setIcon(new ImageIcon(Enigma044.class.getResource("/Imagens/armadosim.jpg")));
		lblNewLabel.setBounds(292, 12, 33, 33);
		add(lblNewLabel);
		
		
		
		
		JButton btnDesativar = new JButton("Desarmado");
		btnDesativar.setIcon(new ImageIcon(Enigma044.class.getResource("/Imagens/anginho.jpg")));
		btnDesativar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDesativar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnModusPonens.isSelected()) {
					lblNewLabel.setIcon(new ImageIcon(Enigma044.class.getResource("/Imagens/desarmadosim.png")));
					right();
					
					
					lblNewLabel.setText("Desarmado");
				}else {
					wrong();
					
				}
				
			
				
			}
		});
		btnDesativar.setBounds(0, 170, 332, 69);
		add(btnDesativar);
		
		
		

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
