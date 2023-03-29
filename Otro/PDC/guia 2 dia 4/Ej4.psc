//Diseñe un algoritmo que lea un número de tres cifras y determine si es o no capicúa.

Algoritmo sin_titulo
	Definir nro,c,u Como Entero
	
	Escribir "Ingrese un número de tres cifras:"
	Leer nro
	
	c = TRUNC(nro / 100)
	u = nro % 10
	
	Si c == u Entonces
		Escribir "El número ",nro " es capicúa."
	FinSi
	
FinAlgoritmo
