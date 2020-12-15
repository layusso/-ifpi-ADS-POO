package AtividadePoo;

public class TestaProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto(123, 25, 210, "carne");

        // quantidade 210 para 180
        p1.baixar(30); 
        
        // não reduz pois a quantidade ficara negativa
        p1.baixar(230); 
        
        // a quantidade vai para 190
        p1.repor(10); 
        
        // Novo valor: R$27,50
        p1.reajusta(10); 

        System.out.println(p1.toString());
        
    }
}