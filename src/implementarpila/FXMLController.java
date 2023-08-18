package implementarpila;

import datos.Vehiculo;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import modelo.Pila;

/**
 *
 * @author fabian_esteban.lopez
 */
public class FXMLController implements Initializable {

    //--- Variables ---
    @FXML
    private Label titleL;
    @FXML
    private Label plateNumberL;
    @FXML
    private Label brandL;
    @FXML
    private Label modelL;

    @FXML
    private TextField plateNumberTXT;
    @FXML
    private TextField brandTXT;
    @FXML
    private TextField modelTXT;
    @FXML
    private TextArea showTXT;

    Pila<Vehiculo> pilaVehiculos;

    //--- EVENTS ---
    //Metodo apilar
    @FXML
    private void apilarVehiculo(ActionEvent event) {
    /*    String plateNumberV = plateNumberTXT.getText();
        String brandV = brandTXT.getText();
        int modelV = Integer.parseInt(modelTXT.getText());

        pilaVehiculos.apilar(new Vehiculo(plateNumberV, brandV, modelV));
        */
        System.out.println("deberia funcionar");
    }
/*
    @FXML
    private void showVehicles(ActionEvent event) {
        showTXT.setText(pilaVehiculos.toString());
  */ 

    

    //Metodo desaapilar
    //Metodo estaVacia
    //Metodo mostrar
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        pilaVehiculos = new Pila<>();
    }

}
