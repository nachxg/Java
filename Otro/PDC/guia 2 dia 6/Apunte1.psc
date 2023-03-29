//Ingresar un número del 1 ? 12 y mostrar el mes del año que corresponde, si el número ingresado
//no es correcto mostrar un "mensaje de error".

Algoritmo sin_titulo
	Definir mes Como Entero
	
	Escribir "Ingrese un número del 1 al 12:"
	Leer mes
	
	Segun mes Hacer
		1:
			Escribir "El número ingresado corresponde a ENERO."
		2:
			Escribir "El número ingresado corresponde a FEBRERO."
		3:
			Escribir "El número ingresado corresponde a MARZO."
		4:
			Escribir "El número ingresado corresponde a ABRIL."
		5:
			Escribir "El número ingresado corresponde a MAYO."
		6:
			Escribir "El número ingresado corresponde a JUNIO."
		7:
			Escribir "El número ingresado corresponde a JULIO."
		8:
			Escribir "El número ingresado corresponde a AGOSTO."
		9:
			Escribir "El número ingresado corresponde a SEPTIEMBRE."
		10:
			Escribir "El número ingresado corresponde a OCTUBRE."
		11:
			Escribir "El número ingresado corresponde a NOVIEMBRE."
		12:
			Escribir "El número ingresado corresponde a DICIEMBRE."
			
		De Otro Modo:
			Escribir "El número ingresado no corresponde a ningún mes."
			
	FinSegun
	
FinAlgoritmo
