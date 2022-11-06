package arquivos.model.entities;

public class Product {

	private String name;
	private Double price;
	private Integer quantity;

	public Product(String name, Double unitPrice, Integer quantity) {
		this.name = name;
		this.price = unitPrice;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double unitPrice) {
		this.price = unitPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double total() {
		return quantity * price;
	}
}
