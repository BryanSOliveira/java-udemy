package exercicios.poo.aplication;

import java.util.Locale;
import java.util.Scanner;

import exercicios.poo.util.CurrencyConverter;

public class ProgramConverter {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double priceDollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double quantityDollars = sc.nextDouble();
		
		double valueInReais = CurrencyConverter.converter(priceDollar, quantityDollars);
		valueInReais = CurrencyConverter.calculateTax(valueInReais);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", valueInReais);		
		
		sc.close();
	}
}