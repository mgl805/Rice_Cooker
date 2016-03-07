package ca.ets.mgl805.hiver2016.ricecooker.util;

import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.AUDIO_PATH_FOLDER;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 * AudioMediaPlayer - a simple util class for the Media Player 
 * <a href="mailto:asylvose@yahoo.fr">Sylvose ALLOGO</a>
 * @version $Revision: 1.1 $
 * @since 14 February 2016 09:00:00
 */
public class AudioMediaPlayer {
	
	private static final Logger log = LoggerFactory.getLogger(AudioMediaPlayer.class);
	
	private static AudioMediaPlayer instance = null;

	private MediaPlayer mediaPlayer;
	
	
	public AudioMediaPlayer() {}
	
	
	/**
	 * @param mediaPlayer
	 */
	public AudioMediaPlayer(MediaPlayer mediaPlayer) {
		this();
		this.mediaPlayer = mediaPlayer;
	}

	public static AudioMediaPlayer getInstance() {
		if (instance == null) {
			instance = new AudioMediaPlayer();
		}
		return instance;
	}

	public void play(String mp3File) {
    	if (StringUtils.isBlank(mp3File))
    			throw new IllegalArgumentException(mp3File);
    	
    	final String pathFileAudio = AUDIO_PATH_FOLDER + File.separator + mp3File;
   
    	URL url = null;
    	File file = null;
    	String source = null;
    	
    	try {
    		final Thread thread = Thread.currentThread();
            final ClassLoader classLoader = thread.getContextClassLoader();
            
            url = classLoader.getResource(pathFileAudio); 
            source = url.toString();
            file = new File(url.toURI());
            
		} catch (URISyntaxException e) {
			log.error("Cause : " + e.getCause() + ", Message : " + e.getMessage() + ", Stack Trace : " +e.getStackTrace());
			file = new File(url.getPath());
			
		} catch (Exception e) {
			log.error("Cause : " + e.getCause() + ", Message : " + e.getMessage() + ", Stack Trace : " +e.getStackTrace());
			
		} finally {
			if (file.exists() && file.isFile() && file.canRead() && file.canWrite()) {
    	    	final Media media = new Media(source);
    	    	
    	    	if (this.mediaPlayer != null && mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
    	    		this.mediaPlayer.stop();
    	    		this.mediaPlayer = null;
    	    		this.mediaPlayer = new MediaPlayer(media);
	    	    	this.mediaPlayer.play();
    	    	}
    	    	else {
	    	    	this.mediaPlayer = new MediaPlayer(media);
	    	    	this.mediaPlayer.play();
    	    	} 
        	} else 
        		log.info("The file " + mp3File + " is not found");
		}
    }
    
    public void play() {
    	if (this.mediaPlayer != null && mediaPlayer.getStatus() == MediaPlayer.Status.PAUSED)
    		this.mediaPlayer.play();
    }
    
    public void pause() {
    	if (this.mediaPlayer != null && mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
    		this.mediaPlayer.pause();
    	}
    }
    
    public void close() {
    	if (this.mediaPlayer != null)
			this.mediaPlayer.stop();
    }
    
    public void open(String url) {
    	if (StringUtils.isBlank(url))
			throw new IllegalArgumentException(url);
	
    	try {
			final URI uri = new URI(url);
			final Desktop desktop = Desktop.getDesktop();
			desktop.browse(uri);
			Thread.sleep(5000);
			
		} catch (IOException e) {
			log.error("Cause : " + e.getCause() + ", Message : " + e.getMessage() + ", Stack Trace : " +e.getStackTrace());
		} catch (URISyntaxException e) {
			log.error("Cause : " + e.getCause() + ", Message : " + e.getMessage() + ", Stack Trace : " +e.getStackTrace());
		} catch (InterruptedException e) {
			log.error("Cause : " + e.getCause() + ", Message : " + e.getMessage() + ", Stack Trace : " +e.getStackTrace());
		}
    }
}