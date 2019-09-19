package com.example.chaos.monkey.shopping.domain;

/**
 * @author Benjamin Wilms
 */
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class Product {

    private long id;
    private String name;
	private ProductCategory category;
	
    public Product(long id, String name, ProductCategory category) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
	}

	public Product() {
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

}
