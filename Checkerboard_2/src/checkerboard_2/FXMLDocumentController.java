/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard_2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Mtschannen
 */
public class FXMLDocumentController implements Initializable, Startable {
    
    public Color primaryColor = Color.RED;
    public Color secondaryColor = Color.BLACK;
    public int height = 8;
    public int width = 8;
    
    @FXML
    private AnchorPane boardArea;
    
    @FXML
    private MenuBar menuBar;
    
    @FXML
    private VBox vBox;
    
//    @FXML
//    private void testEvent(ActionEvent event) {
//        System.out.println(vBox.getChildren());
//    }
    
    @FXML
    private void onExtraLargeSize(ActionEvent event) {
        if(vBox.getChildren().size() == 2) {
            vBox.getChildren().remove(1, 2);
        }
        height = 16;
        width = 16;
        CheckerBoard board = new CheckerBoard(height, width, boardArea.getWidth(), boardArea.getHeight() - menuBar.getHeight(), primaryColor, secondaryColor);
        GridPane build = board.build();
        vBox.getChildren().add(build);
    }
    
    @FXML
    private void onLargeSize(ActionEvent event) {
        if(vBox.getChildren().size() == 2) {
            vBox.getChildren().remove(1, 2);
        }
        height = 10;
        width = 10;
        CheckerBoard board = new CheckerBoard(height, width, boardArea.getWidth(), boardArea.getHeight() - menuBar.getHeight(), primaryColor, secondaryColor);
        GridPane build = board.build();
        vBox.getChildren().add(build);
    }
    
    @FXML
    private void onMediumSize(ActionEvent event) {
        if(vBox.getChildren().size() == 2) {
            vBox.getChildren().remove(1, 2);
        }
        height = 8;
        width = 8;
        CheckerBoard board = new CheckerBoard(height, width, boardArea.getWidth(), boardArea.getHeight() - menuBar.getHeight(), primaryColor, secondaryColor);
        GridPane build = board.build();
        vBox.getChildren().add(build);
    }
    
    @FXML
    private void onSmallSize(ActionEvent event) {
        if(vBox.getChildren().size() == 2) {
            vBox.getChildren().remove(1, 2);
        }
        height = 3;
        width = 3;
        CheckerBoard board = new CheckerBoard(height, width, boardArea.getWidth(), boardArea.getHeight() - menuBar.getHeight(), primaryColor, secondaryColor);
        GridPane build = board.build();
        vBox.getChildren().add(build);
    }
    
    @FXML
    private void onDefaultColor(ActionEvent event) {
        if(vBox.getChildren().size() == 2) {
            vBox.getChildren().remove(1, 2);
        }
        primaryColor = Color.RED;
        secondaryColor = Color.BLACK;
        CheckerBoard board = new CheckerBoard(height, width, boardArea.getWidth(), boardArea.getHeight() - menuBar.getHeight(), primaryColor, secondaryColor);
        GridPane build = board.build();
        vBox.getChildren().add(build);
    }
    
    @FXML
    private void onBlueColor(ActionEvent event) {
        if(vBox.getChildren().size() == 2) {
            vBox.getChildren().remove(1, 2);
        }
        primaryColor = Color.SKYBLUE;
        secondaryColor = Color.DARKBLUE;
        CheckerBoard board = new CheckerBoard(height, width, boardArea.getWidth(), boardArea.getHeight() - menuBar.getHeight(), primaryColor, secondaryColor);
        GridPane build = board.build();
        vBox.getChildren().add(build);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }     
    
    @Override
    public void start(Stage stage) {
        
        CheckerBoard firstBoard = new CheckerBoard(height, width, boardArea.getWidth(), boardArea.getHeight() - menuBar.getHeight(), primaryColor, secondaryColor);
        GridPane firstBuild = firstBoard.build();
        vBox.getChildren().add(firstBuild);
        
        this.boardArea.widthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
            if(vBox.getChildren().size() == 2) {
                vBox.getChildren().remove(1, 2);
            }
            CheckerBoard board = new CheckerBoard(height, width, boardArea.getWidth(), boardArea.getHeight() - menuBar.getHeight(), primaryColor, secondaryColor);
            GridPane build = board.build();
            vBox.getChildren().add(build);
        });
        
        this.boardArea.heightProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
            if(vBox.getChildren().size() == 2) {
                vBox.getChildren().remove(1, 2);
            }
            CheckerBoard board = new CheckerBoard(height, width, boardArea.getWidth(), boardArea.getHeight() - menuBar.getHeight(), primaryColor, secondaryColor);
            GridPane build = board.build();
            vBox.getChildren().add(build);
        });
    }
    
}
