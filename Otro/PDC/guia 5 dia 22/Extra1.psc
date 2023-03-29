////Realizar un programa que rellene de números aleatorios una matriz a través de un subpro-
////grama y generar otro subprograma que muestre por pantalla la matriz final.

Algoritmo sin_titulo
	Definir matriz,f,c Como Entero
	
	Escribir "Ingrese el número de filas:"
	Leer f
	Escribir "Ingrese el número de columnas:"
	Leer c
	
	Dimension matriz(f,c)
	
	rellenarMatriz(matriz,f,c)
	mostrarMatriz(matriz,f,c)
	
FinAlgoritmo

SubProceso rellenarMatriz(matriz,f,c)
	Definir i,j Como Entero
	
	Para i = 0 Hasta f-1 Hacer
		Para j = 0 Hasta c-1 Hacer
			matriz(i,j) = Aleatorio(0,100)
		FinPara
	FinPara
FinSubProceso

	
	SubProceso mostrarMatriz(matriz,f,c)
		Definir i,j Como Entero
		
		Para i = 0 Hasta f-1 Hacer
			Para j = 0 Hasta c-1 Hacer
				Escribir sin saltar "(" matriz(i,j) ") "
			FinPara
			Escribir ""
		FinPara
		Escribir ""
FinSubProceso
