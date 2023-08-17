package aula04;

import java.util.Scanner;

public class Poo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		 System.out.println("Entre com as medidas do triangulo X: ");
		 xA = sc.nextDouble();
		 xB = sc.nextDouble();
		 xC = sc.nextDouble();
		 
		 System.out.println("Entre com as medidas do triangulo X: ");
		 yA = sc.nextDouble();
		 yB = sc.nextDouble();
		 yC = sc.nextDouble();
		 
		 double xP = (xA + xB + xC)/ 2.0;
		 double areaX = Math.sqrt( xP * (xP - xA) * (xP - xB) * (xP - xC));
		 
		 double yP = (yA + yB + yC)/ 2.0;
		 double areaY = Math.sqrt( yP * (yP - yA) * (yP - yB) * (yP - yC));
		 
		 System.out.println("A area do triangulo X: " + areaX);
		 System.out.println("A area do triangulo Y: " + areaY);

		 sc.close();
	}

}
