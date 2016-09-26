/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dojo.classes;

import dojo.db.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sbmmartins
 */
public class AlunoDAO {
    private Connection conn;
    
    public AlunoDAO(){
        this.conn = ConnectionFactory.getConnection();
    }
    
    public void insertAluno(Aluno aluno) {
        String sql = "INSERT INTO student (name,age) VALUES (?,?)";
       try{ 
        PreparedStatement smt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        smt.setString(1, aluno.getNome());
        smt.setInt(2, aluno.getIdade());
        
        smt.executeUpdate();
        smt.close();
       }
       catch(SQLException e) {
           e.printStackTrace();
       } finally {
           Finalize();
       }
    }
    
    public List<Aluno> buscaTodosAlunos() {
        List<Aluno> alunos = new ArrayList<Aluno>();
        
        String sql = "SELECT * FROM student";
        Aluno aluno = null;
        
        try{ 
        PreparedStatement smt = conn.prepareStatement(sql);
        
            ResultSet rs = smt.executeQuery();
            while(rs.next()){
                long id = rs.getLong(1);
                String name = rs.getString(2);
                int idade = rs.getInt(3);
                aluno = new Aluno(name, idade);
                alunos.add(aluno);
            }
        smt.close();
       }
       catch(SQLException e) {
           e.printStackTrace();
       } finally {
           Finalize();
       }
       return alunos;
    }
    
    
    public void Finalize (){
        try {
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
