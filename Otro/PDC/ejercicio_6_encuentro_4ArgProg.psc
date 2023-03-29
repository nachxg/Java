Algoritmo mails1
	Definir mails, ejecutivos Como Entero
	Definir emergencias Como Caracter
	
	Escribir "iniciaste como admin"
	Escribir "despues te fijaste la info de marketing"
    Escribir "completaste la hoja de calculo y revisaste los mails"
	ejecutivos=3
	Escribir "¿cuantos mails te llegaron?"
	leer mails 
	si mails < 10 Entonces
		Escribir "revisaste correo de voz para ver si hay solicitudes de ejecutivos"
		escribir "¿cuantas solicitudes habian?"
		leer ejecutivos
		Escribir "habian " ejecutivos " solicitudes de ejecutivos"
		
	sino  
	FinSi
	
	Escribir "¿hay emergencias de otro departamento?"
	leer emergencias
	
	si emergencias= "si" Entonces 
		escribir "como hay emergencias las hiciste primero"
		Escribir "luego completaste las solicitudes de los ejecutivos"
		
	sino escribir "completaste las solicitudes de los ejecutivos"
		
	FinSi
	
	Escribir "enviaste el correo de actualizacion"
	Escribir "luego de eso apagaste la compu y regaste la planta"
	
	
	
	
	
	
	
	
	
	
	
FinAlgoritmo
	