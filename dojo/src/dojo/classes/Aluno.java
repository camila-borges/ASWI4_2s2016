/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dojo.classes;

/**
 *
 * @author sbmmartins
 */
public class Aluno {
    private long id;
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.id = -1;
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
}
