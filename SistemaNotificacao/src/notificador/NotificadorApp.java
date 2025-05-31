/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificador;

import javax.swing.JOptionPane;
import model.avisoModel;
import view.JanelaLogin;
import view.JanelaPrincipal;

/**
 *
 * @author yanma
 */
public class NotificadorApp {
    
    
     public void notificarUsuario(String nomeUsuario, String nomeAviso) {
        String mensagem = "O usuário " + nomeUsuario + " foi notificado em relação ao aviso: " + nomeAviso;
        JanelaPrincipal.mostrarMensagem(mensagem); 
    }
    
}
