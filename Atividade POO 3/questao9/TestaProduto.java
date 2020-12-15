package AtividadePoo;

public class TestaProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto(333, "arroz", 30, 100);

        // Baixar quantidade valida
        p1.baixar(10); // cai de 100 para 90 
        
        // Baixar quantidade invalida
        p1.baixar(200); // n�o reduz pois a quantidade fica < 0

        // Repor quantidade
        p1.repor(20); // a quantidade vai para 110

        // Reajuste de pre�o
        p1.reajusta(10); // o pre�o vai para 33.0

        // Imprimindo descri��o total do produto;
        System.out.println(p1.toString());
        
    }
}