package teste;

import modelo.Gerente;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente funcionario = new Gerente();
		funcionario.setNome("Abilio");
		funcionario.setCpf("123123654-8");
		funcionario.setSalario(2600.00);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
		
	}
	
}
