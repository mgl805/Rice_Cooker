package ca.ets.mgl805.hiver2016.ricecooker.model.db;

/**
 * @DataBase - a simple data base interface for the persistance of datas 
 * <a href="mailto:asylvose@yahoo.fr">Sylvose ALLOGO</a>
 * @version $Revision: 1.1 $
 * @since 14 February 2016 09:00:00
 */
public interface DataBase {

	int width = 450;
    int height = 250;
    
	String TITLE = "Cuiseur de riz par Alexis Leperlier, Maha Kharbech, Marwa Kharbech et Sylvose Allogo";
	
	String RICE_COOKER_ICON = "file:resources/images/ricecooker.png";
	
	String THAI_COOKING_LAYOUT_CONTROLLER_PATH_FILE_FXML = "view/CookingThaiController.fxml";
	String SLOW_COOKING_LAYOUT_CONTROLLER_PATH_FILE_FXML = "view/CookingSlowController.fxml";
	String NORMAL_COOKING_LAYOUT_CONTROLLER_PATH_FILE_FXML = "view/CookingNormalController.fxml";
	String FAST_COOKING_LAYOUT_CONTROLLER_PATH_FILE_FXML = "view/CookingFastController.fxml";
	
	String ON_OFF_POWER_LAYOUT_CONTROLLER_PATH_FILE_FXML = "view/OnOffPowerController.fxml";
	String ON_OFF_RICE_SOAKING_CONTROLLER_PATH_FILE_FXML = "view/OnOffRiceSoakingController.fxml";
	
	String REHEAT_LAYOUT_CONTROLLER_PATH_FILE_FXML = "view/ReheatController.fxml";
	
	int d = 13; 
	
	// initializing float array
	float [][] graphCookingThai = new float [][] {
							                      {1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f, 11f, 12f, 13f}, 
							                      {1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f, 11f, 12f, 13f}
					                             };
					                             
 	float [][] graphCookingSlow = new float [][] {
 							                      {1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f, 11f, 12f, 13f}, 
 							                      {1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f, 11f, 12f, 13f}
 					                             };
	
    float [][] graphCookingNormal = new float [][] {
											        {1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f, 11f, 12f, 13f}, 
											        {1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f, 11f, 12f, 13f}
											       };
 						                             
 	float [][] graphCookingFast = new float [][] {
 							                      {1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f, 11f, 12f, 13f}, 
 							                      {1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f, 11f, 12f, 13f}
 					                             };
 					                          
 	String NO_CLICKING = "No Clicking";
 	String NO_BUTTON_CLICKED = "No Button Cliked";
 	String PLEASE_CLICK_ON_A_BUTTON_IN_THE_LEFT_SIDE = "Please click on a button in the left side";
 	
 	String LABEL_BTN_COOKING_THAI = "";
 	String LABEL_BTN_COOKING_SLOW = "";
 	String LABEL_BTN_COOKING_NORMAL = "";
 	String LABEL_BTN_COOKING_FAST = "";
 	String LABEL_BTN_ON_OFF_POWER= "";
 	String LABEL_BTN_ON_OFF_RICE_SOAKING = "";
 	String LABEL_BTN_REHEAT = "";
 	
 	String STYLE = "-fx-font: 22 arial; -fx-base: #b6e7c9;";
 	
 	String IS_NESTED_IN = "is nested in";
}