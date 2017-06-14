package regalos;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegalosTest {

	private static String archivoIn = "Preparacion de Prueba/Lote de Prueba/Entrada/";
	private static String archivoOut = "Ejecucion de Prueba/Salida Obtenida/";
	
	@Test
	public void testEnunciado() {
		Regalos regalos = new Regalos(archivoIn + "00_Enunciado.in");
		regalos.escribirMatriz();
	}

}
