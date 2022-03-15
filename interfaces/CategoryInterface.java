package interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Category;

public interface CategoryInterface extends JpaRepository<Category, Long> {

	public static Connection createConnectionToMySQL() {
		// JVM holds the class
		return null;
	}

}
