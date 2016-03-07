package ca.ets.mgl805.hiver2016.ricecooker.controller.design.patterns.command;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ca.ets.mgl805.hiver2016.ricecooker.controller.cooking.fast.CookingFastController;
import ca.ets.mgl805.hiver2016.ricecooker.controller.cooking.normal.CookingNormalController;
import ca.ets.mgl805.hiver2016.ricecooker.controller.cooking.slow.CookingSlowController;
import ca.ets.mgl805.hiver2016.ricecooker.controller.cooking.thai.CookingThaiController;
import ca.ets.mgl805.hiver2016.ricecooker.controller.power.OffPowerController;
import ca.ets.mgl805.hiver2016.ricecooker.controller.power.OnPowerController;
import ca.ets.mgl805.hiver2016.ricecooker.controller.reheat.ReheatController;
import ca.ets.mgl805.hiver2016.ricecooker.controller.riceSoaking.RiceSoakingController;

/**
 * Broker - invoker object looks for the appropriate object which can handle 
 * this command and passes the command to the corresponding object which executes the command
 * <a href="mailto:asylvose@yahoo.fr">Sylvose ALLOGO</a>
 * @version $Revision: 1.1 $
 * @since 14 February 2016 09:00:00
 */
public class Broker {

	private static final Logger log = LoggerFactory.getLogger(Broker.class);

	private static Broker instance = null;
	
	
	private OnPowerController onPowerController;
	private OffPowerController offPowerController;
	private CookingThaiController cookingThaiController;
	private CookingSlowController cookingSlowController;
	private CookingNormalController cookingNormalController;
	private CookingFastController cookingFastController;
	private ReheatController reheatController;
	private RiceSoakingController riceSoakingController;
	
	private Set<CommandController> controllerList;

	
	public Broker() {
		this.controllerList = new HashSet<CommandController>();
	}

	/**
	 * @param onPowerController
	 * @param offPowerController
	 * @param cookingThaiController
	 * @param cookingSlowController
	 * @param cookingNormalController
	 * @param cookingFastController
	 * @param reheatController
	 * @param riceSoakingController
	 */
	public Broker(OnPowerController onPowerController, OffPowerController offPowerController,
			CookingThaiController cookingThaiController, CookingSlowController cookingSlowController,
			CookingNormalController cookingNormalController, CookingFastController cookingFastController,
			ReheatController reheatController, RiceSoakingController riceSoakingController) {
		this();
		this.onPowerController = onPowerController;
		this.offPowerController = offPowerController;
		this.cookingThaiController = cookingThaiController;
		this.cookingSlowController = cookingSlowController;
		this.cookingNormalController = cookingNormalController;
		this.cookingFastController = cookingFastController;
		this.reheatController = reheatController;
		this.riceSoakingController = riceSoakingController;
	}

	public static Broker getInstance() {
		if (instance == null) {
			instance = new Broker();
		}
		return instance;
	}

	public void addController(CommandController controller) {
		if (controller == null)
			throw new IllegalArgumentException();
		
		log.info("adding controller into set");
		controllerList.add(controller);
	}

	public void startControllers() {
		for (CommandController controller : controllerList)
			controller.execute();
		
		controllerList.clear();
	}

	/**
	 * @return the onPowerController
	 */
	public OnPowerController getOnPowerController() {
		return onPowerController;
	}

	/**
	 * @param onPowerController the onPowerController to set
	 */
	public void setOnPowerController(OnPowerController onPowerController) {
		this.onPowerController = onPowerController;
	}
	
	public void onPowerControllerInvoker() {
		if (onPowerController != null)
			onPowerController.execute();
	}

	/**
	 * @return the offPowerController
	 */
	public OffPowerController getOffPowerController() {
		return offPowerController;
	}

	/**
	 * @param offPowerController the offPowerController to set
	 */
	public void setOffPowerController(OffPowerController offPowerController) {
		this.offPowerController = offPowerController;
	}
	
	public void offPowerControllerInvoker() {
		if (offPowerController != null)
			offPowerController.execute();
	}

	/**
	 * @return the cookingThaiController
	 */
	public CookingThaiController getCookingThaiController() {
		return cookingThaiController;
	}

	/**
	 * @param cookingThaiController the cookingThaiController to set
	 */
	public void setCookingThaiController(CookingThaiController cookingThaiController) {
		this.cookingThaiController = cookingThaiController;
	}

	public void cookingThaiControllerInvoker() {
		if (cookingThaiController != null)
			cookingThaiController.execute();
	}

	/**
	 * @return the cookingSlowController
	 */
	public CookingSlowController getCookingSlowController() {
		return cookingSlowController;
	}

	/**
	 * @param cookingSlowController the cookingSlowController to set
	 */
	public void setCookingSlowController(CookingSlowController cookingSlowController) {
		this.cookingSlowController = cookingSlowController;
	}

	public void cookingSlowControllerInvoker() {
		if (cookingSlowController != null)
			cookingSlowController.execute();
	}

	/**
	 * @return the cookingNormalController
	 */
	public CookingNormalController getCookingNormalController() {
		return cookingNormalController;
	}

	/**
	 * @param cookingNormalController the cookingNormalController to set
	 */
	public void setCookingNormalController(CookingNormalController cookingNormalController) {
		this.cookingNormalController = cookingNormalController;
	}

	public void cookingNormalControllerInvoker() {
		if (cookingNormalController != null)
			cookingNormalController.execute();
	}

	/**
	 * @return the cookingFastController
	 */
	public CookingFastController getCookingFastController() {
		return cookingFastController;
	}

	/**
	 * @param cookingFastController the cookingFastController to set
	 */
	public void setCookingFastController(CookingFastController cookingFastController) {
		this.cookingFastController = cookingFastController;
	}

	public void cookingFastControllerInvoker() {
		if (cookingFastController != null)
			cookingFastController.execute();
	}

	/**
	 * @return the reheatController
	 */
	public ReheatController getReheatController() {
		return reheatController;
	}

	/**
	 * @param reheatController the reheatController to set
	 */
	public void setReheatController(ReheatController reheatController) {
		this.reheatController = reheatController;
	}

	public void reheatControllerInvoker() {
		if (reheatController != null)
			reheatController.execute();
	}

	/**
	 * @return the riceSoakingController
	 */
	public RiceSoakingController getRiceSoakingController() {
		return riceSoakingController;
	}

	/**
	 * @param riceSoakingController the riceSoakingController to set
	 */
	public void setRiceSoakingController(RiceSoakingController riceSoakingController) {
		this.riceSoakingController = riceSoakingController;
	}
	
	public void riceSoakingControllerInvoker() {
		if (riceSoakingController != null)
			riceSoakingController.execute();
	}
}