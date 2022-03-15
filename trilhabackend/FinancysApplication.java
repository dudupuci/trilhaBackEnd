package trilhabackend;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import entities.Category;
import entities.Entry;

@SpringBootApplication
public class FinancysApplication {
	// Name of user in MySQL.
	private static final String USERNAME = "root";
	// Password of MySQL.
	private static final String PASSWORD = " ";
	// Database way, port, name of database.
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/project";

	public static void main(String[] args) {
		SpringApplication.run(FinancysApplication.class, args);

		// Start to create a object in MySQL
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("example");
		EntityManager em = emf.createEntityManager();
		Category category = new Category();
		// Start to instance a new object of "Category" type
		category.setId(5);
		category.setName("New Category Test");
		category.setDescription("Description Test");

		// Initialize the operation
		em.getTransaction().begin();
		em.persist(category);
		// Stop and commit the operation
		em.getTransaction().commit();
		System.out.println("New category has been created!");

		// Finding all categorys in db
		em.getReference(null, category.findAll());
		// Removes the created category
		em.remove(category);
		em.getReference(null, category.findAll());
		// Start to instance a new object of "Entry" type
		Entry entry = new Entry();
		entry.setAmount("Price Test = $ 500");
		entry.setCategoryId(6);
		entry.setDate("26/05/2021");
		entry.setDescription("Description Test");
		entry.setId(5);
		entry.setName("Name Test");
		entry.setPaid(true);
		entry.setType("Type Test");

		if (entry.getCategoryId() != null) {
			// Initialize the operation
			em.getTransaction().begin();
			em.persist(entry);
			// Stop the operation
			em.getTransaction().commit();
			System.out.println("New entry has been created!");
		} else {
			System.out.println("Error : The system cannot create a new Entry, please try again. ");
		}

		// Start to instance a new object of "Entry" type
		Entry entry2 = new Entry();
		entry.setAmount("Price Test = $ 300");
		entry.setCategoryId(5);
		entry.setDate("27/05/2021");
		entry.setDescription("Description Test");
		entry.setId(7);
		entry.setName("Name Test");
		entry.setPaid(false);
		entry.setType("Type Test");

		em.getReference(null, entry.findAll());

		if (entry.getPaid() == true) {
			// Filtering by paid entry
			System.out.println("Paid entrys.");
			em.getReference(null, entry);
		} else if (entry.getPaid() == false) {
			// Filtering by no paid entry
			System.out.println("No paid entrys");
			em.getReference(null, entry);
		}

	}

}
