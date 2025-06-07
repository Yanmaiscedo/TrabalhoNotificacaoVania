/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import connection.Conexao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.pessoaModel;

/**
 *
 * @author yanma
 */
public class pessoaDao {
    
    public void create(pessoaModel p) {
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO cadastro_usuario (nome,email)VALUES(?,?)");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getEmail());

            stmt.executeUpdate();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
        } finally {
            Conexao.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt);
        }
    }

    public List<pessoaModel> read() {
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<pessoaModel> pessoas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT *FROM cadastro_usuario");
            rs = stmt.executeQuery();
            while (rs.next()) {
                pessoaModel pessoa = new pessoaModel();

                pessoa.setNome(rs.getString("nome"));
                pessoa.setEmail(rs.getString("email"));
                pessoas.add(pessoa);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler" + ex);
        } finally {
            Conexao.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt);
        }

        return pessoas;

    }

    public void update(pessoaModel p) {
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE cadastro_usuario SET nome = ? ,email = ? WHERE id = ?");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getEmail());
            stmt.setInt(3, p.getId());

            stmt.executeUpdate();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar" + ex);
        } finally {
            Conexao.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt);
        }
    }

    public void delete(pessoaModel p) {
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM cadastro_usuario WHERE id = ?");
            stmt.setInt(1, p.getId());

            stmt.executeUpdate();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir" + ex);
        } finally {
            Conexao.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt);
        }
    }

    
}
