package aula04;

import java.util.Scanner;

import application.Triangulo;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		
		x = new Triangulo();
		y = new Triangulo();
		
		 System.out.println("Entre com as medidas do triangulo X: ");
		 x.a = sc.nextDouble();
		 x.a = sc.nextDouble();
		 x.c = sc.nextDouble();
		 
		 System.out.println("Entre com as medidas do triangulo X: ");
		 y.a = sc.nextDouble();
		 y.b = sc.nextDouble();
		 y.c = sc.nextDouble();
		 
		 sc.close();
		 
		 double areaX = x.area();
		 double areaY = x.area();
		 
		 System.out.println("A area do triangulo X: " + areaX);
		 System.out.println("A area do triangulo Y: " + areaY);
		 
		 if(areaX > areaY) {
			 System.out.println("Maior area: X");
		 } else {
			 System.out.println("Maior area: Y");
		 }
		 
	}

}
