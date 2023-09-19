
package com.mycompany.atividadefinal;

public class Professor {
    private String nome;
    private String telefone;
    private String disciplina;
    private int cargaHorariaMensal;
    private float salario; //valor da hora aula R$65
    private String tempoDeTrabalhoEmAnos;
    
    public Professor(String nome, String telefone, String disciplina, int cargaHorariaMensal, float salario, String tempoDeTrabalhoEmAnos) {
        this.nome = nome;
        this.telefone = telefone;
        this.disciplina = disciplina;
        this.cargaHorariaMensal = cargaHorariaMensal;
        this.salario = salario;
        this.tempoDeTrabalhoEmAnos = tempoDeTrabalhoEmAnos;
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

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getCargaHorariaMensal() {
        return cargaHorariaMensal;
    }

    public void setCargaHorariaMensal(int cargaHorariaMensal) {
        this.cargaHorariaMensal = cargaHorariaMensal;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getTempoDeTrabalhoEmAnos() {
        return tempoDeTrabalhoEmAnos;
    }

    public void setTempoDeTrabalhoEmAnos(String tempoDeTrabalhoEmAnos) {
        this.tempoDeTrabalhoEmAnos = tempoDeTrabalhoEmAnos;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Disciplina: " + getDisciplina());
        System.out.println("Carga Horaria Mensal: " + getCargaHorariaMensal());
        System.out.println("Salário: R$" + getSalario());
        System.out.println("Tempo de trabalho: " + getTempoDeTrabalhoEmAnos());
    }
}
