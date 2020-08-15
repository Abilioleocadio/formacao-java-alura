package modelo;

public class AutenticacaoUtil {

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if(senha == this.senha) {
			return true;
		}
		return false;
	}
	
}
