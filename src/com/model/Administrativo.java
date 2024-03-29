package com.model;

public class Administrativo extends Empleado {
	private int aniosTrabajados;

	public Administrativo() {

	}

	public Administrativo(String nombre, int id, double salarioBase, int aniosTrabajados) {
		super(nombre, id, salarioBase);
		this.aniosTrabajados = aniosTrabajados;
	}

	public double calcularSalario() {
		double porcentaje = 0.05;
		return this.salario_base + (this.salario_base * porcentaje * this.aniosTrabajados);
	}

	@Override
	public String toString() {
		return "Administrativo: " + this.nombre + "\nId: " + this.id + "\nSalario: " + this.calcularSalario();
	}

}
