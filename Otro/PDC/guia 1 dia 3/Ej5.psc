//Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio del
//año, y el precio del mismo producto al finalizar el año. El programa debe calcular cuál fue el
//porcentaje de aumento que tuvo ese producto en el año y mostrarlo por pantalla.

Algoritmo sin_titulo
	Definir precio_inicial,precio_final,aumento,porc_aumento Como Real
	
	Escribir "Ingrese el precio del producto al comienzo del año: "
	Leer precio_inicial
	Escribir "Ingrese el precio del producto al final del año: "
	Leer precio_final
	
	aumento = (precio_final - precio_inicial) * 100 / precio_inicial
	
	Escribir "El porcentaje de aumento es de ",aumento "%"
	
FinAlgoritmo
