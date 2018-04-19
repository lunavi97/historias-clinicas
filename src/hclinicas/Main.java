package hclinicas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main  {

	private static List<HistoriaClinica> hClinica;
	
	private static int cantHistorias;
	
	public static void main(String[] args) throws IOException {
				
		leerHistoriasClinicas();
		
		ordenarHistoriasClinicas();
		
		archivarHistoriasClinicasOrdenadas();
		
				
	}
	
	public static void leerHistoriasClinicas() throws FileNotFoundException {
		
		File pathEntrada = new File("h_clinicas.in");
		
		Scanner sc = new Scanner(pathEntrada);
		
		cantHistorias = sc.nextInt();
		
		hClinica = new ArrayList<HistoriaClinica>();
		
		for(int i = 0; i < cantHistorias; i++) {
			
			int numHistoriaClinica = sc.nextInt();
			String nomHistoriaClinica = sc.nextLine();
			
			hClinica.add(new HistoriaClinica(numHistoriaClinica, nomHistoriaClinica));
			
		}
		
		sc.close();
	}
	
	public static void ordenarHistoriasClinicas() {
		
		hClinica.sort(null);
		
	}
	
	public static void archivarHistoriasClinicasOrdenadas() throws IOException {
		
		File pathSalida = new File("hc_ordenado.out");
		
		FileWriter fw = new FileWriter(pathSalida);
		
		PrintWriter pw = new PrintWriter(fw);
		
		for(int i = 0; i < cantHistorias; i++) {
			
			hClinica.get(i).mostrar(pw);
			
		}
		
		fw.close();
		
	}
	
}
