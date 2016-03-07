package ca.ets.mgl805.hiver2016.ricecooker.controller.riceSoaking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ca.ets.mgl805.hiver2016.ricecooker.controller.design.patterns.command.CommandController;
import ca.ets.mgl805.hiver2016.ricecooker.controller.design.patterns.command.Receptor;

/**
 * RiceSoakingController - a simple soaking controller class
 * <a href="mailto:asylvose@yahoo.fr">Sylvose ALLOGO</a>
 * @version $Revision: 1.1 $
 * @since 14 February 2016 09:00:00
 */
public class RiceSoakingController implements CommandController {
	
    private static final Logger log = LoggerFactory.getLogger(RiceSoakingController.class);

	private Receptor receptor;

	public RiceSoakingController(Receptor receptor){
		  this.receptor = receptor;
    }

	public void execute() {
		log.info("executing of the RiceSoaking method from the RiceSoakingController class");
		receptor.riceSoaking();
	}
}