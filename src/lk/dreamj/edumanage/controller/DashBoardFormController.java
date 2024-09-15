package lk.dreamj.edumanage.controller;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import javax.print.DocFlavor;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DashBoardFormController {
    public AnchorPane context;
    public Label lblDate;
    public Label lblTime;

    public void initialize(){
        setDate();
    }

    private void setDate() {
        lblDate.setText(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0),
                        e->{
                            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
                            lblTime.setText(LocalTime.now().format(dateTimeFormatter));
                        }
                        ),
                new KeyFrame(Duration.seconds(1))
        );
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    public void btnRegOnAction(ActionEvent actionEvent) {
    }

    public void btnTeachersOnAction(ActionEvent actionEvent) {
    }

    public void btnIntakesOnAction(ActionEvent actionEvent) {
    }

    public void btnProgramsOnAction(ActionEvent actionEvent) {
    }

    public void btnRegisterOnAction(ActionEvent actionEvent) {
    }

    public void btnLogoutOnACtion(ActionEvent actionEvent) {
    }

    public void loadGitHubRepoOnAction(ActionEvent actionEvent) {

    }
}
