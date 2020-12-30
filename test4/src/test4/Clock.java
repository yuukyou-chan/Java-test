package test4;
import java.util.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.animation.Timeline;
import javafx.scene.control.Label;
import javafx.animation.KeyFrame;
import javafx.geometry.Pos;
import javafx.util.Duration;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author admin
 */
public class Clock extends Application {

    ClockPane clock = new ClockPane();//
    BorderPane borderPane = new BorderPane();//

    @Override
    public void start(Stage primaryStage) throws Exception {

        EventHandler<ActionEvent> eventHandler = e -> {
            clock.setCurrentTime();

            String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
            Label labelCurrentTime = new Label(timeString);
            borderPane.setCenter(clock);
            borderPane.setBottom(labelCurrentTime);
            BorderPane.setAlignment(labelCurrentTime, Pos.TOP_CENTER);
        };

        Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000), eventHandler));//设定时钟动画每1秒变一次，关键帧时间间隔
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

//Scene
        Scene scene = new Scene(borderPane, 500, 500);
        primaryStage.setTitle("陈勇强 20194760");
        primaryStage.setScene(scene);
        primaryStage.show();//展示场景

        borderPane.widthProperty().addListener(o
                -> clock.setW(borderPane.getWidth()));//保持时间面板与场景同步
        borderPane.heightProperty().addListener(o
                -> clock.setH(borderPane.getHeight()));
//设置一个按钮，用于调整时间

    }

    public static void main(String[] args) {
        launch(args);
    }

}

 