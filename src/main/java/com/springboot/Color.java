package com.springboot;

import jakarta.persistence.*;

@Entity
@Table(name="colors")
public class Color {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private long id;
	@Column
	private String color;

	@ManyToOne
	@JoinColumn(name="laptop")
	private Laptop laptop;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String s) {
		this.color = s;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	
	
	
}
