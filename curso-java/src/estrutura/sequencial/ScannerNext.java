package estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ScannerNext {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String a;
		int b;
		double c;
		char d;
		
		// Pode ser feito todas entradas em uma única linha, separadas por espaço
		
		// Armazenar uma palavra
		a = sc.next();
		// Armazenar um int
		b = sc.nextInt();
		// Armazenar um double (Entrada feita com vírgula, para mudar basta alterar o Locale)
		c = sc.nextDouble();
		// Usar função para pegar o primeiro caractere da string 
		d = sc.next().charAt(0);
		
		System.out.println("Dados digitados:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		sc.close();
	}
}
