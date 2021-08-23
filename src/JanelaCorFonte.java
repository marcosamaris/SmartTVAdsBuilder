package interfaceG;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;

import net.miginfocom.swing.MigLayout;

import interfaceG.MontadorNCL;

public class JanelaCorFonte extends JFrame {
	String caminho[] = new String [4];
	public JanelaCorFonte() {
		super("Mude a cor e a fonte dos textos");
		
		// componentes
		// Label
		JLabel l1 = new JLabel("Selecione uma cor para os botões: ");
		JLabel l2 = new JLabel("Selecione um tamanho para fonte dos botões: ");
		JLabel l3 = new JLabel("Selecione uma cor para as descrições: ");
		JLabel l4 = new JLabel("Selecione um tamanho para fonte das descrições: ");

		// Cores
		String[] Cores = { "white", "black", "silver", "gray", "red", "maroon", "fuchsia", "purple", "lime", "green","yellow", "olive", "blue", "navy", "aqua", "teal" };
		String[] Tamanho= {"6","8","10","12","14","16","18","20","22","24","26","28","30","32","34","36","38","40","42","44"};
		// combobox
		JComboBox CaixaCoresB = new JComboBox(Cores);
		JComboBox CaixaTamanhoFontesB = new JComboBox(Tamanho);
		JComboBox CaixaCoresD = new JComboBox(Cores);
		JComboBox CaixaTamanhoFontesD = new JComboBox(Tamanho);
		// botões
		JButton b1 = new JButton("Mudar Cor e Tamanho da fonte");
		JButton b2 = new JButton("Voltar");
		
		// alterando tamanho dos botões
		b1.setMinimumSize(new Dimension(200, 30));
		b1.setPreferredSize(new Dimension(210, 30));
		b1.setMaximumSize(new Dimension(220, 30));
		CaixaCoresB.setMinimumSize(new Dimension(200,25));
		CaixaCoresB.setPreferredSize(new Dimension(210,25));
		CaixaCoresB.setMaximumSize(new Dimension(220,25));
		CaixaTamanhoFontesB.setMinimumSize(new Dimension(200,25));
		CaixaTamanhoFontesB.setPreferredSize(new Dimension(210,25));
		CaixaTamanhoFontesB.setMaximumSize(new Dimension(220,25));
		CaixaCoresD.setMinimumSize(new Dimension(200,25));
		CaixaCoresD.setPreferredSize(new Dimension(210,25));
		CaixaCoresD.setMaximumSize(new Dimension(220,25));
		CaixaTamanhoFontesD.setMinimumSize(new Dimension(200,25));
		CaixaTamanhoFontesD.setPreferredSize(new Dimension(210,25));
		CaixaTamanhoFontesD.setMaximumSize(new Dimension(220,25));

		// painel
		JPanel panel = new JPanel();
		MigLayout layout = new MigLayout("", "[][][]40[]", "[]40[]40[]40[]40[]");
		panel.setLayout(layout);

		// linha1
		panel.add(l1);
		panel.add(CaixaCoresB, "wrap");

		// linha2
		panel.add(l2);
		panel.add(CaixaTamanhoFontesB, "wrap");
		
		//linha3
		panel.add(l3);
		panel.add(CaixaCoresD, "wrap");
		
		//linha4
		panel.add(l4);
		panel.add(CaixaTamanhoFontesD, "wrap");

		// linha5
		panel.add(b1,"wrap");
		panel.add(b2);

		// ações dos botões
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				caminho[1] = (String) CaixaCoresB.getSelectedItem();
				caminho[0] = (String) CaixaTamanhoFontesB.getSelectedItem();
				caminho[3] = (String) CaixaCoresD.getSelectedItem();
				caminho[2] = (String) CaixaTamanhoFontesD.getSelectedItem();
				new MontadorNCL(caminho,3);
				JOptionPane.showMessageDialog(b1, "Cor e tamanho da fonte mudados com sucesso");
			}
		});



		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new TelaPrincipal().setVisible(true);
				setVisible(false);
			}
		});

		// Frame
		add(panel);
		setVisible(true);
		setSize(900, 600);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new JanelaCorFonte();
	}
}
