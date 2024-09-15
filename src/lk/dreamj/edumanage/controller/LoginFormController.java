package lk.dreamj.edumanage.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import lk.dreamj.edumanage.database.Database;
import lk.dreamj.edumanage.model.User;

import java.io.IOException;

public class LoginFormController {
    public TextField txtEmail;
    public TextField txtPwd;
    public AnchorPane context;

    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        String email = txtEmail.getText().toLowerCase().trim();
        String password = txtPwd.getText().trim();

        for (User user: Database.userTable) {
            if (user.getEmail().equals(email)){
                if (user.getPassword().equals(password)){
                    setUi("DashBoardForm");
                }else{
                    new Alert(Alert.AlertType.WARNING,"Please Enter Correct Password, Try Again!").show();
                }
                return;
            }
        }
        new Alert(Alert.AlertType.WARNING,("Invalid Email!")).show();

    }

    public void createNewAccOnAction(ActionEvent actionEvent) throws IOException {
        setUi("SignupForm");
    }

    private void setUi(String location) throws IOException {
        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }


}
