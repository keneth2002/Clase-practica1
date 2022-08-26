package clasepractica1;

public class Troncodecono {

	public static void main(String[] args) {
		//Declaracion de variables
		float H, R, r;
		double G, Abase1, Abase2, AreaLateral, AreaTotal, Volumen;
		
		//Datos de entrada
		H = 20;
		R= 15;
		r= 8;
		G = Math.sqrt(Math.pow(H, 2) + Math.pow(R - r, 2));
		Abase1 = Math.PI * Math.pow(R, 2);
		Abase2 = Math.PI * Math.pow(r, 2);
		AreaLateral = Math.PI * G * (R  +  r);
        AreaTotal = AreaLateral + Abase1 + Abase2;
        Volumen =  Math.PI * H * (Math.pow(R, 2) + Math.pow(r, 2) + R * r);
        
        //Datos de salida
        System.out.println("Datos del Tronco de Cono :");
        System.out.println("1.Altura "  + H);
        System.out.println("2.Radio Mayor :"  + R);
        System.out.println("3.Radio Menor :"  + r);
        System.out.println("4.Generatriz :"  + String.format("%.2f", G));
        System.out.println("5.Area de la base Mayor :"  + String.format("%.2f", Abase1));
        System.out.println("6.Area de la base Menor :"  + String.format("%.2f", Abase2));
        System.out.println("7.Area lateral :"  + String.format("%.2f", AreaLateral));
        System.out.println("8.Area Total :"  + String.format("%.2f", AreaTotal));
        System.out.println("9.Volumen :"  + String.format("%.2f", Volumen));
 	}

}
