//Escribir un programa que lea un número entero y devuelva el número de dígitos que
//componen ese número. Por ejemplo, si introducimos el número 12345, el programa
//deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
//de división. Nota: recordar que las variables de tipo entero truncan los números o
//resultados.

Algoritmo sin_titulo
	Definir nro,digitos Como Real
	
	digitos = 0
	
	Escribir "Ingrese un número entero:" 
	Leer nro
	
	Hacer 
		nro = TRUNC(nro/10)
		digitos = digitos + 1
	Mientras que nro >= 1
	
	Escribir "El número ingresado tiene ",digitos " dígitos."
	
FinAlgoritmo
