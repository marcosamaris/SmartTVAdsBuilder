package interfaceG;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Normalizer.Form;

import javax.swing.*;

import net.miginfocom.swing.MigLayout;

public class TelaInicial extends JFrame {
	static int T;
	public TelaInicial() {
		super("SmartTV Ads Builder");
		//componentes
		//label

		JLabel l2 = new JLabel("Selecione um template:");
		JLabel l4 = new JLabel();
		
		//Templates
		String[] templates = {"Template 1", "Template 2"};
		String[] caminho = new String[2];
		caminho[0]= "C:/Users/Andrei/Documents/TCC_2/img/Template1.png";
		caminho[1]= "C:/Users/Andrei/Documents/TCC_2/img/Template2.png";
		
		//combobox
		JComboBox CaixaT = new JComboBox(templates);
		
		//Bot�es
		JButton b1 = new JButton("Pr�ximo");
		
		//painel
		JPanel panel = new JPanel();
		MigLayout layout = new MigLayout("","[][]","[]50[][]");
		panel.setLayout(layout);
		

		//linha 2
		panel.add(l2);
		panel.add(CaixaT);
		panel.add(l4,"wrap");
		
		//linha 3
		panel.add(b1);
		
		//a��es dos bot�es
		
		CaixaT.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				if (CaixaT.getSelectedIndex()==0){
					ImageIcon img = new ImageIcon (caminho[0].toString());
					l4.setIcon(img);
					
				}
				if (CaixaT.getSelectedIndex()==1){
					ImageIcon img = new ImageIcon (caminho[1].toString());
					l4.setIcon(img);
					
				}


			}
		});
		

		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				T = CaixaT.getSelectedIndex();
				new TelaPrincipal().setVisible(true);
				setVisible(false);
				
			}
		});
		

	
		//JFrame
		add(panel);
		setVisible(true);
		setSize(1100, 750);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);	
	}
	
	
	public int getTemplate(){
		return T;
	}
	
	
	
	public static void main(String[] args) {
		TelaInicial q = new TelaInicial();
	}


}