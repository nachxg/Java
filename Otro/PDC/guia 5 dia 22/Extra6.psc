/// Realizar un programa que permita visualizar el resultado del producto de una matriz de enteros
/// de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden inicializarse
/// evitando así el ingreso de datos por teclado. Para conocer más acerca de cómo se realiza
/// la multiplicación entre matrices consultar el siguiente link:
/// https://es.wikibooks.org/wiki/%C3%81lgebra_Lineal/Matriz_por_vector

Algoritmo Extra6Enc22al25
	Definir Matriz, Vector, VectorM, i,j, suma, sumaM Como Entero
	Dimension Matriz(3,3)
	Dimension Vector(3)
	Dimension VectorM(3)
	
	Para i = 0 Hasta 2 Hacer
		Vector(i)=Aleatorio(1,10)
		Para j = 0 Hasta 2 Hacer
			Matriz(i,j) = Aleatorio(1,10)
		FinPara
	FinPara
	
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			Escribir sin saltar "(" Matriz(i,j) ") "
		FinPara
		Escribir ""
	FinPara
	Escribir " "
	
	Para i = 0 Hasta 2 Hacer
		Escribir Sin Saltar "(" Vector(i) ") "
	FinPara
	Escribir " "
		
	/// Imprimir Matriz x Vector: Toda la fila x cada indice vector sumados entre si
	Para i = 0 Hasta 2 Hacer
		suma=0 ; sumaM=0
		Para j = 0 Hasta 2 Hacer
			sumaM=Matriz(i,j)*Vector(i)
			suma=sumaM+suma
		FinPara
		VectorM(i)=suma
	FinPara
	
	Escribir " "
	Para i = 0 Hasta 2 Hacer
		Escribir Sin Saltar "(" VectorM(i) ") "
	FinPara
	
	Escribir " " 	
	Escribir " " 
	
FinAlgoritmo
