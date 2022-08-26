package clasepractica1;

public class Esfera {

	public static void main(String[] args) {
		// Declaracion de variables
		float R;
		double Area, Volumen;
		
		// Datos de entrada
		R = 10;
		Area = 4 * (Math.PI * Math.pow(R, 2));
		Volumen =  (Math.PI * Math.pow(R, 3)) * 4 / 3;
		
		// Datos de salida
		System.out.println("Datos de la esfera :");
		System.out.println("1.Radio :"  + R);
		System.out.println("2.Area :"  + String.format("%.2f", Area));
		System.out.println("3.Volumen :"  + String.format("%.2f", Volumen));
	}

}
