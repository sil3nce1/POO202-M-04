

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import java.awt.Component;
import javax.swing.Box;
import java.awt.List;
import java.awt.Checkbox;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuBar;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Canvas;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Enigma5 extends JPanel {
	private final Action action = new SwingAction();
		
		private Enigma enigma;
		public boolean isRight;
	/**
	 * Create the panel.
	 */
	public Enigma5() {
		this.setEnigma();
		enigma.setDefuse(false);
		setBorder(new LineBorder(new Color(255, 0, 0), 10));
		setForeground(Color.YELLOW);
		setBackground(new Color(0, 0, 0));
		setToolTipText("Escolha\r\n");
		setLayout(null);
		
		JLabel lblPq = new JLabel("P \uE111 (Q \uE111 P)");
		lblPq.setBounds(177, 86, 133, 20);
		lblPq.setForeground(Color.RED);
		add(lblPq);
		
		JComboBox cbxEscolha = new JComboBox();
		cbxEscolha.setModel(new DefaultComboBoxModel(new String[] {"Contradit\u00F3ria", "Tautologia", "Satisfaz\u00EDvel"}));
		cbxEscolha.setMaximumRowCount(10);
		cbxEscolha.setBackground(new Color(255, 255, 255));
		cbxEscolha.setBounds(130, 122, 216, 26);
		cbxEscolha.setToolTipText("Escolha\r\n");
		add(cbxEscolha);
		
		JLabel lblIndiqueANumerao = new JLabel("Na L\u00F3gica Proposicional\r\n a f\u00F3rmula \u00E9:");
		lblIndiqueANumerao.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIndiqueANumerao.setForeground(Color.GREEN);
		lblIndiqueANumerao.setBounds(80, 28, 319, 57);
		add(lblIndiqueANumerao);
		
		JLabel lblNewLabel = new JLabel("Armado");
		lblNewLabel.setBounds(29, 34, 48, 14);
		add(lblNewLabel);
		
		JButton btnSlecionar = new JButton("Live our Die");
		btnSlecionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cbxEscolha.getSelectedIndex() == 2) {
					right();
					serializeObject();
					
					lblNewLabel.setText("Desarmado");
				}else {
					wrong();
					serializeObject();
				}
			}
		});
		btnSlecionar.setBackground(new Color(255, 255, 0));
		btnSlecionar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSlecionar.setForeground(new Color(255, 0, 0));
		btnSlecionar.setBounds(156, 196, 168, 29);
		add(btnSlecionar);
		
		

	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	
	public void serializeObject() {
		try {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("enigma5.ser"));
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
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("enigma5.ser"));
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
