Algoritmo Ejercicio11
	
	Definir impares, pares, sumaPar, num13_24, nMayor como Entero
	Definir promPar como Real
	
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		
		numAl <- Aleatorio(0,36)
		
		Si numAl MOD 2 = 0 Entonces
			Si numAl <> 0 Entonces
				pares <- pares + 1
				sumaPar <- sumaPar + numAl
			Fin Si
		SiNo
			impares <- impares+1
		Fin Si
		
		Si numAl>=13 Y numAl<=24 Entonces
			num13_24 <- num13_24 + 1
		Fin Si
		
		Si numAl > nMayor Entonces
			nMayor <- numAl
		Fin Si
		
		Escribir numAl
		
	Fin Para
	
	promPar <- sumaPar / pares
	
	Escribir "Cantidad de Impares: " impares
	Escribir "Promedio de Pares:" promPar
	Escribir "Cantidad de números en segunda docena: " num13_24
	Escribir "Número mayor: " nMayor
	
FinAlgoritmo
