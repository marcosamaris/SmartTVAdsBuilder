package interfaceG;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import interfaceG.EscritorArq;
import interfaceG.LeitorArq;
import interfaceG.TelaPrincipal;
import net.miginfocom.swing.MigLayout;
public class JanelaDescProduto extends JFrame{

	public JanelaDescProduto(){
		super("Mudar descri��o dos produtos");

		
		//Componentes
		//label
		JLabel l1 = new JLabel("Digite a descri��o do produto: ");
		JLabel l2 = new JLabel("Digite a descri��o do produto: ");
		JLabel l3 = new JLabel("Digite a descri��o do produto: ");
		JLabel l4 = new JLabel("Digite a descri��o do produto: ");
		//bot�es
		JButton b1 = new JButton("Mudar descri��o 1");
		JButton b2 = new JButton("Mudar descri��o 2");
		JButton b3 = new JButton("Mudar descri��o 3");
		JButton b4 = new JButton("Mudar descri��o 4");
		JButton b5 = new JButton("Voltar");
		
		
		//variavel para obten��o do nome dos produtos que est�o no codigo NCL
		String produto[] = new String[4];
		String caminho[] = new String[4];
		
		//inclus�o do caminho manualmente para teste
		caminho[0]= "txt/textProd1.txt";
		caminho[1]= "txt/textProd2.txt";
		caminho[2]= "txt/textProd3.txt";
		caminho[3]= "txt/textProd4.txt";
		
		//leitor dos arquivos para obter o nome dos produtos
		new LeitorArq(produto,caminho,2);
		//txt
		JTextArea txt1 = new JTextArea(produto[0]);
		JTextArea txt2 = new JTextArea(produto[1]);
		JTextArea txt3 = new JTextArea(produto[2]);
		JTextArea txt4 = new JTextArea(produto[3]);
		
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
		
	
		
		//Painel
		JPanel panel = new JPanel();
		MigLayout layout = new MigLayout("insets 100 100 0 0");
		panel.setLayout(layout);
		
		//linha1
		panel.add(l1);
		panel.add(txt1,"width 500:510:520");
		panel.add(b1,"wrap");
		
		//linha2
		panel.add(l2);
		panel.add(txt2,"width 500:510:520");
		panel.add(b2,"wrap");
		
		//linha3
		panel.add(l3);
		panel.add(txt3,"width 500:510:520");
		panel.add(b3,"wrap");
		
		//linha4
		panel.add(l4);
		panel.add(txt4,"width 500:510:520");
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
				JOptionPane.showMessageDialog(b1, "descri��o mudada com sucesso");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				escrita[1]=txt2.getText();
				new EscritorArq(caminho,escrita,2);
				JOptionPane.showMessageDialog(b2, "descri��o mudada com sucesso");
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				escrita[2]=txt3.getText();
				new EscritorArq(caminho,escrita,3);
				JOptionPane.showMessageDialog(b3, "descri��o mudada com sucesso");
			}
		});
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				escrita[3]=txt4.getText();
				new EscritorArq(caminho,escrita,4);
				JOptionPane.showMessageDialog(b4, "descri��o mudada com sucesso");
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
		setSize(1000,700);
		setVisible(true);
		setLocationRelativeTo(null);
		
		
	}
	
public static void main(String[] args) {
	new JanelaDescProduto();
}

	
}
