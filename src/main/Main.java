package main;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Editada la linea 6");
	}
	
}

class Rectangulo{
	
	private int base;
	private int altura;
	
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public void imprimir() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%" + base + "s", "")).replace(0, base, "_");
	}
	
}

class Circulo{
	private double radio;
	public Circulo(double radio){
		this.radio = radio;
	}

	public double getRadio(){
		return radio;
	}

	public void setRadio(double radio){
		this.radio = radio;
	}
}
