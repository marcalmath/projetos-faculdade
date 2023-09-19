
package com.mycompany.atividade2;


public class PessoaFisica extends Cliente {
    
    private String cpf;
    
    public PessoaFisica(String n, String e, String t, String c){
        this.setNome(n);
        this.setEndereco(e);
        this.setTelefone(t);
        this.setCpf(c);
    }
    
    private void setCpf(String c){
        this.cpf = c;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void imprimirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CPF: " + getCpf());
    }
}
