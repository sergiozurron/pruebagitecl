package main;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Editada la linea 6");
	}
	
}

class Circulo{
	private double radio;
	public Circulo(double radio){
		this.radio = radio;
	}

	public double getRadio(){
		return radio
	}

	public void setRadio(double radio){
		this.radio = radio;
	}
}
