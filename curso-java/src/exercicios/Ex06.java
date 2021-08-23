// Exercício 06 - For

package exercicios;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int linhas = sc.nextInt();
		
		for(int i = 1; i <= linhas; i++) {
			System.out.println(i + " " + i*i + " " + i*i*i);
		}
		
		sc.close();
	}
}
