// Exercício 03 - While

package exercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int op = sc.nextInt();
		
		while(op != 4) {
			if (op == 1) {
				alcool++;
			} else if (op == 2) {
				gasolina++;
			} else if (op == 3) {
				diesel++;
			}
			op = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();

	}
}
