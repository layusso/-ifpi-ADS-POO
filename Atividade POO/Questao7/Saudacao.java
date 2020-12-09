package AtividadePoo;

public class Saudacao {
	String texto, destinatario;

	String obterSaudacao() {
		return texto + destinatario;
	}

	public static void main(String[] args) {
		Saudacao mensagem = new Saudacao();
		mensagem.texto = "Bom dia, ";
		mensagem.destinatario = "Joao";

		System.out.println(mensagem.obterSaudacao());
	}

}
