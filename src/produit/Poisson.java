package produit;

public class Poisson extends Produit {
	String date;
	
	public Poisson(String date) {
		super("poisson");
		this.date = date;
		
		
	}
	
	
	@Override
	public void description() {
		System.out.println("poisson pêchés " + date);
		
	}
}
