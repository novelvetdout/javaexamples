package py.com.uaa.pooj.util;


public class TestOperadoresIteradores {
//Método que cuenta como parámetro un vector con números enteros.
	public int sumar(int[] numeros) {
		int resultado = 0;
		for (int i = 0; i < numeros.length; i++) {
			resultado = resultado + numeros[i];
		}
		return resultado;
	}
	
	public int restar(int[] numeros) {
		int resultado = 0;
		for (int i = 0; i < numeros.length; i++) {
			resultado = resultado - numeros[i];
		}
		return resultado;
	}
	
	public int multiplicar(int[] numeros) {
		int resultado = 0;
		for (int i = 0; i < numeros.length; i++){
			resultado = resultado * numeros[i];
		}
		return resultado;
	}
	
	
	public static void main (String[] args) {
		
		TestOperadoresIteradores firstTest = new TestOperadoresIteradores();
		int[] sumofNumbers = {10, 20, 30, 40, 50};
		System.out.println(firstTest.sumar(sumofNumbers));
	}
}
