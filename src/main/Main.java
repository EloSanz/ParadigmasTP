package main;

import com.model.Administrativo;
import com.model.Empleado;
import com.model.Operario;

public class Main {

	public static void main(String[] args) {
		Empleado adm = new Administrativo("Eliseo", 1, 10000.00, 20);
		Empleado op = new Operario("Eliseo el operario", 2, 20000.00, 1000);

		System.out.println(adm);
		System.out.println("==============================");
		System.out.print(op);
	}
}
