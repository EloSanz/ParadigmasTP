package main;

import com.model.Administrativo;
import com.model.Empleado;
import com.model.Operario;

public class Main {

	public static void main(String[] args) {
		
//		Empleado adm = new Administrativo("Eliseo", 1, 10000.00, 20);
//		Empleado op = new Operario("Eliseo el operario", 2, 20000.00, 1000);
//		
//		System.out.println(adm);
//		System.out.print(op);
		
		Empleado admin = new Administrativo("Juan", 123, 1500, 5);
        Empleado operario = new Operario("Pedro", 456, 1200, 1000);
        System.out.println("Salario de " + admin.getNombre() + ": $" + admin.calcularSalario());
        System.out.println("Salario de " + operario.getNombre() + ": $" + operario.calcularSalario());
	}

}
