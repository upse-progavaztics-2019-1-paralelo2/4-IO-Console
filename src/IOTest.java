/**
 * 
 * @author ivansanchez
 * Este programa trata acerca de la impresion de datos y 
 * el ingreso por consola I/O.
 */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class IOTest {

	public static void main(String[] args) {

		
		NumberFormat formateador =
				NumberFormat.getCurrencyInstance(Locale.FRANCE);
		
		System.out.println(formateador.format(21.223));
		System.out.println(formateador.format(21.227));
		System.out.println(formateador.format(21.2));
		System.out.println(formateador.format(2));
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hola soy ... ");
		System.out.println("Hola ...");
		String nombreVendedor = scanner.nextLine();
		System.out.println("Que mas pues " + nombreVendedor);
		System.out.println("Cuanto billete quieres?");
		
		
		double billete = scanner.nextDouble();
		System.out.println("Pediste " + formateador.format(billete));
		System.out.println("Algo mas?");
		String palabra1 = scanner.next();
		System.out.println("Quieres " + palabra1 + "?");
		String palabra2 = scanner.next();
		System.out.println("Y tambien quieres " + palabra2 + "?");
		System.out.println("Gracias por su compra.");
		scanner.nextLine();
		String despedida = scanner.nextLine();
		
		System.out.print("Chao " + nombreVendedor + ". " + despedida);
		
		scanner.close();
		
	}
	

}
