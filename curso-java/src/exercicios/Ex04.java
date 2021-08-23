// Exercício 04 - For

package exercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int fat = 1;
		for(int i = 1 ; i <= num; i++) {
			fat *= i;
		}
		
		System.out.println(fat);
		
		sc.close();

	}
}
