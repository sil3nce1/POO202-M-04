

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.CardLayout;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class Enigma6 extends JPanel {

		private Enigma enigma;
		
	/**
	 * Create the panel.
	 */
	public Enigma6(Enigma e) {
		this.setEnigma(e);
		enigma.setDefuse(false);
		setBorder(new LineBorder(new Color(0, 0, 0), 15));
		setBackground(new Color(135, 206, 250));
		setForeground(new Color(230, 230, 250));
		setLayout(null);
		
		JLabel lblEnunciado = new JLabel("(p  \u2227  q)  \u2192  (p  v  q) ");
		lblEnunciado.setBounds(256, 32, 167, 20);
		add(lblEnunciado);
		
		JList list = new JList();
		list.setBounds(207, 69, 1, 1);
		add(list);
		
		JComboBox cBxPrimeiraLinha = new JComboBox();
		cBxPrimeiraLinha.setFont(new Font("Tahoma", Font.BOLD, 16));
		cBxPrimeiraLinha.setForeground(Color.BLUE);
		cBxPrimeiraLinha.setModel(new DefaultComboBoxModel(new String[] {"Selecione linha 1", "V  V  V  F  F  F  V ", "V  V  F  V  F  V  V ", "V  F  V  V  F  V  V ", "F  V  V  V  V  F  V ", "V  V  V  V  V  V  V "}));
		cBxPrimeiraLinha.setBounds(256, 71, 167, 26);
		add(cBxPrimeiraLinha);
		
		JComboBox cBxPrimeiraLinha2 = new JComboBox();
		cBxPrimeiraLinha2.setFont(new Font("Tahoma", Font.BOLD, 16));
		cBxPrimeiraLinha2.setForeground(Color.BLUE);
		cBxPrimeiraLinha2.setModel(new DefaultComboBoxModel(new String[] {"Selecione linha 2", "V  V  V  V  V  V  V ", "V  F  V  V  V  V  V ", "V  F  V  V  F  V  V ", "V  V  F  V  V  V  V ", "V  F  F  V  V  V  F "}));
		cBxPrimeiraLinha2.setBounds(256, 113, 167, 26);
		add(cBxPrimeiraLinha2);
		
		JComboBox cBxPrimeiraLinha3 = new JComboBox();
		cBxPrimeiraLinha3.setForeground(Color.BLUE);
		cBxPrimeiraLinha3.setFont(new Font("Tahoma", Font.BOLD, 16));
		cBxPrimeiraLinha3.setModel(new DefaultComboBoxModel(new String[] {"Selecione linha 3", "V  F  V  V  F  V  V ", "V  V  V  V  F  V  V ", "V  V  F  F  V  V  V ", "F  F  V  V  F  V  V ", "V  V  V  V  V  V  V "}));
		cBxPrimeiraLinha3.setBounds(256, 155, 167, 26);
		add(cBxPrimeiraLinha3);
		
		JComboBox cBxPrimeiraLinha4 = new JComboBox();
		cBxPrimeiraLinha4.setFont(new Font("Tahoma", Font.BOLD, 16));
		cBxPrimeiraLinha4.setForeground(Color.BLUE);
		cBxPrimeiraLinha4.setModel(new DefaultComboBoxModel(new String[] {"Selecione linha 4", "F  F  F  V  F   F   F ", "V  F  V  V  V  V  F ", "V  V  F  V  F  F  F ", "V  V  F  F  V  F  V ", "V  F  V  F  V  V  F "}));
		cBxPrimeiraLinha4.setBounds(256, 197, 167, 26);
		add(cBxPrimeiraLinha4);
		
		
		
		JLabel lblSequencia = new JLabel("Escolha a sequ\u00EAncia");
		lblSequencia.setForeground(Color.RED);
		lblSequencia.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSequencia.setBounds(52, 113, 175, 20);
		add(lblSequencia);
		
		JLabel lblCorreta = new JLabel("correta dos valores ");
		lblCorreta.setForeground(Color.RED);
		lblCorreta.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCorreta.setBounds(52, 135, 227, 20);
		add(lblCorreta);
		
		JLabel lblTabela = new JLabel("da Tabela-Verdade");
		lblTabela.setForeground(Color.RED);
		lblTabela.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTabela.setBounds(52, 158, 227, 20);
		add(lblTabela);
		
		JLabel lblNewLabel = new JLabel("Armado");
		lblNewLabel.setBounds(32, 35, 48, 14);
		add(lblNewLabel);
		
		JButton btnSelecao = new JButton("Ser\u00E1?");
		btnSelecao.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSelecao.setForeground(Color.RED);
		btnSelecao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(  cBxPrimeiraLinha.getSelectedIndex() == 5 && cBxPrimeiraLinha2.getSelectedIndex() == 5 &&
					cBxPrimeiraLinha3.getSelectedIndex() == 4 && cBxPrimeiraLinha4.getSelectedIndex() == 2) {
				right();
				
			}else {
				wrong();
				
			}
				
			}
		});
		btnSelecao.setBounds(287, 239, 115, 29);
		add(btnSelecao);

	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
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