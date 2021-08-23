package interfaceG;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class EscritorArq {
	
	
	public EscritorArq(String caminho[],String escrita[], int b){
		try{
			//edição do nome dos botões	
			switch(b){
			case 1:
			FileWriter fw1 = new FileWriter(caminho[0]);
			fw1.write(escrita[0]);
			fw1.close();
			break;
			case 2:
			FileWriter fw2 = new FileWriter(caminho[1]);
			fw2.write(escrita[1]);
			fw2.close();
			break;
			case 3:
			FileWriter fw3 = new FileWriter(caminho[2]);
			fw3.write(escrita[2]);
			fw3.close();
			break;
			case 4:
			FileWriter fw4 = new FileWriter(caminho[3]);
			fw4.write(escrita[3]);
			fw4.close();
			break;
			}
		} catch(IOException e){
			System.err.printf("erro na abertura do arquivo: %s.\n",
			e.getMessage());
		}
		
	}

	
}
	
