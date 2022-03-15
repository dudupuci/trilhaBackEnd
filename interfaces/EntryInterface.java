package interfaces;

import java.sql.Connection;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Entry;

public interface EntryInterface extends JpaRepository<Entry, Long> {

	public static Connection createConnectionToMySQL() {
		// JVM holds the class
		return null;
	}

}
