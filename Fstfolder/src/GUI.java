import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.shape.*;

import java.util.ArrayList;

public class GUI extends Application {
    public static AI computerGuess = new AI();
    public static double win = 0;
    public static ArrayList <Integer> hits = new ArrayList<>();
    public static ArrayList <Integer> playerForbidden = new ArrayList<>();
    Image background= new Image("background.jpg");
    ImageView backgroundView = new ImageView(background);
    Button startButton;
    Button quitButton;
    Rectangle box=new Rectangle(0,0,750,500);
    Line horizLine=new Line(0,0,750,0);
    Line horizLine2=new Line(0, 0,750,0);
    Line horizLine3=new Line(0,0,750,0);
    Line horizLine4=new Line(0,0,750,0);
    Line horizLine5=new Line(0,0,750,0);
    Line horizLine6=new Line(0,0,750,0);
    Line horizLine7=new Line(0,0,750,0);
    Line horizLine8=new Line(0,0,750,0);
    Line horizLine9= new Line (0,0,750,0);
    Line horizLine10= new Line(0,0,750,0);
    Line vertLine= new Line(0,-400,0,100);
    Line vertLine2= new Line(0,-400,0,100);
    Line vertLine3= new Line(0,-400,0,100);
    Line vertLine4= new Line(0,-400,0,100);
    Line vertLine5= new Line(0,-400,0,100);
    Line vertLine6= new Line(0,-400,0,100);
    Line vertLine7= new Line(0,-400,0,100);
    Line vertLine8= new Line(0,-400,0,100);
    Line vertLine9= new Line(0,-400,0,100);
    Line vertLine10= new Line(0,-400,0,100);
    Boards userBoard = new Boards();
    ArrayList<Integer> playerBoard = new ArrayList<>();
    ArrayList<Button> buttonList= new ArrayList<>();
    int loopCount4=0;
    int loopCount3=0;



    Scene scene, scene1;

    public static void main(String[] args) {
        launch (args);
    }
    @Override
    public void start (Stage primaryStage)throws Exception{
        primaryStage.setTitle("Window Title");
        System.out.println(userBoard.userBoard);
        startButton=new Button();
        startButton.setText("Start");
        quitButton= new Button();
        quitButton.setText("Quit");
        quitButton.setTranslateY(100);
        backgroundView.setFitHeight(600);
        backgroundView.setFitWidth(800);
        box.setFill(Color.WHITE);
        box.setStroke(Color.BLACK);
        box.setTranslateY(-50);
        horizLine.setTranslateY(-250);
        horizLine2.setTranslateY(-200);
        horizLine3.setTranslateY(-150);
        horizLine4.setTranslateY(-100);
        horizLine5.setTranslateY(-50);
        horizLine6.setTranslateY(0);
        horizLine7.setTranslateY(50);
        horizLine8.setTranslateY(100);
        horizLine9.setTranslateY(150);
        horizLine10.setTranslateY(200);
        vertLine.setTranslateY(-50);
        vertLine2.setTranslateY(-50);
        vertLine3.setTranslateY(-50);
        vertLine4.setTranslateY(-50);
        vertLine5.setTranslateY(-50);
        vertLine6.setTranslateY(-50);
        vertLine7.setTranslateY(-50);
        vertLine8.setTranslateY(-50);
        vertLine9.setTranslateY(-50);
        vertLine10.setTranslateY(-50);
        vertLine.setTranslateX(-300);
        vertLine2.setTranslateX(-225);
        vertLine3.setTranslateX(-150);
        vertLine4.setTranslateX(-75);
        vertLine5.setTranslateX(0);
        vertLine6.setTranslateX(75);
        vertLine7.setTranslateX(150);
        vertLine8.setTranslateX(225);
        vertLine9.setTranslateX(300);
        vertLine10.setTranslateX(375);
        TextField placeShip=new TextField();
        Button enter= new Button();
        Button enter2=new Button();
        Button enter3=new Button();
        Button enter4=new Button();
        Button enter5=new Button();
        Button enter6=new Button();
        Button enter7=new Button();
        Button enter8=new Button();
        Button enter9=new Button();
        Button startGame=new Button();
        Button compTurn= new Button();
        Button nextRound= new Button();
        enter.setText("Enter");
        enter.setTranslateY(250);
        enter2.setText("Enter2");
        enter2.setTranslateY(250);
        enter3.setText("Enter3");
        enter3.setTranslateY(250);
        enter4.setText("Enter4");
        enter4.setTranslateY(250);
        enter5.setText("Enter5");
        enter5.setTranslateY(250);
        enter6.setText("Enter6");
        enter6.setTranslateY(250);
        enter7.setText("Enter7");
        enter7.setTranslateY(250);
        enter8.setText("Enter8");
        enter8.setTranslateY(250);
        enter9.setText("Enter9");
        enter9.setTranslateY(250);
       /* Button testButton=new Button();
        testButton.setMaxWidth(70);
        testButton.setMaxHeight(45);
        testButton.setTranslateY(-275);
        testButton.setTranslateX(-337);*/
        startGame.setText("Start Game");
        startGame.setTranslateY(250);
        compTurn.setText("Computer turn");
        compTurn.setTranslateY(250);
        nextRound.setText("Next Turn");
        nextRound.setTranslateY(250);
        placeShip.maxWidth(50);
        placeShip.setTranslateY(225);
        Label prompt= new Label();
        prompt.setFont(new Font("Arial",20));
        prompt.setTranslateY(-25);
        prompt.setText("The first ship is a 5, type 0 to place it vertically or 1 to place horizontally:");
        StackPane layout=new StackPane();
        StackPane layout1=new StackPane();
        scene = new Scene(layout,800,600);
        scene1=new Scene(layout1,800,600);
        layout.getChildren().addAll(backgroundView,startButton,quitButton);
        layout1.getChildren().addAll(box,horizLine,horizLine2,horizLine3,horizLine4,horizLine5,horizLine6,horizLine7,horizLine8,horizLine9,horizLine10,vertLine,vertLine2,vertLine3,vertLine4,vertLine5,vertLine6,vertLine7,vertLine8,vertLine9,vertLine10,enter,placeShip,prompt);
        enter.setOnAction(e->{
            int vertHoriz=0;
                try {
                    vertHoriz=Integer.parseInt(placeShip.getText());
                    if(vertHoriz!=0&&vertHoriz!=1){
                        throw new IllegalArgumentException();
                    }
                    if (vertHoriz==0) {
                        layout1.getChildren().remove(enter);
                        layout1.getChildren().add(enter2);
                        prompt.setText("Choose a number between 1 and 60 to be the head of the ship.");
                    }
                    if (vertHoriz==1) {
                        layout1.getChildren().remove(enter);
                        layout1.getChildren().add(enter3);
                        prompt.setText("Choose a number between 1 and 100 that ends in 1-6 to be the head.");

                    }


                    placeShip.clear();

                }catch (Exception ex){
                    prompt.setText("Enter a 0 or 1");
                }
                }
                );
        enter2.setOnAction(e->{
            int head=0;
            try{
                head= Integer.parseInt(placeShip.getText());
                if (head <1||head>60){
                    throw new IllegalArgumentException();
                }

                playerBoard.add(head);
                playerBoard.add(head + 10);
                playerBoard.add(head + 20);
                playerBoard.add(head + 30);
                playerBoard.add(head + 40);

                if ((head-1)%10 == 0) {
                    playerForbidden.add(head - 10);
                    playerForbidden.add(head + 50);
                    playerForbidden.add(head + 1);
                    playerForbidden.add(head + 11);
                    playerForbidden.add(head + 21);
                    playerForbidden.add(head + 31);
                    playerForbidden.add(head + 41);
                }
                else if (head%10 == 0) {
                    playerForbidden.add(head - 10);
                    playerForbidden.add(head + 50);
                    playerForbidden.add(head -1);
                    playerForbidden.add(head + 9);
                    playerForbidden.add(head + 19);
                    playerForbidden.add(head + 29);
                    playerForbidden.add(head + 39);
                }
                else {
                    playerForbidden.add(head - 10);
                    playerForbidden.add(head + 50);
                    playerForbidden.add(head + 1);
                    playerForbidden.add(head - 1);
                    playerForbidden.add(head + 9);
                    playerForbidden.add(head + 11);
                    playerForbidden.add(head + 19);
                    playerForbidden.add(head + 21);
                    playerForbidden.add(head + 29);
                    playerForbidden.add(head + 31);
                    playerForbidden.add(head + 39);
                    playerForbidden.add(head + 41);
                }
                placeShip.clear();
                layout1.getChildren().remove(enter2);
                layout1.getChildren().add(enter4);
                prompt.setText("The next ship is a 4, type 0 to place it vertically or 1 to place horizontally");
                System.out.println(playerBoard);
                System.out.println(playerForbidden);
            }catch (Exception ex){
                prompt.setText("Please choose a number in the correct range (1-60)");
            }
        });

        enter3.setOnAction(e->{
            int head=0;
            int test=0;
            try{
                test=Integer.parseInt(placeShip.getText());
                String s= Integer.toString(test);
                int letter=0;
                if(s.length()==2) {
                    char S = s.charAt(1);
                    String x = Character.toString(S);
                    letter = Integer.parseInt(x);
                    head=test;
                }
                else if(s.length()==1){
                    letter=test;
                    head=test;

                }
                if (letter<1||letter>6||head>100||head<1){
                    throw new IllegalArgumentException();
                }
                head=test;

                playerBoard.add(head);
                playerBoard.add(head + 1);
                playerBoard.add(head + 2);
                playerBoard.add(head + 3);
                playerBoard.add(head + 4);

                if (head>90) {
                    playerForbidden.add(head - 1);
                    playerForbidden.add(head + 5);
                    playerForbidden.add(head - 10);
                    playerForbidden.add(head - 9);
                    playerForbidden.add(head - 8);
                    playerForbidden.add(head - 7);
                    playerForbidden.add(head - 6);
                }
                else if (head<10) {
                    playerForbidden.add(head - 1);
                    playerForbidden.add(head + 5);
                    playerForbidden.add(head + 10);
                    playerForbidden.add(head + 11);
                    playerForbidden.add(head + 12);
                    playerForbidden.add(head + 13);
                    playerForbidden.add(head + 14);
                }
                else {
                    playerForbidden.add(head - 1);
                    playerForbidden.add(head + 5);
                    playerForbidden.add(head + 10);
                    playerForbidden.add(head - 10);
                    playerForbidden.add(head - 9);
                    playerForbidden.add(head + 11);
                    playerForbidden.add(head - 8);
                    playerForbidden.add(head + 12);
                    playerForbidden.add(head - 7);
                    playerForbidden.add(head + 13);
                    playerForbidden.add(head - 6);
                    playerForbidden.add(head + 14);
                }
                placeShip.clear();
                layout1.getChildren().remove(enter3);
                layout1.getChildren().add(enter4);
                prompt.setText("The next ship is a 4, type 0 to place it vertically or 1 to place horizontally");
                System.out.println(playerBoard);
                System.out.println(playerForbidden);
            }catch (Exception ex){
                prompt.setText("Enter a valid number (1-100 ending in 1-6)");
            }
        });
        enter4.setOnAction(e->{
            int vertHoriz=0;
            try {
                vertHoriz=Integer.parseInt(placeShip.getText());
                if(vertHoriz!=0&&vertHoriz!=1){
                    throw new IllegalArgumentException();
                }
                if (vertHoriz==0) {
                    layout1.getChildren().remove(enter4);
                    layout1.getChildren().add(enter5);
                    prompt.setText("Choose a number between 1 and 70 to be the head of the ship.");
                    vertHoriz=0;
                }
                if (vertHoriz==1) {
                    layout1.getChildren().remove(enter4);
                    layout1.getChildren().add(enter6);
                    prompt.setText("Choose a number between 1 and 100 that ends in 1-7 to be the head.");
                    vertHoriz=0;

                }


                placeShip.clear();

            }catch (Exception ex){
                prompt.setText("Enter a 0 or 1");
            }

        });

        enter5.setOnAction(e->{
            int head=0;
            try{
               head=Integer.parseInt(placeShip.getText());
                if (head < 1 || head > 70 || playerBoard.contains(head) || playerBoard.contains(head+10)||playerBoard.contains(head+20) || playerBoard.contains(head+30) || playerForbidden.contains(head) || playerBoard.contains(head+10)|| playerForbidden.contains(head+20) || playerForbidden.contains(head+30)) {
                    throw new IllegalArgumentException();
                }

                playerBoard.add(head);
                playerBoard.add(head + 10);
                playerBoard.add(head + 20);
                playerBoard.add(head + 30);

                if ((head-1)%10 == 0) {
                    playerForbidden.add(head - 10);
                    playerForbidden.add(head + 40);
                    playerForbidden.add(head + 1);
                    playerForbidden.add(head + 11);
                    playerForbidden.add(head + 21);
                    playerForbidden.add(head + 31);
                }
                else if (head%10 == 0) {
                    playerForbidden.add(head - 10);
                    playerForbidden.add(head + 40);
                    playerForbidden.add(head -1);
                    playerForbidden.add(head + 9);
                    playerForbidden.add(head + 19);
                    playerForbidden.add(head + 29);
                }
                else {
                    playerForbidden.add(head - 10);
                    playerForbidden.add(head + 40);
                    playerForbidden.add(head + 1);
                    playerForbidden.add(head - 1);
                    playerForbidden.add(head + 9);
                    playerForbidden.add(head + 11);
                    playerForbidden.add(head + 19);
                    playerForbidden.add(head + 21);
                    playerForbidden.add(head + 29);
                    playerForbidden.add(head + 31);
                }
                head=0;
                placeShip.clear();
                loopCount4++;
                if(loopCount4<2) {
                    layout1.getChildren().remove(enter5);
                    layout1.getChildren().add(enter4);
                    prompt.setText("The next ship is a 4, type 0 to place it vertically or 1 to place horizontally");
                    System.out.println(playerBoard);
                    System.out.println(playerForbidden);
                }
                else if(loopCount4>=2){
                    layout1.getChildren().remove(enter5);
                    layout1.getChildren().add(enter7);
                    prompt.setText("The next ship is a 3, type 0 to place it vertically or 1 to place horizontally");
                    System.out.println(playerBoard);
                    System.out.println(playerForbidden);
                }
            }catch (Exception ex){
                prompt.setText("Enter a valid number. Your ships may not touch or overlap.");
            }


        });
        enter6.setOnAction(e->{
            int head=0;
            int test=0;
            int letter=0;
            try {
                test = Integer.parseInt(placeShip.getText());
                String s = Integer.toString(test);
                if(s.length()==2) {
                    char S = s.charAt(1);
                    String x = Character.toString(S);
                    letter = Integer.parseInt(x);
                    head=test;
                }
                else if(s.length()==1){
                    letter=test;
                    head=test;

                }
                if (letter < 1 || letter > 7 || head > 100 || head < 1 || playerBoard.contains(head) || playerBoard.contains(head+1) || playerBoard.contains(head+2) || playerBoard.contains(head+3) || playerForbidden.contains(head) || playerForbidden.contains(head+1) || playerForbidden.contains(head+2) || playerForbidden.contains(head+3)) {
                    throw new IllegalArgumentException();
                }

                head = test;
                playerBoard.add(head);
                playerBoard.add(head + 1);
                playerBoard.add(head + 2);
                playerBoard.add(head + 3);

                if (head>90) {
                    playerForbidden.add(head - 1);
                    playerForbidden.add(head + 4);
                    playerForbidden.add(head - 10);
                    playerForbidden.add(head - 9);
                    playerForbidden.add(head - 8);
                    playerForbidden.add(head - 7);
                }
                else if (head<10) {
                    playerForbidden.add(head - 1);
                    playerForbidden.add(head + 4);
                    playerForbidden.add(head + 10);
                    playerForbidden.add(head + 11);
                    playerForbidden.add(head + 12);
                    playerForbidden.add(head + 13);
                }
                else {
                    playerForbidden.add(head - 1);
                    playerForbidden.add(head + 4);
                    playerForbidden.add(head + 10);
                    playerForbidden.add(head - 10);
                    playerForbidden.add(head - 9);
                    playerForbidden.add(head + 11);
                    playerForbidden.add(head - 8);
                    playerForbidden.add(head + 12);
                    playerForbidden.add(head - 7);
                    playerForbidden.add(head + 13);
                }
                head=0;
                test=0;
                placeShip.clear();
                loopCount4++;
                if(loopCount4<2) {
                    layout1.getChildren().remove(enter5);
                    layout1.getChildren().add(enter4);
                    prompt.setText("The next ship is a 4, type 0 to place it vertically or 1 to place horizontally");
                    System.out.println(playerBoard);
                    System.out.println(playerForbidden);
                }
                else if(loopCount4>=2){
                    layout1.getChildren().remove(enter6);
                    layout1.getChildren().add(enter7);
                    prompt.setText("The next ship is a 3, type 0 to place it vertically or 1 to place horizontally");
                    System.out.println(playerBoard);
                    System.out.println(playerForbidden);
                }
            }catch (Exception ex){
                prompt.setText("Enter a valid number. Ships cannot touch or overlap");
            }

        });
        enter7.setOnAction(e->{
            int vertHoriz=0;
            try {
                vertHoriz=Integer.parseInt(placeShip.getText());
                if(vertHoriz!=0&&vertHoriz!=1){
                    throw new IllegalArgumentException();
                }
                if (vertHoriz==0) {
                    layout1.getChildren().remove(enter7);
                    layout1.getChildren().add(enter8);
                    prompt.setText("Choose a number between 1 and 80 to be the head of the ship.");
                    vertHoriz=0;
                }
                if (vertHoriz==1) {
                    layout1.getChildren().remove(enter7);
                    layout1.getChildren().add(enter9);
                    prompt.setText("Choose a number between 1 and 100 that ends in 1-8 to be the head.");
                    vertHoriz=0;

                }


                placeShip.clear();

            }catch (Exception ex){
                prompt.setText("Enter a 0 or 1");
            }
        });
        enter8.setOnAction(e-> {
            int head = 0;
            try {


                head = Integer.parseInt(placeShip.getText());
                if (head < 1 || head > 80 || playerBoard.contains(head) || playerBoard.contains(head + 10) || playerBoard.contains(head + 20) || playerForbidden.contains(head) || playerForbidden.contains(head + 10) || playerForbidden.contains(head + 20)) {
                    throw new IllegalArgumentException();
                }

                playerBoard.add(head);
                playerBoard.add(head + 10);
                playerBoard.add(head + 20);

                if ((head - 1) % 10 == 0) {
                    playerForbidden.add(head - 10);
                    playerForbidden.add(head + 30);
                    playerForbidden.add(head + 1);
                    playerForbidden.add(head + 11);
                    playerForbidden.add(head + 21);
                } else if (head % 10 == 0) {
                    playerForbidden.add(head - 10);
                    playerForbidden.add(head + 30);
                    playerForbidden.add(head - 1);
                    playerForbidden.add(head + 9);
                    playerForbidden.add(head + 19);
                } else {
                    playerForbidden.add(head - 10);
                    playerForbidden.add(head + 30);
                    playerForbidden.add(head + 1);
                    playerForbidden.add(head - 1);
                    playerForbidden.add(head + 9);
                    playerForbidden.add(head + 11);
                    playerForbidden.add(head + 19);
                    playerForbidden.add(head + 21);
                }


            head=0;
            loopCount3++;
            if(loopCount3<2) {
                layout1.getChildren().remove(enter8);;
                layout1.getChildren().add(enter7);
                prompt.setText("The next ship is a 3, type 0 to place it vertically or 1 to place horizontally");
                System.out.println(playerBoard);
                System.out.println(playerForbidden);
            }
            else if(loopCount4>=2){
                layout1.getChildren().remove(enter8);
                layout1.getChildren().remove(placeShip);
                layout1.getChildren().add(startGame);
                System.out.println(playerBoard);
                System.out.println(playerForbidden);
            }
            }catch (Exception ex){
                prompt.setText("Enter a valid number. Your ships may not touch or overlap.");
            }

        });
        enter9.setOnAction(e->{
            int head=0;
            int test=0;
            int letter=0;
            try {
                test = Integer.parseInt(placeShip.getText());
                String s = Integer.toString(test);
                if (s.length() == 2) {
                    char S = s.charAt(1);
                    String x = Character.toString(S);
                    letter = Integer.parseInt(x);
                    head=test;
                } else if (s.length() == 1) {
                    letter = test;
                    head = test;

                }
                if (letter < 1 || letter > 8 || head > 100 ||head<1|| playerBoard.contains(head) || playerBoard.contains(head + 1) || playerBoard.contains(head + 2) || playerForbidden.contains(head) || playerForbidden.contains(head + 1) || playerForbidden.contains(head + 2)) {
                    throw new IllegalArgumentException();
                }

                head = test;

                playerBoard.add(head);
                playerBoard.add(head + 10);
                playerBoard.add(head + 20);

                if ((head-1)%10 == 0) {
                    playerForbidden.add(head - 10);
                    playerForbidden.add(head + 30);
                    playerForbidden.add(head + 1);
                    playerForbidden.add(head + 11);
                    playerForbidden.add(head + 21);
                }
                else if (head%10 == 0) {
                    playerForbidden.add(head - 10);
                    playerForbidden.add(head + 30);
                    playerForbidden.add(head -1);
                    playerForbidden.add(head + 9);
                    playerForbidden.add(head + 19);
                }
                else {
                    playerForbidden.add(head - 10);
                    playerForbidden.add(head + 30);
                    playerForbidden.add(head + 1);
                    playerForbidden.add(head - 1);
                    playerForbidden.add(head + 9);
                    playerForbidden.add(head + 11);
                    playerForbidden.add(head + 19);
                    playerForbidden.add(head + 21);
                }
                head = 0;
                test = 0;

                loopCount3++;
                if(loopCount3<2) {
                    layout1.getChildren().remove(enter8);
                    layout1.getChildren().add(enter7);
                    prompt.setText("The next ship is a 3, type 0 to place it vertically or 1 to place horizontally");
                    System.out.println(playerBoard);
                    System.out.println(playerForbidden);
                }
                else if(loopCount3>=2){
                    layout1.getChildren().remove(enter9);
                    layout1.getChildren().remove(placeShip);
                    layout1.getChildren().add(startGame);
                    prompt.setText("");
                    System.out.println(playerBoard);
                    System.out.println(playerForbidden);
                }
            }catch (Exception ex){
                prompt.setText("Enter a valid number. Ships cannot touch or overlap");
            }

        });
        startGame.setOnAction(e->{
            prompt.setText("");
            layout1.getChildren().remove(enter6);
            for (int i=0; i<100;i++) {
                    int guess=(i);
                    int x=-337;
                    int y=-275;
                    if(i<=9) {
                        buttonList.add(new Button(Integer.toString(i)));
                        buttonList.get(i).setMaxHeight(45);
                        buttonList.get(i).setMaxWidth(70);
                        buttonList.get(i).setTranslateX((x) + (i * 75));
                        buttonList.get(i).setTranslateY(y);
                        buttonList.get(i).setText(Integer.toString((i)+1));
                    }

                  if (i>9&&i<=19){
                        buttonList.add(new Button(Integer.toString(i)));
                        buttonList.get(i).setMaxHeight(45);
                        buttonList.get(i).setMaxWidth(70);
                        buttonList.get(i).setTranslateX((x) + ((i-10) * 75));
                        buttonList.get(i).setTranslateY((y)+(50));
                        buttonList.get(i).setText(Integer.toString((i)+1));
                    }
                  if(i>19&&i<=29){
                      buttonList.add(new Button(Integer.toString(i)));
                      buttonList.get(i).setMaxHeight(45);
                      buttonList.get(i).setMaxWidth(70);
                      buttonList.get(i).setTranslateX((x) + ((i-20) * 75));
                      buttonList.get(i).setTranslateY((y)+(100));
                      buttonList.get(i).setText(Integer.toString((i)+1));
                  }
                  if(i>29&&i<=39){
                      buttonList.add(new Button(Integer.toString(i)));
                      buttonList.get(i).setMaxHeight(45);
                      buttonList.get(i).setMaxWidth(70);
                      buttonList.get(i).setTranslateX((x) + ((i-30) * 75));
                      buttonList.get(i).setTranslateY((y)+(150));
                      buttonList.get(i).setText(Integer.toString((i)+1));
                  }
                if(i>39&&i<=49){
                    buttonList.add(new Button(Integer.toString(i)));
                    buttonList.get(i).setMaxHeight(45);
                    buttonList.get(i).setMaxWidth(70);
                    buttonList.get(i).setTranslateX((x) + ((i-40) * 75));
                    buttonList.get(i).setTranslateY((y)+(200));
                    buttonList.get(i).setText(Integer.toString((i)+1));
                }
                if(i>49&&i<=59){
                    buttonList.add(new Button(Integer.toString(i)));
                    buttonList.get(i).setMaxHeight(45);
                    buttonList.get(i).setMaxWidth(70);
                    buttonList.get(i).setTranslateX((x) + ((i-50) * 75));
                    buttonList.get(i).setTranslateY((y)+(250));
                    buttonList.get(i).setText(Integer.toString((i)+1));
                }
                if(i>59&&i<=69){
                    buttonList.add(new Button(Integer.toString(i)));
                    buttonList.get(i).setMaxHeight(45);
                    buttonList.get(i).setMaxWidth(70);
                    buttonList.get(i).setTranslateX((x) + ((i-60) * 75));
                    buttonList.get(i).setTranslateY((y)+(300));
                    buttonList.get(i).setText(Integer.toString((i)+1));
                }
                if(i>69&&i<=79){
                    buttonList.add(new Button(Integer.toString(i)));
                    buttonList.get(i).setMaxHeight(45);
                    buttonList.get(i).setMaxWidth(70);
                    buttonList.get(i).setTranslateX((x) + ((i-70) * 75));
                    buttonList.get(i).setTranslateY((y)+(350));
                    buttonList.get(i).setText(Integer.toString((i)+1));
                }if(i>79&&i<=89){
                    buttonList.add(new Button(Integer.toString(i)));
                    buttonList.get(i).setMaxHeight(45);
                    buttonList.get(i).setMaxWidth(70);
                    buttonList.get(i).setTranslateX((x) + ((i-80) * 75));
                    buttonList.get(i).setTranslateY((y)+(400));
                    buttonList.get(i).setText(Integer.toString((i)+1));
                }if(i>89&&i<=99){
                    buttonList.add(new Button(Integer.toString(i)));
                    buttonList.get(i).setMaxHeight(45);
                    buttonList.get(i).setMaxWidth(70);
                    buttonList.get(i).setTranslateX((x) + ((i-90) * 75));
                    buttonList.get(i).setTranslateY((y)+(450));
                    buttonList.get(i).setText(Integer.toString((i)+1));
                }
                buttonList.get(i).setOnAction(d-> {
                    if (userBoard.userBoard.contains((guess)+1)) {
                        for (int k = 0; k < userBoard.userBoard.size(); k++) {
                            if (userBoard.userBoard.get(k) == ((guess)+1) ){
                                userBoard.userBoard.remove(k);
                            }
                        }
                        buttonList.get(guess).setText("X");
                        for(int j=0;j<buttonList.size();j++){
                            layout1.getChildren().remove(buttonList.get(j));
                        }
                        prompt.setText("Hit");


                    }
                    else {
                        buttonList.get(guess).setText("O");
                        for(int j=0;j<buttonList.size();j++){
                            layout1.getChildren().remove(buttonList.get(j));
                        }
                        prompt.setText("Miss");
                    }
                    layout1.getChildren().remove(startGame);
                    startGame.setText("Next turn");
                    layout1.getChildren().add(compTurn);

                });
                }

            layout1.getChildren().addAll(buttonList);
            layout1.getChildren().remove(startGame);
        });
        compTurn.setOnAction(e->{


            int cG=computerGuess.getComputerGuess();
            if(playerBoard.contains(cG)){
            for (int i=0;i<playerBoard.size();i++){
                if (playerBoard.get(i)==cG){
                    playerBoard.remove(i);
                }
                prompt.setText("Computer hit");
                layout1.getChildren().remove(nextRound);
                layout1.getChildren().add(nextRound);
                layout1.getChildren().remove(compTurn);
            }
            }
            else if(playerBoard.size()==0) {
                layout1.getChildren().clear();
                prompt.setText("You Lose");
                layout1.getChildren().add(prompt);
            }
            else {
                prompt.setText("Computer miss");
                layout1.getChildren().add(nextRound);
                layout1.getChildren().remove(compTurn);
            }
        });
        nextRound.setOnAction(e->{
            for (int i=0;i<buttonList.size();i++){
                layout1.getChildren().add(buttonList.get(i));
            }
            layout1.getChildren().remove(nextRound);
            prompt.setText("");
            if(userBoard.userBoard.size()==0){
                layout1.getChildren().clear();
                prompt.setText("You Win");
                layout1.getChildren().add(prompt);
            }
        });










        primaryStage.setScene(scene);
        primaryStage.show();
        startButton.setOnAction(e-> primaryStage.setScene(scene1));
        quitButton.setOnAction(e->System.exit(0));
    }
}