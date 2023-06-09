// En medio de la auditor�a interna, el equipo est� cubriendo a un compa�ero de trabajo que
//est� de licencia. Su compa�ero de trabajo ha dejado un mensaje con las tareas a realizar.
//"�Hola! Muchas gracias por cubrirme. Lo principal que debes hacer es completar la hoja
//de c�lculo de ingresos mensuales. Puedes hacerlo buscando los �ltimos ingresos
//publicitarios en los informes de marketing. Despu�s de hacer todo eso, revisa mi correo
//electr�nico y si hay menos de 10 correos sin leer revisa mi correo de voz para ver si hay
//		alguna solicitud de los ejecutivos. Si hay tales solicitudes, h�galas primero a menos que
//		tenga una solicitud de emergencia de otro departamento. Una vez que hayas terminado
//		con la solicitud de cumplimiento, riegue la planta de mi escritorio despu�s de apagar la
//		computadora. Ah, espera, deber�a haber mencionado un par de cosas: debes iniciar
//		sesi�n con usuario de administrador para ver los informes de marketing, y tendr�s que
//		enviarme un correo electr�nico de actualizaci�n justo despu�s de que termines de
//		manejar las solicitudes. Bueno, gracias de nuevo. �Es de gran ayuda! Te debo el almuerzo
//		uando regrese." [Continua en la siguiente p�gina]
//		Nuestra tarea ser� imprimir por pantalla la lista de tareas en el orden que corresponden
//		para que luego las podamos realizar. �Te animas a colocar las tareas en el orden correcto?
//		Para hacer esto, debes crear en PSeInt la cantidad de variables que creas correctas y
//		asignarles valor.
//		Por ejemplo:
//					? cantidadEmails = 6
//					? solicitudesEjecutivos = 3


Algoritmo sin_titulo
	Definir preg,solicEmergencia,solicEjecutivo Como Caracter
	
	Escribir "Inicie sesi�n"
	Escribir "Busque ingresos"
	Escribir "Completar hoja"
	Escribir "Revisar email"
	Escribir "�Hay menos de 10 correos?"
	Leer preg
	
	Si preg == "si" Entonces
		Escribir "Revisar correo de voz"
		Escribir "�Hay alguna solicitud de emergencia?"
		Leer solicEmergencia
		Si solicEmergencia == "si" Entonces
			Escribir "Completar solicitud de emergencia"
		FinSi
		
		Escribir "Hay alguna solicitud de los ejecutivos?"
		Leer solicEjecutivo
		Si solicEjecutivo == "si" Entonces
			Escribir "Completar solicitud de los ejecutivos"
		FinSi
		
	FinSi
	
	Escribir "Apagar la computadora"
	Escribir "Regar las plantas"
	
FinAlgoritmo
