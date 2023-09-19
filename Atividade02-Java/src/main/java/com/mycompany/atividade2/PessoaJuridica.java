
package com.mycompany.atividade2;


public class PessoaJuridica extends Cliente {
    
    private String cnpj;
    private String nomeFantasia;
    
    public PessoaJuridica(String n, String e, String t, String c, String nf){
        this.setNome(n);
        this.setEndereco(e);
        this.setTelefone(t);
        this.cnpj = c;
        this.nomeFantasia = nf;
    }
    
    public void setNomeFantasia(String nf){
        this.nomeFantasia = nf;
    }
    
    public String getNomeFantasia(){
        return this.nomeFantasia;
    }
    
    public String getCnpj(){
        return this.cnpj;
    }
    
    public void imprimirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Nome Fantasia: " + getNomeFantasia());
    };
}
