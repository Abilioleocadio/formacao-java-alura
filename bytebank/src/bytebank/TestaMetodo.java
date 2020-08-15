package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.saldo = 100;
		conta1.deposita(50);
		
		System.out.println(conta1.saldo);
		
		boolean conseguiuRetirar = conta1.saca(20);
		
		System.out.println(conta1.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		
		if(conta2.transfere(3000, conta1)) {
			System.out.println("Transferencia com sucesso!");
		} else {
			System.out.println("Faltou dinheiro!");
		}
		
		System.out.println("Conta 1 saldo: " + conta1.saldo);
		System.out.println("Conta 2 saldo: " + conta2.saldo);
		
		conta1.titular = "Paulo Silveira";
		
		System.out.println(conta1.titular);
	}
	
}
