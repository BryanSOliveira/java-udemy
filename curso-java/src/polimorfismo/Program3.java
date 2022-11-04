package polimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import polimorfismo.entities.ImportedProduct;
import polimorfismo.entities.Product;
import polimorfismo.entities.UsedProduct;

public class Program3 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if(type == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				
				products.add(new ImportedProduct(name, price, customsFee));
			} else if(type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				
				products.add(new UsedProduct(name, price, manufactureDate));
			} else {
				products.add(new Product(name, price));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for(Product product : products) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}

}
