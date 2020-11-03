package dev1;
import java.util.Scanner;
public class TestCalendrier {
	public static void main(String[] args) {
		System.out.println("Entrez une date de la forme jj mm aaaa:");
		Scanner keyboard = new Scanner(System.in);
		int jours=keyboard.nextInt();
		int mois=keyboard.nextInt();
		int annee=keyboard.nextInt();
		
		String journee = calendrier.jourDeSemaine(jours,mois,annee);
		boolean bi= calendrier.bissextile(annee);
		
		if (bi) System.out.println("l'année "+ String.valueOf(annee) + " est bissextile");
		else System.out.println("l'année "+ String.valueOf(annee) + " n'est pas bissextile"); 
		
		System.out.println("le "+String.valueOf(jours) +"/"+ String.valueOf(mois) + "/"
				+ String.valueOf(annee) + " est un "+ journee);
		keyboard.close();
	}

}

