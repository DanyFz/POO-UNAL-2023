#ecuacion de grado 2
from math import sqrt
A=float(input('Ingrese el valor de A: '))
B=float(input('Ingrese el valor de B: '))
C=float(input('Ingrese el valor de C: '))
if ((B**2)-(4*A*C))<0:
    print('La ecuación no tiene solución en los reales')
else:
    x_1=(-B+sqrt((B**2)-(4*A*C))) / 2*A
    x_2=(-B-sqrt((B**2)-(4*A*C))) / 2*A     
    print(f'La soluciones reales de la ecuación son: x_1={x_1} y x_2={x_2}')