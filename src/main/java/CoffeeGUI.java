import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class CoffeeGUI implements Initializable {
    @FXML
    public Button btnCancel;
    @FXML
    private Text title;
    @FXML
    private Button newOrder;
    @FXML
    private Button completeOrder;
    @FXML
    private Button addSugar;
    @FXML
    private Button exShot;
    @FXML
    private Button addCream;
    @FXML
    private ListView<String> coffeeList;
    @FXML
    private Button addCaramel;
    @FXML
    private Button addMocha;

    private CoffeeOrder Coffee;

    @FXML
    void createOrder(){
        coffeeList.getItems().clear();

        completeOrder.setDisable(false);
        addSugar.setDisable(false);
        addCream.setDisable(false);
        exShot.setDisable(false);
        addCaramel.setDisable(false);
        addMocha.setDisable(false);
        btnCancel.setDisable(false);

        Coffee = new CoffeeOrder();
        coffeeList.getItems().add("Black Coffee: $3.99");

    }
    @FXML
    void setAddSugar(){
        if(!coffeeList.getItems().isEmpty()){
            Coffee.addSugar();
            coffeeList.getItems().add(" + sugar: $.50");
        }

    }
    @FXML
    void setExShot(){
        if(!coffeeList.getItems().isEmpty()){
            Coffee.addShot();
            coffeeList.getItems().add(" + extra shot: $1.20");

        }
    }
    @FXML
    void setAddCream(){
        if(!coffeeList.getItems().isEmpty()){
            Coffee.addCream();
            coffeeList.getItems().add(" + cream: $.50");

        }
    }
    @FXML
    void setAddCaramel(){
        if(!coffeeList.getItems().isEmpty()){
            Coffee.addCaramel();
            coffeeList.getItems().add(" + caramel: $.60");

        }
    }
    @FXML
    void setAddMocha(){
        if(!coffeeList.getItems().isEmpty()){
            Coffee.addMocha();
            coffeeList.getItems().add(" + mocha: $.60");

        }
    }
    @FXML
    void setCompleteOrder(){
        if(!coffeeList.getItems().isEmpty()){
            Coffee order = Coffee.getOrder();
            double tCost = order.makeCoffee();
            tCost = Math.round(tCost*100)/100.0;
            coffeeList.getItems().add("Total: $" + tCost);
            completeOrder.setDisable(true);
            addMocha.setDisable(true);
            addCaramel.setDisable(true);
            addCream.setDisable(true);
            exShot.setDisable(true);
            addSugar.setDisable(true);
            btnCancel.setDisable(true);
            coffeeList.getItems().add("Enjoy your Coffee!");
        }
    }
    @FXML
    void setBtnCancel(){
        coffeeList.getItems().add("ORDER CANCELLED");
        completeOrder.setDisable(true);
        addMocha.setDisable(true);
        addCaramel.setDisable(true);
        addCream.setDisable(true);
        exShot.setDisable(true);
        addSugar.setDisable(true);
        btnCancel.setDisable(true);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
