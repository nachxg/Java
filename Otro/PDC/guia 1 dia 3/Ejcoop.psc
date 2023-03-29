//Ingrese un número de tres cifras y muestra la unidad, decena y la centena.
//Por ejemplo, si el número ingresado por pantalla es 123 el programa debe mostrar:
//	CENTENA: 1
//	DECENA: 2
//	UNIDAD: 3

Algoritmo sin_titulo
	Definir nro Como Entero
	Definir c,d,u Como Real
	
	Escribir "Ingrese un número de tres cifras: "
	Leer nro
	
	u = nro % 10
	nro = TRUNC(nro / 10)
	d = nro % 10
	nro = TRUNC(nro / 10)
	c = nro % 10
	nro = TRUNC(nro / 10)
	
	Escribir "Centena: ",c
	Escribir "Decena: ",d
	Escribir "Unidad: ",u
	
FinAlgoritmo
