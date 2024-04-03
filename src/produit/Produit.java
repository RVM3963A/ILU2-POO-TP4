package produit;

import personnages.Gaulois;

public abstract class Produit {
	private String nom;
	
	protected Produit(String nom){
		this.nom = nom;
	}
	
	
	
	protected String getNom() {
		return nom;
	}
	
	
	public abstract void description();
	


}
