package exercicios.poo.util;

public class CurrencyConverter {
	
	public static double converter(double priceDollar, double quantityDollars) {
		return priceDollar * quantityDollars;
	}
	
	public static double calculateTax(double valueInReais) {
		return valueInReais += valueInReais * 6 / 100;
	}
}