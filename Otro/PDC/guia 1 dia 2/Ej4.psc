//Escribir un programa que calcule cuántos litros de combustible consumió un automóvil. El
//usuario ingresará una cantidad de litros de combustible cargados en la estación y una
//cantidad de kilómetros recorridos, después, el programa calculará el consumo (km/lt) y se lo
//mostrará al usuario.

Algoritmo sin_titulo
	Definir km,lt,consumo Como Real
	
	Escribir "Ingrese la cantidad de litros de combustible cargados: "
	Leer lt
	Escribir "Ingrese la cantidad de kilómetros recorridos: "
	Leer km
	
	consumo = km / lt
	
	Escribir "El consumo es de ",consumo " lt."
	
FinAlgoritmo
