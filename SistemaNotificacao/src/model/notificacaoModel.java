/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author yanma
 */
public class notificacaoModel {
    private String aviso;
    private String nome;
    private String email;

    public notificacaoModel(String aviso, String nome, String email) {
        this.aviso = aviso;
        this.nome = nome;
        this.email = email;
    }
    
    public notificacaoModel() {
       
    }

    public String getAviso() {
        return aviso;
    }

    public void setAviso(String aviso) {
        this.aviso = aviso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
