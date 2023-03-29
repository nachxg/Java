// En medio de la auditoría interna, el equipo está cubriendo a un compañero de trabajo que
//está de licencia. Su compañero de trabajo ha dejado un mensaje con las tareas a realizar.
//"¡Hola! Muchas gracias por cubrirme. Lo principal que debes hacer es completar la hoja
//de cálculo de ingresos mensuales. Puedes hacerlo buscando los últimos ingresos
//publicitarios en los informes de marketing. Después de hacer todo eso, revisa mi correo
//electrónico y si hay menos de 10 correos sin leer revisa mi correo de voz para ver si hay
//		alguna solicitud de los ejecutivos. Si hay tales solicitudes, hágalas primero a menos que
//		tenga una solicitud de emergencia de otro departamento. Una vez que hayas terminado
//		con la solicitud de cumplimiento, riegue la planta de mi escritorio después de apagar la
//		computadora. Ah, espera, debería haber mencionado un par de cosas: debes iniciar
//		sesión con usuario de administrador para ver los informes de marketing, y tendrás que
//		enviarme un correo electrónico de actualización justo después de que termines de
//		manejar las solicitudes. Bueno, gracias de nuevo. ¡Es de gran ayuda! Te debo el almuerzo
//		uando regrese." [Continua en la siguiente página]
//		Nuestra tarea será imprimir por pantalla la lista de tareas en el orden que corresponden
//		para que luego las podamos realizar. ¿Te animas a colocar las tareas en el orden correcto?
//		Para hacer esto, debes crear en PSeInt la cantidad de variables que creas correctas y
//		asignarles valor.
//		Por ejemplo:
//					? cantidadEmails = 6
//					? solicitudesEjecutivos = 3


Algoritmo sin_titulo
	Definir preg,solicEmergencia,solicEjecutivo Como Caracter
	
	Escribir "Inicie sesión"
	Escribir "Busque ingresos"
	Escribir "Completar hoja"
	Escribir "Revisar email"
	Escribir "¿Hay menos de 10 correos?"
	Leer preg
	
	Si preg == "si" Entonces
		Escribir "Revisar correo de voz"
		Escribir "¿Hay alguna solicitud de emergencia?"
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
