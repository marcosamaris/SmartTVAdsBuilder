package interfaceG;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeitorArq {

		//leitor dos arquivos
		public LeitorArq (String produto[], String caminho[], int b){
			try{
				//txt1
				File arq1 = new File(caminho[0]);
				FileReader txt1 = new FileReader(arq1);
				BufferedReader lerTxt1 = new BufferedReader(txt1);
				produto[0] = lerTxt1.readLine();//grava linha do arquivo
				//txt2
				File arq2 = new File(caminho[1]);
				FileReader txt2 = new FileReader(arq2);
				BufferedReader lerTxt2 = new BufferedReader(txt2);
				produto[1] = lerTxt2.readLine();//grava linha do arquivo
				
				//txt3
				File arq3 = new File(caminho[2]);
				FileReader txt3 = new FileReader(arq3);
				BufferedReader lerTxt3 = new BufferedReader(txt3);
				produto[2] = lerTxt3.readLine();//grava linha do arquivo
				
				//txt4
				File arq4 = new File(caminho[3]);
				FileReader txt4 = new FileReader(arq4);
				BufferedReader lerTxt4 = new BufferedReader(txt4);
				produto[3] = lerTxt4.readLine();//grava linha do arquivo
				
			}catch(IOException e){
				System.err.printf("erro na abertura do arquivo: %s. \n", e.getMessage());//caso dê erro
			}
			
		}
		
		
	}
