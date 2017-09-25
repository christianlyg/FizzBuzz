// Auteur : LAPERT CHRISTIAN
// Date : 25/09/2017

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner nb = new Scanner(System.in);
		int nombre = 0;
		boolean check = false;
		
		while(!check) {
		System.out.println("Saisir un nombre : ");
		// Verifie si la saisie n'est pas de type numerique
			while(!nb.hasNextInt()) {
				System.out.println("Saisir un nombre :");
				nb.next();
			}
			nombre = nb.nextInt();
			// Verifie si le nombre saisie n'est pas positif
			if(nombre <= 0) {
				System.out.println("Vous devez saisir seulement un nombre positif");
			}else {
				//Boucle de calcul FizzBuzz
				for(int i= 1; i <= nombre; i++){
					if(i % 15 == 0){
						System.out.println("FizzBuzz");
					}else if(i % 3 == 0){
						System.out.println("Fizz");
					}else if(i % 5 == 0){
						System.out.println("Buzz");
					}else{
						System.out.println(i);
					}
				}
				check = true;
			}
		}
	}		
}
