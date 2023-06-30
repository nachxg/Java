//Realizar un programa que lea un número entero (tamaño del lado) y a partir de él cree un
//cuadrado de asteriscos de ese tamaño. Los asteriscos sólo se verán en el borde del
//cuadrado, no en el interior. Por ejemplo, si se ingresa el número 4 se debe mostrar:
//* * * *
//*		*
//*		*
//* * * *
Algoritmo cuadradoDeLadoN
	Definir lado, i, n Como Entero
	Escribir "Ingrese el tamaño del lado del cuadrado"
	Leer lado
	Para i=1 Hasta lado Hacer
		Escribir Sin Saltar "*"
		si i==1 O i==lado
			Para n=2 Hasta lado-1 Hacer
				Escribir Sin Saltar "*"
			FinPara
			Escribir "*"
		SiNo
			para n=1 hasta lado-1 Hacer
				Escribir Sin Saltar " "
			FinPara
			Escribir "*"
		FinSi
	FinPara
FinAlgoritmo
