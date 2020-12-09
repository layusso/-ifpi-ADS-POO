package AtividadePoo;

public class TestaEquipamentos {
	
    public static void main(String[] args) {
        
        Equipamento forno = new Equipamento();
        Equipamento secador = new Equipamento();

        forno.ligado = true;
        secador.ligado = false;

        forno.inverte();
        secador.inverte();

        if (forno.estaLigado() == true) {
            System.out.println(" Forno está ligado!");
        } else {
            System.out.println("Forno desligado!");
        }
        if (secador.estaLigado() == true) {
            System.out.println("Secador está ligado!");
        } else {
            System.out.println("Secador desligado!");
        }

    }
    
}

