//Hacer un algoritmo que lea un n�mero por el teclado y determine si tiene tres d�gitos.

Algoritmo sin_titulo
	Definir nro Como Entero
	
	Escribir "Ingrese un n�mero: "
	Leer nro
	
	Segun TRUNC(nro / 100) Hacer
		1,2,3,4,5,6,7,8,9: Escribir "El n�mero tiene tres d�gitos."
		De Otro Modo:
			Escribir "El n�mero ingresado no tiene tres d�gitos o no es un valor v�lido."
	FinSegun
FinAlgoritmo