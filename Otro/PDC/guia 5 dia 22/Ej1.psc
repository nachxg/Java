////Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el usuario y
////los muestre por pantalla.

Algoritmo sin_titulo
	Definir matriz,i,j Como Entero
	
	Dimension matriz(3,3)
	
	Escribir "Ingrese 9 valores para la matriz:"
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			Escribir "Ingrese el valor correspondiente a (" i "," j ")"
			Leer matriz(i,j)
		FinPara
	FinPara
	
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			Escribir sin saltar "(" matriz(i,j) ") "
		FinPara
		Escribir ""
	FinPara

FinAlgoritmo
