//Crea una función EsMultiplo que reciba los dos números pasados por el usuario, validando
//que el primer número múltiplo del segundo y devuelva verdadero si el primer número es múltiplo 
//del segundo, sino es múltiplo que devuelva falso.

Algoritmo sin_titulo
	Definir n1,n2 Como Entero
	Definir res Como Logico
	
	Escribir "Ingrese el primer número:"
	Leer n1
	Escribir "Ingrese el segundo número:"
	Leer n2
	
	res = EsMultiplo(n1,n2)
	Si res == VERDADERO Entonces
		Escribir n1 " es múltiplo de ",n2
	SiNo
		Escribir n1 " no es múltiplo de ",n2
	FinSi
	
FinAlgoritmo

Funcion mult = EsMultiplo (n1,n2)
	Definir mult Como Logico
	mult = n1 MOD n2 == 0
FinFuncion
	