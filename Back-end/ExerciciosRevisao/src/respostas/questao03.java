package respostas;

import java.util.Scanner;

public class questao03 {

	public static void main(String[] args) {

		double a, b, c;
		
		double areaTriangulo;
		double areaCirculo;
		double areaTrapezio;
		double areaQuadrado;
		double areaRetangulo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor de A: ");
		a = sc.nextDouble();
		
		System.out.println("Valor de B: ");
		b = sc.nextDouble();
		
		System.out.println("Valor de C: ");
		c = sc.nextDouble();
		
		areaTriangulo = (a * c) / 2;
		areaCirculo = Math.PI*Math.pow(c, 2);
		areaTrapezio = ((a+b) * c) / 2;
		areaQuadrado = b*b;
		areaRetangulo = a*b;
		
		System.out.println("Area do Triângulo: " + areaTriangulo);
		System.out.printf("Area do Circulo: %.2f \n", areaCirculo);
		System.out.println("Area do Trapézio: " + areaTrapezio);
		System.out.println("Area do Quadrado: " + areaQuadrado);
		System.out.println("Area do Retangulo: " + areaRetangulo);
	}

}
