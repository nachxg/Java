////Una matriz m�gica es una matriz cuadrada (tiene igual n�mero de filas que de columnas) que
////tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
////Por ejemplo:
////	
////	2 7 6
////	9 5 1
////	4 3 8
////	
////En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un algo-
////ritmo que compruebe si una matriz de datos enteros es m�gica o no, y en caso de que sea
////m�gica escribir la suma. Adem�s, el programa deber� comprobar que los n�meros introduci-
////dos son correctos, es decir, est�n entre el 1 y el 9. El usuario ingresa el tama�o de la matriz
////que no debe superar orden igual a 10.

Algoritmo sin_titulo
	Definir fc,matriz,i,j,sumafil,sumacol,sumadiag,sumadiag2 Como Entero
	
	sumafil = 0
	sumacol = 0
	sumadiag = 0
	sumadiag2 = 0
	
	Escribir "Ingrese el n�mero de filas y columnas de la matriz (m�x. 10):"
	Leer fc
	
	Dimension matriz(fc,fc)
	
	Escribir "Ingrese los valores de la matriz:"
	
	Para i = 0 Hasta fc-1
		Para j = 0 Hasta fc-1
			Leer matriz(i,j)
		FinPara
	FinPara
	Escribir ""
	
	Para i = 0 Hasta fc-1 Hacer
		Para j = 0 Hasta fc-1 Hacer
			Escribir sin saltar "(" matriz(i,j) ") "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	
	Para i = 0 Hasta fc-1 Hacer
		Para j = 0 Hasta fc-1 Hacer
			sumafil = sumafil + matriz(i,j)
			sumacol = sumacol + matriz (j,i)
		FinPara
	FinPara
	
	Para i = 0 Hasta fc-1 Hacer
		sumadiag = sumadiag + matriz(i,i)
		sumadiag2 = sumadiag2 + matriz(i,fc-1-i)
	FinPara
	
	Si sumacol/fc == sumafil/fc Y sumadiag == sumadiag2 Y sumacol/fc == sumadiag  Entonces
		Escribir "La matriz es m�gica."
		Escribir "La suma es: ",sumadiag
	SiNo
		Escribir "La matriz no es m�gica."
	FinSi

FinAlgoritmo