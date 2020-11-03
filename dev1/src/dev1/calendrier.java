package dev1;

public class calendrier {
	
	public static boolean bissextile(int annee) {
		if (annee % 4 == 0 &&  annee % 100 != 0 ) return true;
		if (annee % 400 == 0) return true;
		return false;
	}
	public static String jourDeSemaine(int jour,int mois,int annee) {
		int h,q,m,j,k;
		String[] nom ={"lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche"};
		q=jour;
		m=mois;
		j=annee/100;
		k=annee % 100;
		h=(q+((m+1)*26)/10+k+k/4+j/4+j*5) % 7;
		return nom[h];
	}

}
