# Actividad 1 
# crear una lista vacia
persona=[]
# add name
name=input("What is your name?")
persona.append(name)
# add surname
surname=input("What is your surname?")
persona.append(surname)
# add age
age=input("What is your age?")
persona.append(age)
#show name
print(persona[0])
#show surname
print(persona[1])
#show age
print(persona[2])
#show length
print("The length of list is:", len(persona))
#show list
print(persona)




# Actividad 2
# Crear 2 listas vacias de  compra y precio 
#variable de entrada producto(lista)


#pedir y guardar datos der productos
compras=[]
precios=[]


#pedir datos de primer producto 
producto=input("Que es el primer producto?")
precio=float(input("Que es el precio de producto?"))


compras.append(producto)
precios.append(precio)


#pedir datos de segundo producto
producto=input("Que es el segundo producto?")
precio=float(input("Que es el precio de producto?"))


compras.append(producto)
precios.append(precio)
print(compras[0],precios[0])
print(compras[1],precios[1])


#Actividad 3
#crear una lista vacia
notas=[]
# pedir y guardar notas de M1, M2 y M3 en una lista 


#pedir notas de M1
Nota_M1=float(input("Introduce nota de M1:"))
notas.append(Nota_M1)


#pedir notas de M2
Nota_M2=float(input("Introduce nota de M2:"))
notas.append(Nota_M2)


#pedir notas de M3
Nota_M3=float(input("Introduce nota de M3:"))
notas.append(Nota_M3)


# mostrar lista
print("La nota de M1 es:",notas[0])
print("La nota de M2 es:",notas[1])
print("La nota de M3 es:",notas[2])
#sumamos las notas para hacer la media
suma=0
for nota in notas:
    suma=suma+nota


media=suma/len(notas)
print("La media es:",media)
