/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificador;

import view.JanelaPrincipal;

/**
 *
 * @author yanma
 */
public class NotificarUsuarioAtual {
    //private String usuario;
    //private String aviso;

    //public void setUsuarioAtual(String nomeUsuario) {
    //    this.usuario = nomeUsuario;
    //}

    //public void setAvisoAtual(String nomeAviso) {
    //    this.aviso = nomeAviso;
    //} 
    
    private String mensagem;
    
    public void notificarUsuario() {
        this.mensagem = "Novo Aviso para " + sessaoNotificacao.nomeUsuario + ": " + sessaoNotificacao.nomeAviso;
        JanelaPrincipal.AvisoUsuarioAtual(mensagem);
    }
}
