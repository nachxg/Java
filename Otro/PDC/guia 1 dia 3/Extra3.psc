//Hacer un programa que calcule el salario de un empleado, si se descuenta el 20% de su
//salario bruto.

Algoritmo sin_titulo
	Definir bruto,neto Como Real
	
	Escribir "Ingrese su salario bruto:"
	Leer bruto 
	
	neto = bruto - (20 * bruto / 100)
	
	Escribir "Su salario neto es de: $",neto 
	
FinAlgoritmo
