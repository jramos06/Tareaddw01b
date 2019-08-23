package senati.ddw.ciclo3.tareaddw01b;
import java.util.Scanner;
public class Ejercicio005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sueldo=0;
		float d1=0f;
		float d2=0f;
		float d3=0f;
		float sb=0f;
		
		System.out.println("Introduce su sueldo");
		sueldo=sc.nextInt();
		
		d1= sueldo * 0.10f;
		d2= sueldo * 0.05f;
		d3 = (sueldo - d1 - d2) * 0.03f;
		sb=sueldo - d1 - d2 - d3;
		
		
		System.out.println("Sueldo es: "+ sueldo);
		System.out.println("Descuento 1: " + d1);
		System.out.println("Descuento 2: " + d2);
		System.out.println("Descuento 3: " + d3);
		System.out.println("Sueldo neto: " + sb);
		
	}

}
