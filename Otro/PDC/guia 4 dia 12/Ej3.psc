//Crea una funci�n EsMultiplo que reciba los dos n�meros pasados por el usuario, validando
//que el primer n�mero m�ltiplo del segundo y devuelva verdadero si el primer n�mero es m�ltiplo 
//del segundo, sino es m�ltiplo que devuelva falso.

Algoritmo sin_titulo
	Definir n1,n2 Como Entero
	Definir res Como Logico
	
	Escribir "Ingrese el primer n�mero:"
	Leer n1
	Escribir "Ingrese el segundo n�mero:"
	Leer n2
	
	res = EsMultiplo(n1,n2)
	Si res == VERDADERO Entonces
		Escribir n1 " es m�ltiplo de ",n2
	SiNo
		Escribir n1 " no es m�ltiplo de ",n2
	FinSi
	
FinAlgoritmo

Funcion mult = EsMultiplo (n1,n2)
	Definir mult Como Logico
	mult = n1 MOD n2 == 0
FinFuncion
	