package com.model;

public class Operario extends Empleado {
		private int produccion;
		
		public Operario(String nombre, int id, double salarioBase, int produccion) 
		{
		super(nombre, id, salarioBase);
		this.produccion = produccion;
		}
		public double calcularSalario()
		{
			double porcentaje = 0.02;
			return this.salario_base + (this.salario_base * porcentaje * this.produccion);
		}
		
		@Override
		public String toString()
		{
			return "Operario: " + this.nombre + " id: "+this.id;
		}
		
}