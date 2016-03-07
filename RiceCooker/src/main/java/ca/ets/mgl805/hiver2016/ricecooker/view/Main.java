package ca.ets.mgl805.hiver2016.ricecooker.view;

import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.RICE_COOKER_CSS_STYLE;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.SCREEN_HEIGHT;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.SCREEN_WIDTH;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.TITLE;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.TITLE_BAR_HEIGHT;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.WINDOW_BORDER;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ca.ets.mgl805.hiver2016.ricecooker.util.BorderLayout;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
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
    
    private final BorderLayout borderLayout = BorderLayout.getInstance();
    
    private BorderPane borderPane;
    
    private Stage stage;

    
    public Main() {}
    
    /**
	 * @param borderPane
	 * @param stage
	 */
	public Main(BorderPane borderPane, Stage stage) {
		this();
		this.borderPane = borderPane;
		this.stage = stage;
	}

	/**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args){
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
    	if (stage == null)
			throw new IllegalArgumentException();
	
    	log.info(TITLE);
    	
    	this.stage = stage;
    	
        // create the BorderPane
    	this.borderPane = new BorderPane();
    	this.borderPane.setPrefSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        
        // Show the scene containing the root layout
        final Scene scene = new Scene(this.borderPane, SCREEN_WIDTH, SCREEN_HEIGHT);
        scene.getStylesheets().add(RICE_COOKER_CSS_STYLE);
        
        this.stage.setWidth(SCREEN_WIDTH + 2*WINDOW_BORDER);
        this.stage.setHeight(SCREEN_HEIGHT + 2*WINDOW_BORDER + TITLE_BAR_HEIGHT);
        
        this.stage.setScene(scene);
        stage.setResizable(false);

        this.borderLayout.setStage(this.stage);
        this.borderLayout.setBorderPane(this.borderPane);
        this.borderLayout.initialization();
        
        stage.show();
    }
}