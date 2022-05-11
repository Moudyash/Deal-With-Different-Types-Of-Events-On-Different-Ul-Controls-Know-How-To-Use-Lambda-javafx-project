package javafxapplication2;

import java.awt.Font;
import java.awt.event.MouseEvent;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JavaFXApplication2 extends Application {

    static int combo_check = 0;
    static int r1 = 0;

    @Override
    public void start(Stage primaryStage) {

        String LeftBottomSquarea = "Left Bottom quare";
        String black = "#000000";
        String white = "#FFFFFF";
        String transparent = "#0000ffff";
        Button btnreset = new Button("Reset color");
        btnreset.setLayoutX(367);
        btnreset.setLayoutY(267);
        Label label1 = new Label("Select the shape:");
        label1.setTranslateX(315);
        label1.setTranslateY(120);
        Label selected = new Label("");
        /*-------------------------------------------------*/
        Label label2 = new Label("Fill color:");
        /*-------------------------------------------------*/
        RadioButton Red = new RadioButton("Red");
        RadioButton Green = new RadioButton("Green");
        RadioButton Blue = new RadioButton("Blue");

        HBox hboxselect = new HBox();
        hboxselect.setLayoutX(409);
        hboxselect.setLayoutY(115);
        HBox hboxfill = new HBox(label2, Red, Green, Blue);
        hboxfill.setSpacing(5);
        hboxfill.setLayoutX(357);
        hboxfill.setLayoutY(175);
        CheckBox checkBox1 = new CheckBox("Add Strok?");
        checkBox1.setLayoutX(420);
        checkBox1.setLayoutY(217);
        // *************rectangle green stroke*******************
        Rectangle bigrec = new Rectangle();
        bigrec.setWidth(241);
        bigrec.setHeight(200);
        bigrec.setX(39);
        bigrec.setY(67);
        bigrec.setStroke(Color.GREEN);
        bigrec.setStrokeWidth(3);
        bigrec.setFill(Color.GAINSBORO);
        /*big rectangle*/
        //* *************RightUpSquare*******************
        Rectangle RightUpSquare = new Rectangle();
        RightUpSquare.setWidth(66);
        RightUpSquare.setHeight(66);
        RightUpSquare.setX(54);
        RightUpSquare.setY(83);
        RightUpSquare.setStrokeWidth(3);
        RightUpSquare.setStroke(Color.TRANSPARENT);
        RightUpSquare.setFill(Color.valueOf("#000000"));
        //* *************LeftUpSquare*******************
        Rectangle LeftUpSquare = new Rectangle();
        LeftUpSquare.setWidth(66);
        LeftUpSquare.setHeight(66);
        LeftUpSquare.setX(179);
        LeftUpSquare.setY(83);
        LeftUpSquare.setStrokeWidth(3);
        LeftUpSquare.setStroke(Color.TRANSPARENT);
        LeftUpSquare.setFill(Color.valueOf("#000000"));
        // *************LeftBottomSquare*******************
        Rectangle LeftBottomSquare = new Rectangle();
        LeftBottomSquare.setWidth(66);
        LeftBottomSquare.setHeight(66);
        LeftBottomSquare.setX(54);
        LeftBottomSquare.setY(184);
        LeftBottomSquare.setStrokeWidth(3);
        //  LeftBottomSquare.setStroke(Color.TRANSPARENT);
        LeftBottomSquare.setFill(Color.valueOf("#000000"));
        //* *************RightBottomSquare*******************
        Rectangle RightBottomSquare = new Rectangle();
        RightBottomSquare.setWidth(66);
        RightBottomSquare.setHeight(66);
        RightBottomSquare.setX(179);
        RightBottomSquare.setY(184);
        RightBottomSquare.setStrokeWidth(5);
        RightBottomSquare.setStroke(Color.TRANSPARENT);
        RightBottomSquare.setFill(Color.valueOf("#000000"));
        /*start of circle*/
        Circle circle = new Circle();
        circle.setRadius(80);
        circle.setCenterX(153);
        circle.setCenterY(167);
        circle.setStrokeWidth(3);
        circle.setFill(Paint.valueOf(black));
        circle.setStroke(Color.valueOf(white));
        /*End of circle*/

        // Create a label
        Label description_label
                = new Label("This is a combo box example ");
        // combo box choice array
        String shapes[]
                = {"Circle", "Right Up Square", "Left Up Square",
                    "Left Bottom Square", "Right Bottom Square",};
        // Create a combo box
        ComboBox combo_box
                = new ComboBox(FXCollections
                        .observableArrayList(shapes));

        // Label to display the selected menuitem
        Label selecteda = new Label("default item selected");
        boolean checked = checkBox1.isSelected();
    
        /*--------------------------checkboxischecked------------*/
        // Create action event
        EventHandler<ActionEvent> event
                = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                selecteda.setText(combo_box.getValue() + "");

                combo_check = combo_box.getSelectionModel().getSelectedIndex();
                System.out.println(combo_check);
                if (combo_check == 0) {
                    checkBox1.selectedProperty().addListener((ObservableValue<? extends Boolean> ov, Boolean old_val, Boolean new_val) -> {
                        if (checkBox1.isSelected() && combo_check == 0) {
                            circle.setStroke(Color.TRANSPARENT);

                        } else if (checked != true && combo_check == 0) {
                            circle.setStroke(Color.valueOf(white));

                        }
                    });

                } else if (combo_check == 1) {

                    checkBox1.selectedProperty().addListener((ObservableValue<? extends Boolean> ov, Boolean old_val, Boolean new_val) -> {
                        if (checkBox1.isSelected() && combo_check == 1) {

                            LeftUpSquare.setStroke(Color.WHITE);
                        } else if (checked != true && combo_check == 1) {
                            LeftUpSquare.setStroke(Color.TRANSPARENT);

                        }
                    });                    //
                } else if (combo_check == 2) {
                    checkBox1.selectedProperty().addListener((ObservableValue<? extends Boolean> ov, Boolean old_val, Boolean new_val) -> {
                        if (checkBox1.isSelected() && combo_check == 2) {

                            RightUpSquare.setStroke(Color.WHITE);
                        } else if (checked != true && combo_check == 2) {
                            RightUpSquare.setStroke(Color.TRANSPARENT);

                        }
                    });

                } else if (combo_check == 3) {
                    checkBox1.selectedProperty().addListener((ObservableValue<? extends Boolean> ov, Boolean old_val, Boolean new_val) -> {
                        if (checkBox1.isSelected() && combo_check == 3) {

                            LeftBottomSquare.setStroke(Color.WHITE);
                        } else if (checked != true && combo_check == 3) {
                            LeftBottomSquare.setStroke(Color.TRANSPARENT);

                        }
                    });

                } else if (combo_check == 4) {
                    checkBox1.selectedProperty().addListener((ObservableValue<? extends Boolean> ov, Boolean old_val, Boolean new_val) -> {
                        if (checkBox1.isSelected() && combo_check == 4) {

                            RightBottomSquare.setStroke(Color.WHITE);
                        } else if (checked != true && combo_check == 4) {
                            RightBottomSquare.setStroke(Color.TRANSPARENT);
                        }
                    });
                } else {

                    System.out.println("none");
                }
            }
        };
        // Set on action
        combo_box.setOnAction(event);
        ToggleGroup group = new ToggleGroup();
        Red.setToggleGroup(group);
        Green.setToggleGroup(group);
        Blue.setToggleGroup(group);

        group.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle toggle, Toggle new_toggle) -> {
            // radio button on click action
            if (Red.isSelected() && combo_box.getSelectionModel().getSelectedIndex()==combo_check) {
                circle.setFill(Color.RED);
                System.out.println("red");
                r1 = 1;
            } else if (Green.isSelected() && combo_box.getSelectionModel().getSelectedIndex()==combo_check) {
                circle.setFill(Color.GREEN);
                System.out.println("green");
                r1 = 2;
            } else if (Blue.isSelected() &&combo_box.getSelectionModel().getSelectedIndex()==combo_check) {
                circle.setFill(Color.BLUE);
                System.out.println("blue");
                r1 = 3;
            } else if (Red.isSelected() && combo_check == 1) {
                LeftUpSquare.setFill(Color.RED);
                System.out.println("red");
            } else if (Green.isSelected() && combo_check == 1) {
                LeftUpSquare.setFill(Color.GREEN);
                System.out.println("Green");
            } else if (Blue.isSelected() && combo_check == 1) {
                LeftUpSquare.setFill(Color.BLUE);
                System.out.println("blue");
            } else if (Red.isSelected() && combo_check == 2) {
                RightUpSquare.setFill(Color.RED);
                System.out.println("red");
            } else if (Green.isSelected() && combo_check == 2) {
                RightUpSquare.setFill(Color.GREEN);
                System.out.println("Green");
            } else if (Blue.isSelected() && combo_check == 2) {
                RightUpSquare.setFill(Color.BLUE);
                System.out.println("blue");
            } else if (Red.isSelected() && combo_check == 3) {
                LeftBottomSquare.setFill(Color.RED);
                System.out.println("red");
            } else if (Green.isSelected() && combo_check == 3) {
                LeftBottomSquare.setFill(Color.GREEN);
                System.out.println("Green");
            } else if (Blue.isSelected() && combo_check == 3) {
                LeftBottomSquare.setFill(Color.BLUE);
                System.out.println("blue");
            } else if (Red.isSelected() && combo_check == 4) {
                RightBottomSquare.setFill(Color.RED);
                System.out.println("red");
            } else if (Green.isSelected() && combo_check == 4) {
                RightBottomSquare.setFill(Color.GREEN);
                System.out.println("Green");
            } else if (Blue.isSelected() && combo_check == 4) {
                RightBottomSquare.setFill(Color.BLUE);
                System.out.println("blue");
            }
        });
        // Create a tile pane
        TilePane tile_pane = new TilePane(combo_box, selected);
        tile_pane.setLayoutX(409);
        tile_pane.setLayoutY(115);
        
        //btn on click event
        btnreset.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                circle.setStroke(Color.WHITE);
                RightUpSquare.setStroke(Color.TRANSPARENT);
                LeftUpSquare.setStroke(Color.TRANSPARENT);
                RightBottomSquare.setStroke(Color.TRANSPARENT);
                LeftBottomSquare.setStroke(Color.TRANSPARENT);
                RightUpSquare.setFill(Color.BLACK);
                LeftUpSquare.setFill(Color.BLACK);
                LeftBottomSquare.setFill(Color.BLACK);
                RightBottomSquare.setFill(Color.BLACK);
                circle.setFill(Color.BLACK);
                Red.setSelected(false);
                Green.setSelected(false);
                Blue.setSelected(false);
                checkBox1.setSelected(false);
                bigrec.setStroke(Color.GREEN);
                combo_box.getSelectionModel().select(-1);
            }
        });
        //mouse on click event
        bigrec.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                bigrec.setStroke(Color.BLUE);

            }
        });
        circle.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                combo_box.getSelectionModel().select(0);
            }
        });

        LeftUpSquare.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                combo_box.getSelectionModel().select(1);
            }
        });

        RightUpSquare.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                combo_box.getSelectionModel().select(2);
            }
        });
        LeftBottomSquare.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                combo_box.getSelectionModel().select(3);
            }
        });
        RightBottomSquare.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                combo_box.getSelectionModel().select(4);
            }
        });
        Pane pane = new Pane(bigrec, RightUpSquare, LeftUpSquare, LeftBottomSquare, RightBottomSquare, circle, hboxfill,
                hboxselect, label1, checkBox1, btnreset, tile_pane);
        //KEYBOARD on click event
//shift
        pane.setOnKeyPressed(new EventHandler<javafx.scene.input.KeyEvent>() {

            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.SHIFT) {

                    if (r1 == 1 && (combo_check == 0 || combo_check == 1 || combo_check == 2 || combo_check == 3 || combo_check == 4)) {
                        RightUpSquare.setFill(Color.RED);
                        LeftUpSquare.setFill(Color.RED);
                        RightBottomSquare.setFill(Color.RED);
                        LeftBottomSquare.setFill(Color.RED);
                    } else if (r1 == 2 && (combo_check == 0 || combo_check == 1 || combo_check == 2 || combo_check == 3 || combo_check == 4)) {
                        RightUpSquare.setFill(Color.GREEN);
                        LeftUpSquare.setFill(Color.GREEN);
                        RightBottomSquare.setFill(Color.GREEN);
                        LeftBottomSquare.setFill(Color.GREEN);
                    } else if (r1 == 3 && (combo_check == 0 || combo_check == 1 || combo_check == 2 || combo_check == 3 || combo_check == 4)) {
                        RightUpSquare.setFill(Color.BLUE);
                        LeftUpSquare.setFill(Color.BLUE);
                        RightBottomSquare.setFill(Color.BLUE);
                        LeftBottomSquare.setFill(Color.BLUE);

                    }
                }
            }

        });
              
       
        StackPane root = new StackPane();
        root.getChildren().add(pane);
        Scene scene = new Scene(root, 639, 351);

        primaryStage.setTitle("lab4");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
