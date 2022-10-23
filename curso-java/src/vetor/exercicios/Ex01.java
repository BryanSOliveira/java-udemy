package vetor.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		if(n > 10) {
			System.out.println("Você ultrapassou o limite de 10 números.");
		} else {
		
			int[] vect = new int[n];
			
			for(int i = 0; i < vect.length; i++) {
				System.out.print("Digite um número: ");
				vect[i] = sc.nextInt();
			}
			
			
			System.out.println("NÚMEROS NEGATIVOS");
			for(int i = 0; i < vect.length; i++) {
				if(vect[i] < 0) {
					System.out.println(vect[i]);
				}
			}
			
			
		}
		
		sc.close();
	}

}
