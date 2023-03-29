//Escribir un programa que calcule cuántos dígitos tiene un número entero positivo sin
//convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). Nota:
//investigar la función trunc().

Algoritmo sin_titulo
	Definir nro,digitos Como Entero
	
	digitos = 0
	
	Escribir "Ingrese un número: "
	Leer nro
	
	Mientras TRUNC(nro) >= 1 Hacer
		nro = TRUNC(nro / 10)
		digitos = digitos + 1
	FinMientras
	
	Escribir "El número ingresado tiene ",digitos " dígitos."
	
FinAlgoritmo
