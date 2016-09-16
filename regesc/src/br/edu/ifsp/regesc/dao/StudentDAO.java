
package br.edu.ifsp.regesc.dao;

import br.edu.ifsp.regesc.db.ConnectionFactory;
import br.edu.ifsp.regesc.models.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StudentDAO {
    private Connection conn;
    
    
    public StudentDAO() {
        this.conn = ConnectionFactory.getConnection();
    }
    
    
    // este método sempr é chamado antes do objeto ser destruído
    // último suspiro de vida do objeto
    @Override
    public void finalize() {
        try {
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void insert(Student student) {
        String sql = "INSERT INTO Student(name, age) VALUES(?, ?)";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, student.getName());
            stmt.setInt(2, student.getAge());
            
            stmt.executeUpdate();
            
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}



