//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y termi-
//nada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vo-
//cal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (inclu-
//yendo a las vocales acentuadas) se mantienen sin cambios.
//			a e i o u
//			@ # $ % *
//Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
//correspondiente. Utilice la estructura "según" para la transformación.
//	
//Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
//NOTA: investigue el uso de la función concatenar de PSeInt para armar la palabra/frase.

Algoritmo sin_titulo
	Definir frase Como Cadena
	
	Escribir "Ingrese una frase:"
	Leer frase
	
	Convertir(frase)
	
FinAlgoritmo

SubProceso Convertir(frase Por Referencia)
	Definir i Como Entero
	Definir nueva Como Caracter
	nueva = ""
	
	Para i = 0 Hasta Longitud(frase)
		Segun Subcadena(frase,i,i) Hacer
			"a" o "A": nueva = Concatenar(nueva,"@") 
			"e" o "E": nueva = Concatenar(nueva,"#")
			"i" o "I": nueva = Concatenar(nueva,"$")
			"o" o "O": nueva = Concatenar(nueva,"%") 
			"u" o "U": nueva = Concatenar(nueva,"*") 
		De Otro Modo:
			nueva = Concatenar(nueva,Subcadena(frase,i,i))
		FinSegun
	FinPara

	Escribir nueva
	
FinSubProceso
