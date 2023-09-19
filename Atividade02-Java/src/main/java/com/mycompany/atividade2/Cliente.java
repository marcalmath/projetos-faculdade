
package com.mycompany.atividade2;


public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;
    
    public void Cliente(String n, String e, String t){
        this.nome = n;
        this.endereco = e;
        this.telefone = t;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setEndereco(String e){
        this.endereco = e;
    }
    public String getEndereco(){
        return this.endereco;
    }
    
    public void setTelefone(String t){
        this.telefone = t;
    }
    public String getTelefone(){
        return this.telefone;
    }
}
