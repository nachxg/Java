//Escribir un programa que calcule cu�ntos d�gitos tiene un n�mero entero positivo sin
//convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). Nota:
//investigar la funci�n trunc().

Algoritmo sin_titulo
	Definir nro,digitos Como Entero
	
	digitos = 0
	
	Escribir "Ingrese un n�mero: "
	Leer nro
	
	Mientras TRUNC(nro) >= 1 Hacer
		nro = TRUNC(nro / 10)
		digitos = digitos + 1
	FinMientras
	
	Escribir "El n�mero ingresado tiene ",digitos " d�gitos."
	
FinAlgoritmo
