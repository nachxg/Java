//Realizar una función que calcule la suma de dos números. En el algoritmo principal le pedire-
//mos al usuario los dos números para pasárselos a la función. Después la función calculará la
//suma y lo devolverá para imprimirlo en el algoritmo.

Algoritmo sin_titulo
	Definir n1,n2,suma Como Entero
	
	Escribir "Ingrese el primer número:"
	Leer n1
	Escribir "Ingrese el segundo número:"
	Leer n2
	
	suma = Sumar(n1,n2)
	
	Escribir "La suma de los números es: ",suma
	
FinAlgoritmo

Funcion suma = Sumar(n1, n2)
	Definir suma Como Entero
	suma = n1 + n2
FinFuncion
	