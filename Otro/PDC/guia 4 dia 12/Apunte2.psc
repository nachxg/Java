//Realiza una función llamada Cooperar que reciba dos variables de tipo carácter, una variable debe
//contener el mensaje "Cooperando" y la otra "trabajamos mejor". La función debe concatenar am-
//bos textos.

Algoritmo sin_titulo
	Definir coop,trab,retorno Como Caracter
	
	coop = "Cooperando"
	trab = " trabajamos mejor"
	
	retorno = Conc(coop,trab)
	Escribir retorno
	
FinAlgoritmo

Funcion frase = Conc (coop Por Referencia,trab Por Referencia)
	Definir frase Como Caracter
	frase = Concatenar(coop,trab)
FinFuncion