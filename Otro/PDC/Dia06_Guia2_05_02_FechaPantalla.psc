Algoritmo Dia06_Guia2_05_02_FechaPantalla
	// Condicional M�ltiple
	// Leer tres n�meros que denoten una fecha (d�a, mes, a�o) y comprobar que sea una fecha
	// v�lida. Si la fecha no es v�lida escribir un mensaje de error por pantalla. Si la fecha es
	// v�lida se debe imprimir la fecha cambiando el n�mero que representa el mes por su
	// nombre. Por ejemplo: si se introduce 1 2 2006, se deber� imprimir "1 de febrero de 2006".
	
	Definir d, m, a, maxDias Como Entero
	Definir mes Como Caracter
	
	Escribir "Ingresar d�a:"
	Leer d
	Escribir "Ingresar mes:"
	Leer m
	Escribir "Ingresar a�o:"
	Leer a
	
	Si m = 1 Entonces
		mes = "enero"
		maxDias = 31
	FinSi
	Si m = 2 Entonces
		mes = "febrero"
		maxDias = 28
	FinSi
	Si m = 3 Entonces
		mes = "marzo"
		maxDias = 31
	FinSi
	Si m = 4 Entonces
		mes = "abril"
		maxDias = 30
	FinSi
	Si m = 5 Entonces
		mes = "mayo"
		maxDias = 31
	FinSi
	Si m = 6 Entonces
		mes = "junio"
		maxDias = 30
	FinSi
	Si m = 7 Entonces
		mes = "julio"
		maxDias = 31
	FinSi
	Si m = 8 Entonces
		mes = "agosto"
		maxDias = 31
	FinSi
	Si m = 9 Entonces
		mes = "septiembre"
		maxDias = 30
	FinSi
	Si m = 10 Entonces
		mes = "octubre"
		maxDias = 31
	FinSi
	Si m = 11 Entonces
		mes = "noviembre"
		maxDias = 30
	FinSi
	Si m = 12 Entonces
		mes = "diciembre"
		maxDias = 31
	FinSi
	
	Si d <= maxDias Entonces
		Escribir d " de " mes " de " a
	SiNo
		Escribir "Fecha erronea. El mes de " mes " tiene " maxDias " dias."
	FinSi
	
FinAlgoritmo
