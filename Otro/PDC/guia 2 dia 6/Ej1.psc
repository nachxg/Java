//Construir un programa que simule un men� de opciones para realizar las cuatro
//operaciones aritm�ticas b�sicas (suma, resta, multiplicaci�n y divisi�n) con dos valores
//num�ricos enteros. El usuario, adem�s, debe especificar la operaci�n con el primer
//car�cter de la operaci�n que desea realizar: "S" o "s" para la suma, "R" o "r" para la resta, "M"
//o "m" para la multiplicaci�n y "D" o "d" para la divisi�n.

Algoritmo sin_titulo
	Definir n1,n2 Como Real
	Definir operacion Como Caracter
	
	Escribir "Ingrese el primer n�mero: "
	Leer n1
	Escribir "Ingrese el segundo n�mero:"
	Leer n2
	
	Escribir "Ingrese la inicial de la operaci�n que quiere realizar (suma, resta, multiplicaci�n o divisi�n):"
	Leer operacion
	
	Segun operacion Hacer
		"S","s": Escribir "La suma de los dos n�meros es: ",n1+n2
		"R","r": Escribir "La resta de los dos n�meros es: ",n1-n2
		"M","m": Escribir "La multiplicaci�n de los dos n�meros es: ",n1*n2
		"D","d": Escribir "La divisi�n de los dos n�meros es: ",n1/n2
			
		De Otro Modo:
			Escribir "El caracter ingresado no es correcto."
		
	FinSegun
	
FinAlgoritmo
