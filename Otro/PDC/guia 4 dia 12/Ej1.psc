//Realizar una funci�n que calcule la suma de dos n�meros. En el algoritmo principal le pedire-
//mos al usuario los dos n�meros para pas�rselos a la funci�n. Despu�s la funci�n calcular� la
//suma y lo devolver� para imprimirlo en el algoritmo.

Algoritmo sin_titulo
	Definir n1,n2,suma Como Entero
	
	Escribir "Ingrese el primer n�mero:"
	Leer n1
	Escribir "Ingrese el segundo n�mero:"
	Leer n2
	
	suma = Sumar(n1,n2)
	
	Escribir "La suma de los n�meros es: ",suma
	
FinAlgoritmo

Funcion suma = Sumar(n1, n2)
	Definir suma Como Entero
	suma = n1 + n2
FinFuncion
	