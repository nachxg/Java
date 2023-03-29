Algoritmo Dia26_Guia5_01_EjercicioCooperativo
//	Se debe crear una matriz con las siguientes palabras como se muestra a continuaci�n. Luego de
//	eso debemos acomodar las palabras para que la primera letra "R" de cada una quede en la
//  posici�n 5, aline�ndose.
//	*	0	1	3	3	4	5	6	7	8	9	10	11		*	0	1	2	3	4	[5]	 6	7	8	9	10	11
//	0	V	E	C	T	O	R	*	*	*	*	*	*		0	V	E	C	T	O	[R]	 *	*	*	*	*	*
//	1	M	A	T	R	I	X	*	*	*	*	*	*		1	*	*	M	A	T	[R]	 I	X	*	*	*	*
//	2	P	R	O	G	R	A	M	A	*	*	*	*		2	*	*	*	*	P	[R]	 O	G	R	A	M	A
//	3	S	U	B	P	R	O	G	R	A	M	A	*		3	*	S	U	B	P	[R]	 O	G	R	A	M	A
//	4	S	U	B	P	R	O	C	E	S	O	*	*		4	*	S	U	B	P	[R]	 O	C	E	S	O	*
//	5	V	A	R	I	A	B	L	E	*	*	*	*		5	*	*	*	V	A	[R]	 I	A	B	L	E	*
//	6	E	N	T	E	R	O	*	*	*	*	*	*		6	*	E	N	T	E	[R]	 O	*	*	*	*	*
//	7	P	A	R	A	*	*	*	*	*	*	*	*		7	*	*	*	P	A	[R]	 A	*	*	*	*	*
//	8	M	I	E	N	T	R	A	S	*	*	*	*		8	M	I	E	N	T	[R]	 A	S	*	*	*	*				

	Definir tablero como Cadena
	Dimension tablero[9,12]
	
	inicializarMatriz(tablero, 9, 12)
	imprimirMatriz(tablero, 9, 12)
	Escribir ""
	
	agregarPalabra(tablero, "vector", 0)
	agregarPalabra(tablero, "matrix", 1)
	agregarPalabra(tablero, "programa", 2)
	agregarPalabra(tablero, "subprograma", 3)
	agregarPalabra(tablero, "subproceso", 4)
	agregarPalabra(tablero, "variable", 5)
	agregarPalabra(tablero, "entero", 6)
	agregarPalabra(tablero, "para", 7)
	agregarPalabra(tablero, "mientras", 8)
	
	imprimirMatriz(tablero, 9, 12)
	Escribir ""
	
	acomodarPalabras(tablero)
	imprimirMatriz(tablero, 9, 12)
FinAlgoritmo

// * Subprograma inicializarMatriz *
//	Debe recibir como par�metros la matriz a inicializar, la cantidad de filas y la cantidad de columnas.
//	En primera instancia inicializaremos la matriz con un "*" (asterisco) en cada lugar para que la
//	misma no est� vac�a y no tengamos problemas.

SubProceso inicializarMatriz(tablero,i,j)
	Para i = 0 Hasta 8
	    Para j = 0 Hasta 11
			tablero[i,j] = "*"
		FinPara
	FinPara
FinSubProceso

//	* Subprograma imprimirMatriz *
//	Debe recibir como par�metros la matriz a imprimir, la cantidad de filas y la cantidad de columnas.
//	Para que veamos la matriz en la consola cuando lo necesitemos.
//	Tengamos en cuenta que para que no queden pegadas las letras vamos a imprimir un espacio, la
//	letra y otro espacio. Lo hacemos en imprimir para no modificar el contenido de la matriz.
//	Ambos subprogramas son similares al ejercicio 8 de la gu�a.

SubProceso imprimirMatriz(tablero,i,j)
	Para i = 0 Hasta 8
		para j = 0 Hasta 11
			Escribir Sin Saltar "[" tablero[i,j] "]"
		FinPara
		Escribir ""
	FinPara
FinSubProceso

// * Subprograma agregarPalabra *
//	Se le debe indicar en los par�metros la matriz donde se va a agregar la palabra, la fila en la que se
//	agregar� y la propia palabra. Una vez el subprograma reciba eso debe descomponer la palabra y
//	agregarla a la matriz en la posici�n deseada.Similar al ejercicio 12 de la gu�a.

SubProceso agregarPalabra(tablero,palabra,i)
	Definir j Como Entero
	Para j = 0 Hasta 11
		tablero[i,j] = Subcadena(palabra,j,j)
	FinPara
FinSubProceso

// * Subprograma buscarR *
//	Se le debe indicar la matriz donde se buscar� la letra R y el n�mero de fila en el que buscaremos.
//	Debe comparar cada letra de la fila indicada hasta que encuentre la primera letra "R". Ah� debe
//	devolvernos la posici�n de "R".
//	Nota: cuidado! debe devolver la posici�n de la primera R solamente.
//	Aqu� podemos usar principios que usamos en el ejercicio 5

// * Subprograma acomodarPalabra *
//	Se le debe indicar s�lo la matriz en donde se acomodar�n las palabras.
//	Ahora debemos crear una l�gica que nos permita mover las palabras de las filas. Recordar que
//	podemos llamar a buscarR para saber cu�ntos espacios hay que mover las palabras.
//	Una vez que las palabras se muevan hay que llenar los espacios con asteriscos nuevamente: es
//	decir, si la palabra se mueve dos posiciones a la derecha hay que agregar dos asteriscos a la
//	izquierda de la fila.
//	Nota: �recuerden que la primera letra "R" debe quedar en la posici�n 5 de la matriz! Ya sabemos
//	en qu� posici�n se encuentra "R" as� que s�lo debemos llevarla a la posici�n 5 corriendo toda la
//	palabra.

SubProceso acomodarPalabras(tablero)
	Definir i, j, lugarInicial, diferencia, testigo Como Entero
	Definir palabra Como Caracter
	
	Para i = 0 Hasta 8
		palabra = ""
		Para j = 0 Hasta 11
			palabra = Concatenar(palabra,tablero[i,j])
		FinPara
		
		testigo = 0
		Para j = 0 Hasta 11
			Si Subcadena(palabra,j,j) = "r" y testigo = 0
				lugarInicial = j
				diferencia = abs(lugarInicial-5)
				//Escribir "lugar inicial " lugarInicial " diferencia con posicion 5 " diferencia
				testigo = 1
			FinSi
		FinPara
		
		Para j = 0 Hasta diferencia
			tablero[i,j] = "*"
		FinPara
		
		Para j = 0 Hasta 11 - diferencia
			tablero[i,j+diferencia] = Subcadena(palabra,j,j)
		FinPara
		
		Para j = 11 Hasta Longitud(palabra) + (diferencia) Con Paso -1
			tablero[i,j] = "*"
		FinPara
	FinPara
	
FinSubProceso
	