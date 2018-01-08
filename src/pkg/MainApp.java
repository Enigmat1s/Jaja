package pkg;


import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class MainApp extends Application {
	
	String logtxt = null;
	
	public static void main(String[] args) {
		launch(args);
		}

	@Override
	public void start(Stage curStg) throws Exception {
		curStg.setTitle("Knock-Knock!");
		Button gobtn = new Button();
		gobtn.setText("Who is there?");
		gobtn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println(logtxt);
			}
		});
		
		public void changeLogVar() {
			logtxt = userTF.GetText();
		}
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		Text maintitle = new Text("Welcome");
		maintitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(maintitle, 0, 0, 2, 1);
		
		Label userName = new Label("User:");
		grid.add(userName, 0, 1);

		TextField userTF = new TextField();
		userTF.setOnKeyTyped(new EventHandler<? super KeyEvent> changeLogVar);
		grid.add(userTF, 1, 1);

		Label pwd = new Label("Pass:");
		grid.add(pwd, 0, 2);

		PasswordField pwdBox = new PasswordField();
		grid.add(pwdBox, 1, 2);

		Scene scene = new Scene(grid, 300, 250);
		grid.add(gobtn, 1, 3);
	    curStg.setScene(scene);
	    curStg.show();
		
	}

}
