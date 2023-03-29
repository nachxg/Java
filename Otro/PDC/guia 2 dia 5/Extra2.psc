//Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento del
//10% sobre el total de la compra que realiza un cliente. Solicitar al usuario que ingrese un
//mes y el importe de la compra. El programa debe calcular cuál es el monto total que se
//debe cobrar al cliente e imprimirlo por pantalla.

Algoritmo sin_titulo
	Definir importe,final Como Real
	Definir mes Como Caracter
	
	Escribir "Ingrese el mes:"
	Leer mes
	Escribir "Ingrese el importe:"
	Leer importe 
	
	Si mes == "septiembre" O mes == "octubre" O mes == "noviembre" Entonces
		final = importe - (importe * 0.10)
		Escribir "El monto final es de: $",final
	SiNo
		Escribir "El monto final es de: $",importe
	FinSi
	
FinAlgoritmo
