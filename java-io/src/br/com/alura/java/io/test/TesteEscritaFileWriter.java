package br.com.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de escrita com Arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
		bw.newLine();
		bw.newLine();
		bw.write("asdasd asfsdf dfadf asdfdaf");
		
		bw.close();
		
	}
	
}
