//Conocido el n�mero en matem�tica PI ?, pedir al usuario que ingrese el valor del radio de
//una circunferencia y calcular y mostrar por pantalla el �rea y per�metro. Recuerde que para
//calcular el �rea y el per�metro se utilizan las siguientes f�rmulas:
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
	
	Escribir "�rea: ",area
	Escribir "Per�metro: ",per
	
FinAlgoritmo
