#El ejercicio no da información sobre las variable entonces se asume que se deben de pedir en el ehercicio 
codigo=int(input())
nombres=str(input())
horas=int(input())
valor_hora=int(input())
porcentaje=float(input())
bruto=horas*valor_hora
retencion=bruto*(porcentaje/100)
neto=bruto-retencion
print(f"{codigo}, {nombres}, Salario bruto:{bruto}, Salario neto:{int(neto)}")