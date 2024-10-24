import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        List<String> listOfAlphabet = new ArrayList<>();

        for (int i = 0; i < alphabet.length(); i++) {
            listOfAlphabet.add(String.valueOf(alphabet.charAt(i)));
        }

        BAL bal = new BAL();
        Facteur facteur = new Facteur(bal, listOfAlphabet);
        Habitant habitant = new Habitant(bal);


        facteur.start();
        habitant.start();
    }
    
}
