package ca.ets.mgl805.hiver2016.ricecooker.controller.design.patterns.command;

import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.COOKING_FAST_BUTTON_CLICKED;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.COOKING_NORMAL_BUTTON_CLICKED;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.COOKING_SLOW_BUTTON_CLICKED;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.COOKING_THAI_BUTTON_CLICKED;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.LENT;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MSG_CLENTE;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MSG_CNORMALE;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MSG_CRAPIDE;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MSG_CTHAI;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MSG_OFF_POWER;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MSG_ON_POWER;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MSG_RECHAUFFAGE;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.MSG_TREMPAGE;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.NORMAL;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.OFF_POWER;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.OFF_POWER_BUTTON_CLICKED;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.ON_POWER;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.ON_POWER_BUTTON_CLICKED;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.RAPIDE;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.RECHAUFFAGE;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.REHEAT_BUTTON_CLICKED;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.RICE_SOAKING_BUTTON_CLICKED;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.THAI;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.TREMPAGE;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ca.ets.mgl805.hiver2016.ricecooker.util.AudioMediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 * Receptor - a request is wrapped under an object as command and passed to invoker object
 * <a href="mailto:asylvose@yahoo.fr">Sylvose ALLOGO</a>
 * @version $Revision: 1.1 $
 * @since 14 February 2016 09:00:00
 */
public class Receptor {

	private static final Logger log = LoggerFactory.getLogger(Receptor.class);

	
	private static Receptor instance = null;
	
	private Text etatCuiseurText;
	  
    private String etatCuiseurString;
    
	private Rectangle trempageRectangle;
    private Rectangle rechaudRectangle;
    private Rectangle cuissonRectangle;
    
	private AudioMediaPlayer audioMediaPlayer;
	
	
	public Receptor() {}
	
	/**
	 * @param etatCuiseurText
	 * @param etatCuiseurString
	 * @param trempageRectangle
	 * @param rechaudRectangle
	 * @param cuissonRectangle
	 * @param audioMediaPlayer
	 */
	public Receptor(Text etatCuiseurText, String etatCuiseurString, Rectangle trempageRectangle,
			Rectangle rechaudRectangle, Rectangle cuissonRectangle, AudioMediaPlayer audioMediaPlayer) {
		this();
		this.etatCuiseurText = etatCuiseurText;
		this.etatCuiseurString = etatCuiseurString;
		this.trempageRectangle = trempageRectangle;
		this.rechaudRectangle = rechaudRectangle;
		this.cuissonRectangle = cuissonRectangle;
		this.audioMediaPlayer = audioMediaPlayer;
	}

	public static Receptor getInstance() {
		if (instance == null) {
			instance = new Receptor();
		}
		return instance;
	}

	/**
	 * @return the etatCuiseurText
	 */
	public Text getEtatCuiseurText() {
		return etatCuiseurText;
	}

	/**
	 * @param etatCuiseurText the etatCuiseurText to set
	 */
	public void setEtatCuiseurText(Text etatCuiseurText) {
		this.etatCuiseurText = etatCuiseurText;
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

	/**
	 * @return the trempageRectangle
	 */
	public Rectangle getTrempageRectangle() {
		return trempageRectangle;
	}

	/**
	 * @param trempageRectangle the trempageRectangle to set
	 */
	public void setTrempageRectangle(Rectangle trempageRectangle) {
		this.trempageRectangle = trempageRectangle;
	}

	/**
	 * @return the rechaudRectangle
	 */
	public Rectangle getRechaudRectangle() {
		return rechaudRectangle;
	}

	/**
	 * @param rechaudRectangle the rechaudRectangle to set
	 */
	public void setRechaudRectangle(Rectangle rechaudRectangle) {
		this.rechaudRectangle = rechaudRectangle;
	}

	/**
	 * @return the cuissonRectangle
	 */
	public Rectangle getCuissonRectangle() {
		return cuissonRectangle;
	}

	/**
	 * @param cuissonRectangle the cuissonRectangle to set
	 */
	public void setCuissonRectangle(Rectangle cuissonRectangle) {
		this.cuissonRectangle = cuissonRectangle;
	}

	/**
	 * @return the audioMediaPlayer
	 */
	public AudioMediaPlayer getAudioMediaPlayer() {
		return audioMediaPlayer;
	}

	/**
	 * @param audioMediaPlayer the audioMediaPlayer to set
	 */
	public void setAudioMediaPlayer(AudioMediaPlayer audioMediaPlayer) {
		this.audioMediaPlayer = audioMediaPlayer;
	}

	public void onPower() {
		try {
			log.info("executing of the onPower method from the Receptor class");
			
			audioMediaPlayer.play(ON_POWER_BUTTON_CLICKED);
			
			this.trempageRectangle.setFill(Color.GHOSTWHITE);
			this.rechaudRectangle.setFill(Color.GHOSTWHITE);
			
			if (this.etatCuiseurString.equalsIgnoreCase(THAI) ||
				this.etatCuiseurString.equalsIgnoreCase(LENT) || 
				this.etatCuiseurString.equalsIgnoreCase(NORMAL) || 
				this.etatCuiseurString.equalsIgnoreCase(RAPIDE)) {
				
	       		 if (this.etatCuiseurString.equalsIgnoreCase(THAI)){
	       			 this.cuissonRectangle.setFill(Color.RED);
	       			 this.etatCuiseurText.setText(MSG_CTHAI);
	       		 }
	       		 else if (this.etatCuiseurString.equalsIgnoreCase(LENT)){
	    			 this.cuissonRectangle.setFill(Color.RED);
	    			 this.etatCuiseurText.setText(MSG_CLENTE);
	       	     
	    		 } 
	       		 else if (this.etatCuiseurString.equalsIgnoreCase(NORMAL)){
	    			 this.cuissonRectangle.setFill(Color.RED);
	           		 this.etatCuiseurText.setText(MSG_CNORMALE);
	    		 }
	       		 else if (this.etatCuiseurString.equalsIgnoreCase(RAPIDE)){
	    			 this.cuissonRectangle.setFill(Color.RED);
	    			 this.etatCuiseurText.setText(MSG_CRAPIDE);
	    		 }
			 } else {
				 this.etatCuiseurText.setText(MSG_ON_POWER);
				 this.etatCuiseurString = ON_POWER;
			 }
			 log.info("cooking On power clic");
			 
		} catch (Exception e) {
			log.error("Cause : " + e.getCause() + ", Message : " + e.getMessage() + ", Stack Trace : " +e.getStackTrace());
		}
	}

	public void offPower() {
		try {
			log.info("executing of the offPower method from the Receptor class");
			
			audioMediaPlayer.play(OFF_POWER_BUTTON_CLICKED);
			
			this.trempageRectangle.setFill(Color.GHOSTWHITE);
			this.rechaudRectangle.setFill(Color.GHOSTWHITE);
			this.cuissonRectangle.setFill(Color.GHOSTWHITE);
			this.etatCuiseurText.setText(MSG_OFF_POWER);
			this.etatCuiseurString = OFF_POWER;
			log.info("cooking Off power clic");
			
		} catch (Exception e) {
			log.error("Cause : " + e.getCause() + ", Message : " + e.getMessage() + ", Stack Trace : " +e.getStackTrace());
		}
	}
	
	public void cookingThai() {
		try {
			log.info("executing of the cookingThai method from the Receptor class");
			
			audioMediaPlayer.play(COOKING_THAI_BUTTON_CLICKED);
			
			this.trempageRectangle.setFill(Color.GHOSTWHITE);
			this.rechaudRectangle.setFill(Color.GHOSTWHITE);
			this.cuissonRectangle.setFill(Color.GHOSTWHITE);
			this.etatCuiseurText.setText(null);
			this.etatCuiseurString = THAI;
			log.info("thai clic");
			
		} catch (Exception e) {
			log.error("Cause : " + e.getCause() + ", Message : " + e.getMessage() + ", Stack Trace : " +e.getStackTrace());
		}
	}
	
	public void cookingSlow() {
		try {
			log.info("executing of the cookingSlow method from the Receptor class");
			
			audioMediaPlayer.play(COOKING_SLOW_BUTTON_CLICKED);
			
			this.trempageRectangle.setFill(Color.GHOSTWHITE);
			this.rechaudRectangle.setFill(Color.GHOSTWHITE);
			this.cuissonRectangle.setFill(Color.GHOSTWHITE);
			this.etatCuiseurText.setText(null);
			this.etatCuiseurString = LENT;
			log.info("slow clic");
			
		} catch (Exception e) {
			log.error("Cause : " + e.getCause() + ", Message : " + e.getMessage() + ", Stack Trace : " +e.getStackTrace());
		}
	}
	
	public void cookingNormal() {
		try {
			log.info("executing of the cookingNormal method from the Receptor class");
			
			audioMediaPlayer.play(COOKING_NORMAL_BUTTON_CLICKED);
			
			this.trempageRectangle.setFill(Color.GHOSTWHITE);
			this.rechaudRectangle.setFill(Color.GHOSTWHITE);
			this.cuissonRectangle.setFill(Color.GHOSTWHITE);
			this.etatCuiseurText.setText(null);
			this.etatCuiseurString = NORMAL;
			log.info("normal clic");
			
		} catch (Exception e) {
			log.error("Cause : " + e.getCause() + ", Message : " + e.getMessage() + ", Stack Trace : " +e.getStackTrace());
		}
	}
	
	public void cookingFast() {
		try {
			log.info("executing of the cookingFast method from the Receptor class");
			
			audioMediaPlayer.play(COOKING_FAST_BUTTON_CLICKED);
			
			this.trempageRectangle.setFill(Color.GHOSTWHITE);
			this.rechaudRectangle.setFill(Color.GHOSTWHITE);
			this.cuissonRectangle.setFill(Color.GHOSTWHITE);
			this.etatCuiseurText.setText(null);
			this.etatCuiseurString = RAPIDE;
			log.info("fast clic");
			
		} catch (Exception e) {
			log.error("Cause : " + e.getCause() + ", Message : " + e.getMessage() + ", Stack Trace : " +e.getStackTrace());
		}
	}
	
	public void reheat() {
		try {
			log.info("executing of the reheat method from the Receptor class");
			
			audioMediaPlayer.play(REHEAT_BUTTON_CLICKED);
			
			this.trempageRectangle.setFill(Color.GHOSTWHITE);
			this.rechaudRectangle.setFill(Color.YELLOW);
			this.cuissonRectangle.setFill(Color.GHOSTWHITE);
			this.etatCuiseurText.setText(MSG_RECHAUFFAGE);
			this.etatCuiseurString = RECHAUFFAGE;
			log.info("cooking reheat clic");
			
		} catch (Exception e) {
			log.error("Cause : " + e.getCause() + ", Message : " + e.getMessage() + ", Stack Trace : " +e.getStackTrace());
		}
	}
	
	public void riceSoaking() {
		try {
			log.info("executing of the riceSoaking method from the Receptor class");
			
			audioMediaPlayer.play(RICE_SOAKING_BUTTON_CLICKED);
			
			this.trempageRectangle.setFill(Color.GREEN);
			this.rechaudRectangle.setFill(Color.GHOSTWHITE);
			this.cuissonRectangle.setFill(Color.GHOSTWHITE);
			this.etatCuiseurText.setText(MSG_TREMPAGE);
			this.etatCuiseurString = TREMPAGE;
			log.info("cooking rice soaking clic");
			
		} catch (Exception e) {
			log.error("Cause : " + e.getCause() + ", Message : " + e.getMessage() + ", Stack Trace : " +e.getStackTrace());
		}
	}
}