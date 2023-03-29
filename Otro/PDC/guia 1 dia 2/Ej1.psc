//Conocido el número en matemática PI ?, pedir al usuario que ingrese el valor del radio de
//una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que para
//calcular el área y el perímetro se utilizan las siguientes fórmulas:
//area = PI * radio2
//perimetro = 2 * PI * radio

Algoritmo sin_titulo
	Definir r Como Real
	Definir area Como Real
	Definir per Como Real
	
	Escribir "Ingrese el radio de la circunferencia:"
	Leer r
	
	area = 3.14 * r ^ 2
	per = 2 * 3.14 * r
	
	Escribir "Área: ",area
	Escribir "Perímetro: ",per
	
FinAlgoritmo
