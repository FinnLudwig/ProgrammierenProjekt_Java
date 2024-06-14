public class HelloApplication extends Application {

	  public void start(Stage stage) throws IOExpection {
		  FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Eon_Springs.fxml"));
		  Scene scene = new Scene(fxmlLoader.load(), 1489, 1041 );
		  stage.setScene(scene);
		  stage.show();	  
	  }
	  
	  public static void main(String[] args) { launch(); }
}
