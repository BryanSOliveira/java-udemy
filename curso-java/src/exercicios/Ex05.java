// Exerc�cio 05 - For

package exercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
