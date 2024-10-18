public class Habitant extends Thread{
    
    private BAL bal;

    public Habitant(BAL bal){
        this.bal = bal;
    }

    public void run(){
        try {
            while (true){
                bal.retirer();
                Thread.sleep(200);
            }
        } catch (Exception e) {
        }
    }
}
