//Escribir un programa que lea un n�mero entero y devuelva el n�mero de d�gitos que
//componen ese n�mero. Por ejemplo, si introducimos el n�mero 12345, el programa
//deber� devolver 5. Calcular la cantidad de d�gitos matem�ticamente utilizando el operador
//de divisi�n. Nota: recordar que las variables de tipo entero truncan los n�meros o
//resultados.

Algoritmo sin_titulo
	Definir nro,digitos Como Real
	
	digitos = 0
	
	Escribir "Ingrese un n�mero entero:" 
	Leer nro
	
	Hacer 
		nro = TRUNC(nro/10)
		digitos = digitos + 1
	Mientras que nro >= 1
	
	Escribir "El n�mero ingresado tiene ",digitos " d�gitos."
	
FinAlgoritmo
