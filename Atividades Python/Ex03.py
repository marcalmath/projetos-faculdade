nome = input("Digite o nome do ginasta: ")

notas = [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
maior = float(0)
menor = float(11)
media = float(0)

for i in range(0,7):
    notas[i] = float(input("Digite a nota: "))
    media = media + notas[i]
    if maior < notas[i]:
        maior = notas[i]
    if menor > notas[i]:
        menor = notas[i]

media = media - maior
media = media - menor
media = media / 5;

print("")
print("Resultado Final")
print("Atleta:",nome)
print("Melhor nota:",maior)
print("Pior nota:",menor)
print("Média:",media)