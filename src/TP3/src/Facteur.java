import java.util.List;

public class Facteur extends Thread{
    
    private BAL bal;
    private List<String> lettresADeposer;
    
    public Facteur(BAL bal, List<String> lettres){
        this.bal = bal;
        lettresADeposer = lettres;

    }

    public void run(){
        try {
            for (int i = 0; i < lettresADeposer.size(); i++) {
                String lettre = lettresADeposer.get(i);
                bal.deposer(lettre);
                if (lettre.equals("Q")) {
                    this.interrupt();
                }
                Thread.sleep(200);
            }
        } catch (Exception e) {
        }
    }

}
