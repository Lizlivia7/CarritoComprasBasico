package org.cibertec.edu.pe.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="productos")
public class Producto {
	
	@Id
	private int Id;
	private String Name;
	private String Description;
	private double Price;
	
	
	//METODOS DE CONSTRUCTORES
	public Producto() {
		super();
	}



	public Producto(int id, String name, String description, double price) {
		super();
		Id = id;
		Name = name;
		Description = description;
		Price = price;
	}


	
	//METODOS DE LECTURA Y ESCRITURA

	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getDescription() {
		return Description;
	}



	public void setDescription(String description) {
		Description = description;
	}



	public double getPrice() {
		return Price;
	}



	public void setPrice(double price) {
		Price = price;
	}
	
	
	

}
