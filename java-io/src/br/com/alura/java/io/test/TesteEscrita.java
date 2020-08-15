package br.com.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de escrita com Arquivo
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
//		bw.newLine();
		bw.newLine();
		bw.write("asdasd asfsdf dfadf asdfdaf");
		
		bw.close();
		
	}
	
}
