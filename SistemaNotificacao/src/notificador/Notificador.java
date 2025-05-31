/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificador;

import dao.pessoaDao;
import java.util.List;
import model.avisoModel;
import model.pessoaModel;
import view.Notificao;

/**
 *
 * @author yanma
 */
public class Notificador {

    public void enviarAviso(avisoModel a) {
        pessoaDao dao = new pessoaDao();
        List<pessoaModel> usuarios = dao.read();

        for (pessoaModel usuario : usuarios) {
            String mensagem = "O usuário " + usuario.getNome() + " foi notificado em relação ao aviso: " + a.getNome();

            // Envio por e-mail
            System.out.println("Enviando e-mail para: " + usuario.getEmail());
            System.out.println("Mensagem: " + mensagem);

            // Envio para app
            System.out.println("Notificando app de: " + usuario.getNome());

            // Enviar para janela de notificações 
            Notificao.adicionarNotificacao("App de " + usuario.getNome() + " foi notificado.");
            Notificao.adicionarNotificacao("E-mail de " + usuario.getEmail() + " foi notificado.");    
        }
    }  
}
