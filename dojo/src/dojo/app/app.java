/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dojo.app;

import dojo.classes.Aluno;
import dojo.classes.AlunoDAO;

/**
 *
 * @author sbmmartins
 */
public class app {
    public static void main(String[] args) {
        Aluno a = new Aluno("JUJU", 20);
        AlunoDAO adao = new AlunoDAO();
        
        adao.insertAluno(a);
        //adao.buscaTodosAlunos();
        
    }
    
}
