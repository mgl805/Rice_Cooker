package ca.ets.mgl805.hiver2016.ricecooker.controller.power;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ca.ets.mgl805.hiver2016.ricecooker.controller.design.patterns.command.CommandController;
import ca.ets.mgl805.hiver2016.ricecooker.controller.design.patterns.command.Receptor;

/**
 * OnOffPowerController - a simple on power controller class
 * <a href="mailto:asylvose@yahoo.fr">Sylvose ALLOGO</a>
 * @version $Revision: 1.1 $
 * @since 14 February 2016 09:00:00
 */
public final class OffPowerController implements CommandController {

	private static final Logger log = LoggerFactory.getLogger(OffPowerController.class);

	private Receptor receptor;

	public OffPowerController(Receptor receptor){
		  this.receptor = receptor;
    }

	public void execute() {
		log.info("executing of the offPower method from the OffPowerController class");
		receptor.offPower();
	}
}