package Intregavel3;

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

public class Enigma6 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Enigma6() {
		setBorder(new LineBorder(new Color(0, 0, 0), 15));
		setBackground(new Color(135, 206, 250));
		setForeground(new Color(230, 230, 250));
		setLayout(null);
		
		JLabel lblEnunciado = new JLabel("(p  \u2227  q)  \u2192  (p  v  q) ");
		lblEnunciado.setBounds(153, 34, 167, 20);
		add(lblEnunciado);
		
		JList list = new JList();
		list.setBounds(207, 69, 1, 1);
		add(list);
		
		JComboBox cBxPrimeiraLinha = new JComboBox();
		cBxPrimeiraLinha.setModel(new DefaultComboBoxModel(new String[] {"V  V  V  F  F  F  V ", "V  V  F  V  F  V  V ", "V  F  V  V  F  V  V ", "F  V  V  V  V  F  V ", "V  V  V  V  V  V  V "}));
		cBxPrimeiraLinha.setBounds(153, 71, 167, 26);
		add(cBxPrimeiraLinha);
		
		JComboBox cBxPrimeiraLinha2 = new JComboBox();
		cBxPrimeiraLinha2.setModel(new DefaultComboBoxModel(new String[] {"V  V  V  V  V  V  V ", "V  F  V  V  V  V  V ", "V  F  V  V  F  V  V ", "V  V  F  V  V  V  V ", "V  F  F  V  V  V  F "}));
		cBxPrimeiraLinha2.setBounds(153, 113, 167, 26);
		add(cBxPrimeiraLinha2);
		
		JComboBox cBxPrimeiraLinha3 = new JComboBox();
		cBxPrimeiraLinha3.setModel(new DefaultComboBoxModel(new String[] {"V  F  V  V  F  V  V ", "V  V  V  V  F  V  V ", "V  V  F  F  V  V  V ", "F  F  V  V  F  V  V ", "V  V  V  V  V  V  V "}));
		cBxPrimeiraLinha3.setBounds(153, 155, 167, 26);
		add(cBxPrimeiraLinha3);
		
		JComboBox cBxPrimeiraLinha3_1 = new JComboBox();
		cBxPrimeiraLinha3_1.setModel(new DefaultComboBoxModel(new String[] {"F  F  F  V  F   F   F ", "V  F  V  V  V  V  F ", "V  V  F  V  F  F  F ", "V  V  F  F  V  F  V ", "V  F  V  F  V  V  F "}));
		cBxPrimeiraLinha3_1.setBounds(153, 197, 167, 26);
		add(cBxPrimeiraLinha3_1);
		
		JButton btnSelecao = new JButton("Ser\u00E1?");
		btnSelecao.setBounds(181, 239, 115, 29);
		add(btnSelecao);

	}
}
