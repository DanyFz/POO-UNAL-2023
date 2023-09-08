
A=float(input('Ingrese el peso de la esfera A: '))
B=float(input('Ingrese el peso de la esfera B: '))
C=float(input('Ingrese el peso de la esfera C: '))
if (B>C) and (B>A):
    print(f'El mayor es B con un peso de {B}')
elif (A>C) and (A>B):
    print(f'El mayor es A con un peso de {A}')
elif (C>B) and (C>A):
    print(f'El mayor es C con un peso de {C}')   
else:
    print('No hay mayor')     