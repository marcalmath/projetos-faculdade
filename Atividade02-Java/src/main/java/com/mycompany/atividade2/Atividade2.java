
package com.mycompany.atividade2;
import java.util.Scanner;
import java.util.ArrayList;

public class Atividade2 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        ArrayList<PessoaFisica> listaPf = new ArrayList<PessoaFisica>();
        ArrayList<PessoaJuridica> listaPj = new ArrayList<PessoaJuridica>();
        
        char op = 0;
        
        while(op != '4'){
            System.out.println("***** MENU *****");
            System.out.println("1 - Inserir cadastro Pessoa Física.");
            System.out.println("2 - Inserir cadastro Pessoa Jurídica.");
            System.out.println("3 - Imprimir dados.");
            System.out.println("4 - Sair.");
            System.out.println("****************");
            
            op = ler.nextLine().charAt(0);
                    
            switch (op) {
                case '1' ->{
                        System.out.print("Digite o nome: ");
                        String nome = ler.nextLine();
                        
                        System.out.print("Digite o endereço: ");
                        String endereco = ler.nextLine();
                        
                        System.out.print("Digite o telefone: ");
                        String telefone = ler.nextLine();
                        
                        System.out.print("Digite o CPF: ");
                        String cpf = ler.nextLine();
                        
                        PessoaFisica p = new PessoaFisica(nome, endereco, telefone, cpf);
                        listaPf.add(p);

                    }
                case '2' ->{
                        System.out.print("Digite o nome: ");
                        String nome = ler.nextLine();
                        
                        System.out.print("Digite o endereço: ");
                        String endereco = ler.nextLine();
                        
                        System.out.print("Digite o telefone: ");
                        String telefone = ler.nextLine();
                        
                        System.out.print("Digite o CNPJ: ");
                        String cnpj = ler.nextLine();
                        
                        System.out.print("Digite o Nome Fantasia: ");
                        String nomeFantasia = ler.nextLine();
                        
                        PessoaJuridica p = new PessoaJuridica(nome, endereco, telefone, cnpj, nomeFantasia);
                        listaPj.add(p);
                    }
                case '3' -> {
                    System.out.println("*****************************");
                    System.out.println("1 - Imprimir Pessoa Fisica.");
                    System.out.println("2 - Imprimir Pessoa Juridica.");
                    System.out.println("*****************************");
                    
                    char op1 = 0;
                    op1 = ler.nextLine().charAt(0);
                    
                    if(op1 == '1'){
                        System.out.println("Tamanho da lista: "+listaPf.size());
                        System.out.print("Digite a posição, *Posição 1 em diante*: ");
                        int pos = 0;
                        pos = ler.nextInt();
                        ler.nextLine();
                        
                        if(listaPf.size() < pos){
                            System.out.println("Posição inválida!");
                        }else{
                            pos -= 1;
                            listaPf.get(pos).imprimirDados();
                        }

                    }else if(op1 == '2'){
                        System.out.println("Tamanho da lista: "+listaPj.size());
                        System.out.print("Digite a posição, *Posição 1 em diante*: ");
                        int pos = 0;
                        pos = ler.nextInt();
                        ler.nextLine();
                        
                        if(listaPj.size() < pos){
                            System.out.println("Posição inválida!");
                        }else{
                            pos -= 1;
                            listaPj.get(pos).imprimirDados();
                        }
                    }
                }
                default -> {
                }
            }
        }
 
    }
}
