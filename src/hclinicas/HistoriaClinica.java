package hclinicas;

import java.io.PrintWriter;

public class HistoriaClinica implements Comparable<HistoriaClinica> {
	
	private int numero;
	private String nombreCompleto;
	
	public HistoriaClinica(int numero, String nombreCompleto) {
		this.numero = numero;
		this.nombreCompleto = nombreCompleto;
	}
	
	public void mostrar(PrintWriter pw) {
		pw.println(this.numero + " " + this.nombreCompleto);
	}
	
	@Override
	public int compareTo(HistoriaClinica otro) {
		
		return this.numero - otro.numero;
		
	}
	
}
