//Escribir un programa que calcule el volumen de un cilindro. Para ello se deberá solicitar al
//usuario que ingrese el radio y la altura. Mostrar el resultado por pantalla.
//volumen = pi * radio2 * altura

Algoritmo sin_titulo
	Definir radio,altura,volumen Como Real
	
	Escribir "Ingrese el el radio del cilindro: "
	Leer radio
	Escribir "Ingrese la altura del cilindro: "
	Leer altura
	
	volumen = pi * radio ^ 2 * altura
	
	Escribir "El volumen del cilindro es: ",volumen " m3" 
	
FinAlgoritmo
