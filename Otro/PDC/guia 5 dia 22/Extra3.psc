////Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos y
////ceros. Llenando el marco o la delimitación externa de la matriz de unos y la parte interna de
////ceros. Por ejemplo, nuestro matriz final debería verse así:
////	111111111111111
////	100000000000001
////	100000000000001
////	100000000000001
////	111111111111111

Algoritmo sin_titulo
	Definir matriz,i,j Como Entero
	
	Dimension matriz(5,15)
	
	Para i = 0 Hasta 4
		Para j = 0 Hasta 14
			Si i <> 0 Y i <> 4 Y j <> 0 Y j <> 14 Entonces
				matriz(i,j) = 0
			SiNo
				matriz(i,j) = 1
			FinSi
		FinPara
	FinPara
	
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 14 Hacer
			Escribir sin saltar "(" matriz(i,j) ") "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	
FinAlgoritmo
