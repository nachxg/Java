//Crear una funci�n llamada "Login", que recibe un nombre de usuario y una contrase�a y que
//devuelve Verdadero si el nombre de usuario es "usuario1" y si la contrase�a es "asdasd". Ade-
//m�s, la funci�n calculara el n�mero de intentos que se ha usado para loguearse, tenemos solo
//3 intentos, si nos quedamos sin intentos la funci�n devolver� Falso.

Algoritmo sin_titulo
	Definir usuario,clave Como Caracter

	Escribir "Ingrese su nombre de usuario:"
	Leer usuario
	Escribir "Ingrese su contrase�a:"
	Leer clave
	
	Escribir login(usuario,clave)
	
FinAlgoritmo

Funcion log = Login(usuario,clave)
	Definir log,log2 Como Logico
	Definir intentos Como Entero
	intentos = 3
	log = falso
	log2 = falso
	Si usuario == "usuario1" Y clave == "asdasd" Entonces
		log = Verdadero
	SiNo
		Mientras intentos > 1 Y log2 == falso Hacer
		Escribir "Datos incorrectos. Vuelva a intentarlo."
		intentos = intentos - 1
		Escribir "Le quedan ",intentos " intentos."
			Escribir "Ingrese su nombre de usuario:"
			Leer usuario
			Escribir "Ingrese su contrase�a:"
			Leer clave
			Si usuario == "usuario1" Y clave == "asdasd" Entonces
				log2 = verdadero
			FinSi
		FinMientras
		si log2 = verdadero Entonces
			log = Verdadero
		SiNo
			log = falso
		FinSi
	FinSi
FinFuncion
	