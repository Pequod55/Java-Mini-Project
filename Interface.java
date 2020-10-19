package com.SmartSocketWrench;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author Yashmit Nayudu(CFDNIE)
 *
 */

public class Interface {
	static Scanner InputScanner = new Scanner(System.in);
	

	static class UserChoice implements java.io.Serializable {
		private static final long serialVersionUID = 6134220303244962123L;
		private int ChosenFrontWheels;
		private int ChosenMiddleWheels;
		private int ChosenBackWheels;
		private int ChosenLugnuts;
		private int ChosenFrontTorque;
		private int ChosenMiddleTorque;
		private int ChosenBackTorque;
		
		public UserChoice() {}
		
		public int getChosenFrontWheels() {return ChosenFrontWheels;}
		public void setChosenFrontWheels(int chosenFrontWheels) {this.ChosenFrontWheels = chosenFrontWheels;}
		public int getChosenBackWheels() {return ChosenBackWheels;}
		public void setChosenBackWheels(int chosenBackWheels) {this.ChosenBackWheels = chosenBackWheels;}
		public int getChosenMiddleWheels() {return ChosenMiddleWheels;}
		public void setChosenMiddleWheels(int chosenMiddleWheels) {this.ChosenMiddleWheels = chosenMiddleWheels;}
		public int getChosenFrontTorque() {return ChosenFrontTorque;}
		public void setChosenFrontTorque(int chosenFrontTorque) {this.ChosenFrontTorque = chosenFrontTorque;}
		public int getChosenLugnuts() {return ChosenLugnuts;}
		public void setChosenLugnuts(int chosenLugnuts) {this.ChosenLugnuts = chosenLugnuts;}
		public int getChosenMiddleTorque() {return ChosenMiddleTorque;}
		public void setChosenMiddleTorque(int chosenMiddleTorque) {this.ChosenMiddleTorque = chosenMiddleTorque;}
		public int getChosenBackTorque() {return ChosenBackTorque;}
		public void setChosenBackTorque(int chosenBackTorque) {this.ChosenBackTorque = chosenBackTorque;}
	}
	
	
	public static void SensorCheck() {
		if (Sensors.Sensor1Check()) {
			System.out.println("Sensors readings normal.");
		}
		else {
			System.out.println("Sensor Readings Abnomral, Repairs Needed, Shutting Down");
			System.exit(0);;
		}
	}
	

	
	public static void getUserChoice() {
		
		int InterfaceChoice;
		int index = 1;
		
		ArrayList<VehicleSpecs.CarSpecs> CarsList = new ArrayList<VehicleSpecs.CarSpecs>();
		CarsList = VehicleSpecs.PopulateCarList(); 
		ArrayList<VehicleSpecs.BikeSpecs> BikesList = new ArrayList<VehicleSpecs.BikeSpecs>();
		BikesList = VehicleSpecs.PopulateBikeList(); 
		ArrayList<VehicleSpecs.TruckSpecs> TrucksList = new ArrayList<VehicleSpecs.TruckSpecs>();
		TrucksList = VehicleSpecs.PopulateTruckList(); 
		ArrayList<VehicleSpecs.SpecialVehicle> SpecialList = new ArrayList<VehicleSpecs.SpecialVehicle>();
		SpecialList = VehicleSpecs.PupulateSpecialList(); 
		UserChoice UserChoice1 = new UserChoice();
		
		while(true) {
			try{ 
				System.out.println("Hello, Please Choose One of The Following Vehicle Types:");
				System.out.println("1 for Cars, 2 for Trucks, 3 For Bikes, 0 for Special Vehicles");
				InterfaceChoice = InputScanner.nextInt();
				InputScanner.close();
				break;
				}
			catch (Exception InterfaceChoiceNotInt){
				InputScanner.close();
				System.out.println("The given input was not a number, Please try again");
				}
			 }
		
		if (InterfaceChoice == 0) {
			for (VehicleSpecs.SpecialVehicle i : SpecialList ) {
				System.out.println(i.getVehicleName()+index);
				index=index+1;
			}
		}
		
		if (InterfaceChoice == 1 ) {
			for (VehicleSpecs.CarSpecs i : CarsList ) {
				System.out.println(i.getVehicleName()+index);
				index=index+1;
			}
		}
		if (InterfaceChoice == 2 ) {
			for (VehicleSpecs.TruckSpecs j : TrucksList ) {
				index = index + 1;
				System.out.println(j.getVehicleName()+index);
			}
		
	 }

}
}
	
	


/*
ArrayList<VehicleSpecs.CarSpecs> CarsList = new ArrayList<VehicleSpecs.CarSpecs>();
CarsList = VehicleSpecs.PopulateCarLists(); 
for (Users i : ListOf Users) {
	System.out.println(i.VehicleName);
}
CarsList.add(Users.new CarSpecs(0, 0, 0, "New Car Yo"));
*/
