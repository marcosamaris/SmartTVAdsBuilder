package interfaceG;

import java.io.*;

import javax.swing.JFileChooser;
import javax.swing.filechooser.*;

public class PesquisarArq {
	public PesquisarArq(String caminhoArq[],int b){
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagens (.jpg/.gif)", "jpg","gif");
		FileNameExtensionFilter filtro2 = new FileNameExtensionFilter("Videos (.MP4)", "MP4");
		
		String diretorioBase = System.getProperty("user.home") + "/Pictures";
		File dir = new File(diretorioBase);
		
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(dir);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		chooser.setAcceptAllFileFilterUsed(false);
		chooser.addChoosableFileFilter(filtro);
		chooser.addChoosableFileFilter(filtro2);
		
		int retorno = chooser.showOpenDialog(null);
		if(retorno == JFileChooser.APPROVE_OPTION){
			
			caminhoArq[b] = chooser.getSelectedFile().getAbsolutePath();
		}
		
		
		}
}
