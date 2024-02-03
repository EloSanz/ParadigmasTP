package com.model;

public abstract class Empleado {
	protected String nombre;
	protected int id;
	protected double salario_base;
	
	public Empleado(String nombre, int id, double salarioBase)
	{
		this.nombre = nombre;
		this.id = id;
		this.salario_base = salarioBase;
	}
	
	public double calcularSalario()
	{
		return this.salario_base;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalario_base() {
		return salario_base;
	}

	public void setSalario_base(double salario_base) {
		this.salario_base = salario_base;
	}
	@Override
	public String toString()
	{
		return this.nombre+" id:"+ id + " Salario Base:" + salario_base;
	}

}
