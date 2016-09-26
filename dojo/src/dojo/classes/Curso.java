/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dojo.classes;

import java.util.List;

/**
 *
 * @author sbmmartins
 */
public class Curso {
    private String sigla;
    private String nome;
    private String descricao;
    private List<Aluno> aluno;

    public Curso(String sigla, String nome, String descricao, List<Aluno> aluno) {
        this.sigla = sigla;
        this.nome = nome;
        this.descricao = descricao;
        this.aluno = aluno;
    }
    
    public String getSigla(){
        return this.sigla;
    }
    
    public void setSigla(String sigla){
        this.sigla = sigla;
    }
    
    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
