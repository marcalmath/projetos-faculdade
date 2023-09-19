print("***** CADASTRO *****")
usuarioCad = input("Digite o nome de usuário: ")
senhaCad = input("Digite sua senha: ")

while(usuarioCad == senhaCad):
    print("ERRO. Login deve ser diferente da senha.")
    print("")
    print("***** CADASTRO *****")
    usuarioCad = input("Digite o nome de usuário: ")
    senhaCad = input("Digite sua senha: ")

print("")
print("Bem vindo ao sistema bancário")
print("Insira seus dados para começar...")
usuario = input("Login: ")
senha = input("Senha: ")

while usuario != usuarioCad or senha != senhaCad:
    print("Usuário ou senha inválidos!")
    usuario = input("Login: ")
    senha = input("Senha: ")

op = int(0)
saldo = int(0)

while op != 4:
    valor = int(0)
    print("***** MENU *****")
    print("1 - Depositar")
    print("2 - Sacar")
    print("3 - Transferir")
    print("4 - Sair")

    op = int(input("Digite a opção desejada: "))

    if op == 1:
        saldo = int(input("Digite o valor a ser depositado: "))
        print("Saldo atualizado.")
    elif op == 2:
        valor = int(input("Digite o valor do saque: "))
        if valor > saldo:
            print("Saldo insuficiente!")
        else:
            saldo = saldo - valor
    elif op == 3:
        valor = int(input("Digite o valor para transferir: "))
        if valor > saldo:
            print("Saldo insuficiente!")
        else:
            saldo = saldo - valor
            conta = input("Digite a conta do destinatario: ")
            agencia = input("Digite a agencia do destinatario: ")

print("Até a próxima!! Seu saldo atualizado é de:",saldo)