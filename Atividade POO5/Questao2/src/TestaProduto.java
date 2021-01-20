
public class TestaProduto {

    public static void main(String[] args) {
        ProdutoPrecerivel produtoPrecivel = new ProdutoPrecerivel();
        produtoPrecivel.setDataValidade("11/01/2021");
        System.out.println(produtoPrecivel.dataValida("12/01/2021"));
    }
}