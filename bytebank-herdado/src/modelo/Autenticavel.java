package modelo;

// Contrato Autenticavel
	// quem assina esse contrato, precisa implementar
		// método set senha
		// método autentica
public abstract interface Autenticavel {


	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
}
