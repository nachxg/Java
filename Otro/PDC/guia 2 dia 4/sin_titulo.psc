//Dise�e un algoritmo que lea un n�mero de tres cifras y determine si es o no capic�a.

Algoritmo sin_titulo
	Definir nro,c,u Como Entero
	
	Escribir "Ingrese un n�mero de tres cifras:"
	Leer nro
	
	c = TRUNC(nro / 100)
	u = nro % 10
	
	Si c == u Entonces
		Escribir "El n�mero ",nro " es capic�a."
	FinSi
	
FinAlgoritmo
