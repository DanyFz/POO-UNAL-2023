#Algoritmo para calcular relaciones con un lado de un triangulo equilatero 
from math import sqrt
lado=float(input("Ingrese el lado del triangulo: "))
perimetro=3*lado
altura=(sqrt(3)*lado)/2
area=((sqrt(3))/4)*lado**2
print(f"Perimetro:{perimetro}, altura:{altura}, area:{area}")