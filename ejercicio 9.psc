Algoritmo Temperatura
	promedioTemperaturas <- 0
	contPromedio <- 0
	tempAux <- 0
	contTemp <- 0
	Escribir 'Se leeran pares de temperaturas porfavor ingreselas (T1,T2)'
	Mientras contTemp<>1 Hacer
		Escribir 'porfavor ingrese la temperatura T1'
		Leer temp1
		Si temp1=0 Entonces
			contTemp <- 1
			Escribir 'La temperatura  1 es cero por ende termina el programa'
			Escribir ''
		SiNo
			Escribir 'Porfavor ingrese la temperatura T2'
			Leer temp2
			Si (temp1>=5 Y temp1<=15) Entonces
				promedioTemperaturas <- (promedioTemperaturas+temp1)
				contPromedio <- (contPromedio+1)
			FinSi
			Si (temp2>=5 Y temp2<=15) Entonces
				promedioTemperaturas <- (promedioTemperaturas+temp2)
				contPromedio <- (contPromedio+1)
			FinSi
		FinSi
	FinMientras
	Si contPromedio<>0 Entonces
		promedioTempReal <- promedioTemperaturas/contPromedio
		Escribir 'El promedio de las temperaturas entre el rango (5-15) Grados es:'
		Escribir promedioTempReal,' GRADOS'
	FinSi
FinAlgoritmo
