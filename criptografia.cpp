#include <iostream>
#include <stdio.h>

using namespace std;

char mensagem[100000] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
int chave;

void receber_mensagem(){
    cout << "Digite o texto: ";
    fgets(mensagem, sizeof(mensagem), stdin);
    cout << "\nMensagem recebida!\n\n";
    system("pause");
}

void criptografar(){
    char x;
    int i;
    
    for(i=0; mensagem[i] != '\0'; i++){
        x = mensagem[i];
        if(x >= 'a' && x <= 'z'){
            x += chave;
            if(x > 'z'){
                x = x - 'z' + 'a' - 1;
            }
            mensagem[i] = x;
        }
    }
    cout << "\nMensagem criptografada: " << mensagem << endl << endl;
    system("pause");
}

void descriptografar(){
    char x;
    int i;

    for(i=0; mensagem[i] != '\0'; i++){
        x = mensagem[i];
        if(x >= 'a' && x <= 'z'){
            x -= chave;
            if(x < 'a'){
                x = x + 'z' - 'a' + 1;
            }
            mensagem[i] = x;
        }
    }
    cout << "\nMensagem descriptografada: " << mensagem << endl << endl;
    system("pause");
}

int menu(){
	int op;
	system("cls");
    cout << "Criptografia de Mensagem\n\n";
    cout << "1 - Inserir mensagem\n";
    cout << "2 - Criptografar mensagem\n";
    cout << "3 - Descriptografar mensagem\n";
    cout << "4 - Mostrar mensagem\n";
    cout << "5 - Sair\n";
    cout << "\nInforme a opção: ";
    cin >> op;
	while(op < 1 || op > 5){
		cout << "Digite uma opção válida." << endl;
		cin >> op;
	}
	return op;
}

int main(){
    setlocale(LC_ALL,"UTF-8");
    
    int op = menu(), msg = 0;
	do{
		if(op == 1){
            fflush(stdin);
            receber_mensagem();
            msg = 1;
        }else if(op == 2 && msg == 1){
            cout << "Digite o tamanho da chave (máximo +10): ";
            cin >> chave;
            while(chave < 1 || chave > 10){
                cout << "Digite uma chave válida (máximo +10): ";
                cin >> chave;
            }
            criptografar();
        }else if(op == 3 && msg == 1){
            descriptografar();
        }else if(op == 4 && msg == 1){
            cout << "\nMostrando mensagem: " << mensagem << endl;
            system("pause");
        }else if(op == 5){
            exit(0);
        }else{
            cout << "ERRO! Digite uma mensagem para começar.\n\n";
            system("pause");
        }
		op = menu();
	}while(op != 5);
    
    return 0;
}