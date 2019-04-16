
public class MatematickeOperacije {

	private double rezultat;

	public void sabiranjeBrojeva(double x, double y) {

		this.rezultat = x + y;

		System.out.println("Rezultat sabiranja brojeva je  = " + rezultat);
	}
	
	public void oduzimanjeBrojeva (double x, double y) {
		
		if (x > y) {
			this.rezultat = x -y;
		}else if (x <= y) {
			this.rezultat = y - x;
		}
		System.out.println("Razlika oduzimanja dva broja je  " + rezultat);
	}
	
	public void mnozenjeBrojeva (double x, double y) {
		
		this.rezultat = x * y;
		
		System.out.println("Rezultat mnozenja dva broja je = " + rezultat);
	}
	
	public void dijeljenjeBrojeva (double x, double y) {
		
		this.rezultat = x / y;
		
		System.out.println("Rezultat dijeljenja dva broja je " + rezultat);
	}
	
	public void korjenovnajeBrojeva (double x) {
		
		this.rezultat = Math.sqrt(x);
		
		System.out.println("Korijen Vaseg  broja iznosi " + rezultat);
	}
	
	public void  kvadriranjeBrojeva (double broj, int stepenKvadriranja) {
		
		this.rezultat = Math.pow(broj, stepenKvadriranja);
		
		System.out.println("Kvadrat Vaseg broja iznosi " + rezultat);
	}

	

}
