#Calculo de ralaciones dado tres lados
from math import sqrt
lado_1=float(input())
lado_2=float(input())
lado_3=float(input())
perimetro=lado_1+lado_2+lado_3
semi=(perimetro)/2
area=sqrt(semi*(semi-lado_1)*(semi-lado_2)*(semi-lado_3))
print(f"Perimetro:{perimetro}, semiperimetro:{semi}, area:{area}")
