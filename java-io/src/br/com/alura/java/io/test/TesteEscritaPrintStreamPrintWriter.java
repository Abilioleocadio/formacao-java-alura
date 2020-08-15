package br.com.alura.java.io.test;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de escrita com Arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		PrintStream ps = new PrintStream(new File("lorem2.txt"));
		
		PrintWriter ps = new PrintWriter("lorem2.txt", "UTF-8");
		
		ps.println("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
		ps.println();
		ps.println();
		ps.println();
		ps.println("asdasd asfsdf dfadf asdfdaf");
		
		ps.close();
		
	}
	
}
