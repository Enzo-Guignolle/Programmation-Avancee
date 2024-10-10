/*
import java.io.*;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;
*/
import java.lang.String;

public class Main {

	public static void main(String[] args){
		semaphoreBinaire semaphore = new semaphoreBinaire(1);
		Affichage TA = new Affichage("AAA", semaphore);
		Affichage TB = new Affichage("BBB", semaphore);
		Affichage TC = new Affichage("CCC", semaphore);
		Affichage TD = new Affichage("DDD", semaphore);

		TB.start();
		TA.start();
		TC.start();
		TD.start();
	}

}
