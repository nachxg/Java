//Escriba un programa que solicite dos n�meros enteros (m�nimo y m�ximo). A continuaci�n,
//se debe pedir al usuario que ingrese n�meros enteros situados entre el m�ximo y m�nimo.
//Cada vez que un n�mero se encuentre entre ese intervalo, se sumara uno a una variable.
//El programa terminar� cuando se escriba un n�mero que no pertenezca a ese intervalo, y
//al finalizar se debe mostrar por pantalla la cantidad de n�meros ingresados dentro del
//intervalo.

Algoritmo sin_titulo
	Definir min,max,nro,cantidad Como Entero
	
	cantidad = 0
	
	Escribir "Ingrese un n�mero m�ximo:" 
	Leer max
	Escribir "Ingrese un n�mero m�nimo:"
	Leer min 
	Escribir "Ingrese un n�mero:"
	Leer nro
	
	Mientras nro >= min Y nro <= max Hacer
		cantidad = cantidad + 1
		Escribir "Ingrese un n�mero: "
		Leer nro
	FinMientras
	
	Escribir "Cantidad de n�meros ingresados: ",cantidad
	
FinAlgoritmo
