public class Facteur extends Thread{
    
    private BAL bal;
    private char[] lettreADeposer;
    
    public Facteur(BAL bal, char[] lettre){
        this.bal = bal;
        lettreADeposer = lettre;

    }

    public void run(){
        try {
            for (int i = 0; i < lettreADeposer.length; i++){
                bal.deposer(String.valueOf(lettreADeposer[i]));
                Thread.sleep(200);
            }
        } catch (Exception e) {
        }
    }

}
