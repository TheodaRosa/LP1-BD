package org.lojanova.lojanova;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CoolerController {

    @FXML
    private Button btnComprar1;

    @FXML
    private Button btnComprar3;

    @FXML
    private Button btnComprar2;

    @FXML
    private Label lblMarca2;

    @FXML
    private Button btnFechar;

    @FXML
    private Label lblMarca3;

    @FXML
    private Label lblMarca1;

    @FXML
    private Label lblModelo3;

    @FXML
    private Label lblModelo2;

    @FXML
    private Label lblModelo1;

    @FXML
    private Label lblPreco1;

    @FXML
    private Label lblPreco2;

    @FXML
    private Label lblPreco3;

    int compra;
    Cooler cooler = new Cooler();
    @FXML
    void comprar2(ActionEvent event) {
        this.compra += Integer.parseInt(lblPreco2.getText());
        cooler.setCompra(this.compra);
        System.out.println("Compra feita com Sucesso!");
    }

    @FXML
    void comprar3(ActionEvent event) {
        this.compra += Integer.parseInt(lblPreco3.getText());
        cooler.setCompra(this.compra);
        System.out.println("Compra feita com Sucesso!");
    }

    @FXML
    void comprar1(ActionEvent event) {
        this.compra += Integer.parseInt(lblPreco1.getText());
        cooler.setCompra(this.compra);
        System.out.println("Compra feita com Sucesso!");
    }

    @FXML
    void btnMonitorClose(ActionEvent event) {

    }

}
