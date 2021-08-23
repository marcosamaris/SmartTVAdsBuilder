package interfaceG;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import interfaceG.EscritorArq;
import interfaceG.LeitorArq;
import interfaceG.TelaPrincipal;
import net.miginfocom.swing.MigLayout;

public class JanelaDescBotao extends JFrame{

	public JanelaDescBotao(){
		super("Mudar nome dos bot�es");

		
		//Componentes
		//label
		JLabel l1 = new JLabel("Digite o nome do produto: ");
		JLabel l2 = new JLabel("Digite o nome do produto: ");
		JLabel l3 = new JLabel("Digite o nome do produto: ");
		JLabel l4 = new JLabel("Digite o nome do produto: ");
		//bot�es
		JButton b1 = new JButton("Mudar Bot�o 1");
		JButton b2 = new JButton("Mudar Bot�o 2");
		JButton b3 = new JButton("Mudar Bot�o 3");
		JButton b4 = new JButton("Mudar Bot�o 4");
		JButton b5 = new JButton("Voltar");
		
		//variavel para obten��o do nome dos produtos que est�o no codigo NCL
		String produto[] = new String[4];
		String caminho[] = new String[4];
		
		//inclus�o do caminho manualmente para teste
		caminho[0]= "txt/text1.txt";
		caminho[1]= "txt/text2.txt";
		caminho[2]= "txt/text3.txt";
		caminho[3]= "txt/text4.txt";
		
		//leitor dos arquivos para obter o nome dos produtos
		new LeitorArq(produto,caminho,1);
		//txt
		JTextField txt1 = new JTextField(produto[0]);
		JTextField txt2 = new JTextField(produto[1]);
		JTextField txt3 = new JTextField(produto[2]);
		JTextField txt4 = new JTextField(produto[3]);
		
		//alterando tamanho txt
		txt1.setPreferredSize(new Dimension(0,30));
		txt2.setPreferredSize(new Dimension(0,30));
		txt3.setPreferredSize(new Dimension(0,30));
		txt4.setPreferredSize(new Dimension(0,30));
		
		//Painel
		JPanel panel = new JPanel();
		MigLayout layout = new MigLayout();
		panel.setLayout(layout);
		
		//linha1
		panel.add(l1);
		panel.add(txt1,"width 200:210:220");
		panel.add(b1,"wrap");
		
		//linha2
		panel.add(l2);
		panel.add(txt2,"width 200:210:220");
		panel.add(b2,"wrap");
		
		//linha3
		panel.add(l3);
		panel.add(txt3,"width 200:210:220");
		panel.add(b3,"wrap");
		
		//linha4
		panel.add(l4);
		panel.add(txt4,"width 200:210:220");
		panel.add(b4,"wrap");
		//linha5
		panel.add(b5);
		
		//a��es dos bot�es
		String escrita[] = new String[4];//variavel para armazenar a escrita do usu�rio
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				escrita[0]=txt1.getText();
				new EscritorArq(caminho,escrita,1);
				JOptionPane.showMessageDialog(b1, "bot�o mudado com sucesso");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				escrita[1]=txt2.getText();
				new EscritorArq(caminho,escrita,2);
				JOptionPane.showMessageDialog(b2, "bot�o mudado com sucesso");
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				escrita[2]=txt3.getText();
				new EscritorArq(caminho,escrita,3);
				JOptionPane.showMessageDialog(b3, "bot�o mudado com sucesso");
			}
		});
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				escrita[3]=txt4.getText();
				new EscritorArq(caminho,escrita,4);
				JOptionPane.showMessageDialog(b4, "bot�o mudado com sucesso");
			}
		});
		
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new TelaPrincipal().setVisible(true);
				setVisible(false);
			}
		});
		
		//Frame
		add(panel);
		setSize(500,250);
		setVisible(true);
		setLocationRelativeTo(null);
		
		
	}
	

	
}
