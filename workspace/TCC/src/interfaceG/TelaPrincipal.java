package interfaceG;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import interfaceG.JanelaDescBotao;
import interfaceG.JanelaDescProduto;
import interfaceG.JanelaLayoutBotao;
import interfaceG.FinalizarPropaganda;
import interfaceG.TelaInicial;

import net.miginfocom.swing.MigLayout;

public class TelaPrincipal extends JFrame {
	
	public TelaPrincipal(){
		super("Montando sua propaganda");
		//componentes
		JButton b1 = new JButton("Mudar nome dos produtos");
		JButton b2 = new JButton("Mudar descrição dos produtos");
		JButton b3 = new JButton("Mudar layout dos botões");
		JButton b4 = new JButton("Mudar backgroud/video");
		JButton b5 = new JButton("Mudar Cor e tamanho da fonte");
		JButton b6 = new JButton("Finalizar propaganda");
		JButton b7 = new JButton("Escolher outro template");
		
		//alterar tamanho dos botões
		b1.setMinimumSize(new Dimension(250, 30));
		b1.setPreferredSize(new Dimension(250, 30));
		b1.setMaximumSize(new Dimension(250, 30));
		b2.setMinimumSize(new Dimension(250, 30));
		b2.setPreferredSize(new Dimension(250, 30));
		b2.setMaximumSize(new Dimension(250, 30));
		b3.setMinimumSize(new Dimension(250, 30));
		b3.setPreferredSize(new Dimension(250, 30));
		b3.setMaximumSize(new Dimension(250, 30));
		b4.setMinimumSize(new Dimension(250, 30));
		b4.setPreferredSize(new Dimension(250, 30));
		b4.setMaximumSize(new Dimension(250, 30));
		b5.setMinimumSize(new Dimension(250, 30));
		b5.setPreferredSize(new Dimension(250, 30));
		b5.setMaximumSize(new Dimension(250, 30));
		b6.setMinimumSize(new Dimension(250, 30));
		b6.setPreferredSize(new Dimension(250, 30));
		b6.setMaximumSize(new Dimension(250, 30));
		b7.setMinimumSize(new Dimension(250, 30));
		b7.setPreferredSize(new Dimension(250, 30));
		b7.setMaximumSize(new Dimension(250, 30));
		
		
		//painel
		JPanel panel = new JPanel();
		MigLayout layout = new MigLayout("insets 100 250 200 200");//redimensionando o painel
		panel.setLayout(layout);
		panel.add(b1,"wrap");//botando o próximo componente para a próxima linha
		panel.add(b2,"wrap");
		panel.add(b3,"wrap");
		panel.add(b4,"wrap");
		panel.add(b5,"wrap");
		panel.add(b6,"wrap");
		panel.add(b7);
		
		
		//ações dos botões
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new JanelaDescBotao();
				setVisible(false);
			}
		});
		
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new JanelaDescProduto();
				setVisible(false);
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new JanelaLayoutBotao();
				setVisible(false);
			}
		});
		
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new JanelaBackground();
				setVisible(false);
			}
		});
		
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new JanelaCorFonte();
				setVisible(false);
			}
		});
		
		b6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int resposta =JOptionPane.showConfirmDialog(null, "Deseja realmente finalizar a propaganda?","Selecione uma opção",
						JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				
				if(resposta == 0){
				TelaInicial T = new TelaInicial();
				new FinalizarPropaganda(T.getTemplate());
				System.exit(0);
				}
			}
		});
		
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new TelaInicial().setVisible(true);
				setVisible(false);
			}
		});
		
	
		//JFrame
		add(panel);
		setVisible(true);
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		
	}
}