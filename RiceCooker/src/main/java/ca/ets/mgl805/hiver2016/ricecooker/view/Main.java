package ca.ets.mgl805.hiver2016.ricecooker.view;

import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_COOKING_FAST;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_COOKING_NORMAL;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_COOKING_SLOW;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_COOKING_THAI;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_OFF_POWER;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_ON_OFF_RICE_SOAKING;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_ON_POWER;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LABEL_BTN_REHEAT;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MSG_CLENTE;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MSG_CNORMALE;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MSG_CRAPIDE;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MSG_CTHAI;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MSG_RECHAUD;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MSG_TREMP;
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
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


/**
 * Main - Main Application for the Rice Cooker Application
 * <a href="mailto:asylvose@yahoo.fr">Sylvose ALLOGO</a>
 * <a href="mailto:maha.kharbech@gmail.com">Maha KHARBECH</a>
 * @version $Revision: 2.0 $
 * @since 02 March 2016 01:00:00
 */
public class Main extends Application {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    private BorderPane borderPane;
    
    private Stage stage;
    
    private Button btnCookingThai;
    private Button btnCookingSlow;
    private Button btnCookingNormal;
    private Button btnCookingFast;
    private Button btnCookingOnPower;
    private Button btnCookingOffPower;
    private Button btnCookingOnOffRiceSoaking;
    private Button btnCookingReheat;
    
    
    private Rectangle trempageRectangle;
    private Rectangle rechaudRectangle;
    private Rectangle cuissonRectangle;
    
    private Text text = new Text();
    private Text etatCuiseurText = new Text("");
    private TextArea messagesTextArea;
    
   //  private String messageEtatCuiseur="hello";
   //  private String
    
    
    private String etatCuiseur="";
    
    // the 3 sections : left, center, bottom of the screen
    private VBox left;
    private VBox center;
    private HBox bottom;
    
    private VBox right;
    private HBox cuissonHbox;
    private HBox trempageHbox;
    private HBox rechaudHbox;
    
    private Label cuissonLabel;
    private Label tremapgeLabel;
    private Label rechaudLabel;

   
    /**
     * Initializes the root layout and tries 
     * to load the 3 sections : left, center, bottom of the screen
     */
    @Override 
    public void init() throws Exception {
    	
        try {
        	this.btnCookingThai = new Button(LABEL_BTN_COOKING_THAI);
            this.btnCookingThai.setStyle(STYLE);
            this.btnCookingThai.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
             	 @Override public void handle(MouseEvent event) {
                     handleButtonAction(event);
             		     /*
                  		 trempageRectangle.setFill(Color.GHOSTWHITE);
                  		 rechaudRectangle.setFill(Color.GHOSTWHITE);
                  		 cuissonRectangle.setFill(Color.GHOSTWHITE);
                  		 etatCuiseur = "thai";
                  		 log.info("thai clic");
                  		 */
                }
            });
            
            this.btnCookingSlow = new Button(LABEL_BTN_COOKING_SLOW);
            this.btnCookingSlow.setStyle(STYLE);
            this.btnCookingSlow.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
             	 @Override public void handle(MouseEvent event) {
                     // 	handleButtonAction1(event);
                  		 trempageRectangle.setFill(Color.GHOSTWHITE);
                  		 rechaudRectangle.setFill(Color.GHOSTWHITE);
                  		 cuissonRectangle.setFill(Color.GHOSTWHITE);
                  		 etatCuiseur = "lent";
                	System.out.println("slow clic");
                }
            });
            
            this.btnCookingNormal = new Button(LABEL_BTN_COOKING_NORMAL);
            this.btnCookingNormal.setStyle(STYLE);
            this.btnCookingNormal.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
             	 @Override public void handle(MouseEvent event) {
                     // 	handleButtonAction1(event);
                  		 trempageRectangle.setFill(Color.GHOSTWHITE);
                  		 rechaudRectangle.setFill(Color.GHOSTWHITE);
                  		 cuissonRectangle.setFill(Color.GHOSTWHITE);
                  		 etatCuiseur = "normal";
                	System.out.println("normal clic");
                }
            });
            
            this.btnCookingFast = new Button(LABEL_BTN_COOKING_FAST);
            this.btnCookingFast.setStyle(STYLE);
            this.btnCookingFast.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
              	 @Override public void handle(MouseEvent event) {
                 // 	handleButtonAction1(event);
              		 trempageRectangle.setFill(Color.GHOSTWHITE);
              		 rechaudRectangle.setFill(Color.GHOSTWHITE);
              		 cuissonRectangle.setFill(Color.GHOSTWHITE);
              		 etatCuiseur = "rapide";
                	System.out.println("fast clic");
                }
            });
            
            
            
            
            this.btnCookingOnPower = new Button(LABEL_BTN_ON_POWER);
            this.btnCookingOnPower.setStyle(STYLE);
            this.btnCookingOnPower.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
           	 @Override public void handle(MouseEvent event) {
             	//handleButtonTrempageAction(event);
         		 trempageRectangle.setFill(Color.GHOSTWHITE);
         		 rechaudRectangle.setFill(Color.GHOSTWHITE);
         		 if (etatCuiseur != "" && etatCuiseur.equals("rapide")){
         		 cuissonRectangle.setFill(Color.RED);
        // 		 messagesTextArea.set
         		// messageEtatCuiseur = new Label(MSG_CRAPIDE);
         		// messageEtatCuiseur.setText(MSG_CRAPIDE);
           		 etatCuiseurText.setText(MSG_CRAPIDE);
         	//	 messageEtatCuiseur = MSG_CRAPIDE;
                  		 
         	//	 System.out.println(messageEtatCuiseur);
         		 }
         		if (etatCuiseur != "" && etatCuiseur.equals("lent")){
            		 cuissonRectangle.setFill(Color.RED);
            	//	 messageEtatCuiseur.setText(MSG_CLENTE);
            		 etatCuiseurText.setText(MSG_CLENTE);
        //    		 messageEtatCuiseur = MSG_CLENTE;
            	 }
         		if (etatCuiseur != "" && etatCuiseur.equals("normal")){
            		 cuissonRectangle.setFill(Color.RED);
            //		 messageEtatCuiseur.setText(MSG_CNORMALE);
       //     		 messageEtatCuiseur = MSG_CNORMALE;
            		 etatCuiseurText.setText(MSG_CNORMALE);
            	 }
         		if (etatCuiseur != "" && etatCuiseur.equals("thai")){
            		 cuissonRectangle.setFill(Color.RED);
            		// messageEtatCuiseur.setText(MSG_CTHAI);
        //    		 messageEtatCuiseur = MSG_CTHAI;
            		 etatCuiseurText.setText(MSG_CTHAI);
            	 }
                }
            });
            
            this.btnCookingOffPower = new Button(LABEL_BTN_OFF_POWER);
            this.btnCookingOffPower.setStyle(STYLE);
            this.btnCookingOffPower.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
           	 @Override public void handle(MouseEvent event) {
             	//handleButtonTrempageAction(event);
         		 trempageRectangle.setFill(Color.GHOSTWHITE);
         		 rechaudRectangle.setFill(Color.GHOSTWHITE);
         		 cuissonRectangle.setFill(Color.GHOSTWHITE);
                }
            });
            
            this.btnCookingOnOffRiceSoaking = new Button(LABEL_BTN_ON_OFF_RICE_SOAKING);
            this.btnCookingOnOffRiceSoaking.setStyle(STYLE);
            this.btnCookingOnOffRiceSoaking.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
            	 @Override public void handle(MouseEvent event) {
                	//handleButtonTrempageAction(event);
            		 etatCuiseur = "trempage";
            		 trempageRectangle.setFill(Color.GREEN);
            		 rechaudRectangle.setFill(Color.GHOSTWHITE);
            		 cuissonRectangle.setFill(Color.GHOSTWHITE);
            		 etatCuiseurText.setText(MSG_TREMP);
            		
                }
            });
            
            
            

         
            
            this.btnCookingReheat = new Button(LABEL_BTN_REHEAT);
            this.btnCookingReheat.setStyle(STYLE);
            this.btnCookingReheat.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
           	 @Override public void handle(MouseEvent event) {
             	//handleButtonTrempageAction(event);
           		 etatCuiseur = "rechaud";
         		 trempageRectangle.setFill(Color.GHOSTWHITE);
         		 rechaudRectangle.setFill(Color.YELLOW);
         		 cuissonRectangle.setFill(Color.GHOSTWHITE);
         		 etatCuiseurText.setText(MSG_RECHAUD);
                }
            });

            
      
            this.stage.setTitle(TITLE);
            final Image image = new Image(RICE_COOKER_ICON);
            this.stage.getIcons().add(image);
            
    //        Label aa = new Label("hahaha");
            left = new VBox (btnCookingOnPower,btnCookingOffPower, btnCookingThai, btnCookingSlow, btnCookingNormal, btnCookingFast, btnCookingOnOffRiceSoaking, btnCookingReheat);
            left.setSpacing(10);
            left.setPadding(new Insets(20));
            
            messagesTextArea= new TextArea();
            messagesTextArea.setPrefRowCount(10);
     //       messagesTextArea.setPrefColumnCount(500);
            messagesTextArea.setWrapText(true);
            messagesTextArea.setPrefWidth(450);
            messagesTextArea.setPrefHeight(500);
            messagesTextArea.setEditable(false);
          //  messagesTextArea.setMax(600);
         
            
       /*     GridPane.setHalignment(cssEditorFld, HPos.CENTER);
            gridpane.add(cssEditorFld, 0, 1);*/
            
  //          HBox diodesContainer = new HBox(cuissonBtn);
       //     HBox textAreaHbox = new HBox(messagesTextArea);
       //     messageEtatCuiseur= new Label();
            
     //       messageEtatCuiseur.setStyle(STYLE);
          //  center = new VBox(messageEtatCuiseur);
         //   center = new VBox(etatCuiseurText,messagesTextArea);
            center = new VBox(etatCuiseurText);
            center.setSpacing(10);
            center.setPadding(new Insets(20));

            
            
            cuissonLabel = new Label("Cuisson");
            tremapgeLabel = new Label("Trempage");
            rechaudLabel = new Label("Réchauffage");
            
            
            
        //    cuissonHbox = new HBox(cuissonLabel);
            
            cuissonRectangle = new Rectangle();
            cuissonRectangle.setX(500);
            cuissonRectangle.setY(100);
            cuissonRectangle.setWidth(90);
            cuissonRectangle.setHeight(30);
     //       cuissonRectangle.setFill(Color.RED);
            cuissonRectangle.setFill(Color.GHOSTWHITE);
            cuissonRectangle.setStroke(Color.BLACK);
            cuissonLabel.setStyle(STYLE);
            cuissonHbox = new HBox(cuissonRectangle,cuissonLabel);
            cuissonHbox.setSpacing(10);
            cuissonHbox.setPadding(new Insets(5));
           
            
            trempageRectangle = new Rectangle();
            trempageRectangle.setX(500);
            trempageRectangle.setY(100);
            trempageRectangle.setWidth(90);
            trempageRectangle.setHeight(30);
            trempageRectangle.setFill(Color.GHOSTWHITE);
            trempageRectangle.setStroke(Color.BLACK);
            tremapgeLabel.setStyle(STYLE);
            trempageHbox = new HBox(trempageRectangle,tremapgeLabel);
            trempageHbox.setSpacing(10);
            trempageHbox.setPadding(new Insets(5));
         
            rechaudRectangle = new Rectangle();
            rechaudRectangle.setX(500);
            rechaudRectangle.setY(100);
            rechaudRectangle.setWidth(90);
            rechaudRectangle.setHeight(30);
         //   rechaudRectangle.setFill(Color.YELLOW);
            rechaudRectangle.setFill(Color.GHOSTWHITE);
            rechaudRectangle.setStroke(Color.BLACK);
            rechaudLabel.setStyle(STYLE);
            rechaudHbox = new HBox(rechaudRectangle,rechaudLabel);
            rechaudHbox.setSpacing(10);
            rechaudHbox.setPadding(new Insets(5));
         
            
            right = new VBox(cuissonHbox,trempageHbox,rechaudHbox);
            right.setSpacing(10);
            right.setPadding(new Insets(20));
         
           
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
            text.setFont(Font.font("Times New Roman", 12));
       //     text.setWrappingWidth(200);
            text.setTextAlignment(TextAlignment.LEFT);
            text.setText(FOOTER);
            bottom = new HBox(text);
            
            
            
        	//add components to regions of BorderPane 
        	borderPane.setLeft(left);
        	borderPane.setCenter(center);
        	borderPane.setBottom(bottom);
        	borderPane.setRight(right);
        	
            // center the 3 sections left, center, bottom in the region
            BorderPane.setAlignment(left, Pos.CENTER);
            BorderPane.setAlignment(center, Pos.CENTER);
            BorderPane.setAlignment(bottom, Pos.CENTER);

        } catch (Exception e) {
        //	log.error("Cause : " + e.getCause().getMessage() + ", Message : " + e.getMessage() + ", Stack Trace : " +e.getStackTrace());
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
        stage.setMinWidth(width);
        stage.setMinHeight(height);

        init();
        
        stage.show();
    }
    
    public static void main(String[] args) throws Exception {
        launch(args);
    }
   
    private void handleButtonAction(MouseEvent event) {
    	
    	if (event.getSource() != null) {
    		if (event.getSource() == btnCookingOnPower)
    			log.info("Event : " + event.getSource().toString());
    		else if (event.getSource() == btnCookingThai){
             		 trempageRectangle.setFill(Color.GHOSTWHITE);
             		 rechaudRectangle.setFill(Color.GHOSTWHITE);
             		 cuissonRectangle.setFill(Color.GHOSTWHITE);
             		 etatCuiseur = "thai";
             		 log.info("thai clic");
            }
    		else if (event.getSource() == btnCookingSlow)
    			log.info("Event : " + event.getSource().toString());
    		else if (event.getSource() == btnCookingNormal)
    			log.info("Event : " + event.getSource().toString());
    		else if (event.getSource() == btnCookingFast)
    			log.info("Event : " + event.getSource().toString());
    		//else if (event.getSource() == btnCookingOnOffRiceSoaking)
    			//log.info("Event : " + event.getSource().toString());
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