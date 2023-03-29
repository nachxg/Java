//Realizar una funci�n que calcule la suma de los d�gitos de un n�mero.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el �ltimo n�mero de un digito de 2 cifras o m�s debemos pensar en el
//resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc.

Algoritmo sin_titulo
	Definir nro Como Entero
	
	Escribir "Ingrese un n�mero:"
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
