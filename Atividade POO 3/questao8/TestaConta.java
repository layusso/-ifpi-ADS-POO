package AtividadePoo;

public class TestaConta {

    public static void main(String[] args) {
        Conta c1 = new Conta("1", 250);
        Conta c2 = new Conta("2", 545);
        c1 = c2;
        c1.sacar(35);
        c1.transferir(c2, 60);

        System.out.println(c1.saldo);
        System.out.println(c2.saldo);

    }
}