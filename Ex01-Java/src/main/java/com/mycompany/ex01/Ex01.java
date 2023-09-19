
package com.mycompany.ex01;
import java.util.Scanner;

public class Ex01 {

        public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        final char gabarito[] = {'A', 'B', 'C', 'D', 'E', 'E', 'D', 'C', 'B', 'A'};
        char resposta[] = {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'};
        
        int op = 1;
        int alunosQtd = 0, alunoMaior = 0, alunoMenor = 0;
        int acertos = 0;
        int maior = 0, menor = 11;
        int media = 0;
        
        do{
            acertos = 0;
            System.out.println("Verificação de gabarito do Aluno "+(alunosQtd+1)+".");
            
            for(int i=0; i<10; i++){
                System.out.println("Insira a resposta da questão "+(i+1)+".");
                resposta[i] = ler.nextLine().charAt(0);
                if(resposta[i] == gabarito[i]){
                    acertos++;
                }
            }
            
            if(acertos > maior){
                maior = acertos;
                alunoMaior = alunosQtd+1;
            }
            
            if(acertos < menor){
                menor = acertos;
                alunoMenor = alunosQtd+1;
            }
            
            System.out.println("O Aluno "+(alunosQtd+1)+" teve uma nota de "+acertos+".");
            System.out.println("Deseja continuar a verificação?");
            System.out.println("1 - Para continuar.");
            System.out.println("2 - Para sair.");
            op = Integer.parseInt(ler.nextLine());
            
            media = media + acertos;
            
            alunosQtd++;
        }while(op == 1);
        
        int mediaFinal = media / alunosQtd;
        
        System.out.println("**** Resultados da Prova ****");
        System.out.println("O maior acerto foi de "+maior+" do Aluno "+alunoMaior+".");
        System.out.println("O menor acerto foi de "+menor+" do Aluno "+alunoMenor+".");
        System.out.println("Um total de "+(alunosQtd)+" alunos utilizaram o sistema.");
        System.out.println("A média total da turma é de: "+mediaFinal+".");
        
    }
        
}
