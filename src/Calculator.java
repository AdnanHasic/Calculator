import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
	MatematickeOperacije matOperacije = new MatematickeOperacije();
		
    Scanner unos = new Scanner (System.in);
    
    System.out.println("Unesite prvi broj : ");

    double prviBroj  = unos.nextDouble();
    
    System.out.println("Unesite drugi broj :");
    
    double drugiBroj = unos.nextDouble();
    
    matOperacije.sabiranjeBrojeva(prviBroj, drugiBroj);
    
    matOperacije.oduzimanjeBrojeva(prviBroj, drugiBroj);
    
    matOperacije.mnozenjeBrojeva(prviBroj, drugiBroj);
    
    matOperacije.dijeljenjeBrojeva(prviBroj, drugiBroj);
    
    matOperacije.korjenovnajeBrojeva(prviBroj);
    
    matOperacije.kvadriranjeBrojeva(prviBroj, 2);
    
    
    
    
    

	}

}
