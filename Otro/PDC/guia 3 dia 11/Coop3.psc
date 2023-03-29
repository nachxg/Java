//Necesitamos crear un sistema para una m�quina de reciclaje de botellas autom�tica. Dicha
//m�quina nos pagar� dinero por la cantidad de pl�stico reciclado. Tenemos que ingresar
//nuestro usuario y contrase�a para que se nos cargue el saldo por sistema a nuestra
//cuenta.
//	-Condici�n simple anidada: validaremos que el usuario sea "Albus_D", luego si esto es
//	verdadero, validaremos si la contrase�a es "caramelosDeLimon". Si la contrase�a es
//	correcta haremos que una variable llamada Login sea verdadera.
//
//	-Bucle Mientras: Este bloque de validaci�n de la contrase�a lo encerraremos en un
//	bucle Mientras para darle al usuario s�lo 3 intentos para poner la contrase�a.
//						
//	-Bucle Hacer Mientras(Repetir): Una vez que el login sea verdadero, accederemos al
//									men� de opciones:
//										o Ingresar botellas
//										o Consultar saldo
//										o Salir
//			
//			-Ingresar Botellas: Primero preguntaremos cu�ntas botellas se va a ingresar al sistema.
//			Una vez que tenemos el n�mero vamos a usar un bucle para, a fin de ir ingresando
//			cada botella. En cada ciclo del bucle se debe generar un n�mero aleatorio entre 100 y
//			3000 gr, que va a ser el peso de las botellas a reciclar (simulando que el usuario est�
//			ingresando botellas en la m�quina). Una vez generado, seg�n el peso del material,
//			usaremos un condicional m�ltiple para asignarle un valor monetario:
//					o Si es menos de 500 gr, corresponden $50
//					o Si es entre 501 gr y 1500 gr, corresponden $125
//					o Si es m�s de 1501 gr, corresponden $200
//			Hecho esto, el programa debe informar al usuario por pantalla el valor que se le
//			ofrece. Si el usuario acepta, lo acreditamos a su saldo, sino se debe devolver el
//			material (s�lo mostrar en pantalla "Devolviendo material"). Para esto usaremos un
//			condicional doble.
//			
//			-Consultar saldo: revisaremos el valor monetario que tiene asignada la variable "saldo".
//			-Tanto al terminar "Ingresar Botellas" como "Consultar Saldo" debe volver al men� principal.

Algoritmo sin_titulo
	Definir usuario,clave,des,salida Como Caracter
	Definir login Como Logico
	Definir intentos,opciones,botellas,i,peso,saldo Como Entero
	
	intentos = 3
	login = Falso
	peso = 0
	saldo = 0
	
	
	Mientras login = falso Hacer
		Escribir "Ingrese el usuario:"
		Leer usuario
		
		Si usuario <> "Albus_D" Entonces
			Mientras usuario <> "Albus_D" Hacer
				Escribir "Usuario incorrecto. Vuelva a intentarlo."
				Leer usuario
			FinMientras
		FinSi
		
			Escribir "Ingrese la contrase�a:"
			Leer clave
			Mientras clave <> "caramelosDeLimon" Y intentos > 0 Hacer
				intentos = intentos - 1
				Escribir "Contrase�a incorrecta. Tiene ",intentos " intentos restantes."
				Leer clave
				Si intentos = 1 Y clave <> "caramelosDeLimon" Entonces 
					Escribir ""
					Escribir "Ha superado el m�ximo de intentos."
					Mientras intentos = 1 Hacer
					FinMientras
				FinSi
			FinMientras
			
		login = VERDADERO
		
	FinMientras
	
	Hacer
		Escribir ""
		Escribir "Ingrese un n�mero para proceder:"
		Escribir "1. Ingresar botellas."
		Escribir "2. Consultar saldo. "
		Escribir "3. Salir."
		Leer opciones
		Escribir ""
		
		Segun opciones
			1: 
				Escribir "�Cu�ntas botellas ingresar�n al sistema?"
				Leer botellas
				Escribir ""
				
				Para i = 1 Hasta botellas
					peso = peso + aleatorio(100,300)
				FinPara
				
				Si peso < 500 Entonces
					Escribir "El peso ingresado es de ",peso " gr. Le corresponden $50 �Desea aceptarlos? Ingrese S o N para continuar."
				SiNo
					Si peso > 500 Y peso < 1501
						Escribir "El peso ingresado es de ",peso " gr. Le corresponden $125 �Desea aceptarlos? Ingrese S o N para continuar."
					SiNo
						Si peso > 1501 Entonces
							Escribir "El peso ingresado es de ",peso " gr. Le corresponden $200 �Desea aceptarlos? Ingrese S o N para continuar."
						FinSi
					FinSi
				FinSi
				
				Leer des
				Escribir ""
				
				Si des == "s" O des == "S" Entonces
					Si peso < 500 Entonces
						Escribir "Le acreditaremos $50 a su saldo."
						saldo = saldo + 50
					SiNo
						Si peso > 500 y peso < 1501 Entonces
							Escribir "Le acreditaremos $125 a su saldo."
							saldo = saldo + 125
						SiNo
							Si peso > 1501 Entonces
								Escribir "Le acreditaremos $200 a su saldo."
								saldo = saldo + 200
							FinSi
						FinSi
					FinSi
				SiNo
					Escribir ""
					Escribir "Devolviendo materiales..."
					Escribir "Desea volver al men�? Ingrese S o N para continuar."
					Leer salida
					Escribir ""
					Si salida == "n" o salida == "N" Entonces
						Escribir "Saliendo del sistema..."
						login = falso
					FinSi
				FinSi
				
			2: 
				Escribir "Su saldo es de: $",saldo
				Escribir "�Desea volver al men�? Ingrese S o N para continuar."
				Leer salida
				Escribir ""
				Si salida == "n" O salida == "N" Entonces
					Escribir "Saliendo del sistema..."
					login = falso
				FinSi
				
			3: 
				Escribir ""
				Escribir "Saliendo del sistema..."
				login = Falso
				
		FinSegun
		
	Mientras que login == Verdadero
FinAlgoritmo
