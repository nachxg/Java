// Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
// capicúa o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc. No podemos
// transformar el numero a cadena para realizar el ejercicio.

Funcion retorno <- Capicua( num )
	Definir retorno Como Logico;
	Definir digito, numc, numinv Como Entero;
	numc=num
	numinv=0

	Mientras numc<>0 Hacer
		digito = numc mod 10;
		numinv=(numinv*10)+digito;
		numc = trunc(numc/10);
	Fin Mientras
	
	Si num=numinv Entonces
		retorno = Verdadero
	SiNo 
		retorno = Falso
	FinSi
Fin Funcion

Algoritmo numero_capicua
	Definir num Como Entero;
	Escribir "Ingrese un numero";
	Leer num
	
	Escribir "El numero ", num , " es capicua ", Capicua(num)
	
FinAlgoritmo
