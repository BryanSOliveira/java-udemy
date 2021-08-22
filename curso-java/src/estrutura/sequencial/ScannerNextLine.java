package estrutura.sequencial;

import java.util.Scanner;

public class ScannerNextLine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		// Quebra de linha pendente será absorvida pelo nextLine quando usamos uma leitura diferente
		x = sc.nextInt();
		sc.nextLine();
		// Ler um texto até a quebra de linha (Enter)
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}
}
