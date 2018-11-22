/*  IFT 1810 C - Introduction to programming (C/Java)
*   Author: Bao-Tuong-An Chau
*   Description: Java project that introduces concepts of OOP, constructors and methods
*   This is a student work and is WIP. All other information concerning the project are within the course's webpage.
*/

class Personne{
	private String naissance;
	private int nbCafe;
	
	
	public Personne(String naiss, int cafe) {
		naissance = naiss;
		nbCafe = cafe;
		
	}
	
	
	public Personne(String naiss) {
		naissance = naiss;
		nbCafe = 1;
	}
	
	public int getJour() {
		return Integer.parseInt(naissance.substring(0, 2));
	}
	
	public String getMois(String dateNaissance) {
		
		String mois = dateNaissance;
		
		switch(Integer.parseInt(dateNaissance.substring(3, 5))) {
		case 1:
			mois = "janvier";
			break;
		case 2:
			mois = "fev";
			break;
		case 3:
			mois = "mars";
			break;
		case 4:
			mois = "avril";
			break;
		case 5:
			mois = "mai";
			break;
		case 6:
			mois = "juin";
			break;
		case 7:
			mois = "juillet";
			break;
		case 8:
			mois = "aout";
			break;
		case 9:
			mois = "septembre";
			break;
		case 10:
			mois = "octobre";
			break;
		case 11:
			mois = "novembre";
			break;
		case 12:
			mois = "decembre";
			break;
		}
		
		return mois;
	}
	
	public int getAnnee() {		
		return Integer.parseInt(naissance.substring(6));
	}
	
	public void afficher(String entete) {
		System.out.printf("%s\n", entete);
		System.out.printf("Naissance    : %d %s %d\n", getJour(), getMois(naissance), getAnnee());
		System.out.printf("Cafe         : %d tasse(s) par jour\n", nbCafe);
		System.out.printf("\n\n");
	}
	
	public int getNbCafe() {
		return nbCafe;
	}
	
	public int setNbCafe(int newCupCoffee) {
		nbCafe = newCupCoffee;
		return nbCafe;
	}
	
}

public class TestPersonne {
	
	Personne pers[] = new Personne("", );
	
	for(int i = 1; i < tableauPersonne.length;i++) {
		System.out.printf("Indice        Tableau 'pers'\n");
		System.out.printf("%3d) %s %d tasse(s)");
	}
	

	public static void main(String[] args) {
		Personne pers1 = new Personne("19/02/1992", 3),
				 pers2 = new Personne("31/12/1990"),
				 pers3 = new Personne("08/05/1994", 2);
		
		/*
		 * 
		 *	DEBUGGING
		 * 
		 * 
		 */
//		pers1.afficher("Informations de la 1re personne");
//		pers2.afficher("Informations de la 2e personne");
//		pers3.afficher("Informations de la 3e personne");
//		
//		pers1.setNbCafe(pers1.getNbCafe()-1);
		
		
	}
}
