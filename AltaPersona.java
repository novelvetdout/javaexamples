package py.com.uaa.edu.pooj.practicaJ;
//Ésta Línea De Código importa parte de la libería .util: Scanner..
import java.util.Scanner;

public class altaPersona {

	public void ingresarDatosPersonales() {
		Scanner userInput = new Scanner (System.in);
		String[] listarDatos = new String[20];
		for (int i = 1; i <21; i++ ){
			System.out.println("Ingrese Nombre y Apellido:");
			listarDatos[i] = userInput.nextLine();
		}	
	}
	
	
public static void main (String [] args) {
	altaPersona alta1 = new altaPersona();
	alta1.ingresarDatosPersonales();
}
}
