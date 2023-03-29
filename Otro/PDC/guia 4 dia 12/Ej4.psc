//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La fun-
//ción debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la fun-
//ción Subcadena().

Algoritmo sin_titulo
	Definir frase,letra Como Caracter
	Definir retorno Como Entero
	
	Escribir "Ingrese una frase:"
	Leer frase
	Escribir "Ingrese la letra que desea buscar:"
	Leer letra
	
	retorno = Buscar(frase,letra)
	Escribir "La letra |",letra "| se encontró ",retorno " veces."
	
FinAlgoritmo

Funcion cant = Buscar (frase,letra)
	Definir cant,i Como Entero
	Definir letras Como Caracter
	cant = 0
	Para i = 0 Hasta Longitud(frase) - 1
		letras = Subcadena(frase,i,i)
		Si letras == letra Entonces
			cant = cant + 1
		FinSi
	FinPara
FinFuncion
	