package ca.ets.mgl805.hiver2016.ricecooker.util;

import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.d;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.graphCookingFast;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.graphCookingNormal;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.graphCookingSlow;
import static ca.ets.mgl805.hiver2016.ricecooker.model.db.DataBase.graphCookingThai;

/**
 * @ModeCuisson - a simple util enum class for the mode cooking 
 * <a href="mailto:asylvose@yahoo.fr">Sylvose ALLOGO</a>
 * @version $Revision: 1.1 $
 * @since 14 February 2016 09:00:00
 */
public enum ModeCuisson {

	CookingSlow(graphCookingSlow), CookingNormal(graphCookingNormal), 
	CookingFast(graphCookingFast), CookingThai(graphCookingThai);
	
	private float [][] temperatureTemps;

	
	private ModeCuisson() { this.temperatureTemps = new float [d][d]; }
	
	private ModeCuisson(final float [][] temperatureTemps) { 
		this();
		this.temperatureTemps = temperatureTemps; 
	}

	
	/**
	 * @return the temperatureTemps
	 */
	public float[][] getTemperatureTemps() {
		return temperatureTemps;
	}

	/**
	 * @param temperatureTemps the temperature temps to set
	 */
	public void setTemperatureTemps(float[][] temperatureTemps) {
		this.temperatureTemps = temperatureTemps;
	}
}