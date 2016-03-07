package ca.ets.mgl805.hiver2016.ricecooker.controller.cooking.fast;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ca.ets.mgl805.hiver2016.ricecooker.controller.design.patterns.command.CommandController;
import ca.ets.mgl805.hiver2016.ricecooker.controller.design.patterns.command.Receptor;

/**
 * CookingFastController - a simple cooking fast controller class
 * <a href="mailto:asylvose@yahoo.fr">Sylvose ALLOGO</a>
 * @version $Revision: 1.1 $
 * @since 14 February 2016 09:00:00
 */
public class CookingFastController implements CommandController {
	
    private static final Logger log = LoggerFactory.getLogger(CookingFastController.class);

	private Receptor receptor;

	public CookingFastController(Receptor receptor){
		  this.receptor = receptor;
    }

	public void execute() {
		log.info("executing of the cookingFast method from the CookingFastController class");
		receptor.cookingFast();
	}
}