//Hacer un algoritmo que lea un número por el teclado y determine si tiene tres dígitos.

Algoritmo sin_titulo
	Definir nro Como Entero
	
	Escribir "Ingrese un número: "
	Leer nro
	
	Segun TRUNC(nro / 100) Hacer
		1,2,3,4,5,6,7,8,9: Escribir "El número tiene tres dígitos."
		De Otro Modo:
			Escribir "El número ingresado no tiene tres dígitos o no es un valor válido."
	FinSegun
FinAlgoritmo