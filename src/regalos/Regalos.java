package regalos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Regalos {
	
	private int cantidadLugares;
	private int[][] matrizInicial;
	
	public Regalos(String path){
		try {
			leerArchivo(path);
		} catch (Exception e) {
			System.out.println("Error al abrir archivo.");
			e.printStackTrace();
		}
	}
	
	public void leerArchivo(String path) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(path));
			this.cantidadLugares = sc.nextInt();
			this.matrizInicial = new int[this.cantidadLugares][this.cantidadLugares];
			
			for (int i = 0; i < this.cantidadLugares; i++) {
				int v = sc.nextInt();
				int j = 0;
				while(v != -1){
					this.matrizInicial[i][j] = v;
					v = sc.nextInt();
					j++;
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		sc.close();
	}
	
	public void escribirMatriz(){
		for(int i = 0; i < this.cantidadLugares; i++){
			for(int j = 0; j < this.cantidadLugares; j++){
				System.out.print(this.matrizInicial[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
