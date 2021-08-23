package interfaceG;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;

import net.miginfocom.swing.MigLayout;

import interfaceG.PesquisarArq;
import interfaceG.MontadorNCL;

public class JanelaLayoutBotao extends JFrame {
	
	public JanelaLayoutBotao(){
		super("Mude o layout dos botões");
		//string do caminho escolhido pelo usuário
		String caminho[] = new String[5];
		
		//Componentes
		//label
		JLabel l1 = new JLabel("Selecione o novo layout: ");
		JLabel l2 = new JLabel("Selecione o novo layout: ");
		JLabel l3 = new JLabel("Selecione o novo layout: ");
		JLabel l4 = new JLabel("Selecione o novo layout: ");
		JLabel l5 = new JLabel("Selecione o novo layout: ");
		//icones dos botões para amostra
		JLabel l6 = new JLabel();
		JLabel l7 = new JLabel();
		JLabel l8 = new JLabel();
		JLabel l9 = new JLabel();
		JLabel l10 = new JLabel();

		//botões
		JButton b1 = new JButton("Pesquisar botão 1");
		JButton b2 = new JButton("Pesquisar botão 2");
		JButton b3 = new JButton("Pesquisar botão 3");
		JButton b4 = new JButton("Pesquisar botão 4");
		JButton b5 = new JButton("Pesquisar descrição");
		JButton b6 = new JButton("Voltar");
		JButton b7 = new JButton("Mudar layout");
		//txt
		JTextArea txt1 = new JTextArea();
		JTextArea txt2 = new JTextArea();
		JTextArea txt3 = new JTextArea();
		JTextArea txt4 = new JTextArea();
		JTextArea txt5 = new JTextArea();
		
		//quebra de linha para os txt
		txt1.setLineWrap(true);
		txt1.setWrapStyleWord(true);
		txt1.setBorder(new LineBorder(Color.BLUE));
		txt2.setLineWrap(true);
		txt2.setWrapStyleWord(true);
		txt2.setBorder(new LineBorder(Color.BLUE));
		txt3.setLineWrap(true);
		txt3.setWrapStyleWord(true);
		txt3.setBorder(new LineBorder(Color.BLUE));
		txt4.setLineWrap(true);
		txt4.setWrapStyleWord(true);
		txt4.setBorder(new LineBorder(Color.BLUE));
		txt5.setLineWrap(true);
		txt5.setWrapStyleWord(true);
		txt5.setBorder(new LineBorder(Color.BLUE));
		
		
		
		//Painel
		JPanel panel = new JPanel();
		MigLayout layout = new MigLayout("","[][][]40[]","[]40[]40[]40[]40[]");
		panel.setLayout(layout);
		//linha1
		panel.add(l1);
		panel.add(txt1,"width 200:210:220");
		panel.add(b1,"width 150:160:170");
		panel.add(l6, "wrap");
		
		//linha2
		panel.add(l2);
		panel.add(txt2,"width 200:210:220");
		panel.add(b2,"width 150:160:170");
		panel.add(l7, "wrap");
		
		//linha3
		panel.add(l3);
		panel.add(txt3,"width 200:210:220");
		panel.add(b3,"width 150:160:170");
		panel.add(l8, "wrap");
		
		//linha4
		panel.add(l4);
		panel.add(txt4,"width 200:210:220");
		panel.add(b4,"width 150:160:170");
		panel.add(l9, "wrap");
		
		//linha5
		panel.add(l5);
		panel.add(txt5,"width 200:210:220");
		panel.add(b5,"width 150:160:170");
		panel.add(l10, "wrap");
		
		//linha6
		panel.add(b6);
		panel.add(b7);
		
		//ações dos botões
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new PesquisarArq(caminho,0);
				txt1.setText(caminho[0]);
				ImageIcon img = new ImageIcon(caminho[0].toString());
				l6.setIcon(img);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new PesquisarArq(caminho,1);
				txt2.setText(caminho[1]);
				l7.setIcon(new ImageIcon(caminho[1].toString()));
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new PesquisarArq(caminho,2);
				txt3.setText(caminho[2]);
				l8.setIcon(new ImageIcon(caminho[2].toString()));
			}
		});
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new PesquisarArq(caminho,3);
				txt4.setText(caminho[3]);
				l9.setIcon(new ImageIcon(caminho[3].toString()));
			}
		});
		
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new PesquisarArq(caminho,4);
				txt4.setText(caminho[4]);
				l10.setIcon(new ImageIcon(caminho[4].toString()));
			}
		});
		
		b6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new TelaPrincipal().setVisible(true);
				setVisible(false);
			}
		});

		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new MontadorNCL(caminho,1);
				JOptionPane.showMessageDialog(b7, "Layout mudado com sucesso!");
			}
		});
		
		//Frame
		add(panel);
		setVisible(true);
		setSize(900,600);
		setLocationRelativeTo(null);
	}
	
	
	
	
	
	public static void main(String[] args) {
		new JanelaLayoutBotao();
	}
}
