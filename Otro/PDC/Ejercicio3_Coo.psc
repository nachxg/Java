Algoritmo sin_titulo
////	3. Necesitamos crear un sistema para una máquina de reciclaje de botellas automática. Dicha
////		máquina nos pagará dinero por la cantidad de plástico reciclado. Tenemos que ingresar
////		nuestro usuario y contraseña para que se nos cargue el saldo por sistema a nuestra
////		cuenta.
////		 + Condición simple anidada: validaremos que el usuario sea "Albus_D", luego si esto es
////			verdadero, validaremos si la contraseña es "caramelosDeLimon". Si la contraseña es
////			correcta haremos que una variable llamada Login sea verdadera.
////		+	Bucle Mientras: Este bloque de validación de la contraseña lo encerraremos en un
////			bucle Mientras para darle al usuario sólo 3 intentos para poner la contraseña.
////		+ 	Bucle Hacer Mientras(Repetir): Una vez que el login sea verdadero, accederemos al
////			menú de opciones:
////											o Ingresar botellas
////											o Consultar saldo
////											o Salir
////		1) Ingresar Botellas: Primero preguntaremos cuántas botellas se va a ingresar al sistema.
////			Una vez que tenemos el número vamos a usar un bucle para, a fin de ir ingresando
////			cada botella. En cada ciclo del bucle se debe generar un número aleatorio entre 100 y
////			3000 gr, que va a ser el peso de las botellas a reciclar (simulando que el usuario está
////			ingresando botellas en la máquina). Una vez generado, según el peso del material,
////			usaremos un condicional múltiple para asignarle un valor monetario:
////					o Si es menos de 500 gr, corresponden $50
////					o Si es entre 501 gr y 1500 gr, corresponden $125
////					o Si es más de 1501 gr, corresponden $200
////		Hecho esto, el programa debe informar al usuario por pantalla el valor que se le
////		ofrece. Si el usuario acepta, lo acreditamos a su saldo, sino se debe devolver el
////		material (sólo mostrar en pantalla "Devolviendo material"). Para esto usaremos un
////		condicional doble.
////		2)	Consultar saldo: revisaremos el valor monetario que tiene asignada la variable "saldo".
////		3)	Tanto al terminar "Ingresar Botellas" como "Consultar Saldo" debe volver al menú principal.
	
	Definir usuario,pass,usuarioCorrecto,passCorrecto,respuesta,op1 Como Caracter
	Definir cont1,saldo,valor1,peso,suma,botellas,op,i Como real
	Definir login Como Logico
	saldo=0
	suma=0
	valor1=0
	peso=0
	login=Falso
	usuarioCorrecto="Albus_D"
	passCorrecto="caramelosDeLimon"
	cont1=2
	Escribir "Ingrese usuario"
	leer usuario
	si usuario=usuarioCorrecto
		escribir "Usuario Correcto"
	SiNo
		Mientras usuario<>usuarioCorrecto
			
			Escribir "Usuario incorrecto, Vuelva a intentarlo"
			leer usuario
		FinMientras
		escribir "Usuario Correcto"
	FinSi
	
	Escribir "ingrese contraseña"
	Leer pass
	
	si pass=passCorrecto
		Escribir "Contraseña correcta"
	SiNo
		Mientras pass<>passCorrecto o login=Verdadero
			Escribir "Vuelva a intentar, tiene " cont1 " intentos"
			leer pass
			si pass=passCorrecto
				Escribir "Contraseña correcta"
				login=Verdadero
			SiNo
				cont1=cont1-1
				si cont1==0
					pass=passCorrecto
					Escribir "Se quedo sin intentos"
				FinSi
			FinSi
			
		FinMientras
		
	FinSi
	
	Hacer
		
		Escribir "1- Ingresar botellas"
		Escribir "2- Consultar saldo"
		Escribir "3- Salir"
		leer op
		Segun op
			1:
				escribir "¿Cuantas botellas sa va a ingresar?"
				leer botellas
				
				para i=1 hasta botellas Hacer
					
					peso=Aleatorio(100,3000)
					suma=suma+peso
				FinPara
				si suma<=500
					valor1=50
				SiNo
					si suma>500 y suma<=1500
						valor1=125
					SiNo
						valor1=200
					FinSi
				FinSi
				
				Escribir "El peso es " suma "g"
				Escribir "El Valor es $" valor1
				Escribir "Para aceptarlo presione (Y) o rechazar(N)"
				leer respuesta
				
				si Mayusculas(respuesta)="Y"
					Escribir "Se lo acreditamos a su saldo"
					saldo=saldo+valor1
					Escribir "su nuevo salgo es $" saldo
				SiNo
					Escribir "Devolviendo material"
					
				FinSi
				
			2:
				Escribir "Su Saldo es $" saldo
				
				
			3:
				Escribir "Salio del Programa"
				
		FinSegun
		Escribir ""
		si op<>3
			Escribir "¿Desea volver al menu? Y(para si) N (para salir)"
			leer op1
		FinSi
		
		suma=0
	Mientras Que op1<>"N" y op<>3 y op1<>"n"
	
	Escribir "Hasta Luego!!"
	
	
FinAlgoritmo
