//A partir de una conocida cantidad de metros que el usuario ingresa a trav�s del teclado se
//debe obtener su equivalente en cent�metros, en mil�metros y en pulgadas.

Algoritmo sin_titulo
	Definir m,cm,mm,p Como Real
	
	Escribir "Ingrese el valor en metros: "
	Leer m
	
	cm = m * 100
	mm = m * 1000
	p = m / 0.0254
	
	Escribir "Valor en cent�metros: ",cm
	Escribir "Valor en mil�metros: ",mm
	Escribir "Valor en pulgadas: ",p
	
FinAlgoritmo
