
import java.util.Scanner;

public class cleean {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int resultatCle;
		int Somme = 0;
		int reste;
		boolean chiffre=false;
		int tampon = 0;
		

		
		System.out.println("Inscriver votre code EAN (12 chiffres max)");
		sc = new Scanner(System.in);
		String[] s=new String [12];
		
 		for (int i= 0; i<s.length;i++ ) {
			System.out.println ("Veuillez entrer un chiffre :" );
			//
			do {
				s[i] = sc.nextLine();
				String w=s[i];
				  try {
					  tampon=Integer.parseInt(w);
					  if(tampon<0 || tampon>9)
					  {
						  System.out.println("Cette valeur n'est pas un chiffre, veuillez réesseyer :");
						  chiffre = false; 
					  }
					 else
						  chiffre=true;
				  }
				  catch(NumberFormatException e) {
					    System.out.println("Cette valeur n'est pas un chiffre, veuillez réesseyer :");
					    chiffre=false;
					    
					  }
				  
				} while (chiffre != true);
				
					if(i%2==0)
					{
						Somme=Somme+tampon;
					}
					else
						Somme=Somme+(tampon*3);
					
		}
			System.out.println("Votre code EAN:");
			Tableau.afficherTableau(s);
			System.out.println("\nLa somme est "+Somme);
			reste=Somme%10;
			
			if(reste==0) {
				
				resultatCle=0;
			}
			else{
				  resultatCle=10-reste;
			}
			
			System.out.println("La clé est égale à "+resultatCle);
		}

	
}
		

	

