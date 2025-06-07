/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificador;

import dao.pessoaDao;
import java.util.ArrayList;
import java.util.List;
import model.pessoaModel;
import view.Notificao;

/**
 *
 * @author yanma
 */
public class NotificadorEmail {

    static void EnviarEmail(String Novoaviso) {
        pessoaDao pdao = new pessoaDao();
        List<String> mensagens = new ArrayList<>();
        
        for (pessoaModel p : pdao.read()) {
            p.getEmail();
            mensagens.add((String) ("Notificação (" + sessaoNotificacao.nomeAviso+ ") enviada para o Email: " + p.getEmail()));
        }
        Notificao notificao = new Notificao(mensagens);
        notificao.setVisible(true);
    }
    
}
