package br.com.alura.java.io.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Cliente cliente = new Cliente();
//		cliente.setNome("Abilio");
//		cliente.setProfissao("Dev");
//		cliente.setCpf("45632179865");
//		
//		String nome = "Nico Steppat";
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cliente.getNome());
	}
	
}
