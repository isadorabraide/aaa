package br.edu.principal;

import java.util.Scanner;

import br.edu.figplanas.Circulo;
import br.edu.figplanas.Losango;
import br.edu.figplanas.Paralelogramo;
import br.edu.figplanas.Quadrado;
import br.edu.figplanas.Retangulo;
import br.edu.figplanas.Trapezio;
import br.edu.figplanas.Triangulo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Triangulo.");
		
		Triangulo t1 = new Triangulo();
		System.out.println("Digite a base:");
		t1.base=sc.nextDouble();
		System.out.println("Digite a altura:");
		t1.altura=sc.nextDouble();
		t1.calcArea();
		
		
		System.out.println("Area: "+t1.area);
		
		System.out.println("Quadrado.");
		
		Quadrado q1 = new Quadrado();
		
		System.out.println("Digite o lado:");
		q1.lado=sc.nextDouble();
		q1.calcArea();
		System.out.println("Area: " +q1.area);
		
		System.out.println("Trapezio.");
		
		Trapezio tr1 = new Trapezio();
		System.out.println("Digite a base maior:");
		tr1.base_maior=sc.nextDouble();
		System.out.println("Digite a base menor:");
		tr1.base_menor=sc.nextDouble();
		System.out.println("Digite a altura:");
		tr1.altura=sc.nextDouble();
		tr1.calcArea();
		System.out.println("Area:" +tr1.area);
		
		System.out.println("retangulo.");
		
		Retangulo r1 = new Retangulo();
		System.out.println("digite a base:");
		r1.base = sc.nextDouble();
		System.out.println("digite a altura: ");
		r1.altura = sc.nextDouble();
		r1.calcArea();
		System.out.println("a area é igual a: " +r1.area);
		
		System.out.println("Losango");
		Losango l1 = new Losango();
		System.out.println("Digite a diagonal maior:");
		l1.diagonal_maior=sc.nextDouble();
		System.out.println("Digite a diagonal menor:");
		l1.diagonal_menor=sc.nextDouble();
		l1.calcArea();
		System.out.println("a area é igual a: " +l1.area);
		
		System.out.println("paralelogramo");
		Paralelogramo p1 = new Paralelogramo();
		System.out.println("Digite a base:");
		p1.base=sc.nextDouble();
		System.out.println("Digite a altura:");
		p1.altura=sc.nextDouble();
		p1.calcArea();
		System.out.println("a area é igual a: " +p1.area);
		
		System.out.println("Circulo");
		Circulo c1 = new Circulo();
		System.out.println("Digite o raio:");
		c1.raio=sc.nextDouble();
		c1.calcArea();
		System.out.println("a area é igual a: " +c1.area);
		
		

	}

}
