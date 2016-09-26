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
public class CursoDAO {
    private Connection conn;
    
    public CursoDAO(){
        this.conn = ConnectionFactory.getConnection();
    }
    
    public void insertCurso(Curso curso) {
        String sql = "INSERT INTO course (sigla, descricao) VALUES (?,?)";
       try{ 
        PreparedStatement smt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        smt.setString(1, curso.getSigla());
        smt.setString(2, curso.getDescricao());
        
        smt.executeUpdate();
        smt.close();
       }
       catch(SQLException e) {
           e.printStackTrace();
       } finally {
           Finalize();
       }
    }
    
    public List<Curso> buscaTodosCursos() {
        List<Curso> cursos = new ArrayList<Curso>();
        
        String sql = "SELECT * FROM course";
        Aluno aluno = null;
        //ECLIPSE >>>>>>>>>>>>>>>>>>> NETBEANS
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
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
