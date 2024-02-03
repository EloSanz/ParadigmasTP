# Trabajo Práctico N°1

El presente trabajo práctico tiene como objetivo afianzar la teoría de la Programación Orientada a Objetos, realizando la implementación de sus características a la resolución de un problema. En particular, se busca que los estudiantes exploren y extrapolen conceptos.
- **Fecha de consulta**: 5/02/2024
- **Fecha de entrega:** 14/02/2024

## Planteo
Se desea implementar un sistema para gestionar los empleados de una empresa. Cada empleado puede ser de tipo "Administrativo" u "Operario". Todos los empleados tienen un nombre, un número de identificación y un salario base.
- Los empleados administrativos tienen un sueldo base más un bono por antigüedad, calculado como el 5% del salario base por cada año trabajado.
- Los empleados operarios tienen un sueldo base más un bono por producción, calculado como el 2% del salario base por cada unidad producida.
Ejemplo de uso del sistema:
```
public class Main {
    public static void main(String[] args) {
        Empleado admin = new Administrativo("Juan", 123, 1500, 5);
        Empleado operario = new Operario("Pedro", 456, 1200, 1000);
        System.out.println("Salario de " + admin.getNombre() + ": $" + admin.calcularSalario());
        System.out.println("Salario de " + operario.getNombre() + ": $" + operario.calcularSalario());
    }
}
```
1. Desarrolla  en Java el sistema pedido de forma tal que se pueda ejecutar el ejemplo de uso dado. 
2. Detalle y explique los conceptos utilizados de P.O.O.
3. Resuelve esta misma situación problemática con un lenguaje (C o Go ) que no tenga dichos conceptos, pero que utilice una estrategia diferente para cumplir con dicha funcionalidad.
4. Enunciar las diferencias de implementación entre ambos lenguajes.

## Formalidades
- El trabajo se realizará en forma grupal, con equipos de 4 personas.
- Se espera un informe que contenga al menos: carátula, índice, introducción, desarrollo, conclusiones y referencias.
- Dicho trabajo de investigación deberá tener entre 5 y 12 hojas, incluyendo todos los anexos necesarios. La entrega se realizará en formato PDF. Habrá una defensa y presentación oral.
