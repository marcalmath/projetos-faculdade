def principal():
    paes = int(input("Informe a quantidade de pães vendidos: "))
    broas = int(input("Informe a quantidade de broas vendidos: "))
    valorTotal = (paes * 0.80) + (broas * 2.5)
    custos = (valorTotal * 43) / 100
    poupanca = (valorTotal * 15) / 100
    converter = (valorTotal * 15) / 100
    sobra = valorTotal - custos - poupanca - converter
    euro = converter // 4.6
    print("###########################")
    print("Valor total das vendas: R$", valorTotal)
    print("Valor dos custos: R$", custos)
    print("Valor para guardar na poupança: R$", poupanca)
    print("Valor para converter em Euro: R$", valorTotal, " sendo o total de Euros: £", euro)
    print("Valor restante das vendas: R$", sobra)


principal()