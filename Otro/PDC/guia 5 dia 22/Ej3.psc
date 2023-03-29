////Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
////un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro subpro-
////grama que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y los re-
////sultados por pantalla.

Algoritmo sin_titulo
	Definir f,c,matriz Como Entero
	
	Escribir "Ingrese el número de filas:"
	Leer f
	Escribir "Ingrese el número de columnas:"
	Leer c
	
	Dimension matriz(f,c)
	Escribir ""
	
	rellenarMatriz(matriz,f,c)
	calcularSuma(matriz,f,c)
	
FinAlgoritmo

SubProceso rellenarMatriz(matriz,f,c)
	Definir i,j Como Entero
	
	Para i = 0 Hasta f-1 Hacer
		Para j = 0 Hasta c-1 Hacer
			matriz(i,j) = Aleatorio(0,25)
		FinPara
	FinPara
	
	Para i = 0 Hasta f-1 Hacer
		Para j = 0 Hasta c-1 Hacer
			Escribir sin saltar "(" matriz(i,j) ") "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
FinSubProceso

SubProceso calcularSuma(matriz,f,c) 
	Definir i,j,suma Como Entero
	suma = 0 
	
	Para i = 0 Hasta f-1 Hacer
		Para j = 0 Hasta c-1 Hacer
			suma = suma + matriz(i,j)
		FinPara
	FinPara
	
	Escribir "La suma de todos los números de la matriz es: ",suma
	
FinSubProceso
	