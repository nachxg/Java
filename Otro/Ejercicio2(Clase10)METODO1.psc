//Realizar un programa que lea un n�mero entero (tama�o del lado) y a partir de �l cree un
//cuadrado de asteriscos de ese tama�o. Los asteriscos s�lo se ver�n en el borde del
//cuadrado, no en el interior. Por ejemplo, si se ingresa el n�mero 4 se debe mostrar:
//* * * *
//*		*
//*		*
//* * * *
Algoritmo cuadradoDeLadoN
	Definir lado, i, n Como Entero
	Escribir "Ingrese el tama�o del lado del cuadrado"
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
