package be.claes.domain;

import javax.persistence.Entity;

/**
 * Created by kristofclaes on 05/02/16.
 */
@Entity
public class THPReading {

	private double sht2xTemperature;

	private double bmpTemperature;

	private double bmpPressure;

	private double sht2xHumidity;

	public double getSht2xTemperature() {
		return sht2xTemperature;
	}

	public void setSht2xTemperature(double sht2xTemperature) {
		this.sht2xTemperature = sht2xTemperature;
	}

	public double getBmpTemperature() {
		return bmpTemperature;
	}

	public void setBmpTemperature(double bmpTemperature) {
		this.bmpTemperature = bmpTemperature;
	}

	public double getBmpPressure() {
		return bmpPressure;
	}

	public void setBmpPressure(double bmpPressure) {
		this.bmpPressure = bmpPressure;
	}

	public double getSht2xHumidity() {
		return sht2xHumidity;
	}

	public void setSht2xHumidity(double sht2xHumidity) {
		this.sht2xHumidity = sht2xHumidity;
	}
}
