package com.springboot;

import java.util.List; 

import jakarta.persistence.*;

@Entity
@Table(name="laptops3")
public class Laptop {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private long id;
	@Column
	private String name;
	@Column
	private String brand;
	@Column
	private float price;
	
	@OneToMany(mappedBy="laptop")
	private List<Color> colors;
	
	public Laptop(LaptopRequest request) {
		this.name = request.getName();
		this.price = request.getPrice();
		this.brand = request.getBrand();
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public List<Color> getColors() {
		return colors;
	}

	public void setColors(List<Color> colors) {
		this.colors = colors;
	}
	

}
