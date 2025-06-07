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
public class Notificador {
    private String Novoaviso;

    public void NovoAviso(String nomeAviso) {
        this.Novoaviso = "Aviso: " + sessaoNotificacao.nomeAviso;
        NotificadorApp.EnviarApp(Novoaviso);
        NotificadorEmail.EnviarEmail(Novoaviso);
    }
}
