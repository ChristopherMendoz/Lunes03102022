package metodos;

import java.util.Scanner;

public class SobrecargaDeMetodos {
	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {

		
		System.out.println("El area Lateral del Prisma es = "+calcularAreaLateralPrisma());
		System.out.println("<--------------------------------------------------------->");
		System.out.println("El area Lateral del Prisma es = "+calcularAreaLateralPrisma(5));
		System.out.println("<--------------------------------------------------------->");
		System.out.println("El area Lateral del Prisma es = "+calcularAreaLateralPrisma(5,6.4));
		System.out.println("<--------------------------------------------------------->");
		System.out.println("El area Lateral del Prisma es = "+calcularAreaLateralPrisma(5,6.4,11.2));
		System.out.println("<--------------------------------------------------------->");

	}
	//Es un metodo que devuelve un valor double pero no requiere datos de entrada
	private static double calcularAreaLateralPrisma() {
		double  l, h, areaLateral;
		int n;
		System.out.print("Ingrese n = ");
		n = lector.nextInt();
		System.out.print("Ingrese l = ");
		l = lector.nextDouble();
		System.out.print("Ingrese h = ");
		h = lector.nextDouble();
		areaLateral = n* l * h ;
		
		return areaLateral;
	}
	private static double calcularAreaLateralPrisma(int n) {
		double  l, h, areaLateral;
		System.out.print("Ingrese l = ");
		l = lector.nextDouble();
		System.out.print("Ingrese h = ");
		h = lector.nextDouble();
		areaLateral = n* l * h ;
		
		return areaLateral;
	}
	private static double calcularAreaLateralPrisma(int n,double l) {
		double   h, areaLateral;
		System.out.print("Ingrese h = ");
		h = lector.nextDouble();
		areaLateral = n* l * h ;
		
		return areaLateral;
	}
	private static double calcularAreaLateralPrisma(int n,double l , double h) {
		double    areaLateral;
		areaLateral = n* l * h ;
		
		return areaLateral;
	}

}
