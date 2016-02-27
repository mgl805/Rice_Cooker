package ca.ets.mgl805.hiver2016.ricecooker.controller.cooking.thai;

import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.NO_BUTTON_CLICKED;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.NO_CLICKING;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.PLEASE_CLICK_ON_A_BUTTON_IN_THE_LEFT_SIDE;

import java.net.URL;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ca.ets.mgl805.hiver2016.ricecooker.model.entity.Cuisson;
import ca.ets.mgl805.hiver2016.ricecooker.view.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;

/**
 * @CookingThaiController - a simple cooking thai controller class for cooking thai rice
 * <a href="mailto:asylvose@yahoo.fr">Sylvose ALLOGO</a>
 * @version $Revision: 1.1 $
 * @since 14 February 2016 09:00:00
 */
public class CookingThaiController extends AnchorPane implements Runnable, Initializable {
	
    private static final Logger log = LoggerFactory.getLogger(CookingThaiController.class);

    // Reference to the main application
    private Main application;
    
    private Cuisson cuisson;
   
    
   /**
	* The constructor is called before the initialize() method
	*/
    public CookingThaiController() {}

   /**
    * Start/Restart background service to update the center menu 
    * when the button cooking thai rice is cliked
    */
    public void run() {}
    
    /**
     * Initializes the cooking thai controller class
     * This method is automatically called
     * after the fxml file has been loaded
     */
    @FXML
    private void initialize() {
    	log.info("initialization of Cooking Thai Controller class");
	}
    
    public void initialize(URL location, ResourceBundle resources) {}

	/**
	 * @return the application
	 */
	public Main getApplication() {
		return application;
	}

    /**
     * Is called by the main application to give a reference back to itself
     * 
     * @param application the application to set
     */
	public void setApplication(Main application) {
		this.application = application;
	}
	
	/**
	 * @return the cuisson
	 */
	public final Cuisson getCuisson() {
		return cuisson;
	}

	/**
	 * @param cuisson the cuisson to set
	 */
	public final void setCuisson(Cuisson cuisson) {
		this.cuisson = cuisson;
	}

	/**
	 * Called when the user clicks on the cooking thai rice button
	 */
	@SuppressWarnings("unused")
	@FXML
	private void handleButtonActionCookingThaiRiceCliked(ActionEvent event) {
	    final int selectedIndex = -1; // object.getSelectionModel().getSelectedIndex();
	    if (selectedIndex >= 0) {
	    	// object.getItems().remove(selectedIndex);
	    	log.info("initialization of Controller class");
	    	
	    } else {
	        // Nothing cliked
	    	final Alert alert = new Alert(AlertType.WARNING);
	        alert.initOwner(application.getStage());
	        alert.setTitle(NO_CLICKING);
	        alert.setHeaderText(NO_BUTTON_CLICKED);
	        alert.setContentText(PLEASE_CLICK_ON_A_BUTTON_IN_THE_LEFT_SIDE);
	        alert.showAndWait();
	    }
	}
}