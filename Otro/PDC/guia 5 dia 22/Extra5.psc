////Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos
////primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
////deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar
////la matriz de la siguiente forma:
////	3 + 5 = 8
////	4 + 3 = 7
////	1 + 4 = 5

Algoritmo sin_titulo
	Definir matriz,i,j,f Como Entero
	
	Escribir "Ingrese el número de filas:"
	Leer f
	
	Dimension matriz(f,3)
	
	Escribir "Ingrese valores enteros:"
	
	Para i = 0 Hasta f-1
		Para j = 0 Hasta 2
			Si j <> 2 Entonces
				Leer matriz(i,j)
			SiNo
				matriz(i,2) = matriz(i,0) + matriz(i,1)
			FinSi
		FinPara
	FinPara
	
	Para i = 0 Hasta f-1 Hacer
		Para j = 0 Hasta 2 Hacer
			Segun j Hacer
				0: Escribir sin saltar matriz(i,j) " + "
				1: Escribir sin saltar matriz(i,j) " = "
				2: Escribir sin saltar matriz(i,j)
			FinSegun
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	
FinAlgoritmo
