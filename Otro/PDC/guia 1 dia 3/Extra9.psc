//Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas, el
//vendedor desea saber cuánto dinero obtendrá por concepto de comisiones por las tres
//ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta su sueldo
//base y comisiones.

Algoritmo sin_titulo
	Definir base,comisiones,final Como Real
	
	Escribir "Ingrese su sueldo base: "
	Leer base
	
	comisiones = (base * 10 / 100) * 3
	final = comisiones + base
	
	Escribir "Su dinero extra por comisiones es de: $",comisiones
	Escribir "Su sueldo final con comisiones es de: $",final
	
FinAlgoritmo
