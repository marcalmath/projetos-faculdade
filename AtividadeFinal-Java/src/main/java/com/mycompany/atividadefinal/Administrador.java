
package com.mycompany.atividadefinal;

public class Administrador {
    private String nome;
    private String telefone;
    private float salario;
    private String tempoDeTrabalhoEmAnos;

    public Administrador(String nome, String telefone, float salario, String tempoDeTrabalhoEmAnos) {
        this.nome = nome;
        this.telefone = telefone;
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
        System.out.println("Salário: R$" + getSalario());
        System.out.println("Tempo de trabalho: " + getTempoDeTrabalhoEmAnos());
    }
}
