package ca.ets.mgl805.hiver2016.ricecooker.view;

import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_COOKING_FAST;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_COOKING_NORMAL;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_COOKING_SLOW;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_COOKING_THAI;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_ON_OFF_POWER;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_ON_OFF_RICE_SOAKING;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_REHEAT;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.NO_BUTTON_CLICKED;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.NO_CLICKING;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.PLEASE_CLICK_ON_A_BUTTON_IN_THE_LEFT_SIDE;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.RICE_COOKER_ICON;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.STYLE;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.TITLE;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.height;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.width;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 * Main - Main Application for the Rice Cooker Application
 * <a href="mailto:asylvose@yahoo.fr">Sylvose ALLOGO</a>
 * @version $Revision: 1.1 $
 * @since 14 February 2016 09:00:00
 */
public class Main extends Application {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    private BorderPane borderPane;
    
    private Stage stage;
    
    private Button btnCookingThai;
    private Button btnCookingSlow;
    private Button btnCookingNormal;
    private Button btnCookingFast;
    private Button btnCookingOnOffPower;
    private Button btnCookingOnOffRiceSoaking;
    private Button btnCookingReheat;
    
    private Text text;
    
    // the 3 sections : left, center, bottom of the screen
    private VBox left;
    private HBox center;
    private HBox bottom;

   
    /**
     * Initializes the root layout and tries 
     * to load the 3 sections : left, center, bottom of the screen
     */
    @Override 
    public void init() throws Exception {
    	
        try {
        	this.btnCookingThai = new Button(LABEL_BTN_COOKING_THAI);
            this.btnCookingThai.setStyle(STYLE);
            this.btnCookingThai.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent event) {
                	handleButtonAction(event);
                }
            });
            
            this.btnCookingSlow = new Button(LABEL_BTN_COOKING_SLOW);
            this.btnCookingSlow.setStyle(STYLE);
            this.btnCookingSlow.setOnAction(new EventHandler<ActionEvent>() {
            	public void handle(ActionEvent event) {
                	handleButtonAction(event);
                }
            });
            
            this.btnCookingNormal = new Button(LABEL_BTN_COOKING_NORMAL);
            this.btnCookingNormal.setStyle(STYLE);
            this.btnCookingNormal.setOnAction(new EventHandler<ActionEvent>() {
            	public void handle(ActionEvent event) {
                	handleButtonAction(event);
                }
            });
            
            this.btnCookingFast = new Button(LABEL_BTN_COOKING_FAST);
            this.btnCookingFast.setStyle(STYLE);
            this.btnCookingFast.setOnAction(new EventHandler<ActionEvent>() {
            	public void handle(ActionEvent event) {
                	handleButtonAction(event);
                }
            });
            
            this.btnCookingOnOffPower = new Button(LABEL_BTN_ON_OFF_POWER);
            this.btnCookingOnOffPower.setStyle(STYLE);
            this.btnCookingOnOffPower.setOnAction(new EventHandler<ActionEvent>() {
            	public void handle(ActionEvent event) {
                	handleButtonAction(event);
                }
            });
            
            this.btnCookingOnOffRiceSoaking = new Button(LABEL_BTN_ON_OFF_RICE_SOAKING);
            this.btnCookingOnOffRiceSoaking.setStyle(STYLE);
            this.btnCookingOnOffRiceSoaking.setOnAction(new EventHandler<ActionEvent>() {
            	public void handle(ActionEvent event) {
                	handleButtonAction(event);
                }
            });
            
            this.btnCookingReheat = new Button(LABEL_BTN_REHEAT);
            this.btnCookingReheat.setStyle(STYLE);
            this.btnCookingReheat.setOnAction(new EventHandler<ActionEvent>() {
            	public void handle(ActionEvent event) {
                	handleButtonAction(event);
                }
            });

            
            this.stage.setTitle(TITLE);
            final Image image = new Image(RICE_COOKER_ICON);
            this.stage.getIcons().add(image);
            
            
            left = new VBox(btnCookingOnOffPower, btnCookingThai, btnCookingSlow, btnCookingNormal, btnCookingFast, btnCookingOnOffRiceSoaking, btnCookingReheat);
            left.setSpacing(10);
            left.setPadding(new Insets(20));
            
            
            center = new HBox();
            
	        
            
            final StringBuffer stringBuffer = new StringBuffer();
            
            /*
             * © = \u00A9
             * À = \u00C0
             * é = \u00E9
             * É = \u00C9 
             */
            
            // © UQÀM/ETS – Propriété de MGL805 : Vérification et assurance qualité de logiciels – confidentiel – All rights reserved
            final String firstRow = "\u00A9 UQ\u00C0M/ETS – Propri\u00E9t\u00E9 de MGL805 : V\u00E9rification et assurance qualit\u00E9 de logiciels – confidentiel – All rights reserved";
            stringBuffer.append(firstRow);
            stringBuffer.append("\n");
            
            final DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.getDefault());
            dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            final Calendar calendar = Calendar.getInstance();
            final Date date = calendar.getTime();
            final String string = dateFormat.format(date);
            stringBuffer.append(string);
            stringBuffer.append("\n");
            
            // L'École de Technologie Supérieure, 1100 Rue Notre-Dame Ouest, Montréal, QC H3C 1K3 Canada
            final String secondRow = "L'\u00C9cole de Technologie Sup\u00E9rieure, 1100 Rue Notre-Dame Ouest, Montréal, QC H3C 1K3 Canada";
            stringBuffer.append(secondRow);
            
            final String FOOTER = stringBuffer.toString();
            
            text = new Text();
            text.setFont(Font.font("Times New Roman", 22));
            text.setWrappingWidth(200);
            text.setTextAlignment(TextAlignment.LEFT);
            text.setText(FOOTER);
            bottom = new HBox(text);
            
            
            
        	//add components to regions of BorderPane 
        	borderPane.setLeft(left);
        	borderPane.setCenter(center);
        	borderPane.setBottom(bottom);
        	
            // center the 3 sections left, center, bottom in the region
            BorderPane.setAlignment(left, Pos.CENTER);
            BorderPane.setAlignment(center, Pos.CENTER);
            BorderPane.setAlignment(bottom, Pos.CENTER);

        } catch (Exception e) {
        	log.error("Cause : " + e.getCause().getMessage() + ", Message : " + e.getMessage() + ", Stack Trace : " +e.getStackTrace());
        } 
    }
 

    @Override
    public void start(Stage stage) throws Exception {
    	this.stage = stage;
    	
        // create the BorderPane
    	borderPane = new BorderPane();
        borderPane.setPadding(new Insets(10));
        
        // Show the scene containing the root layout
        final Scene scene = new Scene(borderPane, width, height);
        stage.setScene(scene);
        stage.setWidth(width);
        stage.setHeight(height);

        init();
        
        stage.show();
    }
    
    public static void main(String[] args) throws Exception {
        launch(args);
    }
   
    private void handleButtonAction(ActionEvent event) {
    	
    	if (event.getSource() != null) {
    		if (event.getSource() == btnCookingOnOffPower)
    			log.info("Event : " + event.getSource().toString());
    		else if (event.getSource() == btnCookingThai)
    			log.info("Event : " + event.getSource().toString());
    		else if (event.getSource() == btnCookingSlow)
    			log.info("Event : " + event.getSource().toString());
    		else if (event.getSource() == btnCookingNormal)
    			log.info("Event : " + event.getSource().toString());
    		else if (event.getSource() == btnCookingFast)
    			log.info("Event : " + event.getSource().toString());
    		else if (event.getSource() == btnCookingOnOffRiceSoaking)
    			log.info("Event : " + event.getSource().toString());
    		else if (event.getSource() == btnCookingReheat)
    			log.info("Event : " + event.getSource().toString());
	    	
	    } else {
	        // Nothing cliked
	    	final Alert alert = new Alert(AlertType.WARNING);
	        alert.initOwner(this.stage);
	        alert.setTitle(NO_CLICKING);
	        alert.setHeaderText(NO_BUTTON_CLICKED);
	        alert.setContentText(PLEASE_CLICK_ON_A_BUTTON_IN_THE_LEFT_SIDE);
	        alert.showAndWait();
	    }
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
}