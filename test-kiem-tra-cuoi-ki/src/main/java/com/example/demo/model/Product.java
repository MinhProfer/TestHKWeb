package com.example.demo.model;

//import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

//@Data
@Entity
public class Product {
	@Id
	@Column(name = "code", unique = true, nullable = false)
	private String code;
	private String description;
	private Long price;
	
	public Product(String code, String description, Long price) {
//		super();
		this.code = code;
		this.description = description;
		this.price = price;
	}
	
	public Product() {
//		super();
		// TODO Auto-generated constructor stub
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	
	
}
