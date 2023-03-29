//Escriba un programa para obtener el grado de eficiencia de un operario de una fábrica de
//tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un período
//de prueba:
//	- Producir menos de 200 tornillos defectuosos.
//	- Producir más de 10000 tornillos sin defectos.
// El grado de eficiencia se determina de la siguiente manera:
//	- Si no cumple ninguna de las condiciones, grado 5.
//	- Si sólo cumple la primera condición, grado 6.
//	- Si sólo cumple la segunda condición, grado 7.
//	- Si cumple las dos condiciones, grado 8

Algoritmo sin_titulo
	Definir defectuosos,sin_defectos,grado Como Entero
	
	Escribir "Ingrese la cantidad de tornillos defectuosos producidos: "
	Leer defectuosos
	Escribir "Ingrese la cantidad de tornillos sin defectos producidos: "
	Leer sin_defectos
	
	Si defectuosos > 200 Entonces
		Si sin_defectos < 10000 Entonces
			Escribir "El grado del operario es 5."
		SiNo 
			Escribir "El grado del operario es 7."
		FinSi
	SiNo
		Si sin_defectos < 10000 Entonces
			Escribir "El grado del operario es 6."
		SiNo
			Escribir "El grado del operario es 8."
		FinSi
	FinSi
	
FinAlgoritmo
