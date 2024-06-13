import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.io.IOException;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;



public class CalcularController extends model{

    int qtd1 = 0, qtd2 = 0;

    @FXML
    private Button botaoCalcular;

    @FXML
    private TextField entradaAgricola;

    @FXML
    private TextField entradaResidencial;

    @FXML
    void Calcular(ActionEvent event) throws IOException 

    {
        String qtd_1 = entradaResidencial.getText();
        String qtd_2 = entradaAgricola.getText();

        qtd1 = Integer.parseInt(qtd_1);
        qtd2 = Integer.parseInt(qtd_2);

        calcularVTotal(qtd1, qtd2);

        Alert alerta = new Alert(AlertType.INFORMATION);
        alerta.setTitle("Custo");
        alerta.setHeaderText("Custo calculado com sucesso!");
        alerta.setContentText("Custo estimado de: " + vTotal + " R$");
        alerta.show();

    }

}
