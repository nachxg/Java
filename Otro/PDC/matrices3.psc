Algoritmo matrices3
	
	definir Matrix, i,j, M, N, suma Como Entero
	Escribir "Ingrese la cardinalidad de la matriz" Sin Saltar 
	Leer N
	Leer M

	Dimension Matrix(N,M)
	
	llenamatrix(Matrix,N,M)
	sumar(matrix,N,M,suma)
	
	Escribir "El valor de la suma de los elementos es: ", suma
	
	para i<-0 hasta N-1 Hacer
		
		para j<-0 hasta M-1 Hacer
			
			Escribir sin saltar "(" Matrix(i,j) ")"
			
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo

SubProceso llenamatrix(Matrix,N,M )
	
	definir i, j Como Entero
	
	para i<-0 Hasta N-1 Hacer
		
		para j<-0 Hasta M-1 Hacer
			
			Matrix(i,j)=Aleatorio(0,100)
			
		FinPara
		
	FinPara
	
FinSubProceso

SubProceso sumar(Matrix,N,M,suma Por Referencia)
	
	definir i, j Como Entero
	
	suma=0
	
	para i<-0 Hasta N-1 Hacer
		
		para j<-0 Hasta M-1 Hacer
			
			suma = suma + Matrix(i,j)
			
		FinPara
	FinPara
	
	
FinSubProceso

	
	

////3. Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
////un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro subpro-
////grama que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y los re-
////sultados por pantalla.