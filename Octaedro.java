package clasepractica1;

public class Octaedro {

	public static void main(String[] args) {
		//Declaracion de derivadas
		float a;
		double Area, Volumen;
		
		//Datos de entrada
		a = 12;
		Area= 2 * Math.pow(a, 2) * Math.sqrt(3);
		Volumen= (Math.sqrt(2) / 3) * Math.pow(a, 3);
		
		//Datos de salida
		System.out.println("Datos del Octaedro :" );
		System.out.println("1.Valor de las aristas :"  + a);
		System.out.println("2.Area :"  + String.format("%.2f", Area));
		System.out.println("3.Volumen :"  + String.format("%.2f", Volumen));

	}

}
