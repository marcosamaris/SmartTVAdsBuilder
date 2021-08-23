package interfaceG;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;

import net.miginfocom.swing.MigLayout;

public class JanelaBackground extends JFrame {
	
	public JanelaBackground(){
		super("Mude a imagem de fundo e o video");
		//String do caminho escolhido pelo usuário
		String caminho[] = new String[2];
		
		
		//componentes
		//Label
		JLabel l1 = new JLabel("Selecione a imagem de fundo: ");
		JLabel l2 = new JLabel("Selecione o video: ");
		
		//txt
		JTextArea txt1 = new JTextArea();
		JTextArea txt2 = new JTextArea();
		
		//Alterando tamanho txt
		txt1.setLineWrap(true);
		txt1.setWrapStyleWord(true);
		txt1.setBorder(new LineBorder(Color.BLUE));
		txt2.setLineWrap(true);
		txt2.setWrapStyleWord(true);
		txt2.setBorder(new LineBorder(Color.BLUE));

		
		//botões
		JButton b1 = new JButton("Pesquisar imagem de fundo");
		JButton b2 = new JButton("Pesquisar video");
		JButton b3 = new JButton("Voltar");
		JButton b4 = new JButton("Mudar imagem / video");
		
		
		//alterando tamanho dos botões
		b1.setMinimumSize(new Dimension(190, 25));
		b1.setPreferredSize(new Dimension(200, 25));
		b1.setMaximumSize(new Dimension(210, 25));
		b2.setMinimumSize(new Dimension(190, 25));
		b2.setPreferredSize(new Dimension(200, 25));
		b2.setMaximumSize(new Dimension(210, 25));
		
		
		//painel
		JPanel panel = new JPanel();
		MigLayout layout = new MigLayout("","[][][]40[]","[]40[]40[]40[]40[]");
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
		panel.add(b3);
		panel.add(b4);
		
		//ações dos botões
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new PesquisarArq(caminho,0);
				txt1.setText(caminho[0]);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new PesquisarArq(caminho,1);
				txt2.setText(caminho[1]);
			}
		});
		
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new TelaPrincipal().setVisible(true);
				setVisible(false);
			}
		});
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new MontadorNCL(caminho,2);
				JOptionPane.showMessageDialog(b4, "img/video mudado com sucesso!");
			}
		});
		
		//Frame
		add(panel);
		setVisible(true);
		setSize(900,600);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new JanelaBackground();
	}
}
