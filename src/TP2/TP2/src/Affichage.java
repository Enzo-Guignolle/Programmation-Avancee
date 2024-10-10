/**
 * 
 */
/*
import java.io.*;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;
*/
import java.lang.String;

public class Affichage extends Thread{
	String texte;
	semaphoreBinaire semaphore;
	static Exclusion exclusion = new Exclusion();

	public Affichage (String txt, semaphoreBinaire semaphore){
		texte=txt;
		this.semaphore=semaphore;
	}
	
	public void run(){
		this.semaphore.syncWait();
		for (int i = 0; i < texte.length(); i++) {
			System.out.print(texte.charAt(i));
			try {
				sleep(100);
			} catch (InterruptedException e) {
			}
		}
		this.semaphore.syncSignal();
	}
}
