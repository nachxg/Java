//Dise�ar una funci�n que reciba un numero en forma de cadena y lo devuelva como numero
//entero. El programa podr� recibir n�meros de hasta 3 d�gitos. Nota: no poner n�meros con de-
//cimales ni letras. Ejemplo: ingresando "100"(car�cter) debe convertirse en 100(entero).

Algoritmo sin_titulo
	Definir nro Como Caracter
	Definir conv Como Entero
	
	Escribir "Ingrese un n�mero:"
	Leer nro
	
	conv = Convert(nro)
	Escribir conv
	
FinAlgoritmo

Funcion conv = Convert(nro)
	Definir conv Como Entero
	conv = ConvertirANumero(nro)
	
FinFuncion
	