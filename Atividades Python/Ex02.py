numeroInicial = int(input("Digite um numero entre 1 e 100: "))

while (numeroInicial < 1 or numeroInicial > 100):
    numeroInicial = int(input("Numero inválido!! Digite um numero entre 1 e 100: "))

numero = numeroInicial
contador = numeroInicial

while contador > 1:
    numero *= contador-1
    contador -= 1

print("Usuário escolheu ",numeroInicial)
print("Fatorial de",numeroInicial,"=",numero)
