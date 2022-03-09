package entities;

public class Entry extends Category {

	private String type;
	private String amount;
	private String date;
	private Boolean paid;
	private Integer categoryId;

	public Entry() {

	}

	public Entry(Integer id, String name, String description, String type, String amount, String date, Boolean paid,
			Integer categoryId) {
		super(id, name, description);
		this.type = type;
		this.amount = amount;
		this.date = date;
		this.paid = paid;
		this.categoryId = categoryId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Boolean getPaid() {
		return paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}

	public void isPaid() {
		System.out.println(" ");
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("#Id: " + id + "\nName: " + name + "\nDescription: " + description);
		

		return sb.toString();
	}

}
