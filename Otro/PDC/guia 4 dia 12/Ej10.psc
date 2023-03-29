//Realizar una función que calcule la suma de los dígitos de un número.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el último número de un digito de 2 cifras o más debemos pensar en el
//resto de una división entre 10. Recordar el uso de la función Mod y Trunc.

Algoritmo sin_titulo
	Definir nro Como Entero
	
	Escribir "Ingrese un número:"
	Leer nro
	Escribir suma(nro)
	
FinAlgoritmo

Funcion calc = Suma(nro)
	Definir calc Como Entero
	calc = 0

	Mientras nro > 0 Hacer
		calc = calc + nro MOD 10
		nro = TRUNC(nro / 10)
	FinMientras
	
FinFuncion
