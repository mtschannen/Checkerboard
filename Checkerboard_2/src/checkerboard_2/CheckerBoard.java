/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard_2;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Mtschannen
 */
public class CheckerBoard {
    
    private int numRows;
    private int numCols;
    private double boardWidth;
    private double boardHeight;
    private Color lightColor;
    private Color darkColor;
    GridPane checkerboard;
    
    public CheckerBoard(int initNumRows, int initNumCols, double initBoardWidth, double initBoardHeight) {
        numRows = initNumRows;
        numCols = initNumCols;
        boardWidth = initBoardWidth;
        boardHeight = initBoardHeight;
    }
    
    public CheckerBoard(int initNumRows, int initNumCols, double initBoardWidth, double initBoardHeight, Color initLightColor, Color initDarkColor) {
        this(initNumRows, initNumCols, initBoardWidth, initBoardHeight);
        lightColor = initLightColor;
        darkColor = initDarkColor;
    }
    
    public GridPane build() {
        
        checkerboard = new GridPane();

        Color[] colors = {this.lightColor, this.darkColor};
        double rectangleWidth = this.boardWidth/this.numCols;
        double rectangleHeight = this.boardHeight/this.numRows;
        
        int n = 0;
        for(int row = 0; row < this.numRows; row++){
            for(int col = 0; col < this.numCols; col++){
                Rectangle rec = new Rectangle();
                rec.setWidth(Math.ceil(rectangleWidth));
                rec.setHeight(Math.ceil(rectangleHeight));
//                rec.setWidth(rectangleWidth);
//                rec.setHeight(rectangleHeight);
                rec.setFill(colors[n]);
                GridPane.setRowIndex(rec, row);
                GridPane.setColumnIndex(rec, col);
                checkerboard.getChildren().addAll(rec);
                if(n == 0) {
                    n = 1;
                }
                else {
                    n = 0;
                }
            }
            if(this.numRows % 2 == 0) {
                if(n == 0) {
                    n = 1;
                }
                else {
                    n = 0;
                }  
            }
        }
        return(checkerboard);
    } 
    
    public GridPane getBoard(CheckerBoard board) {
        if(checkerboard != null) {
            return(checkerboard);
        }
        else {
            return(null);
        }
    }
    
    public int getNumRows(CheckerBoard board){
        return(board.numRows);
    }
    
    public int getNumCols(CheckerBoard board) {
        return(board.numCols);
    }
    
    public double getWidth(CheckerBoard board) {
        return(board.boardWidth);
    }
            
    public double getHeight(CheckerBoard board) {
        return(board.boardHeight);
    }
    
    public Color getLightColor(CheckerBoard board) {
        return(board.lightColor);
    }
    
    public Color getDarkColor(CheckerBoard board) {
        return(board.darkColor);
    }
    
    public double getRectangleWidth(CheckerBoard board) {
        return(board.boardWidth / board.numCols);
    }
    
    public double getRectangleHeight(CheckerBoard board) {
        return(board.boardHeight / board.numRows);
    }
    
}
