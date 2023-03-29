//Realizar un procedimiento que permita realizar la división entre dos números y muestre el co-
//ciente y el resto utilizando el método de restas sucesivas.
//
//El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta
//obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas
//realizadas es el cociente. Por ejemplo: 50 / 13:
//		50 - 13 = 37 una resta realizada
//		37 - 13 = 24 dos restas realizadas
//		24 - 13 = 11 tres restas realizadas
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

Algoritmo sin_titulo
	Definir n1,n2 Como Entero
	
	Escribir "Ingrese el primer número:"
	Leer n1
	Escribir "Ingrese el segundo número:"
	Leer n2
	
	Division(n1,n2)
	
FinAlgoritmo

Subproceso Division(dividendo Por Valor, divisor Por Valor)
	Definir cociente,resto,restas Como Entero
	resto = 0
	restas = 0
	Escribir ""
	
	Hacer
		Escribir sin saltar dividendo " - ",divisor " = "
		resto = dividendo - divisor
		dividendo = dividendo - divisor
		restas = restas + 1
		Escribir resto " ",restas " restas realizadas."
	Mientras que resto >= divisor
	
FinSubProceso
	