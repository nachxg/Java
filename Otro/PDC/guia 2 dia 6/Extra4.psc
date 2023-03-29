//Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran
//entre 5 y 10 el precio es de $2500, y si se compran más de 10 el precio es $2000.
//Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las
//llantas que compra, y el monto total que tiene que pagar por el total de la compra.

Algoritmo sin_titulo
	Definir llantas Como Entero
	
	Escribir "Ingrese la cantidad de llantas que desea comprar:"
	Leer llantas
	
	Si llantas < 5 Entonces 
		Escribir "Su precio por llanta es de: $3000"
		Escribir "El monto total es de: $",3000 * llantas
	SiNo
		Si 5 <= llantas Y llantas <= 10 Entonces
			Escribir "Su precio por llanta es de: $2500"
			Escribir "Su monto total es de: $",2500 * llantas
		SiNo
			Si llantas > 10 Entonces
				Escribir "Su precio por llanta es de: $2000"
				Escribir "Su monto total es de: $",2000 * llantas
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
