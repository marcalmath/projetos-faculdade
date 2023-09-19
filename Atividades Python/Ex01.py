base = int(input("Digite o primeiro número: "))
expoente = int(input("Digite o segundo número: "))

potencia = 1
contador = 1

while base == expoente:
    print("Números inválidos! Base e expoente não podem ser iguais!")
    base = int(input("Digite novamente o primeiro número: "))
    expoente = int(input("Digite novamente o segundo número: "))

while contador <= expoente:
    potencia *= base
    contador += 1

print(base,"^",expoente,"=",potencia)


