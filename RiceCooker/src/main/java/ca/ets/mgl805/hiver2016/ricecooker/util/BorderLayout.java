package ca.ets.mgl805.hiver2016.ricecooker.util;

import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.AIDE_MENU;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.ALEXIS_LEPERLIER_MENU_ITEM;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.ALEXIS_LEPERLIER_URL;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.APROPOS_MENU;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.CUISSON;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.ETS_MENU;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.ETS_URL;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.FERMER_APPLICATION_MENU_ITEM;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_COOKING_FAST;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_COOKING_NORMAL;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_COOKING_SLOW;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_COOKING_THAI;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_OFF_POWER;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_ON_OFF_RICE_SOAKING;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_ON_POWER;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_REHEAT;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MAHA_KHARBECH_MENU_ITEM;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MAHA_KHARBECH_URL;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MANUEL_UTILISATEUR_MENU_ITEM;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MANUEL_UTILISATEUR_URL;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MARWA_KHARBECH_MENU_ITEM;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MARWA_KHARBECH_URL;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MGL805_MENU_ITEM;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MGL805_URL;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MSG_EN_COURS;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.OFF_POWER;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.ON_POWER;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.PROJET_RICE_COOKER_URL;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.QUITTER_MENU;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.RECHAUFFAGE;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.RICE_COOKER_BACK_GROUND;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.RICE_COOKER_ICON;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.SCREEN_HEIGHT;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.SCREEN_WIDTH;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.SITE_INTERNET_ETS_MENU_ITEM;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.SITE_INTERNET_PROJET_RICE_COOKER_MENU_ITEM;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.SITE_INTERNET_UQAM_MENU_ITEM;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.STYLE;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.SYLVOSE_ALLOGO_MENU_ITEM;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.SYLVOSE_ALLOGO_URL;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.TITLE;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.TREMPAGE;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.UQAM_MENU;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.UQAM_URL;

import java.io.InputStream;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.apache.maven.shared.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ca.ets.mgl805.hiver2016.ricecooker.controller.cooking.fast.CookingFastController;
import ca.ets.mgl805.hiver2016.ricecooker.controller.cooking.normal.CookingNormalController;
import ca.ets.mgl805.hiver2016.ricecooker.controller.cooking.slow.CookingSlowController;
import ca.ets.mgl805.hiver2016.ricecooker.controller.cooking.thai.CookingThaiController;
import ca.ets.mgl805.hiver2016.ricecooker.controller.design.patterns.command.Broker;
import ca.ets.mgl805.hiver2016.ricecooker.controller.design.patterns.command.Receptor;
import ca.ets.mgl805.hiver2016.ricecooker.controller.power.OffPowerController;
import ca.ets.mgl805.hiver2016.ricecooker.controller.power.OnPowerController;
import ca.ets.mgl805.hiver2016.ricecooker.controller.reheat.ReheatController;
import ca.ets.mgl805.hiver2016.ricecooker.controller.riceSoaking.RiceSoakingController;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 * BorderLayout - a simple util class for the BorderLayout 
 * <a href="mailto:asylvose@yahoo.fr">Sylvose ALLOGO</a>
 * @version $Revision: 1.1 $
 * @since 14 February 2016 09:00:00
 */
public class BorderLayout {
	
	private static final Logger log = LoggerFactory.getLogger(BorderLayout.class);
	
	
	private static BorderLayout instance = null;
	
    private final AudioMediaPlayer audioMediaPlayer = AudioMediaPlayer.getInstance();
	private final Receptor receptor = Receptor.getInstance();
    private final Broker broker = Broker.getInstance();
	
	
	private BorderPane borderPane;
	
	private Stage stage;

    // the 5 sections : top, left, right, center, bottom of the screen
    private HBox topRegion;
    private VBox leftRegion;
    private VBox rightRegion;
    private VBox centerRegion;
    private HBox bottomRegion;
    
    private Text etatCuiseurText;
    
    private String etatCuiseurString;
   
    private HBox cuissonHbox;
    private HBox trempageHbox;
    private HBox rechaudHbox;
    
    private Label etsUqamLabel;
    
    private Label cuissonLabel;
    private Label tremapgeLabel;
    private Label rechaudLabel;

    private ImageView imageView;
    
    private MenuItem siteInternetETSMenuItem;
    private MenuItem mgl805MenuItem;
    private MenuItem siteInternetProjetRiceCookerMenuItem;
    private MenuItem siteInternetUQAMMenuItem;
    private MenuItem manuelUtilisateurMenuItem;
    private MenuItem alexisLeperlierMenuItem;
    private MenuItem mahaKharbechMenuItem;
    private MenuItem marwaKharbechMenuItem;
    private MenuItem sylvoseAllogoMenuItem;
    private MenuItem fermerApplicationMenuItem;
	
    private Button btnCookingThai;
    private Button btnCookingSlow;
    private Button btnCookingNormal;
    private Button btnCookingFast;
    private Button btnCookingOnPower;
    private Button btnCookingOffPower;
    private Button btnCookingRiceSoaking;
    private Button btnCookingReheat;
    
    private Rectangle trempageRectangle;
    private Rectangle rechaudRectangle;
    private Rectangle cuissonRectangle;
    
    
    public BorderLayout() {}
    
	/**
	 * @param borderPane
	 * @param stage
	 * @param topRegion
	 * @param leftRegion
	 * @param rightRegion
	 * @param centerRegion
	 * @param bottomRegion
	 * @param etatCuiseurText
	 * @param etatCuiseurString
	 * @param cuissonHbox
	 * @param trempageHbox
	 * @param rechaudHbox
	 * @param etsUqamLabel
	 * @param cuissonLabel
	 * @param tremapgeLabel
	 * @param rechaudLabel
	 * @param imageView
	 * @param siteInternetETSMenuItem
	 * @param mgl805MenuItem
	 * @param siteInternetProjetRiceCookerMenuItem
	 * @param siteInternetUQAMMenuItem
	 * @param manuelUtilisateurMenuItem
	 * @param alexisLeperlierMenuItem
	 * @param mahaKharbechMenuItem
	 * @param marwaKharbechMenuItem
	 * @param sylvoseAllogoMenuItem
	 * @param fermerApplicationMenuItem
	 * @param btnCookingThai
	 * @param btnCookingSlow
	 * @param btnCookingNormal
	 * @param btnCookingFast
	 * @param btnCookingOnPower
	 * @param btnCookingOffPower
	 * @param btnCookingRiceSoaking
	 * @param btnCookingReheat
	 * @param trempageRectangle
	 * @param rechaudRectangle
	 * @param cuissonRectangle
	 */
	public BorderLayout(BorderPane borderPane, Stage stage, HBox topRegion, VBox leftRegion, VBox rightRegion,
			VBox centerRegion, HBox bottomRegion, Text etatCuiseurText, String etatCuiseurString, HBox cuissonHbox,
			HBox trempageHbox, HBox rechaudHbox, Label etsUqamLabel, Label cuissonLabel, Label tremapgeLabel,
			Label rechaudLabel, ImageView imageView, MenuItem siteInternetETSMenuItem, MenuItem mgl805MenuItem,
			MenuItem siteInternetProjetRiceCookerMenuItem, MenuItem siteInternetUQAMMenuItem,
			MenuItem manuelUtilisateurMenuItem, MenuItem alexisLeperlierMenuItem, MenuItem mahaKharbechMenuItem,
			MenuItem marwaKharbechMenuItem, MenuItem sylvoseAllogoMenuItem, MenuItem fermerApplicationMenuItem,
			Button btnCookingThai, Button btnCookingSlow, Button btnCookingNormal, Button btnCookingFast,
			Button btnCookingOnPower, Button btnCookingOffPower, Button btnCookingRiceSoaking, Button btnCookingReheat,
			Rectangle trempageRectangle, Rectangle rechaudRectangle, Rectangle cuissonRectangle) {
		this();
		this.borderPane = borderPane;
		this.stage = stage;
		this.topRegion = topRegion;
		this.leftRegion = leftRegion;
		this.rightRegion = rightRegion;
		this.centerRegion = centerRegion;
		this.bottomRegion = bottomRegion;
		this.etatCuiseurText = etatCuiseurText;
		this.etatCuiseurString = etatCuiseurString;
		this.cuissonHbox = cuissonHbox;
		this.trempageHbox = trempageHbox;
		this.rechaudHbox = rechaudHbox;
		this.etsUqamLabel = etsUqamLabel;
		this.cuissonLabel = cuissonLabel;
		this.tremapgeLabel = tremapgeLabel;
		this.rechaudLabel = rechaudLabel;
		this.imageView = imageView;
		this.siteInternetETSMenuItem = siteInternetETSMenuItem;
		this.mgl805MenuItem = mgl805MenuItem;
		this.siteInternetProjetRiceCookerMenuItem = siteInternetProjetRiceCookerMenuItem;
		this.siteInternetUQAMMenuItem = siteInternetUQAMMenuItem;
		this.manuelUtilisateurMenuItem = manuelUtilisateurMenuItem;
		this.alexisLeperlierMenuItem = alexisLeperlierMenuItem;
		this.mahaKharbechMenuItem = mahaKharbechMenuItem;
		this.marwaKharbechMenuItem = marwaKharbechMenuItem;
		this.sylvoseAllogoMenuItem = sylvoseAllogoMenuItem;
		this.fermerApplicationMenuItem = fermerApplicationMenuItem;
		this.btnCookingThai = btnCookingThai;
		this.btnCookingSlow = btnCookingSlow;
		this.btnCookingNormal = btnCookingNormal;
		this.btnCookingFast = btnCookingFast;
		this.btnCookingOnPower = btnCookingOnPower;
		this.btnCookingOffPower = btnCookingOffPower;
		this.btnCookingRiceSoaking = btnCookingRiceSoaking;
		this.btnCookingReheat = btnCookingReheat;
		this.trempageRectangle = trempageRectangle;
		this.rechaudRectangle = rechaudRectangle;
		this.cuissonRectangle = cuissonRectangle;
	}


	public static BorderLayout getInstance() {
		if (instance == null) {
			instance = new BorderLayout();
		}
		return instance;
	}
    
	/**
	 * @return the stage
	 */
	public final Stage getStage() {
		return stage;
	}

	/**
	 * @param stage the stage to set
	 */
	public final void setStage(Stage stage) {
		this.stage = stage;
	}

	/**
	 * @return the borderPane
	 */
	public final BorderPane getBorderPane() {
		return borderPane;
	}

	/**
	 * @param borderPane the borderPane to set
	 */
	public final void setBorderPane(BorderPane borderPane) {
		this.borderPane = borderPane;
	}
	
    /**
     * Initializes the root layout and tries 
     * to load the the 5 sections : top, left, right, center, bottom of the screen
     */
    public void initialization() {
        try {
        	title();
        	topRegion();
        	leftRegion();
        	rightRegion();
        	centerRegion();
        	bottomRegion();
        	updatedReceptor();
        	
        	// add components to regions of BorderPane 
            this.borderPane.setTop(this.topRegion);
            this.borderPane.setLeft(this.leftRegion);
            this.borderPane.setRight(this.rightRegion);
            this.borderPane.setCenter(this.centerRegion);
            this.borderPane.setBottom(this.bottomRegion);

        } catch (Exception e) {
        	log.error("Cause : " + e.getCause() + ", Message : " + e.getMessage() + ", Stack Trace : " +e.getStackTrace());
        } 
    }

    private void title(){
    	this.stage.setTitle(TITLE);
        final Thread thread = Thread.currentThread();
        final ClassLoader classLoader = thread.getContextClassLoader();
        final InputStream inputStream = classLoader.getResourceAsStream(RICE_COOKER_ICON); 
        final Image image = new Image(inputStream, 350, 300, true, true);
        this.stage.getIcons().add(image);
    }

    private void topRegion(){
    	final MenuBar menuBar = new MenuBar();
    	menuBar.setStyle("-fx-background-color: purple;");
    	
    	this.siteInternetETSMenuItem = new MenuItem(SITE_INTERNET_ETS_MENU_ITEM, null);
    	this.siteInternetETSMenuItem.setMnemonicParsing(true);
    	final KeyCodeCombination keyCodeCombinationETS = new KeyCodeCombination(KeyCode.E, KeyCombination.CONTROL_DOWN);
    	this.siteInternetETSMenuItem.setAccelerator(keyCodeCombinationETS);
    	siteInternetETSMenuItem.setStyle("-fx-text-fill: red; -fx-font: 13 arial;");
    	siteInternetETSMenuItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				audioMediaPlayer.pause(); 
				audioMediaPlayer.open(ETS_URL);  
    			log.info("Site Internet ETS Menu Item clic");
    			audioMediaPlayer.play();
			}
		});
    	
    	this.mgl805MenuItem = new MenuItem(MGL805_MENU_ITEM, null);
    	this.mgl805MenuItem.setMnemonicParsing(true);
    	final KeyCodeCombination keyCodeCombinationMGL805 = new KeyCodeCombination(KeyCode.M, KeyCombination.CONTROL_DOWN);
    	this.mgl805MenuItem.setAccelerator(keyCodeCombinationMGL805);
    	this.mgl805MenuItem.setStyle("-fx-text-fill: red; -fx-font: 13 arial;");
    	this.mgl805MenuItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				audioMediaPlayer.pause(); 
				audioMediaPlayer.open(MGL805_URL);
    			log.info("mgl 805 Menu Item clic");
    			audioMediaPlayer.play();
			}
		});
    	
    	this.siteInternetProjetRiceCookerMenuItem = new MenuItem(SITE_INTERNET_PROJET_RICE_COOKER_MENU_ITEM, null);
    	this.siteInternetProjetRiceCookerMenuItem.setMnemonicParsing(true);
    	final KeyCodeCombination keyCodeCombinationSiteInternetProjetRiceCooker = new KeyCodeCombination(KeyCode.P, KeyCombination.CONTROL_DOWN);
    	this.siteInternetProjetRiceCookerMenuItem.setAccelerator(keyCodeCombinationSiteInternetProjetRiceCooker);
    	this.siteInternetProjetRiceCookerMenuItem.setStyle("-fx-text-fill: red; -fx-font: 13 arial;");
    	this.siteInternetProjetRiceCookerMenuItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				audioMediaPlayer.pause(); 
				audioMediaPlayer.open(PROJET_RICE_COOKER_URL);
    			log.info("Site Internet Projet Rice Cooker Menu Item clic");
    			audioMediaPlayer.play();
			}
		});
    	
    	final Menu menuETS = new Menu(ETS_MENU);
    	menuETS.setStyle("-fx-background-color: green; -fx-text-fill: red; -fx-font: 15 arial;");
    	
    	menuETS.getItems().add(this.siteInternetETSMenuItem);
    	menuETS.getItems().add(this.mgl805MenuItem);
    	menuETS.getItems().add(this.siteInternetProjetRiceCookerMenuItem);
    	
    	this.siteInternetUQAMMenuItem = new MenuItem(SITE_INTERNET_UQAM_MENU_ITEM, null);
    	this.mgl805MenuItem.setMnemonicParsing(true);
    	final KeyCodeCombination keyCodeCombinationUQAM = new KeyCodeCombination(KeyCode.U, KeyCombination.CONTROL_DOWN);
    	this.siteInternetUQAMMenuItem.setAccelerator(keyCodeCombinationUQAM);
    	this.siteInternetUQAMMenuItem.setStyle("-fx-text-fill: red; -fx-font: 13 arial;");
    	this.siteInternetUQAMMenuItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				audioMediaPlayer.pause(); 
				audioMediaPlayer.open(UQAM_URL);
    			log.info("Site Internet UQAM Menu Item clic");
    			audioMediaPlayer.play();
			}
		});
    	
    	final Menu menuUQAM = new Menu(UQAM_MENU);
    	menuUQAM.setStyle("-fx-background-color: darkGray; -fx-text-fill: red; -fx-font: 15 arial;"); 
    	
    	menuUQAM.getItems().add(this.siteInternetUQAMMenuItem);
    	
    	this.manuelUtilisateurMenuItem = new MenuItem(MANUEL_UTILISATEUR_MENU_ITEM, null);
    	this.manuelUtilisateurMenuItem.setMnemonicParsing(true);
    	final KeyCodeCombination keyCodeCombinationAide = new KeyCodeCombination(KeyCode.A, KeyCombination.CONTROL_DOWN);
    	this.manuelUtilisateurMenuItem.setAccelerator(keyCodeCombinationAide);
    	this.manuelUtilisateurMenuItem.setStyle("-fx-text-fill: red; -fx-font: 13 arial;");
    	this.manuelUtilisateurMenuItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				audioMediaPlayer.pause(); 
				audioMediaPlayer.open(MANUEL_UTILISATEUR_URL);
    			log.info("Manuel de l'utilisateur Menu Item clic");
    			audioMediaPlayer.play();
			}
		});
    	
    	final Menu menuAide = new Menu(AIDE_MENU);
    	menuAide.setStyle("-fx-background-color: orange; -fx-text-fill: red; -fx-font: 15 arial;");
    	
    	menuAide.getItems().add(this.manuelUtilisateurMenuItem);
    	
    	this.alexisLeperlierMenuItem = new MenuItem(ALEXIS_LEPERLIER_MENU_ITEM, null);
    	this.alexisLeperlierMenuItem.setMnemonicParsing(true);
    	final KeyCodeCombination keyCodeCombinationAlexisLeperlier = new KeyCodeCombination(KeyCode.L, KeyCombination.CONTROL_DOWN);
    	this.alexisLeperlierMenuItem.setAccelerator(keyCodeCombinationAlexisLeperlier);
    	this.alexisLeperlierMenuItem.setStyle("-fx-text-fill: red; -fx-font: 13 arial;");
    	this.alexisLeperlierMenuItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				audioMediaPlayer.pause(); 
				audioMediaPlayer.open(ALEXIS_LEPERLIER_URL);
    			log.info("Alexis Leperlier Menu Item clic");
    			audioMediaPlayer.play();
			}
		});
    	
    	this.mahaKharbechMenuItem = new MenuItem(MAHA_KHARBECH_MENU_ITEM, null);
    	this.mahaKharbechMenuItem.setMnemonicParsing(true);
    	final KeyCodeCombination keyCodeCombinationMahaKharbech = new KeyCodeCombination(KeyCode.K, KeyCombination.CONTROL_DOWN);
    	this.mahaKharbechMenuItem.setAccelerator(keyCodeCombinationMahaKharbech);
    	this.mahaKharbechMenuItem.setStyle("-fx-text-fill: red; -fx-font: 13 arial;");
    	this.mahaKharbechMenuItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				audioMediaPlayer.pause(); 
				audioMediaPlayer.open(MAHA_KHARBECH_URL);
    			log.info("Maha Kharbech Menu Item clic");
    			audioMediaPlayer.play();
			}
		});
    	
    	this.marwaKharbechMenuItem = new MenuItem(MARWA_KHARBECH_MENU_ITEM, null);
    	this.marwaKharbechMenuItem.setMnemonicParsing(true);
    	final KeyCodeCombination keyCodeCombinationMarwaKharbech = new KeyCodeCombination(KeyCode.H, KeyCombination.CONTROL_DOWN);
    	this.marwaKharbechMenuItem.setAccelerator(keyCodeCombinationMarwaKharbech);
    	this.marwaKharbechMenuItem.setStyle("-fx-text-fill: red; -fx-font: 13 arial;");
    	this.marwaKharbechMenuItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				audioMediaPlayer.pause(); 
				audioMediaPlayer.open(MARWA_KHARBECH_URL);
    			log.info("Marwa Kharbech Menu Item clic");
    			audioMediaPlayer.play();
			}
		});
    	
    	this.sylvoseAllogoMenuItem = new MenuItem(SYLVOSE_ALLOGO_MENU_ITEM, null);
    	this.sylvoseAllogoMenuItem.setMnemonicParsing(true);
    	final KeyCodeCombination keyCodeCombinationSylvoseAllogo = new KeyCodeCombination(KeyCode.S, KeyCombination.CONTROL_DOWN);
    	this.sylvoseAllogoMenuItem.setAccelerator(keyCodeCombinationSylvoseAllogo);
    	this.sylvoseAllogoMenuItem.setStyle("-fx-text-fill: red; -fx-font: 13 arial;");
    	this.sylvoseAllogoMenuItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				audioMediaPlayer.pause(); 
				audioMediaPlayer.open(SYLVOSE_ALLOGO_URL);
    			log.info("Sylvose Allogo Menu Item clic");
    			audioMediaPlayer.play();
			}
		});
    	
    	final Menu menuApropos = new Menu(APROPOS_MENU);
    	menuApropos.setStyle("-fx-background-color: red; -fx-text-fill: red; -fx-font: 15 arial;");
    	
    	menuApropos.getItems().add(this.alexisLeperlierMenuItem);
    	menuApropos.getItems().add(this.mahaKharbechMenuItem);
    	menuApropos.getItems().add(this.marwaKharbechMenuItem);
    	menuApropos.getItems().add(this.sylvoseAllogoMenuItem);
    	
    	this.fermerApplicationMenuItem = new MenuItem(FERMER_APPLICATION_MENU_ITEM, null);
    	this.fermerApplicationMenuItem.setMnemonicParsing(true);
    	final KeyCodeCombination keyCodeCombinationQuitter = new KeyCodeCombination(KeyCode.Q, KeyCombination.CONTROL_DOWN);
    	this.fermerApplicationMenuItem.setAccelerator(keyCodeCombinationQuitter);
    	this.fermerApplicationMenuItem.setStyle("-fx-text-fill: red; -fx-font: 13 arial;");
    	this.fermerApplicationMenuItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				audioMediaPlayer.close();
    			log.info("fermer Application Menu Item clic");
    			Platform.exit();
			}
		});
    	
    	final Menu menuQuitter = new Menu(QUITTER_MENU);
    	menuQuitter.setStyle("-fx-background-color: blue; -fx-text-fill: red; -fx-font: 15 arial;");
    	
    	menuQuitter.getItems().add(this.fermerApplicationMenuItem);
    	
    	menuBar.getMenus().add(menuETS);
    	menuBar.getMenus().add(menuUQAM);
    	menuBar.getMenus().add(menuApropos);
    	menuBar.getMenus().add(menuAide);
    	menuBar.getMenus().add(menuQuitter);
    	
    	this.topRegion = new HBox(menuBar);
    	this.topRegion.setAlignment(Pos.CENTER);
		this.topRegion.setStyle("-fx-background-color: purple;");
    }
   
    private void leftRegion(){
    	this.etatCuiseurText = new Text();
    	
    	this.btnCookingOnPower = new Button(LABEL_BTN_ON_POWER);
    	this.btnCookingOnPower.setStyle("-fx-background-color: maroon; -fx-text-fill: white; -fx-font: 20 arial;");
    	this.btnCookingOnPower.setMaxWidth(Double.MAX_VALUE);
    	this.btnCookingOnPower.setMaxHeight(Double.MAX_VALUE);
    	this.btnCookingOnPower.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				final OnPowerController onPowerController = new OnPowerController(receptor);
    			broker.setOnPowerController(onPowerController);
    			broker.onPowerControllerInvoker();
    			updatedEtatCuiseurText();
    			setEtatCuiseurString(receptor.getEtatCuiseurString());
			}
		});
    	this.btnCookingOnPower.setOnMouseEntered(actionEvent -> this.btnCookingOnPower.setStyle("-fx-background-color: olive; -fx-text-fill: red; -fx-font: 20 arial;"));
    	this.btnCookingOnPower.setOnMouseExited(actionEvent -> this.btnCookingOnPower.setStyle("-fx-background-color: maroon; -fx-text-fill: white; -fx-font: 20 arial;"));
    	this.btnCookingOnPower.setOnMouseClicked(actionEvent -> {
    		updatedCenterRegion(this.btnCookingOnPower);
    	});
    	
		this.btnCookingOffPower = new Button(LABEL_BTN_OFF_POWER);
		this.btnCookingOffPower.setStyle("-fx-background-color: magenta; -fx-text-fill: white; -fx-font: 20 arial;");
    	this.btnCookingOffPower.setMaxWidth(Double.MAX_VALUE);
    	this.btnCookingOffPower.setMaxHeight(Double.MAX_VALUE);
    	this.btnCookingOffPower.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				final OffPowerController offPowerController = new OffPowerController(receptor);
    			broker.setOffPowerController(offPowerController);
    			broker.offPowerControllerInvoker();
    			updatedEtatCuiseurText();
    			setEtatCuiseurString(receptor.getEtatCuiseurString());
			}
		});
		this.btnCookingOffPower.setOnMouseEntered(actionEvent -> this.btnCookingOffPower.setStyle("-fx-background-color: olive; -fx-text-fill: red; -fx-font: 20 arial;"));
    	this.btnCookingOffPower.setOnMouseExited(actionEvent -> this.btnCookingOffPower.setStyle("-fx-background-color: magenta; -fx-text-fill: white; -fx-font: 20 arial;"));
    	this.btnCookingOffPower.setOnMouseClicked(actionEvent -> {
    		updatedCenterRegion(this.btnCookingOffPower);
    	});
    	
		this.btnCookingThai = new Button(LABEL_BTN_COOKING_THAI);
		this.btnCookingThai.setStyle("-fx-background-color: blue; -fx-text-fill: white; -fx-font: 20 arial;");
    	this.btnCookingThai.setMaxWidth(Double.MAX_VALUE);
    	this.btnCookingThai.setMaxHeight(Double.MAX_VALUE);
    	this.btnCookingThai.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				final CookingThaiController cookingThaiController = new CookingThaiController(receptor);
    			broker.setCookingThaiController(cookingThaiController);
    			broker.cookingThaiControllerInvoker();
    			updatedEtatCuiseurText();
    			setEtatCuiseurString(receptor.getEtatCuiseurString());
			}
		});
		this.btnCookingThai.setOnMouseEntered(actionEvent -> this.btnCookingThai.setStyle("-fx-background-color: olive; -fx-text-fill: red; -fx-font: 20 arial;"));
    	this.btnCookingThai.setOnMouseExited(actionEvent -> this.btnCookingThai.setStyle("-fx-background-color: blue; -fx-text-fill: white; -fx-font: 20 arial;"));
    	this.btnCookingThai.setOnMouseClicked(actionEvent -> {
    		updatedCenterRegion(this.btnCookingThai);
    	});
    	
		this.btnCookingSlow = new Button(LABEL_BTN_COOKING_SLOW);
		this.btnCookingSlow.setStyle("-fx-background-color: gray; -fx-text-fill: white; -fx-font: 20 arial;");
    	this.btnCookingSlow.setMaxWidth(Double.MAX_VALUE);
    	this.btnCookingSlow.setMaxHeight(Double.MAX_VALUE);
    	this.btnCookingSlow.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				final CookingSlowController cookingSlowController = new CookingSlowController(receptor);
    			broker.setCookingSlowController(cookingSlowController);
    			broker.cookingSlowControllerInvoker();
    			updatedEtatCuiseurText();
    			setEtatCuiseurString(receptor.getEtatCuiseurString());
			}
		});
		this.btnCookingSlow.setOnMouseEntered(actionEvent -> this.btnCookingSlow.setStyle("-fx-background-color: olive; -fx-text-fill: red; -fx-font: 20 arial;"));
    	this.btnCookingSlow.setOnMouseExited(actionEvent -> this.btnCookingSlow.setStyle("-fx-background-color: gray; -fx-text-fill: white; -fx-font: 20 arial;"));
    	this.btnCookingSlow.setOnMouseClicked(actionEvent -> {
    		updatedCenterRegion(this.btnCookingSlow);
    	});
    	
		this.btnCookingNormal = new Button(LABEL_BTN_COOKING_NORMAL);
		this.btnCookingNormal.setStyle("-fx-background-color: cyan; -fx-text-fill: white; -fx-font: 20 arial;");
    	this.btnCookingNormal.setMaxWidth(Double.MAX_VALUE);
    	this.btnCookingNormal.setMaxHeight(Double.MAX_VALUE);
    	this.btnCookingNormal.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				final CookingNormalController cookingNormalController = new CookingNormalController(receptor);
    			broker.setCookingNormalController(cookingNormalController);
    			broker.cookingNormalControllerInvoker();
    			updatedEtatCuiseurText();
    			setEtatCuiseurString(receptor.getEtatCuiseurString());
			}
		});
		this.btnCookingNormal.setOnMouseEntered(actionEvent -> this.btnCookingNormal.setStyle("-fx-background-color: olive; -fx-text-fill: red; -fx-font: 20 arial;"));
    	this.btnCookingNormal.setOnMouseExited(actionEvent -> this.btnCookingNormal.setStyle("-fx-background-color: cyan; -fx-text-fill: white; -fx-font: 20 arial;"));
    	this.btnCookingNormal.setOnMouseClicked(actionEvent -> {
    		updatedCenterRegion(this.btnCookingNormal);
    	});
    	
		this.btnCookingFast = new Button(LABEL_BTN_COOKING_FAST);
		this.btnCookingFast.setStyle("-fx-background-color: orange; -fx-text-fill: white; -fx-font: 20 arial;");
    	this.btnCookingFast.setMaxWidth(Double.MAX_VALUE);
    	this.btnCookingFast.setMaxHeight(Double.MAX_VALUE);
    	this.btnCookingFast.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				final CookingFastController cookingFastController = new CookingFastController(receptor);
    			broker.setCookingFastController(cookingFastController);
    			broker.cookingFastControllerInvoker();
    			updatedEtatCuiseurText();
    			setEtatCuiseurString(receptor.getEtatCuiseurString());
			}
		});
		this.btnCookingFast.setOnMouseEntered(actionEvent -> this.btnCookingFast.setStyle("-fx-background-color: olive; -fx-text-fill: red; -fx-font: 20 arial;"));
    	this.btnCookingFast.setOnMouseExited(actionEvent -> this.btnCookingFast.setStyle("-fx-background-color: orange; -fx-text-fill: white; -fx-font: 20 arial;"));
    	this.btnCookingFast.setOnMouseClicked(actionEvent -> {
    		updatedCenterRegion(this.btnCookingFast);
    	});
    	
		this.btnCookingReheat = new Button(LABEL_BTN_REHEAT);
		this.btnCookingReheat.setStyle("-fx-background-color: yellow; -fx-text-fill: white; -fx-font: 20 arial;");
    	this.btnCookingReheat.setMaxWidth(Double.MAX_VALUE);
    	this.btnCookingReheat.setMaxHeight(Double.MAX_VALUE);
    	this.btnCookingReheat.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				final ReheatController reheatController = new ReheatController(receptor);
    			broker.setReheatController(reheatController);
    			broker.reheatControllerInvoker();
    			updatedEtatCuiseurText();
    			setEtatCuiseurString(receptor.getEtatCuiseurString());
			}
		});
		this.btnCookingReheat.setOnMouseEntered(actionEvent -> this.btnCookingReheat.setStyle("-fx-background-color: olive; -fx-text-fill: red; -fx-font: 20 arial;"));
    	this.btnCookingReheat.setOnMouseExited(actionEvent -> this.btnCookingReheat.setStyle("-fx-background-color: yellow; -fx-text-fill: white; -fx-font: 20 arial;"));
    	this.btnCookingReheat.setOnMouseClicked(actionEvent -> {
    		updatedCenterRegion(this.btnCookingReheat);
    	});
    	
		this.btnCookingRiceSoaking = new Button(LABEL_BTN_ON_OFF_RICE_SOAKING);
		this.btnCookingRiceSoaking.setStyle("-fx-background-color: green; -fx-text-fill: white; -fx-font: 20 arial;");
    	this.btnCookingRiceSoaking.setMaxWidth(Double.MAX_VALUE);
    	this.btnCookingRiceSoaking.setMaxHeight(Double.MAX_VALUE);
    	this.btnCookingRiceSoaking.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				final RiceSoakingController riceSoakingController = new RiceSoakingController(receptor);
    			broker.setRiceSoakingController(riceSoakingController);
    			broker.riceSoakingControllerInvoker();
    			updatedEtatCuiseurText();
    			setEtatCuiseurString(receptor.getEtatCuiseurString());
			}
		});
		this.btnCookingRiceSoaking.setOnMouseEntered(actionEvent -> this.btnCookingRiceSoaking.setStyle("-fx-background-color: olive; -fx-text-fill: red; -fx-font: 20 arial;"));
    	this.btnCookingRiceSoaking.setOnMouseExited(actionEvent -> this.btnCookingRiceSoaking.setStyle("-fx-background-color: green; -fx-text-fill: white; -fx-font: 20 arial;"));
    	this.btnCookingRiceSoaking.setOnMouseClicked(actionEvent -> {
    		updatedCenterRegion(this.btnCookingRiceSoaking);
    	});
    	
    	
		this.leftRegion = new VBox (this.btnCookingOnPower, this.btnCookingOffPower, this.btnCookingThai, this.btnCookingSlow, this.btnCookingNormal, this.btnCookingFast, this.btnCookingRiceSoaking, this.btnCookingReheat);
		this.leftRegion.setSpacing(10);
		final Insets insets = new Insets(10);
		this.leftRegion.setPadding(insets);
		this.leftRegion.setStyle("-fx-background-color: black;");
    }
    
    private void centerRegion(){
    	try {
    		final Thread thread = Thread.currentThread();
            final ClassLoader classLoader = thread.getContextClassLoader();
            final InputStream inputStream = classLoader.getResourceAsStream(RICE_COOKER_BACK_GROUND); 
            
            final double requestedWidth = SCREEN_WIDTH - 415;
            final double requestedHeight = SCREEN_HEIGHT - 120;
            final boolean preserveRatio = false;
            final boolean smooth = true;
            
            final Image image = new Image(inputStream, requestedWidth, requestedHeight, preserveRatio, smooth);
            this.imageView = new ImageView(image);
        	
            this.centerRegion = new VBox();
            
            this.centerRegion.setAlignment(Pos.CENTER);
    		this.centerRegion.setStyle("-fx-background-color: teal;");
    		this.centerRegion.getChildren().add(this.imageView);
    		
		} catch (Exception e) {
			log.error("Cause : " + e.getCause() + ", Message : " + e.getMessage() + ", Stack Trace : " +e.getStackTrace());
		}
    }
    
    private void setRectangle(Rectangle rectangle){
    	if (rectangle == null)
			throw new IllegalArgumentException();
	
    	rectangle.setX(500);
    	rectangle.setY(100);
    	rectangle.setWidth(90);
    	rectangle.setHeight(30);
    	rectangle.setFill(Color.GHOSTWHITE);
    	rectangle.setStroke(Color.BLACK);
    }
    
    private void setHBox(HBox hBox){
    	if (hBox == null)
			throw new IllegalArgumentException();
	
    	final Insets insets = new Insets(5);
    	hBox.setSpacing(10);
    	hBox.setPadding(insets);
    }
    
    private void rightRegion(){
    	this.cuissonRectangle = new Rectangle();
    	setRectangle(this.cuissonRectangle);
    	this.cuissonLabel = new Label(CUISSON);
    	this.cuissonLabel.setStyle(STYLE);
    	this.cuissonHbox = new HBox(this.cuissonRectangle, this.cuissonLabel);
    	setHBox(this.cuissonHbox);
       
    	this.trempageRectangle = new Rectangle();
    	setRectangle(this.trempageRectangle);
    	this.tremapgeLabel = new Label(TREMPAGE);
    	this.tremapgeLabel.setStyle(STYLE);
    	this.trempageHbox = new HBox(this.trempageRectangle, this.tremapgeLabel);
    	setHBox(this.trempageHbox);
     
    	this.rechaudRectangle = new Rectangle();
    	setRectangle(this.rechaudRectangle);
    	this.rechaudLabel = new Label(RECHAUFFAGE);
    	this.rechaudLabel.setStyle(STYLE);
    	this.rechaudHbox = new HBox(this.rechaudRectangle, this.rechaudLabel);
    	setHBox(this.rechaudHbox);
     
    	this.rightRegion = new VBox(this.cuissonHbox, this.trempageHbox, this.rechaudHbox);
    	this.rightRegion.setSpacing(10);
    	final Insets insets = new Insets(10);
		this.rightRegion.setPadding(insets);
		this.rightRegion.setStyle("-fx-background-color: cyan;");
    }
    
    private void bottomRegion(){
        
        final StringBuffer stringBuffer = new StringBuffer();

        // © UQÀM/ETS – Propriété de MGL805 : Vérification et assurance qualité de logiciels – confidentiel – All rights reserved
        final String firstRow = "\u00A9 UQ\u00C0M/ETS – Propri\u00E9t\u00E9 de MGL805 : V\u00E9rification et assurance qualit\u00E9 de logiciels – confidentiel – All rights reserved";
        stringBuffer.append(firstRow);
        stringBuffer.append("\n");
        
        final DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.FRENCH);
        final Calendar calendar = Calendar.getInstance();
        final Date date = calendar.getTime();
        final String string = dateFormat.format(date);
        stringBuffer.append(string);
        stringBuffer.append("\n");
        
        // L'École de Technologie Supérieure, 1100 Rue Notre-Dame Ouest, Montréal, QC H3C 1K3 Canada
        final String secondRow = "L'\u00C9cole de Technologie Sup\u00E9rieure, 1100 Rue Notre-Dame Ouest, Montréal, QC H3C 1K3 Canada";
        stringBuffer.append(secondRow);
        
        final String FOOTER = stringBuffer.toString();
        
        this.etsUqamLabel = new Label(FOOTER);
        this.etsUqamLabel.setStyle("-fx-text-fill: white; -fx-font: bold 17 arial;");
        this.etsUqamLabel.setTextAlignment(TextAlignment.LEFT);
        
        this.bottomRegion = new HBox(etsUqamLabel);
		this.bottomRegion.setSpacing(10);
		final Insets insets = new Insets(10);
		this.bottomRegion.setPadding(insets);
		this.bottomRegion.setStyle("-fx-background-color: red;");
    }
    
	/**
	 * @return the etatCuiseurString
	 */
	public String getEtatCuiseurString() {
		return etatCuiseurString;
	}

	/**
	 * @param etatCuiseurString the etatCuiseurString to set
	 */
	public void setEtatCuiseurString(String etatCuiseurString) {
		this.etatCuiseurString = etatCuiseurString;
	}
	
    private void updatedEtatCuiseurText(){
    	if (this.centerRegion != null)
    		this.centerRegion.getChildren().clear();
    	else
    		this.centerRegion = new VBox();
		
		final DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetY(3.0f);
		dropShadow.setColor(Color.color(0.4f, 0.4f, 0.4f));
		
		this.etatCuiseurText.setEffect(dropShadow);
		this.etatCuiseurText.setCache(true);
		final Font font = Font.font ("arial", FontWeight.BOLD, 32);
		this.etatCuiseurText.setFont(font);
		this.etatCuiseurText.setFill(Color.RED);

		this.centerRegion.getChildren().add(this.etatCuiseurText);
		this.centerRegion.setAlignment(Pos.CENTER);
    }
    
    private void updatedReceptor(){
    	this.receptor.setEtatCuiseurText(this.etatCuiseurText);
    	this.receptor.setTrempageRectangle(this.trempageRectangle);
    	this.receptor.setRechaudRectangle(this.rechaudRectangle);
    	this.receptor.setCuissonRectangle(this.cuissonRectangle);
    	this.receptor.setAudioMediaPlayer(this.audioMediaPlayer);
    	
    	setEtatCuiseurString(this.receptor.getEtatCuiseurString());
    }
    
	private void updatedCenterRegion(Button button){
    	if (button == null)
			throw new NullPointerException();
    	
    	if (this.btnCookingOffPower.equals(button) && 
    		this.btnCookingOffPower.getText().equalsIgnoreCase(button.getText()) &&
    		button.getText().equalsIgnoreCase(LABEL_BTN_OFF_POWER) &&
    		this.etatCuiseurString.equalsIgnoreCase(OFF_POWER)) {
    	
    		this.btnCookingThai.setDisable(false);
    		this.btnCookingSlow.setDisable(false);
    		this.btnCookingNormal.setDisable(false);
    		this.btnCookingFast.setDisable(false);
    		this.btnCookingReheat.setDisable(false);
    		this.btnCookingRiceSoaking.setDisable(false);
    		this.btnCookingOnPower.setDisable(false);
    	}
    	else if (StringUtils.isNotBlank(this.etatCuiseurString)) {
    		
	    	if (!(this.btnCookingOnPower.equals(button) && 
        		  this.btnCookingOnPower.getText().equalsIgnoreCase(button.getText()) &&
        		  button.getText().equalsIgnoreCase(LABEL_BTN_ON_POWER) &&
        		  this.etatCuiseurString.equalsIgnoreCase(ON_POWER))) {
		    	
				this.btnCookingThai.setDisable(true);
				this.btnCookingSlow.setDisable(true);
				this.btnCookingNormal.setDisable(true);
				this.btnCookingFast.setDisable(true);
				this.btnCookingReheat.setDisable(true);
				this.btnCookingRiceSoaking.setDisable(true);
				
				if ((this.btnCookingOnPower.equals(button) && this.btnCookingOnPower.getText().equalsIgnoreCase(button.getText())) ||
				    (this.btnCookingReheat.equals(button) && this.btnCookingReheat.getText().equalsIgnoreCase(button.getText())) ||
					(this.btnCookingRiceSoaking.equals(button) && this.btnCookingRiceSoaking.getText().equalsIgnoreCase(button.getText()))) {
					  
					 this.btnCookingOnPower.setDisable(true);
					 this.etatCuiseurText.setText(this.etatCuiseurText.getText() + MSG_EN_COURS);
		    	 }
		    }
		    
    	} else if (this.etatCuiseurString.equalsIgnoreCase(ON_POWER)) {
    		log.info("button : " +button);
    		log.info("button.getText() : " +button.getText());
    		log.info("this.etatCuiseurString : " +this.etatCuiseurString);
    		log.info("this.etatCuiseurText : " +this.etatCuiseurText);
    	}
	}
}