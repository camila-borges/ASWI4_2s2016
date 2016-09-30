/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.regesc.controllers;

import br.edu.ifsp.regesc.models.Student;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sbmmartins
 */
public class FXMLAnchorPaneCadastrosAlunosDialogController implements Initializable {
    @FXML
    private Label labelId;
    @FXML
    private TextField textFieldNome;
    @FXML
    private TextField textFieldIdade;
    @FXML
    private Button buttonConfirmar;
    @FXML
    private Button buttonCancelar;
    
    // atributos que não correspondem a componentes visuais
    private Stage dialogStage;
    private boolean buttonConfirmarClicked = false; // saber se a pessoa clicou no botão confirmar ou cancelar
    private Student student; // armaneza os dados do aluno a ser cadastrado

    public Stage getDialogStage() {
        return dialogStage;
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public boolean isButtonConfirmarClicked() {
        return buttonConfirmarClicked;
    }

    public void setButtonConfirmarClicked(boolean buttonConfirmarClicked) {
        this.buttonConfirmarClicked = buttonConfirmarClicked;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    
    
    // implementação dos eventos de confirmar e cancelar
    @FXML
    public void handleButtonConfirmar() {
        this.student.setName(textFieldNome.getText());
        this.student.setAge(Integer.parseInt(textFieldIdade.getText()));
        
        this.buttonConfirmarClicked = true;
        this.dialogStage.close();
    }
    
    
    @FXML
    public void handleButtonCancelar() {
        this.dialogStage.close();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
