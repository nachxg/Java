Algoritmo ejercicioCooperativoGuia4
	Definir tablero como Cadena
	Dimension tablero[9, 12]
	inicializarMatriz(tablero,9,12)
	agregarPalabra(tablero)
//	acomodarPalabras(tablero)
	imprimirMatriz(tablero, 9, 12)
FinAlgoritmo

SubProceso inicializarMatriz(tablero,9,12)
	Definir i,j Como Entero
	
	Escribir "Inicializando matriz..."
	
	Para i = 0 Hasta 8
		Para j = 0 Hasta 11
			tablero(i,j) = " "
		FinPara
	FinPara
	
	imprimirMatriz(tablero, 9, 12)
	Esperar 1 Segundos
	Limpiar Pantalla
	
FinSubProceso

SubProceso imprimirMatriz(tablero,9,12)
	Definir i,j Como Entero
	
	Para i = 0 Hasta 8
		Para j = 0 Hasta 11
			Escribir sin saltar "[" tablero(i,j) "] "
		FinPara
		Escribir ""
	FinPara
FinSubProceso

SubProceso agregarPalabra(tablero)
	Definir i,j,c Como Entero
	c = 0
	
	Escribir "Agregando palabra VECTOR..."
	Esperar 500 Milisegundos
	
	Para i = 0 Hasta Longitud("VECTOR")-1
		tablero(0,i) = Subcadena("VECTOR",c,c)
		c = c + 1
		Si Subcadena("VECTOR",c,c) == "R" Entonces
			Escribir "La letra R se encuentra en la posición " c+1 "."
		FinSi
	FinPara
	
	c = 0
	imprimirMatriz(tablero, 9, 12)
	Escribir "Pulse una tecla para continuar con la siguiente palabra..."
	Esperar Tecla
	Limpiar Pantalla
	
	Escribir "Agregando palabra MATRIX..."
	Esperar 500 Milisegundos
	
	Para i = 0 Hasta Longitud("MATRIX")-1
		tablero(1,i) = Subcadena("MATRIX",c,c)
		c = c + 1
		Si Subcadena("MATRIX",c,c) == "R" Entonces
			Escribir "La letra R se encuentra en la posición " c+1 "."
		FinSi
	FinPara
	
	c = 0
	imprimirMatriz(tablero, 9, 12)
	Escribir "Pulse una tecla para continuar con la siguiente palabra..."
	Esperar Tecla
	Limpiar Pantalla
	
	Escribir "Agregando palabra PROGRAMA..."
	Esperar 500 Milisegundos
	
	Para i = 0 Hasta Longitud("PROGRAMA")-1
		tablero(2,i) = Subcadena("PROGRAMA",c,c)
		c = c + 1
		Si Subcadena("PROGRAMA",c,c) == "R" Y c == 1 Entonces
			Escribir "La primera letra R se encuentra en la posición " c+1 "."
		FinSi
	FinPara
	
	c = 0
	imprimirMatriz(tablero, 9, 12)
	Escribir "Pulse una tecla para continuar con la siguiente palabra..."
	Esperar Tecla
	Limpiar Pantalla
	
	Escribir "Agregando palabra SUBPROGRAMA..."
	Esperar 500 Milisegundos
	
	Para i = 0 Hasta Longitud("SUBPROGRAMA")-1
		tablero(3,i) = Subcadena("SUBPROGRAMA",c,c)
		c = c + 1
		Si Subcadena("SUBPROGRAMA",c,c) == "R" Y c == 4 Entonces
			Escribir "La primera letra R se encuentra en la posición " c+1 "."
		FinSi
	FinPara
	
	c = 0
	imprimirMatriz(tablero, 9, 12)
	Escribir "Pulse una tecla para continuar con la siguiente palabra..."
	Esperar Tecla
	Limpiar Pantalla
	
	Escribir "Agregando palabra SUBPROCESO..."
	Esperar 500 Milisegundos
	
	Para i = 0 Hasta Longitud("SUBPROCESO")-1
		tablero(4,i) = Subcadena("SUBPROCESO",c,c)
		c = c + 1
		Si Subcadena("SUBPROCESO",c,c) == "R" Entonces
			Escribir "La primera letra R se encuentra en la posición " c+1 "."
		FinSi
	FinPara
	
	c = 0
	imprimirMatriz(tablero, 9, 12)
	Escribir "Pulse una tecla para continuar con la siguiente palabra..."
	Esperar Tecla
	Limpiar Pantalla
	
	Escribir "Agregando palabra VARIABLE..."
	Esperar 500 Milisegundos
	
	Para i = 0 Hasta Longitud("VARIABLE")-1
		tablero(5,i) = Subcadena("VARIABLE",c,c)
		c = c + 1
		Si Subcadena("VARIABLE",c,c) == "R" Entonces
			Escribir "La primera letra R se encuentra en la posición " c+1 "."
		FinSi
	FinPara
	
	c = 0
	imprimirMatriz(tablero, 9, 12)
	Escribir "Pulse una tecla para continuar con la siguiente palabra..."
	Esperar Tecla
	Limpiar Pantalla
	
	Escribir "Agregando palabra ENTERO..."
	Esperar 500 Milisegundos
	
	Para i = 0 Hasta Longitud("ENTERO")-1
		tablero(6,i) = Subcadena("ENTERO",c,c)
		c = c + 1
		Si Subcadena("ENTERO",c,c) == "R" Entonces
			Escribir "La primera letra R se encuentra en la posición " c+1 "."
		FinSi
	FinPara
	
	c = 0
	imprimirMatriz(tablero, 9, 12)
	Escribir "Pulse una tecla para continuar con la siguiente palabra..."
	Esperar Tecla
	Limpiar Pantalla
	
	Escribir "Agregando palabra PARA..."
	Esperar 500 Milisegundos
	
	Para i = 0 Hasta Longitud("PARA")-1
		tablero(7,i) = Subcadena("PARA",c,c)
		c = c + 1
		Si Subcadena("PARA",c,c) == "R" Entonces
			Escribir "La primera letra R se encuentra en la posición " c+1 "."
		FinSi
	FinPara
	
	c = 0
	imprimirMatriz(tablero, 9, 12)
	Escribir "Pulse una tecla para continuar con la siguiente palabra..."
	Esperar Tecla
	Limpiar Pantalla
	
	Escribir "Agregando palabra MIENTRAS..."
	Esperar 500 Milisegundos
	
	Para i = 0 Hasta Longitud("MIENTRAS")-1
		tablero(8,i) = Subcadena("MIENTRAS",c,c)
		c = c + 1
		Si Subcadena("MIENTRAS",c,c) == "R" Entonces
			Escribir "La primera letra R se encuentra en la posición " c+1 "."
		FinSi
	FinPara
	
	c = 0
	imprimirMatriz(tablero, 9, 12)
	Escribir "Pulse una tecla para continuar con la siguiente palabra..."
	Esperar Tecla
	Limpiar Pantalla
	
FinSubProceso
	