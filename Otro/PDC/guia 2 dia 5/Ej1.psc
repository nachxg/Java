//1. Realiza un programa que s�lo permita introducir los caracteres ?S? y ?N?. Si el usuario
//ingresa alguno de esos dos caracteres se deber� de imprimir un mensaje por pantalla que
//diga "CORRECTO", en caso contrario, se deber� imprimir "INCORRECTO".

Algoritmo sin_titulo
	Definir car Como Caracter
	
	Escribir "Ingrese los caracteres S o N:"
	Leer car
	
	Si car == "S" O car == "N" O car == "s" O car == "n" Entonces 
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	FinSi
	
FinAlgoritmo
