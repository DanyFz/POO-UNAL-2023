
Salario_Semana=48*5000 #Estamos sacando la ganancia por semana 
Retencion=Salario_Semana*(0.125)
Salario_neto=Salario_Semana-Retencion #este es el salario neto sin retención
print(f"El salario Bruto Semanal es:{int(Salario_Semana)}. Su retención Es:{int(Retencion)} que equivale al 12,5%. Su salario neto Semanal es:{int(Salario_neto)}")
