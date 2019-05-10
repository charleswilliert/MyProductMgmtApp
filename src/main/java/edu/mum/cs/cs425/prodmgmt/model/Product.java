package edu.mum.cs.cs425.prodmgmt.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTS")

public class Product {

	public Product(long pid, long productNumber,String name, float unitPrice, LocalDate dateMfd) {
		
		this.pid = pid;
		this.productNumber = productNumber;
		this.name=name;
		this.unitPrice = unitPrice;
		this.dateMfd = dateMfd;
	}
	public Product(){}
	
	@Id
	private long  pid;
	private long productNumber;
	private String name;
	private float unitPrice;
	private LocalDate dateMfd;
	
	
	public long getPid() {
		return pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public long getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(long productNumber) {
		this.productNumber = productNumber;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public LocalDate getDateMfd() {
		return dateMfd;
	}
	public void setDateMfd(LocalDate dateMfd) {
		this.dateMfd = dateMfd;
	}
	
	
	
	
}
