import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BAL bal = new BAL();
        Facteur facteur = new Facteur(bal, "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray());
        Habitant habitant = new Habitant(bal);


        facteur.start();
        habitant.start();
    }
    
}
