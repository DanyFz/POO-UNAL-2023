VD1 = int(input())
VD2 = int(input())
VD3 = int(input())
SALAR = int(input())
TOTVEN = VD1 + VD2 + VD3
PORVEN = 33 * TOTVEN // 100

if VD1 > PORVEN:
    SALAR1 = SALAR + 20 * SALAR // 100
else:
    SALAR1 = SALAR

if VD2 > PORVEN:
    SALAR2 = SALAR + 20 * SALAR // 100
else:
    SALAR2 = SALAR

if VD3 > PORVEN:
    SALAR3 = SALAR + 20 * SALAR // 100
else:
    SALAR3 = SALAR

print(SALAR1)
print(SALAR2)
print(SALAR3)