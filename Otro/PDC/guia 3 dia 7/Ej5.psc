//Escriba un programa que solicite dos números enteros (mínimo y máximo). A continuación,
//se debe pedir al usuario que ingrese números enteros situados entre el máximo y mínimo.
//Cada vez que un número se encuentre entre ese intervalo, se sumara uno a una variable.
//El programa terminará cuando se escriba un número que no pertenezca a ese intervalo, y
//al finalizar se debe mostrar por pantalla la cantidad de números ingresados dentro del
//intervalo.

Algoritmo sin_titulo
	Definir min,max,nro,cantidad Como Entero
	
	cantidad = 0
	
	Escribir "Ingrese un número máximo:" 
	Leer max
	Escribir "Ingrese un número mínimo:"
	Leer min 
	Escribir "Ingrese un número:"
	Leer nro
	
	Mientras nro >= min Y nro <= max Hacer
		cantidad = cantidad + 1
		Escribir "Ingrese un número: "
		Leer nro
	FinMientras
	
	Escribir "Cantidad de números ingresados: ",cantidad
	
FinAlgoritmo
