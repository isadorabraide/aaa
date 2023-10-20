package br.edu.figplanas;

public class Circulo {
	
	public double raio;
	public double area;
	public double pi = 3.14;
	
	public void calcArea() {
		
		area = pi * Math.pow(raio, 2);
	}

}
