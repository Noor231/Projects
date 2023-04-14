Actividades 
#Actividad 1
#crear  lista vacia 
Datos=[]
# pedir y añadir nombre
Nombre=input("Cual es tu nombre?")
Datos.append(Nombre)
# Pedir y añadir Apellido 
Apellido=input("Cual es tu apellido?")
Datos.append(Apellido)
# Pedir y añadir Altura
Altura=float(input("Cuantos mides?"))
Datos.append(Altura)
#Pedir y añadir Peso
Peso=float(input("Cuanto pesas?"))
Datos.append(Peso)
#calculr y añadir ICM 
ICM=Peso/Altura**2
Datos.append(ICM)
#mostrar resultado
print(Datos)



#Actividad 2
#crear listas
Kms=[]
Litres=[]
#suma 
suma_Km=0
suma_litres=0

#pedir y añadir  Km
Km_add=float(input("Introduce Km (1)"))
Kms.append(Km_add)

Km_add2=float(input("Introduce Km (2)"))
Kms.append(Km_add2)
for km in Kms:
    suma_Km=suma_Km+km
    
#Pedir y añadir Litres
litres_add=float(input("Introduce Litres(1)"))
Litres.append(litres_add)

litres_add2=float(input("Introduce Litres (2)"))
Litres.append(litres_add2)
for liter in Litres:
    suma_litres=suma_litres+liter
    
consumo=100*suma_litres/suma_Km
    
print("El resultado es:",consumo)


