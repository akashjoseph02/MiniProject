package com.example.miniproject;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() { welcomeText.setText("Welcome to JavaFX Application!");}

    public static int total = 0;
    public int count = 0;

    public String TC, C;

    @FXML
    public Button closeButton;

    @FXML
    protected void create_account() throws IOException {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("2nd_page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        Stage nstage = new Stage();
        nstage.setTitle("Create Account");
        nstage.setScene(scene);
        nstage.show();
    }

    @FXML
    protected void support() throws IOException {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("about_page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        Stage nstage = new Stage();
        nstage.setTitle("Support");
        nstage.setScene(scene);
        nstage.show();
    }

    @FXML
    protected void button() throws IOException {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        Stage nstage = new Stage();
        nstage.setTitle("Support");
        nstage.setScene(scene);
        nstage.show();
    }

    @FXML
    protected void create() throws IOException {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("createmessage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        Stage nstage = new Stage();
        nstage.setTitle("New Message");
        nstage.setScene(scene);
        nstage.show();
    }

    @FXML
    protected void next_shop() throws IOException {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("shop_page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        Stage nstage = new Stage();
        nstage.setTitle("Shop");
        nstage.setScene(scene);
        nstage.show();
    }

    @FXML
    protected void shopMenu() throws IOException {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("shopmenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        Stage nstage = new Stage();
        nstage.setTitle("Shop");
        nstage.setScene(scene);
        nstage.show();
    }

    @FXML
    protected void shopJersi() throws IOException {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("shopJersy.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        Stage nstage = new Stage();
        nstage.setTitle("Jersey Shop");
        nstage.setScene(scene);
        nstage.show();
    }

    @FXML
    protected void shopBoots() throws IOException {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("shoppingcart_boots.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        Stage nstage = new Stage();
        nstage.setTitle("Boots Shop");
        nstage.setScene(scene);
        nstage.show();
    }

    @FXML
    protected void shopSocksmenu() throws IOException {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("footballsocks.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        Stage nstage = new Stage();
        nstage.setTitle("Boots Shop");
        nstage.setScene(scene);
        nstage.show();
    }

    @FXML
    protected void shopSocks() throws IOException {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Fsocks.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        Stage nstage = new Stage();
        nstage.setTitle("Boots Shop");
        nstage.setScene(scene);
        nstage.show();
    }

    @FXML
    protected void shopShin() throws IOException {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Fshinguard.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        Stage nstage = new Stage();
        nstage.setTitle("Boots Shop");
        nstage.setScene(scene);
        nstage.show();
    }

    @FXML
    protected void shopFootball() throws IOException {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("footballaccessories.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        Stage nstage = new Stage();
        nstage.setTitle("Boots Shop");
        nstage.setScene(scene);
        nstage.show();
    }

    @FXML
    protected void pumaEclipse() throws IOException {
        total = total + 2500;
        count = count +1;
        System.out.println("Puma ECLIPSE selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void adidasPredator() throws IOException {
        total = total + 3000;
        count = count +1;
        System.out.println("Adidas PREDATOR selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void nikeMercurial() throws IOException {
        total = total + 3500;
        count = count +1;
        System.out.println("Nike MERCURIAL selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void nikeMercurialSuperfly() throws IOException {
        total = total + 4200;
        count = count +1;
        System.out.println("Nike MERCURIAL SUPERFLY selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void nikeMercurialSuperflySE() throws IOException {
        total = total + 5500;
        count = count +1;
        System.out.println("Nike MERCURIAL SUPERFLY Special Edition selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void adidasGhosted() throws IOException {
        total = total + 2500;
        count = count +1;
        System.out.println("Adidas GHOSTED selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void lingaSocks() throws IOException {
        total = total + 300;
        count = count +1;
        System.out.println("Linga Socks selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void BotoSocks() throws IOException {
        total = total + 200;
        count = count +1;
        System.out.println("Boto Socks selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void NikeSocks() throws IOException {
        total = total + 500;
        count = count +1;
        System.out.println("Nike Socks selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void PumaSocks() throws IOException {
        total = total + 400;
        count = count +1;
        System.out.println("Puma Socks selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void PumaSocks2() throws IOException {
        total = total + 300;
        count = count +1;
        System.out.println("Puma Socks selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void AdidasSocks() throws IOException {
        total = total + 700;
        count = count +1;
        System.out.println("Adidas Socks selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void nikeShin() throws IOException {
        total = total + 1200;
        count = count +1;
        System.out.println("Nike Shin selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void nikeShinshock() throws IOException {
        total = total + 1000;
        count = count +1;
        System.out.println("Nike Shin Shock selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void pumaShin() throws IOException {
        total = total + 1100;
        count = count +1;
        System.out.println("Puma Shin Shock selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void umbroShin() throws IOException {
        total = total + 800;
        count = count +1;
        System.out.println("Umbro Shin selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void adidasShin() throws IOException {
        total = total + 1500;
        count = count +1;
        System.out.println("Adidas Shin selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void adidasShinmessi() throws IOException {
        total = total + 1400;
        count = count +1;
        System.out.println("Adidas Shin Messi selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void coscoFootball() throws IOException {
        total = total + 1000;
        count = count +1;
        System.out.println("Cosco Football selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void nikeOrdem() throws IOException {
        total = total + 2500;
        count = count +1;
        System.out.println("Nike Ordem Football selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void pumaEvo() throws IOException {
        total = total + 800;
        count = count +1;
        System.out.println("Puma EVO Football selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void uefa() throws IOException {
        total = total + 2000;
        count = count +1;
        System.out.println("UEFA CL Football selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void brazucaFootball() throws IOException {
        total = total + 1500;
        count = count +1;
        System.out.println("Brazuca Football selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void jabulaniFootball() throws IOException {
        total = total + 1200;
        count = count +1;
        System.out.println("Adidas Jabulani Football selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void rmaJersey() throws IOException {
        total = total + 2500;
        count = count +1;
        System.out.println("Real Madrid Jersey selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void munJersey() throws IOException {
        total = total + 3500;
        count = count +1;
        System.out.println("Manchester United Jersey selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void fcbJersey() throws IOException {
        total = total + 2000;
        count = count +1;
        System.out.println("FC Barcelona Jersey selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void bvbJersey() throws IOException {
        total = total + 1500;
        count = count +1;
        System.out.println("Borusia Dortmund Jersey selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void mciJersey() throws IOException {
        total = total + 2000;
        count = count +1;
        System.out.println("Manchester City Jersey selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    protected void psgJersey() throws IOException {
        total = total + 3000;
        count = count +1;
        System.out.println("Paris ST Germany Jersey selected "+" total cost: "+ total);
        TC = new String(String.valueOf(total)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
    }

    @FXML
    public void checkout() throws IOException {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("final.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        Stage nstage = new Stage();
        nstage.setTitle("Checkout");
        Label lblTotal = (Label) scene.lookup("#lblTotal");
        if (lblTotal!=null) lblTotal.setText(String.valueOf(total));
        nstage.setScene(scene);
        nstage.show();

    }

    @FXML
    protected void endingp() throws IOException {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("end_page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        Stage nstage = new Stage();
        nstage.setTitle("Boots Shop");
        nstage.setScene(scene);
        nstage.show();
    }
}