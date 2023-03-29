////Crear una funci�n que devuelva la diferencia que hay entre el valor m�s chico de un arreglo y
////su valor m�s grande.

Algoritmo sin_titulo
	Definir vector,i,n Como Entero
	
	Escribir "Ingrese el tama�o del vector:"
	Leer n
	
	Dimension vector(n)
	
	Escribir "Ingrese los n�meros:"
	
	Para i = 0 Hasta n-1 Hacer
		Leer vector(i)
	FinPara

	Escribir "La resta entre el valor m�ximo y el m�nimo del vector es de: ",maxmin(vector,n)
	
FinAlgoritmo

Funcion resta = maxmin(vector,n)
	Definir max,min,i,resta Como Entero
	max = 0
	min = 0
	
	Para i = 0 Hasta n-1 Hacer
		Si i = 0 Entonces
			min = vector(0)
		SiNo
			Si vector(i) < min Entonces
				min = vector(i)
			FinSi
		FinSi
		Si max < vector(i) Entonces 
			max = vector(i)
		FinSi
	FinPara
	
	resta = max - min
	
FinFuncion
