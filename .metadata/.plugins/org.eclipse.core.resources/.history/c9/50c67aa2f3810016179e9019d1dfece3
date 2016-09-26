
package br.edu.ifsp.regesc.app;

import br.edu.ifsp.regesc.dao.StudentDAO;
import br.edu.ifsp.regesc.models.Student;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {     
//        Student student = new Student("Bolsonaro Mito!", 20);
//        System.out.println(student);
//        
//        StudentDAO dao = new StudentDAO();
//        dao.insert(student);
//        
//        System.out.println(student);
//        
//        System.out.println("Deu bom!");

        StudentDAO dao = new StudentDAO();
        ArrayList<Student> studentList = dao.findAll();
        
        
        System.out.println("*******************");
        
        for (Student student : studentList) {
            System.out.println("----");
            System.out.println(student);
            System.out.println("----");
        }
        System.out.println("*******************");
    }
}
