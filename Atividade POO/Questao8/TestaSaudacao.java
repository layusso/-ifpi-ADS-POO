package AtividadePoo;

public class TestaSaudacao {

	public static void main(String[] args) {
		Saudacao saudacao = new Saudacao();
		saudacao.texto = "Bom Dia";
		saudacao.destinatario = "Jo�o";

		System.out.println(saudacao.obterSaudacao());
	}
}
