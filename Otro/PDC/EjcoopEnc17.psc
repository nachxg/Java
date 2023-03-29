//// 			Menu
////1. Calcular muro de ladrillo
////2. Calcular viga de hormigón
////3. Calcular columnas de hormigón
////4. Calcular contrapisos
////5. Calcular techo
////6. Calcular pisos
////7. Calcular pintura
////8. Calcular iluminación
////9. Salir
////subprogramas calcularSuperficie y calcularVolumen
////Haremos ambos para usarlos dentro de los otros subprogramas. El usuario no puede acceder a
////	ellos.

Algoritmo sin_titulo
	
	Menu()
	
FinAlgoritmo

SubProceso Menu()
	
	Definir op Como Entero
	Escribir "Ingrese una opción:"
	Escribir "1. Calcular muro de ladrillo."
	Escribir "2. Calcular viga de hormigón."
	Escribir "3. Calcular columnas de hormigón."
	Escribir "4. Calcular contrapisos."
	Escribir "5. Calcular techo."
	Escribir "6. Calcular pisos."
	Escribir "7. Calcular pintura."
	Escribir "8. Calcular iluminación."
	Escribir "9. Salir."
	Leer op
	
	Segun op Hacer
		1: calcularMuro()
		2: calcularViga()
		3: calcularColumnas()
		4: calcularContrapisos()
		5: calcularTecho()
		6: calcularPisos()
		7: calcularPintura()
		8: calcularIluminacion()
		9: salir()
		De otro Modo: 
			Escribir ""
			Escribir "El valor ingresado no es correcto. Vuelva a intentarlo."
			Escribir ""
			Menu()
	FinSegun
FinSubProceso

Subproceso calcularSuperficie(largo Por Referencia,ancho Por Referencia,sup Por Referencia)
	sup = 0
	sup = largo * ancho
FinSubProceso

Subproceso calcularVolumen(espesor Por Referencia,ancho Por Referencia,largo Por Referencia,vol Por Referencia)
	vol = 0
	vol = espesor * largo * ancho
FinSubProceso

SubProceso calcularMuro()
	Definir espesor Como Entero
	Definir largo,ancho,sup,ladrillos,arena,cemento Como Real
	Escribir "Ingrese el espesor del muro:"
	Escribir "1. 20 cm."
	Escribir "2. 30 cm."
	Leer espesor
	Escribir "Ingrese el largo del muro:"
	Leer largo
	Escribir "Ingrese la altura del muro:"
	Leer ancho
	
	calcularSuperficie(largo,ancho,sup)
	
	Si espesor == 2 Entonces
		ladrillos = sup * 120
		cemento = sup * 15.2
		arena = sup * 0.115
	Sino
		ladrillos = sup * 90
		cemento = sup * 10.9
		arena = sup * 0.09
	FinSi
	
	Escribir "La superficie del muro es: ",sup
	Escribir "Se necesitarán:"
	Escribir cemento " kg de cemento."
	Escribir arena " m3 de arena."
	Escribir ladrillos " ladrillos."
	menu()
FinSubProceso

SubProceso calcularViga()
	Definir largo,cemento,ayp,hierro8,hierro4 Como Real
	
	Escribir "Ingrese el largo de la viga:"
	Leer largo
	
	cemento = 9 * largo
	ayp = 0.02 * largo
	hierro8 = 4 * largo
	hierro4 = 3 * largo 
	
	Escribir "Cantidad de materiales necesarios:" 
	Escribir cemento " kg de cemento."
	Escribir ayp " m3 de arena."
	Escribir ayp " m2 de piedra."
	Escribir hierro8 " m de hierro del 8."
	Escribir hierro4 " m de hierro del 4."
	menu()
FinSubProceso

SubProceso calcularColumnas()
	Definir largo,cemento,ayp,hierro10,hierro4 Como Real
	Escribir "Ingrese el largo de la columna:"
	Leer largo
	
	cemento = 7.5 * largo
	ayp = 0.016 * largo
	hierro10 = 6 * largo
	hierro4 = 3 * largo 
	
	Escribir "Cantidad de materiales necesarios:" 
	Escribir cemento " kg de cemento."
	Escribir ayp " m3 de arena."
	Escribir ayp " m2 de piedra."
	Escribir hierro10 " m de hierro del 10."
	Escribir hierro4 " m de hierro del 4."
	menu()
FinSubProceso

Subproceso calcularContrapisos()
	Definir espesor,ancho,largo,vol,cemento,arena,piedra Como Real
	
	Escribir "Ingrese el espesor del contrapiso:"
	Leer espesor
	Escribir "Ingrese el ancho del contrapiso:"
	Leer ancho
	Escribir "Ingrese el largo del contrapiso:"
	Leer largo
	
	calcularVolumen(espesor,ancho,largo,vol)
	Escribir "El volumen del contrapiso es: ",vol " m3."
	
	cemento = 105 * vol
	arena = 0.45 * vol
	piedra = 0.9 * vol
	
	Escribir "Cantidad de materiales necesarios:"
	Escribir cemento " kg de cemento."
	Escribir arena " m3 de arena."
	Escribir piedra " m3 de piedra."
	menu()
FinSubProceso

SubProceso calcularTecho()
	Definir espesor,ancho,largo,cemento,ayp,hierro8,hierro6,sup Como Real
	
	Escribir "Ingrese el espesor del techo:"
	Leer espesor
	Escribir "Ingrese el ancho del techo:"
	Leer ancho
	Escribir "Ingrese el largo del techo:"
	Leer largo
	
	calcularSuperficie(largo,ancho,sup)
	
	cemento = 33 * sup
	ayp = 0.072 * sup
	hierro8 = 7 * sup
	hierro6 = 4 * sup
	
	Escribir "La superficie del techo es de: ",sup " m2."
	Escribir "Cantidad de materiales necesarios:"
	Escribir cemento " kg de cemento."
	Escribir ayp " m3 de arena."
	Escribir ayp " m2 de piedra."
	Escribir hierro8 " m de hierro del 10."
	Escribir hierro6 " m de hierro del 4."
	menu()
FinSubProceso
	
SubProceso calcularPisos()
	Definir ancho,largo,sup Como Real
	
	Escribir "Ingrese el ancho del piso:"
	Leer ancho
	Escribir "Ingrese el largo del piso:"
	Leer largo
	
	calcularSuperficie(ancho,largo,sup)
	
	Escribir "La superficie del piso será de ",sup + (sup*0.1) " m2."
	menu()
FinSubProceso
	
SubProceso calcularPintura()
	Definir sup Como Real
	
	Escribir "Ingrese la superficie del muro a pintar:" 
	Leer sup
	Escribir "Se necesitarán ",sup * 6 " lt de pintura."
	menu()
FinSubProceso
	
SubProceso calcularIluminacion() 
	Definir sup Como Real
	
	Escribir "Ingrese la superficie de la habitación."
	Leer sup
	Escribir "La cantidad mínima de iluminación natural será de: ",sup * 0.20 "."
	menu()
FinSubProceso
	
SubProceso salir()
	Definir sn Como Caracter
	Escribir "¿Desea salir? S/N"
	leer sn
	si sn = "N" o sn="n" Entonces
		menu()
	SiNo
		Escribir "Gracias por utilizar el servicio."
	FinSi
FinSubProceso
	