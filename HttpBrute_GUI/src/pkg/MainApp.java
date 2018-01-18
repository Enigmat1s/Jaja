package pkg;


import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.*;

public class MainApp extends Application {
	
	public String adr = null;
	public String logtxt = null;
	public Integer min = 3;
	public Integer max = 5;
	
	public static void main(String[] args) {
		launch(args);
		}

	@Override
	public void start(Stage curStg) throws Exception {
		curStg.setTitle("Knock-Knock!");
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		Text maintitle = new Text("Http Bruteforce");
		maintitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(maintitle, 0, 0, 2, 1);
		
		Label userName = new Label("User:");
		grid.add(userName, 0, 2);
		
		TextField addr = new TextField();
		//addr.resize(2, 1);
		grid.add(addr, 1, 1);
		
		Label adddr = new Label("URL:");
		grid.add(adddr, 0, 1);

		TextField userTF = new TextField();
		grid.add(userTF, 1, 2);

		//Label pwd = new Label("Pass:");
		//grid.add(pwd, 0, 3);

		TextField minBox = new TextField();
		grid.add(minBox, 0, 3);
		
		Text totx = new Text("            to");
		totx.setTextAlignment(TextAlignment.CENTER);
		grid.add(totx, 1, 3);
		
		TextField maxBox = new TextField();
		grid.add(maxBox, 2, 3);
		
		Analysed thread = new Analysed(logtxt, min, max);
		
		Button gobtn = new Button();
		gobtn.setText("Who is there?");
		Alert alert = new Alert (AlertType.ERROR, "Dat shit is not numbers!");
		gobtn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				logtxt = userTF.getText();
				adr = addr.getText();
				try {
					min = Integer.parseInt(minBox.getText());
					max = Integer.parseInt(maxBox.getText());
				}
				catch (Exception e) {
					alert.showAndWait();
					System.out.println("Dat shit is not numbers!");
				}
				if (adr != "" && logtxt != "" && min < max)
				thread.bruter(adr, logtxt, min, max);
				System.out.println(adr + logtxt + min + max);
			}
		});

		Scene scene = new Scene(grid, 350, 200);
		grid.add(gobtn, 1, 5);
	    curStg.setScene(scene);
	    curStg.show();
	    
	}

}
