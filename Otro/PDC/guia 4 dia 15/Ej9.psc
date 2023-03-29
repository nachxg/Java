//Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales re-
//petidas. Al final el procedimiento mostrará la frase final.
//
//Por ejemplo:
//Entrada: "Habia una vez un barco"
//Salida: "Habi un vez n brco"
//	
//Se marcan en rojo las repetidas sólo para explicar la consigna. Las vocales ?e?, ?i? y ?o? que-
//dan al no estar repetidas.

Algoritmo sin_titulo
	Definir frase Como Caracter
	
	Escribir "Ingrese una frase:"
	Leer frase
	
	Convertir(frase)
	
FinAlgoritmo

SubProceso Convertir(frase Por Referencia)
Definir i Como Entero
Definir nueva Como Caracter
Definir contA,contE,contI,contO,contU Como Logico

nueva = ""
contA = Falso
contE = Falso
contI = Falso
contO = Falso
contU = Falso

Para i = 0 Hasta Longitud(frase)
	Segun Subcadena(frase,i,i) Hacer
		"a" o "A": 
			Si contA = Falso Entonces
				nueva = Concatenar(nueva,"a") 
				contA = Verdadero
			SiNo
				nueva = Concatenar(nueva,"") 
			FinSi
			
		"e" o "E": 
			Si contE = Falso Entonces
				nueva = Concatenar(nueva,"e") 
				contE = Verdadero
			SiNo
				nueva = Concatenar(nueva,"") 
			FinSi
		"i" o "I": 
			Si contI = Falso Entonces
				nueva = Concatenar(nueva,"i") 
				contI = Verdadero
			SiNo
				nueva = Concatenar(nueva,"") 
			FinSi
		"o" o "O": 
			Si contO = Falso Entonces
				nueva = Concatenar(nueva,"o") 
				contO = Verdadero
			SiNo
				nueva = Concatenar(nueva,"") 
			FinSi
		"u" o "U": 
			Si contU = Falso Entonces
				nueva = Concatenar(nueva,"u") 
				contU = Verdadero
			SiNo
				nueva = Concatenar(nueva,"") 
			FinSi
		De Otro Modo:
			nueva = Concatenar(nueva,Subcadena(frase,i,i))
	FinSegun
FinPara

Escribir nueva

FinSubProceso