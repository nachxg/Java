//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
//es una ?A?. Si la primera letra es una ?A?, se deber� de imprimir un mensaje por pantalla
//que diga "CORRECTO", en caso contrario, se deber� imprimir "INCORRECTO". Nota:
//investigar la funci�n Subcadena de PseInt.

Algoritmo sin_titulo
	Definir frase Como Cadena
	
	Escribir "Ingrese una frase:"
	Leer frase
	
	Si subcadena(frase,0,0) == "A" O subcadena(frase,0,0) == "a" Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	FinSi
	
FinAlgoritmo
