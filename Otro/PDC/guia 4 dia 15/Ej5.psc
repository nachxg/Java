//Crea un procedimiento "convertirEspaciado", que reciba como argumento un texto y muestra
//una cadena con un espacio adicional tras cada letra.
//Por ejemplo, "Hola, tú" devolverá "H o l a , t ú ". Crea un programa principal donde se use
//dicho procedimiento.

Algoritmo sin_titulo
	Definir frase Como Caracter
	
	Escribir "Ingrese una frase:"
	Leer frase
	
	Espaciado(frase)
	
	
	
FinAlgoritmo

SubProceso Espaciado(frase)
	Definir i Como Entero
	Definir nueva Como Caracter
	nueva = ""
	
	Para i = 0 Hasta Longitud(frase)
		nueva = Concatenar(nueva,Subcadena(frase,i,i))
		nueva = Concatenar(nueva," ")
	FinPara
	
	Escribir nueva
	
FinSubProceso
	