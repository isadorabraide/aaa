package br.edu.figplanas;

public class Trapezio {
	
	public double base_maior;
	public double base_menor;
	public double altura;
	public double area;
	
	public void calcArea() {
		area=((base_maior+base_menor)*altura)/2;
	}

}
