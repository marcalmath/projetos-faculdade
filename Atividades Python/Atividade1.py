lista = []
op = int(0)

def adicionar_contato():
    contato = {
        'nome': input("Digite o nome: "),
        'telefone': input("Digite o telefone: "),
        'email': input("Digite o e-mail: "),
        'endereco': input("Digite o endereço: ")
    }
    lista.append(contato)
    print("O contato {} foi cadastrado com sucesso.\n".format(contato['nome']))

def atualizar():
    print("# Atualizar contato... #")
    if len(lista) > 0:
        nome = input("Digite o nome do contato para atualizar: ")
        for contato in lista:
            if contato['nome'] == nome:
                print("Nome: {}".format(contato['nome']))
                print("Telefone: {}".format(contato['telefone']))
                print("E-mail: {}".format(contato['email']))
                print("Endereço: {}".format(contato['endereco']))
                print("##############################")
                contato['nome'] = input("Digite o novo nome: ")
                contato['telefone'] = input("Digite o novo telefone: ")
                contato['email'] = input("Digite o novo e-mail: ")
                contato['endereco'] = input("Digite o novo endereço: ")
                break
    else:
        print("Não existem contatos cadastrados...")

def pesquisa_contato():
    print("# Buscando contato... #")
    if len(lista) > 0:
        nome = input("Digite o nome do contato para pesquisar: ")
        for contato in lista:
            if contato['nome'] == nome:
                print("Nome: {}".format(contato['nome']))
                print("Telefone: {}".format(contato['telefone']))
                print("E-mail: {}".format(contato['email']))
                print("Endereço: {}".format(contato['endereco']))
                print("##############################")
                break
    else:
        print("Não existem contatos cadastrados...")

def apagar_contato():
    print("# Excluir contato... #")
    if len(lista) > 0:
        nome = input("Digite o nome do contato para apagar: ")
        for i, contato in enumerate(lista):
            if contato['nome'] == nome:
                print("Nome: {}".format(contato['nome']))
                print("Telefone: {}".format(contato['telefone']))
                print("E-mail: {}".format(contato['email']))
                print("Endereço: {}".format(contato['endereco']))
                print("##############################")
                del lista[i]
                print("O contato foi apagado com sucesso.\n")
                break
    else:
        print("Não existem contatos cadastrados...")

def listar_contatos():
    print("# Listando contatos... #")
    if len(lista) > 0:
        for i, contato in enumerate(lista):
            print("Contato número {}".format(i+1))
            print("\tNome: {}".format(contato['nome']))
            print("\tTelefone: {}".format(contato['telefone']))
            print("\tE-mail: {}".format(contato['email']))
            print("\tEndereço: {}".format(contato['endereco']))
            print("##############################")
    else:
        print("Não existem contatos cadastrados...")


while op != 6:

    print("****** MENU ******")
    print("1 - Inserir contato.")
    print("2 - Atualizar contato.")
    print("3 - Pesquisar contato.")
    print("4 - Apagar contato.")
    print("5 - Listar todos.")
    print("6 - Sair.")
    print("******************")

    op = int(input("Digite a opção: "))

    if op == 1:
        adicionar_contato()
    elif op == 2:
        atualizar()
    elif op == 3:
        pesquisa_contato()
    elif op == 4:
        apagar_contato()
    elif op == 5:
        listar_contatos()
    elif op == 6:
        print("Encerrando programa...")
    else:
        print("Opção inválida!")
        op = int(input())
