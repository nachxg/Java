Algoritmo sin_titulo
	Definir matriz,diagonal3D1,diagonal3D2 Como Entero
	Definir cadena1,cadena2 Como Caracter
	
	Dimension matriz(3,3,3)
	
	cadena1 = "123456789"
	cadena2 = "987654321"
	
	inicializarMatriz(matriz)
	llenarMatriz_Z0(matriz,cadena1)
	llenarMatriz_Z1(matriz,cadena2)
	llenarMatriz_Z2(matriz)
	imprimirMatriz(matriz)
	
	diagonal3D1 = matriz(0, 2, 0)*matriz(1, 1, 1)*matriz(2, 0, 2)
	diagonal3D2 = matriz(0, 0, 0)*matriz(1, 1, 1)*matriz(2, 2, 2)
	
	Escribir ""
	Escribir "La multiplicación de los elementos de la diagonal 3D1 es: ",diagonal3D1
	Escribir "La multiplicación de los elementos de la diagonal 3D2 es: ",diagonal3D2
	
FinAlgoritmo

SubProceso inicializarMatriz(matriz)
	Definir i,j,k Como Entero
	
	Para i = 0 Hasta 2
		Para j = 0 Hasta 2
			Para k = 0 Hasta 2
				matriz(i,j,k) = 0
			FinPara
		FinPara
	FinPara
	
FinSubProceso

SubProceso llenarMatriz_Z0(matriz,cadena1)
	Definir i,j,c Como Entero 
	
	c = 0
	
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			matriz(i,j,0) = ConvertirANumero(Subcadena(cadena1,c,c))
			c = c + 1
		FinPara
	FinPara
	
FinSubProceso

SubProceso llenarMatriz_Z1(matriz,cadena2)
	Definir i,j,c Como Entero
	
	c = 0
	
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			matriz(i,j,1) = ConvertirANumero(Subcadena(cadena2,c,c))
			c = c + 1
		FinPara
	FinPara
	
FinSubProceso

SubProceso llenarMatriz_Z2(matriz)
	Definir i,j Como Entero
	
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			matriz(i,j,2) = matriz(i,j,0) * matriz(i,j,1)
		FinPara
	FinPara
	
FinSubProceso

SubProceso imprimirMatriz(matriz)
	Definir i,j Como Entero
	
	Para i = 0 Hasta 2
		Para j = 0 Hasta 2
			Escribir sin saltar "[" matriz(i,j,0) "] "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	Para i = 0 Hasta 2
		Para j = 0 Hasta 2
			Escribir sin saltar "[" matriz(i,j,1) "] "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	Para i = 0 Hasta 2
		Para j = 0 Hasta 2
			Escribir sin saltar "[" matriz(i,j,2) "] "
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso
	