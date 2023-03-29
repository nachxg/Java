////Crear un subproceso que rellene dos arreglos de tama�o n, con n�meros aleatorios. Despu�s,
////hacer una funci�n que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
////funci�n debe devolver el resultado de esta validaci�n, para mostrar el mensaje en el algoritmo.
////Nota: recordar el uso de las variables de tipo l�gico.

Algoritmo sin_titulo
	Definir n,vectorA,vectorB Como Entero
	
	Escribir "Ingrese el tama�o de los vectores:"
	Leer n
	
	Dimension vectorA(n)
	Dimension vectorB(n)
	
	llenarVectores(vectorA,vectorB,n)
	
	Escribir "�Coinciden los valores de ambos vectores? ",val(vectorA,vectorB,n)
	
FinAlgoritmo

SubProceso llenarVectores(vectorA,vectorB,n)
	Definir i Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		vectorA(i) = Aleatorio(0,100)
		vectorB(i) = Aleatorio(0,100)
	FinPara
	
	Para i = 0 Hasta n-1 Hacer
		Escribir sin saltar vectorA(i) " "
	FinPara
	
	Escribir ""
	
	Para i = 0 Hasta n-1 Hacer
		Escribir sin saltar vectorB(i) " "
	FinPara
	
	Escribir ""
	
FinSubProceso
	
Funcion validacion = val(vectorA,vectorB,n)
	Definir validacion Como Logico
	Definir cont,i Como Entero
	cont = 0
	
	Para i = 0 Hasta n-1 Hacer
		Si vectorA(i) == vectorB(i) Entonces
			cont = cont + 1 
		FinSi
	FinPara
	
	Si cont < n Entonces
		validacion = Falso
	SiNo
		validacion = Verdadero
	FinSi
	
FinFuncion

	