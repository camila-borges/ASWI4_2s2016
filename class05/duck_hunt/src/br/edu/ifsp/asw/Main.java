package br.edu.ifsp.asw;

public class Main {

    public static void main(String[] args) {
	    PatoReal patoReal = new PatoReal("Donald", new VoarNormal());

        System.out.println("Pato Real");
        patoReal.swim();
        patoReal.myFly();


        System.out.println("\nMarreco");
        Marreco marreco = new Marreco("Ze Carioca", new VoarNormal());
        marreco.swim();
        marreco.myFly();
        marreco.setVoar(new VoarRazante());
        marreco.myFly();

        System.out.println("\nPato de Borracha");
        PatoBorracha borracha = new PatoBorracha("Que Que", new NaoVoar());
        borracha.swim();
        borracha.myFly();
    }
}
