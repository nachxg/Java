////Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el usua-
////rio. A continuaci�n, se deber� crear una funci�n que reciba el vector y devuelva el valor m�s
////grande del vector.

Algoritmo sin_titulo
	Definir n,vector Como Entero
	
	Escribir "Ingrese el tama�o del vector:"
	Leer n
	
	Dimension vector(n)
	
	Escribir sin saltar funcionVector(vector,n) "."
	Escribir ""
	
FinAlgoritmo

Funcion val = funcionVector(vector,n)
	Definir val,i Como Entero
	
	val = 0
	
	Para i = 0 Hasta n-1 Hacer
		Escribir "Ingrese los elementos del vector:"
		Leer vector(i)
		Si val < vector(i) Entonces
			val = vector(i)
		FinSi
	FinPara
	
	Escribir sin saltar "El valor m�s alto ingresado es: "
	
FinFuncion
	