package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private Gaulois chasseur;
	private int poids;
	
	public Sanglier( Gaulois chasseur, int poids) {
		super("sanglier");
		this.chasseur = chasseur;
		this.poids = poids;
		
		
	}
	
	public Gaulois getChasseur() {
		return chasseur;
	}
	
	@Override
	public void description() {
		System.out.println("Sanglier de " + poids + " kg chassé par " + chasseur);
	}
	
}