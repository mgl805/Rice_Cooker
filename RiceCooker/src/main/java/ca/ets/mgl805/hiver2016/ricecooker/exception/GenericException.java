package ca.ets.mgl805.hiver2016.ricecooker.exception;

import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.IS_NESTED_IN;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @GenericException - a simple util class of all applicative exceptions 
 * <a href="mailto:asylvose@yahoo.fr">Sylvose ALLOGO</a>
 * @version $Revision: 1.1 $
 * @since 14 February 2016 09:00:00
 */
public class GenericException extends RuntimeException {

	private static final long serialVersionUID = 1032838061958340507L;

	private static Logger log = LoggerFactory.getLogger(GenericException.class);
	
	
	/**
	 * message
	 */
	private String message;
	
	/**
	 * throwable
	 */
	private Throwable throwable;

	/**
	 * collection
	 */
	private Collection<?> collection;
	
	
	/**
	 * default constructor
	 */
	public GenericException() {
		this.message = null;
		this.throwable = null;
		this.collection = null;
	}

	/**
	 * Constructor with message
	 */
	public GenericException(String message) {
		super(message);
	}

	/**
	 * Constructor with throwable
	 */
	public GenericException(Throwable throwable) {
		super(throwable);
	}
	
	/**
	 * Constructor with collection
	 */
	public GenericException(Collection<?> collection) {
		this.collection = collection;
	}
	
	/**
	 * Constructor with message and throwable
	 */
	public GenericException(String message, Throwable throwable) {
		super(message, throwable);
	}

	/**
	 * Constructor with message and collection
	 */
	public GenericException(String message, Collection<?> collection) {
		super(message);
		this.collection = collection;
	}

	/**
	 * Constructor with throwable and collection
	 */
	public GenericException(Throwable throwable, Collection<?> collection) {
		super(throwable);
		this.collection = collection;
	}
	
	/**
	 * Constructor with message, throwable and collection
	 */
	public GenericException(String message, Throwable throwable, Collection<?> collection) {
		super(message, throwable);
		this.collection = collection;
	}
	
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the throwable
	 */
	public Throwable getThrowable() {
		return throwable;
	}

	/**
	 * @param throwable the throwable to set
	 */
	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}

	/**
	 * @return the collection
	 */
	public Collection<?> getCollection() {
		return collection;
	}

	/**
	 * @param collection the collection to set
	 */
	public void setCollection(Collection<?> collection) {
		this.collection = collection;
	}

	/**
	 * Prints the stack trace of the throwable
	 */
	public void printStackTrace() {
		Throwable throwable = getThrowable();
		if (throwable != null) {
			throwable.printStackTrace();
			log.error(IS_NESTED_IN);
		}
		super.printStackTrace();
	}

	/**
	 * Prints the stack trace of the throwable
	 */
	public void printStackTrace(PrintStream out) {
		Throwable throwable = getThrowable();
		if (throwable != null) {
			throwable.printStackTrace(out);
			out.println(IS_NESTED_IN);
		}
		super.printStackTrace(out);
	}

	/**
	 * Prints the stack trace of the throwable
	 */
	public void printStackTrace(PrintWriter out) {
		Throwable throwable = getThrowable();
		if (throwable != null) {
			throwable.printStackTrace(out);
			out.println(IS_NESTED_IN);
		}
		super.printStackTrace(out);
	}

	/**
	 * Gets an editable trace of the exception and the throwable
	 * @return the exception as a String
	 */
	public String toString(String blank) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(blank);
		buffer.append(super.toString());
		if (this.throwable != null) {
			buffer.append("\n" + blank);
			buffer.append("with nested exception");
			if (this.throwable instanceof GenericException) {
				buffer.append("\n");
				buffer.append(((GenericException) this.throwable).toString(blank));
			} else {
				buffer.append("\n" + blank);
				buffer.append(this.throwable.toString());
			}
		}
		return buffer.toString();
	}
}