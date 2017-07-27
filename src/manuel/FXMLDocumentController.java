/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manuel;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author manuel.tovar
 */
public class FXMLDocumentController implements Initializable {

    LinkedList<Manuel> listaE;

    @FXML
    private Label nombre;

    @FXML
    private Label codigo;

    @FXML
    private Label Ingresar;

    @FXML
    private TextField text1;

    @FXML
    private TextField text2;

    @FXML
    private void button1(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");

        String nombre = text1.getText();
        String codigo = text2.getText();

        Manuel objMan = new Manuel(nombre, codigo);
        boolean guardar = listaE.add(objMan);

        if (guardar) {
            text1.setText("");
            text2.setText("");
        }
    }

    private void button2(ActionEvent event) {

        String mostrar = "";
        for (int i = 0; i < listaE.size(); i++) {
            mostrar += listaE.get(i) + "\n";

        }
        JOptionPane.showMessageDialog(null, mostrar);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        listaE = new LinkedList<>();
    }

}
