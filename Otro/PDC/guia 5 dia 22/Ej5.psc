////Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario, encon-
////trando la manera de que la frase se muestre de manera continua en la matriz.
////
////Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:
////		H A B
////		I L I
////		D A D
////	Nota: recordar el uso de la función Subcadena().
//// cornaglia, habilidad
Algoritmo sin_titulo
	Definir i,j,c Como Entero
	Definir matriz,frase Como Caracter
	c = 0
	
	Dimension matriz(3,3)
	
	Hacer 
	Escribir "Ingrese una palabra de 9 letras:"
	Leer frase
	Si longitud(frase) <> 9 Entonces
		Escribir "La palabra es inválida. Vuelva a intentarlo."
		Leer frase
	FinSi
	Mientras que Longitud(frase) <> 9
	
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			matriz(i,j) = Subcadena(frase,c,c)
			c = c + 1 
		FinPara
	FinPara
	
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			Escribir sin saltar "(" matriz(i,j) ") "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	
FinAlgoritmo
