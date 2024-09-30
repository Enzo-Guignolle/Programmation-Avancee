import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class UneFenetre extends JFrame 
{
    UnMobile tacheMobile;
    JButton sonBouton1;
    private final int LARG=400, HAUT=250;
    
    public UneFenetre()
    {
        Container leConteneur = getContentPane();
        tacheMobile = new UnMobile(LARG, HAUT);
        leConteneur.add(tacheMobile);
        Thread supportTache = new Thread(tacheMobile);
        this.setVisible(true);
        this.setSize(LARG, HAUT);

        sonBouton1 = new JButton("Start/Stop");
        leConteneur.add(sonBouton1, BorderLayout.SOUTH);
        sonBouton1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (supportTache.getState() == Thread.State.TIMED_WAITING){
                    supportTache.suspend();
                }else{
                    supportTache.resume();
                }
            }
        });

        supportTache.start();
    }
}
