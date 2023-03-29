////Realizar un programa que permita visualizar el resultado del producto de una matriz de enteros
////de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden inicializarse
////evitando así el ingreso de datos por teclado. Para conocer más acerca de cómo se realiza
////la multiplicación entre matrices consultar el siguiente link:
////https://es.wikibooks.org/wiki/%C3%81lgebra_Lineal/Matriz_por_vector

Algoritmo Guia5_Extra_6
	Definir m, n, mat1, vec Como Entero
	m=3
	n=3
	Dimension mat1[m,n]
	Dimension vec[n]
	Escribir "La Matriz: "
	LlenaMatriz(mat1,m,n)
	MuestraMatriz(mat1,m,n)
	Escribir "El vector:"
	LlenaVector(vec,n)
	MultiplicaMatrizVector(mat1,vec,m,n)
FinAlgoritmo
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
SubProceso LlenaVector(vec,n)
	Definir i Como Entero
	Para i=0 Hasta n-1 Hacer
		vec[i]=Aleatorio(1,3)
	FinPara
	MuestraVector(vec,n)
FinSubProceso
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
SubProceso MuestraVector(vector,n)
	Definir i Como Entero
	Escribir Sin Saltar"("
	Para i=0 Hasta n-1 Hacer
		Si i<>(n-1) Entonces
			Escribir  vector[i] " , " Sin Saltar
		SiNo
			Escribir  vector[i] ")"
		Fin Si
	FinPara	
FinSubProceso
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
SubProceso MultiplicaMatrizVector(mat1,vec,m,n)
	Definir j, k, Mult Como Entero
	Dimension Mult[m]
	Para j=0 Hasta m-1 Hacer
		Mult[j]=0
	Fin Para
	Para j=0 Hasta m-1 Hacer
		Para k=0 Hasta m-1 Hacer
			Mult[j]=mat1[j,k]*vec[k]+Mult[j]
		Fin Para
	Fin Para
	Escribir " El producto de la Matriz por el vector es:"
	MuestraVector(Mult,m)
FinSubProceso
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
SubProceso LlenaMatriz(mat,m,n)
	Definir i,j Como Entero
	Para i=0 Hasta m-1 Hacer
		Para j=0 Hasta n-1 Hacer
			mat[i,j]=azar(4)
		Fin Para
	Fin Para
FinSubProceso
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
SubProceso MuestraMatriz(mat,m,n)
	Definir i,j Como Entero
	Para i=0 Hasta m-1 Hacer
		Para j=0 Hasta n-1 Hacer
			escribir Sin Saltar" [", mat[i,j] , "] "
		Fin Para
		Escribir " "
	Fin Para
FinSubProceso
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////