////Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario), llenarla
////con números aleatorios entre 1 y 100 y mostrar su traspuesta.
////¿Qué es una Matriz Traspuesta?
////
////La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por co-
////lumnas (o viceversa).
////
////Matriz A = è Matriz B =
////
////Ejemplo: Obsérvese, por ejemplo, que la primera fila de la matriz A es (1,0,4). Esta fila es la pri-
////mera columna de su matriz traspuesta.

Algoritmo sin_titulo
	Definir matriz,traspuesta,f,c Como Entero
	
	Escribir "Ingrese el número de filas:"
	Leer f
	Escribir "Ingrese el número de columnas:"
	Leer c
	
	Dimension matriz(f,c),traspuesta(f,c)
	
	rellenarMatriz(matriz,traspuesta,f,c)
	mostrarMatriz(matriz,traspuesta,f,c)
	
FinAlgoritmo

SubProceso rellenarMatriz(matriz,traspuesta,f,c)
	Definir i,j Como Entero
	
	Para i = 0 Hasta f-1 Hacer
		Para j = 0 Hasta c-1 Hacer
			matriz(i,j) = Aleatorio(0,100)
			traspuesta(j,i) = matriz(i,j)
		FinPara
	FinPara
FinSubProceso


SubProceso mostrarMatriz(matriz,traspuesta,f,c)
	Definir i,j Como Entero
	
	Para i = 0 Hasta f-1 Hacer
		Para j = 0 Hasta c-1 Hacer
			Escribir sin saltar "(" matriz(i,j) ") "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	
	Para i = 0 Hasta f-1 Hacer
		Para j = 0 Hasta c-1 Hacer
			Escribir sin saltar "(" traspuesta(i,j) ") "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
FinSubProceso