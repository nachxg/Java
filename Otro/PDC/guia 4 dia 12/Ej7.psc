//Diseñar una función que reciba un numero en forma de cadena y lo devuelva como numero
//entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner números con de-
//cimales ni letras. Ejemplo: ingresando "100"(carácter) debe convertirse en 100(entero).

Algoritmo sin_titulo
	Definir nro Como Caracter
	Definir conv Como Entero
	
	Escribir "Ingrese un número:"
	Leer nro
	
	conv = Convert(nro)
	Escribir conv
	
FinAlgoritmo

Funcion conv = Convert(nro)
	Definir conv Como Entero
	conv = ConvertirANumero(nro)
	
FinFuncion
	