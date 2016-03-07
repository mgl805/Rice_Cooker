package ca.ets.mgl805.hiver2016.ricecooker.controller.cooking.normal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ca.ets.mgl805.hiver2016.ricecooker.controller.design.patterns.command.CommandController;
import ca.ets.mgl805.hiver2016.ricecooker.controller.design.patterns.command.Receptor;

/**
 * CookingNormalController - a simple cooking normal controller class
 * <a href="mailto:asylvose@yahoo.fr">Sylvose ALLOGO</a>
 * @version $Revision: 1.1 $
 * @since 14 February 2016 09:00:00
 */
public class CookingNormalController implements CommandController {
	
    private static final Logger log = LoggerFactory.getLogger(CookingNormalController.class);

	private Receptor receptor;

	public CookingNormalController(Receptor receptor){
		  this.receptor = receptor;
    }

	public void execute() {
		log.info("executing of the cookingNormal method from the CookingNormalController class");
		receptor.cookingNormal();
	}
}