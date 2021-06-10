/* 
   11. Se ingresan 10 números cuyos valores corresponden a los de la ruleta (0,1,2,…,36), se pide hallar y mostrar por pantalla lo siguiente:
        a. Cantidad de números impares.
        b. Promedio de los números pares (no contar los ceros).
        c. Cantidad de números que se encuentran en la 2º docena (13 al 24).
        d. El número más grande.
        e. ¿En qué cambia la solución si en lugar de leer 10 números, ahora se leen números hasta que llega el valor 36?
*/

import java.util.*;

public class Ejercicio11 {

	public static void main(String args[]) {

		Random random = new Random();

		final int CANTIDAD = 10;
		int impares=0, nMayor=0, num13_24=0, numAl, pares=0;
		double promPar, sumaPar=0;

		System.out.println();

		for (int i=0; i<CANTIDAD; i++) {

			numAl = random.nextInt(36+1);

			System.out.println(" - "+numAl+" -");

			if (numAl%2==0) {

				if (numAl!=0) {
					pares++;
					sumaPar += numAl;
				}

			} else {
				impares++;
			}

			if (numAl>=13 && numAl<=24) {
				num13_24++;
			}

			if (numAl>nMayor) {
				nMayor = numAl;
			}
		
		}

		promPar = sumaPar/pares;

		System.out.println("\n   Cantidad de Impares: "+impares);
		System.out.println(  "   Promedio de Pares: "+promPar);
		System.out.println(  "   Cantidad de numeros en segunda docena: "+num13_24);
		System.out.println(  "   Numero mayor: "+nMayor+"\n");
	}


}

