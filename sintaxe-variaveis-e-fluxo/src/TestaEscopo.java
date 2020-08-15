
public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 20;
		int quantidadePessoas = 3;
		
		boolean acompanhado = false;
		
//		boolean acompanhado = quantidadePessoas > 1;
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		}

		System.out.println("Valor do acompanhado = " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem-vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
	}
	
}
