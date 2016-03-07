package ca.ets.mgl805.hiver2016.ricecooker.model.db;

/**
 * DataBase - a simple data base interface for the persistance of datas 
 * <a href="mailto:asylvose@yahoo.fr">Sylvose ALLOGO</a>
 * @version $Revision: 1.1 $
 * @since 14 February 2016 09:00:00
 */
public interface DataBase {

	int SCREEN_WIDTH = 1000;
    int SCREEN_HEIGHT = 600;
    int WINDOW_BORDER = 3; // on desktop platform
    int TITLE_BAR_HEIGHT = 19; // on desktop platform
    
	String TITLE = "Cuiseur de riz par Alexis Leperlier, Maha Kharbech, Marwa Kharbech et Sylvose Allogo";
	
	String RICE_COOKER_ICON = "images/ricecooker.jpg";
	String RICE_COOKER_CSS_STYLE = "/styles/styles.css";
	
	String RICE_COOKER_BACK_GROUND = "images/background.jpg";
	
	String AUDIO_PATH_FOLDER = "audio";
	
	
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

 	String LABEL_BTN_COOKING_THAI = "Riz Tha\u00EF";
 	String LABEL_BTN_COOKING_SLOW = "Lent";
 	String LABEL_BTN_COOKING_NORMAL = "Normal";
 	String LABEL_BTN_COOKING_FAST = "Rapide";
 	String LABEL_BTN_ON_POWER = "D\u00E9part";
 	String LABEL_BTN_OFF_POWER = "Arr\u00EAt";
 	String LABEL_BTN_ON_OFF_RICE_SOAKING = "Trempage";
 	String LABEL_BTN_REHEAT = "R\u00E9chauffage";
 	
 	String STYLE = "-fx-font: 20 arial; -fx-base: #b6e7c9;";

 	String IS_NESTED_IN = "is nested in";
 	
 	//Liste des messages qui peuvent etre affichés
 	
 	String MSG_MARMITE = "Marmite absente";
 	
 	String THAI = "tha\u00EF";
 	String LENT = "lent";
 	String NORMAL = "normal";
 	String RAPIDE = "rapide";
 	String TREMPAGE = "Trempage";
 	String RECHAUFFAGE = "R\u00E9chauffage";
 	String ON_POWER = "onPower";
 	String OFF_POWER = "offPower";
 	
 	String CUISSON = "Cuisson";
 	
 	
 	String MSG_COMMUTATEUR_EN_MODE_MARCHE = "Le commutateur est \nen mode \u00AB Marche \u00BB";
 	
 	String MSG_CLENTE = "La cuisson lente";
 	String MSG_CNORMALE = "La cuisson normale";
 	String MSG_CRAPIDE = "La cuisson rapide";
 	String MSG_CTHAI = "La cuisson riz tha\u00EF";
 	String MSG_TREMPAGE = "Le trempage";
 	String MSG_RECHAUFFAGE = "Le r\u00E9chauffage";
 	
 	String MSG_EN_COURS = " est en cours \nd'\u00E9xecution et ne peut-\u00EAtre \ninterrompue avant la fin";
 	
 	String MSG_ON_POWER = "Vous devez d'abord cliquer sur l'une \ndes 4 cuissons propos\u00E9es : \n- Cuisson Riz Thai \n- Cuisson Lente \n- Cuisson Normale \n- Cuisson Rapide";
 	String MSG_OFF_POWER = "Arr\u00EAt du cycle \nde cuisson \npar l'utilisateur";
 	
 	String ERR_CUISSON = "Action impossible! Le riz est d\u00E9j\u00E0 en cuisson";
 	String ERR_RECHAU = "Action impossible! Le R\u00E9chauffage est d\u00E9j\u00E0 activ\u00E9";
 	String ERR_TREMP = "Action impossible! Le Trempage est d\u00E9j\u00E0 activ\u00E9";
 	
 	String SITE_INTERNET_ETS_MENU_ITEM = "Site internet de l'\u00C9cole de Technologie Sup\u00E9rieure";
 	String MGL805_MENU_ITEM = "MGL805";
 	String MGL805_URL = "https://cours.etsmtl.ca/mgl805/private/";
 	String SITE_INTERNET_PROJET_RICE_COOKER_MENU_ITEM = "Site internet Gthub du projet Rice Cooker";
 	String PROJET_RICE_COOKER_URL = "https://github.com/mgl805/Rice_Cooker";
 	String ETS_MENU = "ETS";
 	String ETS_URL = "https://www.etsmtl.ca/";
 	
 	String SITE_INTERNET_UQAM_MENU_ITEM = "Universit\u00E9 du Qu\u00E9bec \u00E0 Montr\u00E9al";
 	String UQAM_MENU = "UQAM";
 	String UQAM_URL = "http://www.uqam.ca/";
 	
 	String MANUEL_UTILISATEUR_MENU_ITEM = "Manuel de l'utilisateur";
 	String MANUEL_UTILISATEUR_URL = "https://docs.google.com/document/d/1temZRHh31zNeR3cNmnOWir1ozFS6RhX8lvnM1cW3u7I/edit";
 	String AIDE_MENU = "Aide";
 	
 	String ALEXIS_LEPERLIER_MENU_ITEM = "Alexis Leperlier";
 	String ALEXIS_LEPERLIER_URL = "https://www.linkedin.com/in/alexis-leperlier-45a87991";
 	
 	String MAHA_KHARBECH_MENU_ITEM = "Maha Kharbech";
 	String MAHA_KHARBECH_URL = "https://www.linkedin.com/in/maha-kharbech-a1522823";
 	
 	String MARWA_KHARBECH_MENU_ITEM = "Marwa Kharbech";
 	String MARWA_KHARBECH_URL = "https://www.facebook.com/marwa.kharbech.9";
 	
 	String SYLVOSE_ALLOGO_MENU_ITEM = "Sylvose Allogo";
 	String SYLVOSE_ALLOGO_URL = "https://www.linkedin.com/in/sylvose-allogo-52928923";
 	
 	String APROPOS_MENU = "\u00C0 propos";
 	
 	String FERMER_APPLICATION_MENU_ITEM = "Fermer l'application";
 	String QUITTER_MENU = "Quitter";
 	
 	String ON_POWER_BUTTON_CLICKED = "OnPower.mp3";
 	String OFF_POWER_BUTTON_CLICKED = "OffPower.mp3";
 	String COOKING_THAI_BUTTON_CLICKED = "cookingThai.mp3";
 	String COOKING_SLOW_BUTTON_CLICKED = "cookingSlow.mp3";
 	String COOKING_NORMAL_BUTTON_CLICKED = "cookingNormal.mp3";
 	String COOKING_FAST_BUTTON_CLICKED = "cookingFast.mp3";
 	String REHEAT_BUTTON_CLICKED = "reheat.mp3";
 	String RICE_SOAKING_BUTTON_CLICKED = "riceSoaking.mp3";
}

/*
 * © = \u00A9
 * à = \u00E0
 * À = \u00C0
 * é = \u00E9
 * ê = \u00EA
 * É = \u00C9 
 * « = \u00AB  
 * » = \u00BB 
 * ï = \u00EF 
 */