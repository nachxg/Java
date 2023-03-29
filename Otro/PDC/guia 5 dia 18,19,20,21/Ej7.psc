////Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios. Después,
////hacer una función que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
////función debe devolver el resultado de esta validación, para mostrar el mensaje en el algoritmo.
////Nota: recordar el uso de las variables de tipo lógico.

Algoritmo sin_titulo
	Definir n,vectorA,vectorB Como Entero
	
	Escribir "Ingrese el tamaño de los vectores:"
	Leer n
	
	Dimension vectorA(n)
	Dimension vectorB(n)
	
	llenarVectores(vectorA,vectorB,n)
	
	Escribir "¿Coinciden los valores de ambos vectores? ",val(vectorA,vectorB,n)
	
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

	