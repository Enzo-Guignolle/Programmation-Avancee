public class BAL {
    
    private String lettre;

    public BAL() {

    }

    public synchronized void deposer(String lettreADeposer){
        try{
            while (lettre != null){
                wait();
            }
            lettre = lettreADeposer;
            System.out.println("Le facteur a déposer une lettre\n");
            notify();
        }catch(InterruptedException e){

        }
    }

    public synchronized void retirer(){
        try{
            while (lettre == null){
                wait();
            }
            System.out.println("La lettre contient : " + lettre + "\n\n");
            lettre = null;
            notify();
        }catch(InterruptedException e){

        }
    }
}
