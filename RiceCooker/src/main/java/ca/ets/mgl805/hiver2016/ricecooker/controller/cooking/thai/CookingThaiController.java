package ca.ets.mgl805.hiver2016.ricecooker.controller.cooking.thai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ca.ets.mgl805.hiver2016.ricecooker.controller.design.patterns.command.CommandController;
import ca.ets.mgl805.hiver2016.ricecooker.controller.design.patterns.command.Receptor;

/**
 * CookingThaiController - a simple cooking thai controller class for cooking thai rice
 * <a href="mailto:asylvose@yahoo.fr">Sylvose ALLOGO</a>
 * @version $Revision: 1.1 $
 * @since 14 February 2016 09:00:00
 */
public class CookingThaiController implements CommandController {
	
    private static final Logger log = LoggerFactory.getLogger(CookingThaiController.class);

	private Receptor receptor;

	public CookingThaiController(Receptor receptor){
		  this.receptor = receptor;
    }

	public void execute() {
		log.info("executing of the cookingThai method from the CookingThaiController class");
		receptor.cookingThai();
	}
}