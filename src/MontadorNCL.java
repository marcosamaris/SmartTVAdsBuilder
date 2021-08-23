package interfaceG;

import java.io.*;

public class MontadorNCL {
	//colocando o conte�do do sample02 para a array m�dia
	public MontadorNCL(String caminho[],int tipo){
		File arq = new File("C:/Users/Andrei/Documents/TCC_2/Samples/Sample02.txt"); //local do c�digo ncl
		String Media[] = new String[53]; //array com n�mero de linhas do media
		MontadorArray(arq, Media);//Colocando o conteudo de sample02 para a array
		AlterarCaminho(Media,caminho,tipo);//altera o caminho da img
		NovoSample(arq);//deletando o sample02
		EscreverArquivo(arq,Media);//escreve no arquivo sample02		
	}
	
	
	//m�todo de montar array
	public void MontadorArray(File arq, String Media[]){
		try{
			FileReader txt = new FileReader(arq);
			BufferedReader lerTxt = new BufferedReader(txt);
			for (int i=0;i<=(Media.length-1);i++){
				Media[i]= lerTxt.readLine();//grava cada linha do arquivo
				
			}
			txt.close();//fecha o arquivo
		}catch (IOException e){
			System.err.printf("erro na abertura do arquivo: %s. \n", e.getMessage());//caso d� erro
		}
		
	}
	
	//m�todo de delete do Sample02
	public void NovoSample (File arq){
		System.out.println(arq.delete());//deletando o arquivo sample02
	}
	
	//altera o caminho da img dos bot�es etc
	public void AlterarCaminho(String Media[], String Caminho[],int tipo){
		//layout bot�es
		if(tipo==1){
			//bot�o 1
			if (Caminho[0] !=null){
				String aux = Media[6].substring(0,39) + Caminho[0] + "\"/>";
				Media[6] = aux;
				System.out.print(aux);

			}
			//bot�o 2
			if (Caminho[1] !=null){
				String aux = Media[7].substring(0,39) + Caminho[1] + "\"/>";
				Media[7] = aux;
				System.out.print(aux);
			}
			//bot�o 3
			if (Caminho[2] !=null){
				String aux = Media[8].substring(0,39) + Caminho[2] + "\"/>";
				Media[8] = aux;
			}
			//bot�o 4
			if (Caminho[3] !=null){
				String aux = Media[9].substring(0,39) + Caminho[3] + "\"/>";
				Media[9] = aux;
			}
			//descri��o dos bot�es
			if (Caminho[4] !=null){
				String aux = Media[52].substring(0,39) + Caminho[4] + "\"/>";
				Media[52] = aux;
			}
		}
		//background e video
		if(tipo==2){
			//background
			if(Caminho[0] != null){
				String aux = Media[1].substring(0,30) + Caminho[0] + "\"/>";
				Media[1]= aux;
			
			}
			//video
			if(Caminho[1] != null){
				String aux = Media[3].substring(0,37) + Caminho[1] + "\">";
				Media[3]= aux;
			
			}
		}
		if(tipo==3){
			//tamanho e cor da fonte dos bot�es
			//bot�o 1
			String aux = Media[14].substring(0,37) + Caminho[0] + "\"/>";
			Media[14]= aux;
			aux = Media[15].substring(0,38) + Caminho[1] + "\"/>";
			Media[15]= aux;
			//bot�o 2
			aux = Media[19].substring(0,37) + Caminho[0] + "\"/>";
			Media[19]= aux;
			aux = Media[20].substring(0,38) + Caminho[1] + "\"/>";
			Media[20]= aux;
			//bot�o 3
			aux = Media[24].substring(0,37) + Caminho[0] + "\"/>";
			Media[24]= aux;
			aux = Media[25].substring(0,38) + Caminho[1] + "\"/>";
			Media[25]= aux;
			//bot�o 4
			aux = Media[29].substring(0,37) + Caminho[0] + "\"/>";
			Media[29]= aux;
			aux = Media[30].substring(0,38) + Caminho[1] + "\"/>";
			Media[30]= aux;
			
			//tamanho e cor da fonte dos bot�es
			//Desc 1
			aux = Media[34].substring(0,37) + Caminho[2] + "\"/>";
			Media[34]= aux;
			aux = Media[35].substring(0,38) + Caminho[3] + "\"/>";
			Media[35]= aux;
			//Desc 2
			aux = Media[39].substring(0,37) + Caminho[2] + "\"/>";
			Media[39]= aux;
			aux = Media[40].substring(0,38) + Caminho[3] + "\"/>";
			Media[40]= aux;
			//Desc 3
			aux = Media[44].substring(0,37) + Caminho[2] + "\"/>";
			Media[44]= aux;
			aux = Media[45].substring(0,38) + Caminho[3] + "\"/>";
			Media[45]= aux;
			//Desc 4
			aux = Media[49].substring(0,37) + Caminho[2] + "\"/>";
			Media[49]= aux;
			aux = Media[50].substring(0,38) + Caminho[3] + "\"/>";
			Media[50]= aux;
		}
	}

	//m�todo para escrever no novo arquivo sample02
	public void EscreverArquivo(File arq, String Media[]){
		try{
			FileWriter fileWriter = new FileWriter(arq,false);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			for (int i =0;i<=Media.length-1;i++ ){
				printWriter.println(Media[i]);
			}
			printWriter.flush();
			printWriter.close();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	
}