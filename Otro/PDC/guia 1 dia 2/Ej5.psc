//Escriba un programa que permita al usuario ingresar el valor de dos variables num�ricas de
//tipo entero. Posteriormente, el programa debe intercambiar los valores de ambas variables y
//mostrar el resultado final por pantalla.
//Por ejemplo, si el usuario ingresa los valores num1 = 9 y num2 = 3, la salida a del programa
//deber� mostrar: num1 = 3 y num2 = 9
//Ayuda: Para intercambiar los valores de dos variables se debe utilizar una variable auxiliar.

Algoritmo sin_titulo
	Definir n1,n2,aux Como Entero
	
	Escribir "Ingrese el primer n�mero:"
	Leer n1
	Escribir "Ingrese el segundo n�mero:"
	Leer n2
	
	aux = n2
	n2 = n1
	
	Escribir "N�mero 1: ",aux
	Escribir "N�mero 2: ",n2
	
	
FinAlgoritmo
