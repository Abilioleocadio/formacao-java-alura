package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length())); // Lambda normal
//		palavras.sort(Comparator.comparing(s -> (s.length()))); // Lambda passando o comparator
		palavras.sort(Comparator.comparing(String::length)); // Method Reference
//		palavras.sort(comparing(String::length)); // Method Reference import static

		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		
		System.out.println(palavras);

//		Consumer<String> impressor = System.out::println;
//		palavras.forEach(impressor);
		
//		palavras.forEach(s -> System.out.println(s));
		palavras.forEach(System.out::println);

//		new Thread(() -> System.out.println("Executando um Runnable")).start();

	}

}
