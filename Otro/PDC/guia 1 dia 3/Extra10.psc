//Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea
//saber cuánto deberá pagar finalmente por su compra.

Algoritmo sin_titulo
	Definir precio,descuento Como Real
	
	Escribir "Ingrese el precio del producto:"
	Leer precio
	
	descuento = 15 * precio / 100
	precio = precio - descuento
	
	Escribir "El precio final del producto es de: ",precio
	
FinAlgoritmo
