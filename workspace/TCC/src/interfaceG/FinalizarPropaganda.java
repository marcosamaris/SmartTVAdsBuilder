package interfaceG;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FinalizarPropaganda {
	public FinalizarPropaganda(int T){
	//lendo os arquivos e gravando em uma array
	String Media[] = new String[350];
	String sample="1";//Contador para saber em qual arquivo está
	int sampleint = 1;
	
	//template 1
	if (T==0){
	while(sampleint < 4){
	File arq = new File("Samples/Template1/Sample0" + sample + ".txt"); //local do código ncl
	try{
		FileReader txt = new FileReader(arq);
		BufferedReader lerTxt = new BufferedReader(txt);
		for (int i=0;i<=(Media.length-1);i++){
			if(Media[i]==null) {
			Media[i]= lerTxt.readLine();//grava cada linha do arquivo
			}
		}
		
		txt.close();//fecha o arquivo
		lerTxt.close();//Fecha buffered
	}catch (IOException e){
		System.err.printf("erro na abertura do arquivo: %s. \n", e.getMessage());//caso dê erro
	}
	sampleint++;
	sample = Integer.toString(sampleint);//converte inteiro em string para mudança de arquivo
	}
	for(int i=0;i<=(Media.length-1);i++){
		if(Media[i] == null){
			Media[i]=" ";//colocar espaços em branco onde está escrito null
		}
	}

	
	//escrevendo em um novo arquivo
	File arq = new File("Sample04.ncl"); //local do código ncl
	System.out.println(arq.delete());//deletando o arquivo sample02
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
	
	//template 2
	if (T==1){
	while(sampleint < 4){
	File arq = new File("Samples/Template2/Sample0" + sample + ".txt"); //local do código ncl
	try{
		FileReader txt = new FileReader(arq);
		BufferedReader lerTxt = new BufferedReader(txt);
		for (int i=0;i<=(Media.length-1);i++){
			if(Media[i]==null) {
			Media[i]= lerTxt.readLine();//grava cada linha do arquivo
			}
		}
		
		txt.close();//fecha o arquivo
		lerTxt.close();//Fecha buffered
	}catch (IOException e){
		System.err.printf("erro na abertura do arquivo: %s. \n", e.getMessage());//caso dê erro
	}
	sampleint++;
	sample = Integer.toString(sampleint);//converte inteiro em string para mudança de arquivo
	}
	for(int i=0;i<=(Media.length-1);i++){
		if(Media[i] == null){
			Media[i]=" ";//colocar espaços em branco onde está escrito null
		}
	}

	
	//escrevendo em um novo arquivo
	File arq = new File("Sample04.ncl"); //local do código ncl
	System.out.println(arq.delete());//deletando o arquivo sample02
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
}
