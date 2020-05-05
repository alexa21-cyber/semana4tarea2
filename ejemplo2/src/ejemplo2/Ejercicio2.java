package ejemplo2;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
   double descuento=0, montototal=0;
    Scanner scan=new Scanner (System.in);
    System.out.println("Ingrese la cantidad de los productos");
    int cantidad=scan.nextInt();
    System.out.println("Ingrese el precio");
    double precio=scan.nextDouble();
    double costo=cantidad*precio;
     
    if (costo<50) {
    	 descuento=costo*0.08;
    	 
    }else {
    	if (costo>=50) {
    	 descuento=costo*0.10;}
    }
   montototal=costo-descuento;
System.out.println("su descuento es de: "+descuento);
System.out.println("su monto total es: "+ montototal);
	}

}
