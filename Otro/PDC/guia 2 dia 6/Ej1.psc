//Construir un programa que simule un menú de opciones para realizar las cuatro
//operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
//numéricos enteros. El usuario, además, debe especificar la operación con el primer
//carácter de la operación que desea realizar: "S" o "s" para la suma, "R" o "r" para la resta, "M"
//o "m" para la multiplicación y "D" o "d" para la división.

Algoritmo sin_titulo
	Definir n1,n2 Como Real
	Definir operacion Como Caracter
	
	Escribir "Ingrese el primer número: "
	Leer n1
	Escribir "Ingrese el segundo número:"
	Leer n2
	
	Escribir "Ingrese la inicial de la operación que quiere realizar (suma, resta, multiplicación o división):"
	Leer operacion
	
	Segun operacion Hacer
		"S","s": Escribir "La suma de los dos números es: ",n1+n2
		"R","r": Escribir "La resta de los dos números es: ",n1-n2
		"M","m": Escribir "La multiplicación de los dos números es: ",n1*n2
		"D","d": Escribir "La división de los dos números es: ",n1/n2
			
		De Otro Modo:
			Escribir "El caracter ingresado no es correcto."
		
	FinSegun
	
FinAlgoritmo
