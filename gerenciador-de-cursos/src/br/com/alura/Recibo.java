package br.com.alura;

public class Recibo implements Comparable {

	private Integer id;
	private String nome;

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(Object o) {
		Recibo outro = (Recibo) o;
		return outro.getId().compareTo(this.id);
	}

}
