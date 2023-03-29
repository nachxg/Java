////Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la diagonal
////principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro subpro-
////ceso para imprimir la matriz.

Algoritmo sin_titulo
	Definir matriz,fc como Entero
	
	Escribir "Ingrese el número de filas y columnas:"
	Leer fc
	
	Dimension matriz(fc,fc)
	
	rellenarMatriz(matriz,fc)
	mostrarMatriz(matriz,fc)
	
FinAlgoritmo

SubProceso rellenarMatriz(matriz,fc)
	Definir i,j Como Entero
	
	Para i = 0 Hasta fc-1 Hacer
		Para j = 0 Hasta fc-1 Hacer
			Si i == j Entonces
				matriz(i,j) = 0
			SiNo
				matriz(i,j) = Aleatorio(0,25)
			FinSi
		FinPara
	FinPara
	
FinSubProceso

SubProceso mostrarMatriz(matriz,fc)
	Definir i,j Como Entero
	
	Para i = 0 Hasta fc-1 Hacer
		Para j = 0 Hasta fc-1 Hacer
			Escribir sin saltar "(" matriz(i,j) ") "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	
FinSubProceso
