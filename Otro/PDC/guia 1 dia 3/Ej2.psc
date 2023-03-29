//Solicitar al usuario que ingrese la base y altura de un rectángulo, y calcular y mostrar por
//pantalla el área y perímetro del mismo
//area = base * altura
//perimetro = 2 * altura + 2 * base.

Algoritmo sin_titulo
	Definir base,altura,area,perimetro Como Real
	
	Escribir "Ingrese la base del rectángulo: "
	Leer base
	Escribir "Ingrese la altura del rectángulo: "
	Leer altura
	
	area = base * altura
	perimetro = 2 * altura + 2 * base
	
	Escribir "El área del rectángulo es: ",area
	Escribir "El perímetro del rectángulo es: ",perimetro
	
FinAlgoritmo
