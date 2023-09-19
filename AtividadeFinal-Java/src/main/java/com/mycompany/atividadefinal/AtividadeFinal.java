
package com.mycompany.atividadefinal;
import java.util.Scanner;
import java.util.ArrayList;


public class AtividadeFinal {

    static String loginAdmin = "admin";
    static String senhaAdmin = "admin";
    static String loginProf = "professor";
    static String senhaProf = "professor";
    static String loginAluno = "aluno";
    static String senhaAluno = "aluno";
    
    public static int autenticarUsuario(String login, String senha){
        if(login.equals(loginAdmin) && senha.equals(senhaAdmin)){
            return 1;
        }else if(login.equals(loginProf) && senha.equals(senhaProf)){
            return 2;
        }else if(login.equals(loginAluno) && senha.equals(senhaAluno)){
            return 3;
        }else{
            return 0;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        ArrayList<Administrador> listaAdmin = new ArrayList<Administrador>();
        ArrayList<Professor> listaProfessor = new ArrayList<Professor>();
        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
        
        char op = 0, op2 = '4';
        String login = "vazio", senha = "vazio";

        while(op != '2'){
            
            System.out.println("**** Menu de Login ****");
            System.out.println("1 - Login de usuário.");
            System.out.println("2 - Sair do programa.");
            System.out.print("Digite a opção > ");
            op = ler.nextLine().charAt(0);
            
            if(op == '1'){
                System.out.println("### Acessar usuário ###");
                System.out.print("Digite o login: ");
                login = ler.nextLine();
                System.out.print("Digite a senha: ");
                senha = ler.nextLine();
                op2 = 0;
            }
            
            while(op2 != '4'){   
                if(autenticarUsuario(login, senha) == 1){/////////////////////////MENU DO ADMIN////////////
                    System.out.println("******** MENU ADMIN ********");
                    System.out.println("1 - Adicionar novo cadastro.");
                    System.out.println("2 - Pesquisar usuário.");
                    System.out.println("3 - Excluir usuário.");
                    System.out.println("4 - Voltar para login.");
                    System.out.println("****************************");
                    System.out.print("Digite a opção > ");
                    op2 = ler.nextLine().charAt(0);

                    switch(op2){
                        case '1'->{
                            System.out.print("Digite o nome: ");
                            String nome = ler.nextLine();
                      
                            System.out.print("Digite o Telefone: ");
                            String telefone = ler.nextLine();
                        
                            System.out.print("Digite o Salário: ");
                            float salario = ler.nextFloat();
                            ler.nextLine();
                                    
                            System.out.print("Digite o tempo de trabalho: ");
                            String tempoDeTrabalhoEmAnos = ler.nextLine();
                        
                            Administrador p = new Administrador(nome, telefone, salario, tempoDeTrabalhoEmAnos);
                            listaAdmin.add(p);
                        }
                        case '2'->{
                            System.out.println("Tamanho da lista: "+listaAdmin.size());
                            System.out.print("Digite a posição, *Posição 1 em diante*: ");
                            int pos = 0;
                            pos = ler.nextInt();
                            ler.nextLine();
                        
                            if(listaAdmin.size() < pos){
                                System.out.println("Posição inválida!");
                            }else{
                                pos -= 1;
                                listaAdmin.get(pos).imprimirDados();
                            }
                        }
                        case '3'->{
                            System.out.println("1 - Excluir da lista ADMIN");
                            System.out.println("2 - Excluir da lista PROFESSOR");
                            System.out.println("3 - Excluir da lista ALUNO");
                            char msg = ler.nextLine().charAt(0);
                            
                            if(msg == '1'){
                                System.out.println("Tamanho da lista: "+listaAdmin.size());
                                System.out.print("Digite a posição, *Posição 1 em diante*: ");
                                int pos = 0;
                                pos = ler.nextInt();
                                ler.nextLine();
                            
                                if(listaAdmin.size() < pos){
                                    System.out.println("Posição inválida!");
                                }else{
                                    pos -= 1;
                                    listaAdmin.remove(pos);
                                }
                            }else if(msg == '2'){
                                System.out.println("Tamanho da lista: "+listaProfessor.size());
                                System.out.print("Digite a posição, *Posição 1 em diante*: ");
                                int pos = 0;
                                pos = ler.nextInt();
                                ler.nextLine();
                            
                                if(listaProfessor.size() < pos){
                                    System.out.println("Posição inválida!");
                                }else{
                                    pos -= 1;
                                    listaProfessor.remove(pos);
                                }
                            }else if(msg == '3'){
                                System.out.println("Tamanho da lista: "+listaAluno.size());
                                System.out.print("Digite a posição, *Posição 1 em diante*: ");
                                int pos = 0;
                                pos = ler.nextInt();
                                ler.nextLine();
                            
                                if(listaAluno.size() < pos){
                                    System.out.println("Posição inválida!");
                                }else{
                                    pos -= 1;
                                    listaAluno.remove(pos);
                                }
                            }
                        }
                        default -> {
                        }
                    }
                }else if(autenticarUsuario(login, senha) == 2){ //////////////////////MENU DO PROFESSOR //////////////
                    System.out.println("******** MENU PROFESSOR ********");
                    System.out.println("1 - Adicionar novo cadastro.");
                    System.out.println("2 - Pesquisar usuário.");
                    System.out.println("3 - Excluir usuário.");
                    System.out.println("4 - Voltar para login.");
                    System.out.println("********************************");
                    System.out.print("Digite a opção > ");
                    op2 = ler.nextLine().charAt(0);

                    switch(op2){
                        case '1'->{
                            System.out.print("Digite o nome: ");
                            String nome = ler.nextLine();
                      
                            System.out.print("Digite o Telefone: ");
                            String telefone = ler.nextLine();
                            
                            System.out.print("Digite a disciplina: ");
                            String disciplina = ler.nextLine();
                            
                            System.out.print("Digite a carga horaria: ");
                            int cargaHorariaMensal = ler.nextInt();
                            ler.nextLine();
                            
                            float salario = cargaHorariaMensal * 65;
                            
                            System.out.print("Digite o tempo de trabalho: ");
                            String tempoDeTrabalhoEmAnos = ler.nextLine();
                            
                            Professor p = new Professor(nome, telefone, disciplina, cargaHorariaMensal, salario, tempoDeTrabalhoEmAnos);
                            listaProfessor.add(p);
                            System.out.println("Cadastro inserido com sucesso!");
                        }
                        case '2'->{
                            System.out.println("Tamanho da lista: "+listaProfessor.size());
                            System.out.print("Digite a posição, *Posição 1 em diante*: ");
                            int pos = 0;
                            pos = ler.nextInt();
                            ler.nextLine();
                        
                            if(listaProfessor.size() < pos){
                                System.out.println("Posição inválida!");
                            }else{
                                pos -= 1;
                                listaProfessor.get(pos).imprimirDados();
                            }
                        }
                        case '3'->{
                            System.out.println("Usuário não possui autorização para excluir.");
                        }
                        default -> {
                        }
                    }
                }else if(autenticarUsuario(login, senha) == 3){////////////////MENU DO ALUNO/////////
                    System.out.println("******** MENU ALUNO ********");
                    System.out.println("1 - Adicionar novo cadastro.");
                    System.out.println("2 - Pesquisar usuário.");
                    System.out.println("3 - Excluir usuário.");
                    System.out.println("4 - Voltar para login.");
                    System.out.println("****************************");
                    System.out.print("Digite a opção > ");
                    op2 = ler.nextLine().charAt(0);

                    switch(op2){
                        case '1'->{
                            
                            System.out.print("Digite o nome: ");
                            String nome = ler.nextLine();
                      
                            System.out.print("Digite o Telefone: ");
                            String telefone = ler.nextLine();
                            
                            System.out.print("Digite a quantidade de disciplinas: ");
                            int qtdDisciplina = ler.nextInt();
                            ler.nextLine();
                            
                            float valorMensalidade = qtdDisciplina * 180;
                            
                            System.out.print("Digite o tempo restante para formar: ");
                            String tempoParaFormar = ler.nextLine();
                            
                            Aluno p = new Aluno(nome, telefone, qtdDisciplina, valorMensalidade, tempoParaFormar);
                            listaAluno.add(p);
                            System.out.println("Cadastro inserido com sucesso!");
                        }
                        case '2'->{
                            System.out.println("Tamanho da lista: "+listaAluno.size());
                            System.out.print("Digite a posição, *Posição 1 em diante*: ");
                            int pos = 0;
                            pos = ler.nextInt();
                            ler.nextLine();
                        
                            if(listaAluno.size() < pos){
                                System.out.println("Posição inválida!");
                            }else{
                                pos -= 1;
                                listaAluno.get(pos).imprimirDados();
                            }
                        }
                        case '3'->{
                            System.out.println("Usuário não possui autorização para excluir.");
                        }
                        default -> {
                        }
                    }
                }else if(autenticarUsuario(login, senha) == 0){////////////////SAIR DO MENU E VOLTAR AO LOGIN
                    System.out.println("Usuário não autenticado.");
                    op2 = '4';
                }
            }           
        }
    }   
}
