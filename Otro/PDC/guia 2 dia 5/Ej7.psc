//Continuando el ejercicio anterior, ahora se pedir� una frase o palabra y se validara si la
//primera letra de la frase es igual a la �ltima letra de la frase. Se deber� de imprimir un
//mensaje por pantalla que diga "CORRECTO", en caso contrario, se deber� imprimir
//"INCORRECTO".

Algoritmo sin_titulo
	Definir frase Como Cadena
	Definir long Como Entero
	
	Escribir "Ingrese una frase:"
	Leer frase
	
	long = Longitud(frase) - 1
	
	Si subcadena(frase,0,0) == subcadena(frase,long,long) Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	FinSi
	
FinAlgoritmo
