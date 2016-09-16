
package br.edu.ifsp.regesc.app;

import br.edu.ifsp.regesc.dao.StudentDAO;
import br.edu.ifsp.regesc.models.Student;


public class App {
    public static void main(String[] args) {     
        Student student = new Student("Tiririca Abestado", 50);
        System.out.println(student);
        
        StudentDAO dao = new StudentDAO();
        dao.insert(student);
        
        System.out.println(student);
        
        System.out.println("Deu bom!");
    }
}
