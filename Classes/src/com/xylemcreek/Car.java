/**
 * 
 */
package com.xylemcreek;

/**
 * @author cipherstrike
 *
 */
public class Car {
	
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	/**
	 * @return the doors
	 */
	public int getDoors() {
		return doors;
	}
	/**
	 * @param doors the doors to set
	 */
	public void setDoors(int doors) {
		this.doors = doors;
	}
	/**
	 * @return the wheels
	 */
	public int getWheels() {
		return wheels;
	}
	/**
	 * @param wheels the wheels to set
	 */
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the engine
	 */
	public String getEngine() {
		return engine;
	}
	/**
	 * @param engine the engine to set
	 */
	public void setEngine(String engine) {
		this.engine = engine;
	}
	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}
	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Car [doors=" + doors + ", wheels=" + wheels + ", model=" + model + ", engine=" + engine + ", colour="
				+ colour + "]";
	}
	
	

}
