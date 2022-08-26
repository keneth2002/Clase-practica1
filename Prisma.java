package clasepractica1;

public class Prisma {

	public static void main(String[] args) {
		// Nombres de variables
				//Declaracion de variables
				int N, H;
				float AreaLateral;
				float Pbase, L;
				double AnguloCentral, Apotema, Abase, AreaTotal, Volumen;
				//Datos de entrada
				H= 20;
				N= 5;
				L = 8.5F;
				//Procedimiento
				Pbase = N * L;
				AreaLateral = Pbase *H;
		        AnguloCentral = 360/N * (Math.PI/180);
		        Apotema = L/(2*Math.tan(AnguloCentral)/2);
		        Abase = (Pbase * Apotema)/2;
		        AreaTotal = AreaLateral + 2 * Abase;
		        Volumen = Abase * H;
		        //Datos de salida (Resultados);
		        System.out.println("Datos del prisma : ");
		        System.out.println("1.Cantidad de lados : " + N);
		        System.out.println("2.Longitud de lados : " + L);
		        System.out.println("3.Altura : " + H);
		        System.out.println("4.Perimetro de la base : " + Pbase);
		        System.out.println("5.Area de la base : " + String.format("%.2f", Abase));
		        System.out.println("6.Apotema : " + String.format("%.2f", Apotema));
		        System.out.println("7.Area Lateral : " +  AreaLateral);
		        System.out.println("8.Area Total : " + String.format("%.2f", AreaTotal));
		        System.out.println("9.Volumen : " + String.format("%.2f", Volumen));
			}


	}


