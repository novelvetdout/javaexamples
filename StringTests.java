package py.com.uaa.pooj.util;

public class TestCadenas {

//Concatenar cadenas
	public String concatenar(String cadena1, String cadena2) {
		return cadena1 + cadena2;
		}
//Convertir a Minúsculas	
	public String convertirMinusculas(String cadena) {
		return cadena.toLowerCase();
	}
//Convertir a Minúsculas	
	public String convertirMayusculas(String cadena) {
		return cadena.toUpperCase();
	}
//Obtener longitud de la Cadena	
	public int obtenerLongitudCadena(String cadena) {
		return cadena.length();
	}
//Comparar Cadena diferenciando Mayúsculas	
	public boolean compararCadenaDiferenciandoMayusculas(String cadena1,
			String cadena2) {
		return cadena1.equals(cadena2);
	}
//Comparar Cadena sin diferenciar Mayúsculas y Minúsculas	
	public boolean compararCadenaSinDiferenciarMayusculasYMinusculas(
			String cadena1, String cadena2) {
		return cadena1.equalsIgnoreCase(cadena2);
	}
	// Dividir cadenas
	public String[] divisionCadenas(String cadena) {
		String arrayString[];
		arrayString = cadena.split(";");
		return arrayString;
	}
//Crear Subcadenas
	public String subcadena(String cadena, int inicio, int fin) {
		return cadena.substring(inicio, fin);
	}
// Obtener posición de un caracter de una cadena
	public char obtenerCaracterCadena(String cadena, int posicion) {
		return cadena.charAt(posicion);
	}
// Verificar si la cadena empieza con determinado caracter
	public boolean verificarSiComienzaCon(String cadena, String cadenaAVerificar) {
		return cadena.startsWith(cadenaAVerificar);
	}

	public boolean verificarSiTerminaCon(String cadena, String cadenaAVerificar) {
		return cadena.endsWith(cadenaAVerificar);
	}
//Verificar si la cadena contiene determinado caracter
	public boolean verificarSiContiene(String cadena, String cadenaAVerificar) {
		return cadena.contains(cadenaAVerificar);
	}
//Obtener el index de una cadena
	public int obtenerIndiceSubcadena(String cadena, String subcadena) {
		return cadena.indexOf(subcadena);
	}
	
	//Aplicando los métodos
	
	public static void main(String[] args) {
		TestCadenas testC = new TestCadenas();
		System.out.println(testC.concatenar("Hola", " Que tal?"));
		System.out.println(testC.convertirMinusculas("Hola"));
		System.out.println(testC.convertirMayusculas("Hola"));
		System.out.println(testC.obtenerLongitudCadena("Espectaculo"));
		System.out.println(testC.compararCadenaDiferenciandoMayusculas("Hola", "Hola"));  
		//No se que pasa con este resultado de compararCadenaDiferenciandoMayusculas,
		//aparentemente no tiene bugs pero no me tira ni true ni false. :(
		System.out.println(testC.compararCadenaSinDiferenciarMayusculasYMinusculas("Pocos", "Muchos"));
		System.out.println(testC.divisionCadenas("Sincronicidad"));
		System.out.println(testC.subcadena("Humanidad", 1, 3));
		System.out.println(testC.obtenerCaracterCadena("Candado", 4));
		System.out.println(testC.verificarSiComienzaCon("H", "Hola"));
		System.out.println(testC.verificarSiTerminaCon("J", "Humanidad"));
		System.out.println(testC.verificarSiContiene("Ho", "Hola"));
		System.out.println(testC.obtenerIndiceSubcadena("Humanidad", "Huma"));
		}
}
