package clasepractica1;

public class Piramide {

	public static void main(String[] args) {
		// Declaracion de variables
		float H, L;
		double Hcuadrada, Apotemacuadrada;
		double AP, Apotema, Pbase, Abase, AreaLateral, AreaTotal, Volumen;
		
		//Datos de entrada
		H = 12;
		L = 10;
		Apotema = L/2;
		Hcuadrada= Math.pow(H,2);
		Apotemacuadrada = Math.pow(Apotema, 2);
		Apotema = L/2;
		AP = Math.sqrt(Hcuadrada + Apotemacuadrada);
		Abase = L * L;
		Pbase = L;
		AreaLateral =  ((L * AP) / 2) * 4;
		AreaTotal = AreaLateral + Abase;
		Volumen = (Abase * H) / 3;
		
		//Datos de salida
		System.out.println("Datos de la piramide ;");
		System.out.println("1.Altura : "  + H);
		System.out.println("2.Longitud de sus lados :"  + L);
		System.out.println("3.Apotema :"  + Apotema);
		System.out.println("4.AP :"  + AP);
		System.out.println("5.Area de la base :"  + Abase);
		System.out.println("6.Perimetro de la base :"  + Pbase);
		System.out.println("7.Area Lateral :"  + AreaLateral);
		System.out.println("8.Area Total :"  + AreaTotal);
		System.out.println("9.Volumen :"  + Volumen);

	}

}
