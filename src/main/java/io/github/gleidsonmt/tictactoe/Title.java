package io.github.gleidsonmt.tictactoe;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  19/01/2024
 */
public class Title extends HBox {

    public Title() {
        Text text = new Text("Tic Tac Toe");
        text.setFont(new Font(40));
        this.getChildren().add(text);
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(20));
    }

}
