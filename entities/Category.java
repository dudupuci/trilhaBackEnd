package entities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// This is a entity.
@Entity
public class Category {
	// Primary key of this entity.
	@Id
	// Auto-increment, the database generates the value
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;
	protected String name;
	protected String description;

	public Category() {

	}

	public Category(Integer id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("#Id: " + id + "\nName: " + name + "\nDescription: " + description);

		return sb.toString();
	}

	public ArrayList<Category> findById(long id) {

		return null;
	}

	public ArrayList<Category> findAll() {

		return null;
	}

}
