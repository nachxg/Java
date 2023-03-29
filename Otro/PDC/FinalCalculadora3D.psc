Algoritmo Final
	//Definicion de variables
	Definir calculadora Como Entero
	definir cadena1, cadena2 como caracter
	definir diagonal3d1, diagonal3d2 Como Entero
	//definimos las 3 dimensiones de la matriz calculadora
	dimension calculadora(3,3,3)
	//asignamos valores a las cadenas de texto
	cadena1= "123456789"
	cadena2= "987654321"
	
	inicializarMatriz(calculadora)
	llenarMatriz_Z0(calculadora,cadena1)
	llenarMatriz_Z1(calculadora,cadena2)
	llenarMatriz_Z2(calculadora)
	imprimirMatriz(calculadora)
	
	
	diagonal3d1 = calculadora(0,2,0)*calculadora(1,1,1)*calculadora(2,0,2)
	diagonal3d2 = calculadora(0,0,0)*calculadora(1,1,1)*calculadora(2,2,2)
	
	//escribimos los resultados de las diagonales
	escribir""
	escribir""
	escribir "la multiplicación de los elementos de la diagonal 3D 1 es " , diagonal3d1
	escribir "LA multiplicacion de los elementos de la diagonal 3D 2 es ", diagonal3d2
	
FinAlgoritmo


//inicio la matriz en 0

funcion inicializarMatriz(calculadora)
	
	definir i, j, k Como Entero
	
	para i<- 0 hasta 2 Hacer
		para j <- 0 hasta 2 Hacer
			para k <- 0 hasta 2 Hacer
				calculadora(i,j,k)=0
			FinPara
		FinPara
	FinPara
	
FinFuncion

funcion llenarMatriz_Z0(calculadora Por Referencia,cadena1)
	definir i, j, cont Como Entero
	//Para llenar la primera capa utilizo i y j desde 0 hasta 2 para que recoora todas las filas y columnas
	//y la última variable como 0 ya que quiero que me llene la capa 0 de mis tres dimensiones o capas.
	//Utilizo un contador para que al llenar la matriz, cuando termine una fila y cambie a la siguiente, se
	//continuen colocando los valores desde donde quedó y no se vuelvan a repetir.
	//convierto a número la cadena para que concidan los tipos de variables y no nos de errores.
	//Utilizo una subcadena para poder colocar cada uno de los caracteres.
	
	cont=0
	para i <- 0 hasta 2 Hacer
		para j <- 0 hasta 2 Hacer
			
			calculadora(i,j,0) = convertiranumero(subcadena(cadena1,cont,cont))
			cont=cont+1
			
		FinPara
	FinPara
FinFuncion

Funcion 	llenarMatriz_Z1(calculadora Por Referencia,cadena2)
	definir i, j, k, cont Como Entero
	//Para llenar la segunda capa utilizo i y j desde 0 hasta 2 para que recoora todas las filas y columnas
	//y la última variable como 1 ya que quiero que me llene la capa 1 de mis tres dimensiones o capas.
	//Utilizo un contador para que al llenar la matriz, cuando termine una fila y cambie a la siguiente, se
	//continuen colocando los valores desde donde quedó y no se vuelvan a repetir.
	//convierto a número la cadena para que concidan los tipos de variables y no nos de errores.
	//Utilizo una subcadena para poder colocar cada uno de los caracteres.
	cont=0
	para i <- 2 hasta 0 con paso -1 Hacer
		para j <- 0 hasta 2 Hacer
			
			calculadora(i,j,1) = convertiranumero(subcadena(cadena2,cont,cont))
			cont=cont+1
			
		FinPara
	FinPara
FinFuncion

funcion llenarMatriz_Z2(calculadora Por Referencia)
	definir i,j, cont Como Entero
	
	//La última capa, o capa 2 en nuestro código se llena con la multiplicación de las dos capas anteriores.
	//Para ello vamos a utilizar i y j desde 0 hasta 2 para que recorra todas las filas y columnas
	// y como último valor 2 (nuestra última capa). 
	//Luego multiplico las dos capas anteriores para obtener los valores de la última capa.
	cont=0
	para i <- 0 hasta 2 Hacer
		para j <- 0 hasta 2 Hacer
			
			calculadora(i,j,2) = calculadora(i,j,0) * calculadora(i,j,1)
			cont=cont+1
			
		FinPara
	FinPara
FinFuncion


funcion imprimirMatriz(calculadora Por Referencia)
	
	//Para poder ver las capas de la calculadora, ordeno que las escriba en distintos bucles anidados.
	definir i, j como entero
	
	para i <- 0 hasta 2 Hacer
		para j<-0 hasta 2 Hacer
			Escribir sin saltar "(" calculadora(i,j,0) ")"
		FinPara
		escribir""
	FinPara
	escribir""
	escribir""
	para i <- 0 hasta 2 Hacer
		para j<-0 hasta 2 Hacer
			Escribir sin saltar "(" calculadora(i,j,1) ")"
		FinPara
		escribir""
	FinPara
	escribir""
	escribir""
	para i <- 0 hasta 2 Hacer
		para j<-0 hasta 2 Hacer
			Escribir sin saltar "(" calculadora(i,j,2) ")"
		FinPara
		escribir""
	FinPara
	
FinFuncion


