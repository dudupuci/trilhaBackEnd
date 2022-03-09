package entities;

public class Product {
	// Product class have no relations with another classes (Notion).

	private Integer id;
	private String name;
	private String description;
	private Double price;

	public Product() {

	}

	public Product(Integer id, String name, String description, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public Double increasePrice() {
		return this.price += 10;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Id: " + id + "\nName: " + name + "\nDescription: " + description+ "\nPrice: "+price);

		return sb.toString();
	}

}
