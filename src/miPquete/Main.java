package miPquete;

import clases.*;

public class Main {

	public static void main(String[] args) {
		
		Empleado emp = new Empleado("Eliseo", 1,10000.00);
		Operario op = new Operario("Eliseo el operario", 2, 20000.00, 1000);
		
		System.out.println(emp);
		System.out.print(op);
	}

}
