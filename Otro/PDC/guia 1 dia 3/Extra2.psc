//Calcular el cambio de monedas en d�lares y euros al ingresar cierta cantidad de dinero en
//pesos.

Algoritmo sin_titulo
	Definir peso,dolar,euro Como Real
	
	Escribir "Ingrese un monto en pesos:"
	Leer peso
	
	dolar = peso * 0.0055
	euro = peso * 0.0051
	
	Escribir "Monto en d�lares: ",dolar " USD"
	Escribir "Monto en euros: ",euro " EUR"
	
FinAlgoritmo
