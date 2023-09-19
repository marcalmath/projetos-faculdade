
package com.mycompany.atividadefinal;

public class Aluno {
    private String nome;
    private String telefone;
    private int qtdDisciplina;
    private float valorMensalidade; //cada disciplina custa R$180 por mês
    private String tempoParaFormar; //4 anos de curso

    public Aluno(String nome, String telefone, int qtdDisciplina, float valorMensalidade, String tempoParaFormar) {
        this.nome = nome;
        this.telefone = telefone;
        this.qtdDisciplina = qtdDisciplina;
        this.valorMensalidade = valorMensalidade;
        this.tempoParaFormar = tempoParaFormar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getQtdDisciplina() {
        return qtdDisciplina;
    }

    public void setQtdDisciplina(int qtdDisciplina) {
        this.qtdDisciplina = qtdDisciplina;
    }

    public float getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(float valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public String getTempoParaFormar() {
        return tempoParaFormar;
    }

    public void setTempoParaFormar(String tempoParaFormar) {
        this.tempoParaFormar = tempoParaFormar;
    }
    
    public void imprimirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Quantidade de disciplina: " + getQtdDisciplina());
        System.out.println("Valor da mensalidade: " + getValorMensalidade());
        System.out.println("Tempo para formar: " + getTempoParaFormar());
    }
}
