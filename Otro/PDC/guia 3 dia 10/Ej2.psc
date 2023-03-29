Algoritmo sin_titulo
	Definir lado,x,z,c Como Entero 
	Escribir "Ingrese la cant de asteriscos"
	Leer lado 
	
	Para z = 1 Hasta lado Con Paso 1 Hacer
		Si z = 1 o z = lado Entonces
			Para x = 1 Hasta lado Con Paso 1 Hacer
				Escribir sin saltar "*"
			FinPara
			
		SiNo
			
			Escribir sin saltar "*"
			
			Para c = 1 Hasta lado-2 Con Paso 1 Hacer
				Escribir sin saltar " "
			FinPara
			Escribir sin saltar "*"
		FinSi
		
		Escribir " "
		
	FinPara
	
FinAlgoritmo
