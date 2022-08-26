package clasepractica1;

public class Dodecaedro {

	public static void main(String[] args) {
		//Declaracion de derivadas
		float a;
		double Area, Volumen;
		
		//Datos de entrada
		a = 20;
		Area= 3 * Math.pow(a, 2) * (Math.sqrt(25 + (10 * Math.sqrt(5))));
		Volumen= (15 + (7 * Math.sqrt(5) * Math.pow(a, 3) ) / 4);
        
		//Datos de salida
		System.out.println("Datos del Dodecaedro :");
		System.out.println("1.Valor de las aristas :"  + a);
		System.out.println("2.Area :"  + String.format("%.2f", Area));
		System.out.println("3.Volumen :"  + String.format("%.2f", Volumen));
	}

}
