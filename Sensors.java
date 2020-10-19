package com.SmartSocketWrench;

/**
 * @author Yashmit Nayudu(CFDNIE)
 *
 */

import java.util.Scanner;

public class Sensors implements java.io.Serializable {

	private static final long serialVersionUID = 4332881499483755324L;
	private float TemperatureSensor;
	private float BatterySensor;
	private float TorqueSensorValue;
	
	public Sensors(){}  
	
	public float getBatterySensor() {return BatterySensor;}
	public void setBatterySensor(float batterySensor) {BatterySensor = batterySensor;}
	public float getTemperatureSensor() {return TemperatureSensor;}
	public void setTemperatureSensor(float temperatureSensor) {TemperatureSensor = temperatureSensor;}
	public float getTorqueMin() { return (float) 0 ;}
	public float getTorqueMax() { return (float) 1000;}
	public float getTempMax() { return (float) 250;}
	public float getTempMin() { return (float) -50;}
	
	static Sensors Sensor1= new Sensors();
	
	static Scanner InputScanner = new Scanner(System.in);
	public static float TorqueCurrent() {
		try{ 
		System.out.println("Since I have no way of creating a link to a real sensor, please input the value for the Torque sensor:");
		Sensor1.TorqueSensorValue = InputScanner.nextFloat();
		return Sensor1.TorqueSensorValue;
		}
		catch (Exception TorqueNotFloat ){
		InputScanner.nextLine();
		System.out.println("The given input was not a number, 0 was used instead");
		return 0;	
		}
		
	}
	public static float TemperatureCurrent() {
		try{ 
		System.out.println("Since I have no way of creating a link to a real sensor, please input the value for the Temperature sensor:");
		Sensor1.TorqueSensorValue = InputScanner.nextFloat();
		return Sensor1.TorqueSensorValue;
		}
		catch (Exception TemperatureNotFloat ){
		InputScanner.nextLine();
		System.out.println("The given input was not a number, 0 was used instead");
		return 0;	
		}
	}
	public static float BatteryCurrent() {
		try { 
		System.out.println("Since I have no way of creating a link to a real sensor, please input the value for the Battery sensor:");
		Sensor1.TorqueSensorValue = InputScanner.nextFloat();
		return Sensor1.TorqueSensorValue;
		}
		catch (Exception TorqueNotFloat ){
		InputScanner.nextLine();
		System.out.println("The given input was not a number, 0 was used instead");
		return 0;	
		}
	}
	public static boolean Sensor1Check() {
		if (TemperatureCurrent()< Sensor1.getTempMax() && TemperatureCurrent()> Sensor1.getTempMin()){
			if (TorqueCurrent()<=Sensor1.getTorqueMax() && TorqueCurrent()>=Sensor1.getTorqueMin()) {
				return true;
			}
		}
		return false;
	}
}
