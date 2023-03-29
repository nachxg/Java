////Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3. Inicia-
////lice las matrices para evitar el ingreso de datos por teclado.

Algoritmo sin_titulo
	Definir matriz1,matriz2,mult,i,j Como Entero
	
	Dimension matriz1(3,3),matriz2(3,3),mult(3,3)
	
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			matriz1(i,j) = Aleatorio(0,100)
			matriz2(i,j) = Aleatorio(0,100)
		FinPara
	FinPara
	
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			mult(i,j) = matriz1(i,j) * matriz2(i,j)
		FinPara
	FinPara
	
	
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			Escribir sin saltar "(" matriz1(i,j) ") "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			Escribir sin saltar "(" matriz2(i,j) ") "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			Escribir sin saltar "(" mult(i,j) ") "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	
FinAlgoritmo
