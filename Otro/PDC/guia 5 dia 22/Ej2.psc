////Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el
////usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las coorde-
////nadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En caso de no
////encontrar el valor dentro de la matriz se debe mostrar un mensaje.

Algoritmo sin_titulo
	Definir matriz,i,j,num,cont Como Entero
	cont = 0
	
	Dimension matriz(5,5)
	
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 4 Hacer
			matriz(i,j) = Aleatorio(0,25)
		FinPara
	FinPara
	
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 4 Hacer
			Escribir sin saltar "(" matriz(i,j) ") "
		FinPara
		Escribir ""
	FinPara
	
	Escribir "Ingrese un número de 0 al 25: "
	Leer num
	
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 4 Hacer
			Si matriz(i,j) = num Entonces
				Escribir "El número ingresado se encuentra en la posición (" i "," j ")."
				cont = cont + 1	
			FinSi
		FinPara
	FinPara
	
	Si cont == 0 Entonces
		Escribir "El número ingresado no se encuentra en la matriz."
	FinSi
	
FinAlgoritmo
