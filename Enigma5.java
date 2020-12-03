

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
import javax.swing.ImageIcon;

public class Enigma5 extends JPanel {
	private final Action action = new SwingAction();
		
		private Enigma enigma;
		
	/**
	 * Create the panel.
	 */
	public Enigma5(Enigma e) {
		this.setEnigma(e);
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
		lblIndiqueANumerao.setBounds(27, 21, 319, 57);
		add(lblIndiqueANumerao);
		
		JLabel lblNewLabel = new JLabel("Armado");
		lblNewLabel.setBounds(29, 34, 48, 14);
		add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Enigma5.class.getResource("/Imagens/armadosim.jpg")));
		lblNewLabel_1.setBounds(374, 21, 33, 33);
		add(lblNewLabel_1);
		
		
		
		JButton btnSlecionar = new JButton("Live our Die");
		btnSlecionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cbxEscolha.getSelectedIndex() == 2) {
					lblNewLabel_1.setIcon(new ImageIcon(Enigma5.class.getResource("/Imagens/desarmadosim.png")));
					right();
					
					
					lblNewLabel.setText("Desarmado");
				}else {
					wrong();
					
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
	

	
	public void setEnigma(Enigma e) {
		this.enigma = e;
	}
	public void wrong() {
		this.enigma.IncrementWrongAnsweres();
	}
	public void right() {
		this.enigma.IncrementRightAnsweres();
	}
}
