package teste;

import modelo.ControleBonificacao;
import modelo.Designer;
import modelo.EditorVideo;
import modelo.Gerente;

public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Abílio");
		gerente.setSalario(5000.0);
		
		EditorVideo editorVideo = new EditorVideo();
		editorVideo.setSalario(2500.0);
		
		Designer designer = new Designer();
		designer.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(editorVideo);
		controle.registra(designer);
		
		System.out.println(controle.getSoma());
		
	}
	
}
