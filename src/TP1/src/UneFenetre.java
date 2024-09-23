import java.awt.*;
import javax.swing.*;

class UneFenetre extends JFrame 
{
    UnMobile tacheMobile;
    private final int LARG=400, HAUT=250;
    
    public UneFenetre()
    {
        Container leConteneur = getContentPane();
        tacheMobile = new UnMobile(LARG, HAUT);
        leConteneur.add(tacheMobile);
        Thread supportTache = new Thread(tacheMobile);
        this.setVisible(true);
        this.setSize(1000, 1000);
        supportTache.start();

	// TODO 
	// ajouter sonMobile a la fenetre
	// creer une thread laThread avec sonMobile
	// afficher la fenetre
	// lancer laThread 
    }
}
