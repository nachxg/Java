//Escribir un programa que calcule cu�ntos litros de combustible consumi� un autom�vil. El
//usuario ingresar� una cantidad de litros de combustible cargados en la estaci�n y una
//cantidad de kil�metros recorridos, despu�s, el programa calcular� el consumo (km/lt) y se lo
//mostrar� al usuario.

Algoritmo sin_titulo
	Definir km,lt,consumo Como Real
	
	Escribir "Ingrese la cantidad de litros de combustible cargados: "
	Leer lt
	Escribir "Ingrese la cantidad de kil�metros recorridos: "
	Leer km
	
	consumo = km / lt
	
	Escribir "El consumo es de ",consumo " lt."
	
FinAlgoritmo
