/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificador;

import dao.pessoaDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.pessoaModel;
import view.JanelaLogin;
import view.JanelaPrincipal;
import view.Notificao;
import notificador.sessaoNotificacao;

/**
 *
 * @author yanma
 */
public class NotificadorApp {

    static void EnviarApp(String Novoaviso) {
        pessoaDao pdao = new pessoaDao();
        List<String> mensagens = new ArrayList<>();
        
        for (pessoaModel p : pdao.read()) {
            p.getNome();
            mensagens.add((String) ("Notificação (" + sessaoNotificacao.nomeAviso+ ") enviada para o App de " + p.getNome()));
        }
        Notificao notificao = new Notificao(mensagens);
        notificao.setVisible(true);
    }
    
    
    
    
    
    
    
    
    private JanelaPrincipal janelaPrincipal;

    // Construtor que recebe a janela principal
    public NotificadorApp(JanelaPrincipal janelaPrincipal) {
        this.janelaPrincipal = janelaPrincipal;
    }
    
     public void notificarUsuario(String nomeUsuario, String nomeAviso) {
        String mensagem = "O usuário " + sessaoNotificacao.nomeUsuario + " foi notificado em relação ao aviso: " + sessaoNotificacao.nomeAviso;
        System.out.println("Usuário: " + nomeUsuario);
        janelaPrincipal.mostrarMensagem(mensagem); 
    }
    
}
