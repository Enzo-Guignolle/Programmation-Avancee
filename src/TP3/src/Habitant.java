public class Habitant extends Thread{
    
    private BAL bal;

    public Habitant(BAL bal){
        this.bal = bal;
    }

    public void run(){
        try {
            while (true){
                String lettre = bal.retirer();
                if (lettre.equals("Q")){
                    this.interrupt();
                }
                Thread.sleep(200);
            }
        } catch (Exception e) {
        }
    }
}


