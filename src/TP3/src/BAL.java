public class BAL {
    
    private String lettre;
    private boolean availaible = false;

    public BAL() {

    }

    public synchronized void deposer(String lettreADeposer){
        try{
            while (this.availaible == true){
                wait();
            }
            lettre = lettreADeposer;
            System.out.println("Le facteur a déposer une lettre");
            availaible = true;
            notify();
        }catch(InterruptedException e){

        }
    }

    public synchronized String retirer(){
        try{
            while (this.availaible == false){
                wait();
            }
            System.out.println("La lettre contient : " + lettre + "\n");
            availaible = false;
            notify();
        }catch(InterruptedException e){

        }
        return lettre;
    }
}
