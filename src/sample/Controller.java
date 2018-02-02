package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class Controller implements Initializable {


    @FXML
    public Button btnBuyApples;

    @FXML
    public Button btnBuyOranges;

    @FXML
    public Button btnBuyBananas;

    @FXML
    public Button btnBuyGrapes;

    @FXML
    public Text boxApples;

    @FXML
    public Text boxOranges;

    @FXML
    public Text boxBananas;

    @FXML
    public Text boxGrapes;

    @FXML
    public Text boxTimer;

    @FXML
    public Text outPutText;

    @FXML
    public Button btnSellApples;

    @FXML
    public Button btnSellOranges;

    @FXML
    public Button btnSellBananas;

    @FXML
    public Button btnSellGrapes;

    private int countApples = 0;
    private int countOranges = 0;
    private int countBananas = 0;
    private int countGrapes = 0;
    private int countTime = 15;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        updateBoxes();
//        setUpTimer();
//        setCountCounter();
        setCountTime();
    }


    public void setCountTime() {
        TimerTask task = new TimerTask() {
            public void run() {
                //do stuff here
                System.out.println("meow");
            }
        };

        Timer count = new Timer();
        count.schedule(task, 15000L, 15000L);
    }

//    public void setUpTimer() {
//        TimerTask task = new TimerTask() {
//            @Override
//            public void run() {
//                countTime++;
//                String stringTime = String.valueOf(countTime);
//                boxTimer.setText(stringTime);
//            }
//
//
//        };
//    }
    public void updateBoxes() {
        boxApples.setText("Apples: " + countApples);
        boxOranges.setText("Oranges: " + countOranges);
        boxBananas.setText("Bananas: " + countBananas);
        boxGrapes.setText("Grapes:" + countGrapes);

    }

    public void buyApples(ActionEvent actionEvent) {
        countApples++;
        updateBoxes();
        outPutText.setText(countApples + " " + "APPLE(S) PURCHASED");
    }

    public void buyOranges(ActionEvent actionEvent) {
        countOranges++;
        updateBoxes();
        outPutText.setText(countOranges + " " + "ORANGE(S) PURCHASED");
    }

    public void buyBananas(ActionEvent actionEvent) {
        countBananas++;
        updateBoxes();
        outPutText.setText(countBananas + " " + "BANANA(S) PURCHASED");
    }

    public void buyGrapes(ActionEvent actionEvent) {
        countGrapes++;
        updateBoxes();
        outPutText.setText(countGrapes + " " + "GRAPE(S) PURCHASED");
    }




    public void sellBananas(ActionEvent actionEvent) {
        if (countBananas > 0) {
            countBananas--;
            updateBoxes();
            outPutText.setText("SALE SUCCESSFUL");
        } else {
            outPutText.setText("ERROR. CAN'T SELL MORE THAN YOU HAVE.");
        }
    }

    public void sellGrapes(ActionEvent actionEvent) {
        if (countGrapes > 0) {
            countGrapes--;
            updateBoxes();
            outPutText.setText("SALE SUCCESSFUL");
        } else {
            outPutText.setText("ERROR. CAN'T SELL MORE THAN YOU HAVE.");
        }


    }

    public void sellApples(ActionEvent actionEvent) {
        if (countApples > 0) {
            countApples--;
            updateBoxes();
            outPutText.setText("SALE SUCCESSFUL");
        } else {
            outPutText.setText("ERROR. CAN'T SELL MORE THAN YOU HAVE.");
        }
    }

    public void sellOranges(ActionEvent actionEvent) {
        if (countOranges > 0) {
            countOranges--;
            updateBoxes();
            outPutText.setText("SALE SUCCESSFUL");
        } else {
            outPutText.setText("ERROR. CAN'T SELL MORE THAN YOU HAVE.");
        }

    }
}