////Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los
////muestre por pantalla.

Algoritmo sin_titulo
	Definir i,vector Como Entero
	Dimension vector(5)
	
	Para i = 0 hasta 4 Hacer
		Escribir "Ingrese un valor:"
		Leer vector(i)
	FinPara
	
	Para i = 0 Hasta 4 Hacer
		Escribir vector(i)," "
	FinPara
	
FinAlgoritmo
