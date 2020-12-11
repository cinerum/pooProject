/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import javax.swing.JOptionPane;

import entities.Aluno;

public class ConexaoJDBC2018 {

    public static void main(String[] args) {

        try {
            Aluno l = new Aluno();
            l.setNome_Completo("Mateus");
            System.out.println("Cadastrado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }

}
