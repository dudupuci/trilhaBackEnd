package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Category;
import entities.Entry;
import entities.Product;

public class ProgramChallengeTwo {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		Category health = new Category(3, "Health", "Health Plans for you, employer");
		Category leisure = new Category();
		leisure.setId(4);
		leisure.setName("Leisure");
		leisure.setDescription("Leisure on work? Yes, we have.");

		System.out.println(health);
		System.out.println(leisure);

		// - - - - - - - - - - - - -

		Entry aboutUs = new Entry(5, "About us", "Our new system of payments", "System", "$ 2860.50", "17/05/2021",
				true, 6);
		Entry paymentInAdvance = new Entry();
		paymentInAdvance.setId(6);
		paymentInAdvance.setName("Payments in Advance");
		paymentInAdvance.setDescription("Your advance payment");
		paymentInAdvance.setType("functionality");
		paymentInAdvance.setAmount("$1500");
		paymentInAdvance.setDate("20/05/2021");
		paymentInAdvance.setPaid(false);
		paymentInAdvance.setCategoryId(7);

		System.out.println(aboutUs);
		System.out.println(paymentInAdvance);

		System.out.println("\n- - - - - - - PRODUCTS PART - - - - - - -");

		ArrayList<Product> productsList = new ArrayList<>();
		// First list, normal products.
		for (int i = 0; i < 5; i++) {
			System.out.println("# Product (" + (i + 1) + "):");
			System.out.print("Product id: ");
			Integer id = read.nextInt();
			System.out.print("Product name: ");
			String name = read.next();
			System.out.print("Product description: ");
			String description = read.next();
			System.out.print("Product price: ");
			Double price = read.nextDouble();

			Product product = new Product(id, name, description, price);
			product.increasePrice(); // Increasing +10 only on normal products.
			productsList.add(product);

		}

		ArrayList<Product> expensiveProductsList = new ArrayList<>();
		// Second list, more expensive products.

		for (int i = 0; i < 3; i++) {
			System.out.println("# Expensive Product (" + (i + 1) + "):");
			System.out.print("Product id: ");
			Integer id = read.nextInt();
			System.out.print("Product name: ");
			String name = read.next();
			System.out.print("Product description: ");
			String description = read.next();
			System.out.print("Product price: ");
			Double price = read.nextDouble();

			Product expensiveProduct = new Product(id, name, description, price);
			expensiveProductsList.add(expensiveProduct);

		}

		// Third list, union of two firts lists.
		ArrayList<Product> allProducts = new ArrayList<>();
		allProducts.addAll(productsList);
		allProducts.addAll(expensiveProductsList);

		System.out.println("\nMore expensive products: ");
		for (Product product : expensiveProductsList) {
			System.out.println(product);
		}

		System.out.println("\nAll products: ");
		// All products list.
		for (Product product : allProducts) {
			System.out.println(product);
		}

		read.close();
	}

}
