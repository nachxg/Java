Algoritmo sin_titulo
	definir nro Como Entero
	
	Escribir "Ingrese un número:"
	Leer nro
	Escribir Fibonacci(nro)
	
FinAlgoritmo

Funcion nro = Fibonacci(nro)
	
	Definir n0, n1, i Como Entero
	n0 = 0
	n1 = 1
	
	Para i = 1 hasta nro - 1 Hacer
		Escribir sin saltar n1 " "
		nro = n0 + n1
		n0 = n1
		n1 = nro
	FinPara
	
FinFuncion