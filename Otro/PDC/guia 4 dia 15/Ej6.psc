////Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta entre las
////letras "M" y "T". Recordar que Pseint le da un valor numérico a cada letra a través del Código
////Ascii, lo que nos deja usar operadores relacionales con letras y cadenas.

Algoritmo sin_titulo
	Definir letra Como Caracter
	
	
	Escribir "Ingrese una letra:"
	Leer letra
	
	Ascii(letra)
	
FinAlgoritmo

SubProceso Ascii(letra)
	
	Si "M" <= Mayusculas(letra)  Y "T" >= Mayusculas(letra) Entonces
		
		Escribir "La letra ingresada se encuentra entre las letras M y T."
		
	SiNo
		
		Escribir "La letra ingresada no se encuentra entre las letras M y T."
		
	FinSi
	
FinSubProceso
	