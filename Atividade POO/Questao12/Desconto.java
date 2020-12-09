package AtividadePoo;

public class Desconto {
	double valorOriginal;
	double desconto;
	
	public double calcula() {
		return valorOriginal * (1-desconto/100);
	}
	public static void main(String[] args) {
		Desconto valor = new Desconto();
		valor.valorOriginal = 120;
		valor.desconto = 10;

		System.out.println(valor.calcula());
	}

}
