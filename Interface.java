package com.SmartSocketWrench;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author Yashmit Nayudu(CFDNIE)
 *
 */

class Interface {
	static Scanner InputScanner = new Scanner(System.in);
	static ArrayList<VehicleSpecs.CarSpecs> CarsList = new ArrayList<VehicleSpecs.CarSpecs>();
	static ArrayList<VehicleSpecs.BikeSpecs> BikesList = new ArrayList<VehicleSpecs.BikeSpecs>();
	static ArrayList<VehicleSpecs.TruckSpecs> TrucksList = new ArrayList<VehicleSpecs.TruckSpecs>();
	static ArrayList<VehicleSpecs.SpecialVehicle> SpecialList = new ArrayList<VehicleSpecs.SpecialVehicle>();
	static Interface Interface1 = new Interface();
	static UserChoice UserChoice1 = Interface1.new UserChoice();


	 class UserChoice implements java.io.Serializable {
		private static final long serialVersionUID = 6134220303244962123L;
		private int ChosenFrontWheels = 0;
		private int ChosenMiddleWheels = 0;
		private int ChosenBackWheels = 0;
		private int ChosenLugnuts = 0;
		private int ChosenFrontTorque = 0;
		private int ChosenMiddleTorque = 0;
		private int ChosenBackTorque = 0;
		
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
	
	public static void Initialize() {
		CarsList = VehicleSpecs.PopulateCarList(); 
		BikesList = VehicleSpecs.PopulateBikeList(); 
		TrucksList = VehicleSpecs.PopulateTruckList(); 
		SpecialList = VehicleSpecs.PupulateSpecialList(); 		
	}
	

	public static void printNextLugnut() {System.out.println("Lugnut was torqued to spec, Please move to the next Lugnut in a star pattern "+System.lineSeparator());}
	public static void printNextTire() {System.out.println("All Lugnuts finished on tire, please move to the next tire"+System.lineSeparator()+System.lineSeparator());}
	public static void printCurrentTireInfo(int lugnuts ,int torque) {System.out.println("The Current Tire will have " +lugnuts+" Lugnuts and they will be torqued to "+torque+ " Nm"+System.lineSeparator());}
	public static void printFrontTireDone() {System.out.println("All Front tires have been Torqued to Specifications"+System.lineSeparator()+System.lineSeparator());};
	public static void printMiddleTireDone() {System.out.println("All Middle tires have been Torqued to Specifications"+System.lineSeparator()+System.lineSeparator());};
	public static void printBackTireDone() {System.out.println("All Rear tires have been Torqued to Specifications"+System.lineSeparator()+System.lineSeparator());}
	public static void printMovetoMiddle() {System.out.println("Plese Move to the Middle tires"+System.lineSeparator());};
	public static void printMovetoBack() {System.out.println("Plese Move to the Rear tires"+System.lineSeparator());};
	public static void printMovetoFront() {System.out.println("Plese Move to the Front tires"+System.lineSeparator());};
	public static void printStartTightening() {System.out.println("Please tighten the Lugnut, The System will notify you when Specified Torque Spec is reached"+System.lineSeparator());}
	public static int exitPrompt() {System.out.println("Press 1 to exit, 0 to Service another Vehicle:"+System.lineSeparator());return InputScanner.nextInt();}
	public static void exitThanks() {System.out.println("Thank you for using the Samrt Socket Wrench and have a nice day.");}
	public static void printCurrentVehicleInfo(int Front, int Middle, int Back, int Lugnuts) {System.out.println("The Selected Vehicle has "+Front+" Front tires, "+Middle+" Middle tires and "+Back+" Rear tires, all with "+Lugnuts+" Lugnuts each");}
	
	public static UserChoice getUserChoice() {
		int InterfaceChoice;
		int index = 1;



		
		while(true) {
			try{ 
				System.out.println("Hello, Please Choose One of The Following Vehicle Types:");
				System.out.println("1 for Cars, 2 for Trucks, 3 For Bikes, 0 for Special Vehicles");
				InterfaceChoice = InputScanner.nextInt();
				break;
				}
			catch (Exception InterfaceChoiceNotInt){
				InputScanner.nextLine();
				System.out.println("The given input was not a number, Please try again");
				}
			 }
		
		if (InterfaceChoice == 0) {
			index = 1;
			for (VehicleSpecs.SpecialVehicle i : SpecialList ) {
				System.out.println(i.getVehicleName()+" "+index);
				index=index+1;
			}
			System.out.println("Please Choose a vehicle by pressing the number associated to it, or create a new Vehicle with 0");
			InterfaceChoice = InputScanner.nextInt()-1;
			if (InterfaceChoice == -1) {
				SpecialList.add(VehicleSpecs.Vehicle.new SpecialVehicle());
				
				for (VehicleSpecs.SpecialVehicle i : SpecialList) {
					System.out.println("If you do not want to add a specific Wheel or Torque Specification, Enter 0 ");
					if (i.getVehicleName() == null) {
						System.out.println("Please Enter the Number of Front Wheels this Vehicle has:");
						i.setNumberFrontWheels(InputScanner.nextInt());
						System.out.println("Please Enter the Number of Middle Wheels this Vehicle has:");
						i.setNumberMiddleWheels(InputScanner.nextInt());
						System.out.println("Please Enter the Number of Back Wheels this Vehicle has:");
						i.setNumberofBackWheels(InputScanner.nextInt());
						System.out.println("Please Enter the Number of Lugnuts this Vehicle has:");
						i.setNumberofLugnuts(InputScanner.nextInt());
						System.out.println("Please Enter the TorqueSpec for Front Wheels :");
						i.setLugnutTorqueFront(InputScanner.nextInt());
						System.out.println("Please Enter the TorqueSpec for Middle Wheels :");
						i.setLugnutTorqueMiddle(InputScanner.nextInt());
						System.out.println("Please Enter the TorqueSpec for Rear Wheels :");
						i.setLugnutTorqueBack(InputScanner.nextInt());
						System.out.println("Please Enter a Name for this Vehicle :");
						i.setVehicleName(InputScanner.next());
						UserChoice1.setChosenFrontWheels(i.getNumberFrontWheels());
						UserChoice1.setChosenBackWheels(i.getNumberBackWheels());
						UserChoice1.setChosenMiddleWheels(i.getNumberMiddleWheels());
						UserChoice1.setChosenFrontTorque(i.getTorqueFront());
						UserChoice1.setChosenMiddleTorque(i.getTorqueMiddle());
						UserChoice1.setChosenBackTorque(i.getTorqueBack());
						UserChoice1.setChosenLugnuts(i.getNumberofLugNuts());
						return UserChoice1;
						}
					}	
				}
				else {
					VehicleSpecs.SpecialVehicle ChosenSpecial = SpecialList.get(InterfaceChoice);
					UserChoice1.setChosenFrontWheels(ChosenSpecial.getNumberFrontWheels());
					UserChoice1.setChosenBackWheels(ChosenSpecial.getNumberBackWheels());
					UserChoice1.setChosenMiddleWheels(ChosenSpecial.getNumberMiddleWheels());
					UserChoice1.setChosenFrontTorque(ChosenSpecial.getTorqueFront());
					UserChoice1.setChosenMiddleTorque(ChosenSpecial.getTorqueMiddle());
					UserChoice1.setChosenBackTorque(ChosenSpecial.getTorqueBack());
					UserChoice1.setChosenLugnuts(ChosenSpecial.getNumberofLugNuts());
					return UserChoice1;
					}
				}
		
		if (InterfaceChoice == 1 ) {
			index = 1;
			for (VehicleSpecs.CarSpecs i : CarsList ) {
				System.out.println(i.getVehicleName()+" "+index);
				index=index+1;
			}
			System.out.println("Please Choose a vehicle by pressing the number associated to it, or create a new Vehicle with 0");
			InterfaceChoice = InputScanner.nextInt()-1;
			if (InterfaceChoice == -1) {
				CarsList.add(VehicleSpecs.Vehicle.new CarSpecs());
				System.out.println("If you do not want to add a specific Wheel or Torque Specification, Enter 0 ");
				for (VehicleSpecs.CarSpecs i : CarsList) {
					if (i.getVehicleName() == null) {
						System.out.println("Please Enter the Number of Front Wheels this Vehicle has:");
						i.setNumberFrontWheels(InputScanner.nextInt());
						System.out.println("Please Enter the Number of Back Wheels this Vehicle has:");
						i.setNumberofBackWheels(InputScanner.nextInt());
						System.out.println("Please Enter the Number of Lugnuts this Vehicle has:");
						i.setNumberofLugnuts(InputScanner.nextInt());
						System.out.println("Please Enter the TorqueSpec for Front Wheels :");
						i.setLugnutTorqueFront(InputScanner.nextInt());
						System.out.println("Please Enter the TorqueSpec for Rear Wheels :");
						i.setLugnutTorqueBack(InputScanner.nextInt());
						System.out.println("Please Enter a Name for this Vehicle :");
						i.setVehicleName(InputScanner.next());
						UserChoice1.setChosenFrontWheels(i.getNumberFrontWheels());
						UserChoice1.setChosenBackWheels(i.getNumberBackWheels());
						UserChoice1.setChosenFrontTorque(i.getTorqueFront());
						UserChoice1.setChosenBackTorque(i.getTorqueBack());
						UserChoice1.setChosenLugnuts(i.getNumberofLugNuts());
						return UserChoice1;
						}
					}	
				}
				else {
					VehicleSpecs.CarSpecs ChosenCar = CarsList.get(InterfaceChoice);
					UserChoice1.setChosenFrontWheels(ChosenCar.getNumberFrontWheels());
					UserChoice1.setChosenBackWheels(ChosenCar.getNumberBackWheels());
					UserChoice1.setChosenFrontTorque(ChosenCar.getTorqueFront());
					UserChoice1.setChosenBackTorque(ChosenCar.getTorqueBack());
					UserChoice1.setChosenLugnuts(ChosenCar.getNumberofLugNuts());
					return UserChoice1;
				}
			}
		
		if (InterfaceChoice == 2 ) {
			index = 1;
			for (VehicleSpecs.TruckSpecs i : TrucksList ) {
				System.out.println(i.getVehicleName()+" "+index);
				index = index + 1;
			}
			System.out.println("Please Choose a vehicle by pressing the number associated to it, or create a new Vehicle with 0");
			InterfaceChoice = InputScanner.nextInt()-1;
			if (InterfaceChoice == -1) {
				TrucksList.add(VehicleSpecs.Vehicle.new TruckSpecs());
				System.out.println("If you do not want to add a specific Wheel or Torque Specification, Enter 0 ");
				for (VehicleSpecs.TruckSpecs i : TrucksList) {
					if (i.getVehicleName() == null) {
						System.out.println("Please Enter the Number of Front Wheels this Vehicle has:");
						i.setNumberFrontWheels(InputScanner.nextInt());
						System.out.println("Please Enter the Number of Middle Wheels this Vehicle has:");
						i.setNumberMiddleWheels(InputScanner.nextInt());
						System.out.println("Please Enter the Number of Back Wheels this Vehicle has:");
						i.setNumberofBackWheels(InputScanner.nextInt());
						System.out.println("Please Enter the Number of Lugnuts this Vehicle has:");
						i.setNumberofLugnuts(InputScanner.nextInt());
						System.out.println("Please Enter the TorqueSpec for Front Wheels :");
						i.setLugnutTorqueFront(InputScanner.nextInt());
						System.out.println("Please Enter the TorqueSpec for Middle Wheels :");
						i.setLugnutTorqueMiddle(InputScanner.nextInt());
						System.out.println("Please Enter the TorqueSpec for Rear Wheels :");
						i.setLugnutTorqueBack(InputScanner.nextInt());
						System.out.println("Please Enter a Name for this Vehicle :");
						i.setVehicleName(InputScanner.next());
						UserChoice1.setChosenFrontWheels(i.getNumberFrontWheels());
						UserChoice1.setChosenBackWheels(i.getNumberBackWheels());
						UserChoice1.setChosenFrontTorque(i.getTorqueFront());
						UserChoice1.setChosenBackTorque(i.getTorqueBack());
						UserChoice1.setChosenLugnuts(i.getNumberofLugNuts());
						return UserChoice1;
						}
					}	
				}
				else {
					VehicleSpecs.TruckSpecs ChosenTruck = TrucksList.get(InterfaceChoice);
					UserChoice1.setChosenFrontWheels(ChosenTruck.getNumberFrontWheels());
					UserChoice1.setChosenBackWheels(ChosenTruck.getNumberBackWheels());
					UserChoice1.setChosenMiddleWheels(ChosenTruck.getNumberMiddleWheels());
					UserChoice1.setChosenFrontTorque(ChosenTruck.getTorqueFront());
					UserChoice1.setChosenMiddleTorque(ChosenTruck.getTorqueMiddle());
					UserChoice1.setChosenBackTorque(ChosenTruck.getTorqueBack());
					UserChoice1.setChosenLugnuts(ChosenTruck.getNumberofLugNuts());
					return UserChoice1;
				}
			
		}
		
		
		
		if (InterfaceChoice == 3 ) {
			index = 1;
			for (VehicleSpecs.BikeSpecs i : BikesList ) {
				System.out.println(i.getVehicleName()+" "+index);
				index = index + 1;
				}
			System.out.println("Please Choose a vehicle by pressing the number associated to it, or create a new Vehicle with 0");
			InterfaceChoice = InputScanner.nextInt()-1;
			if (InterfaceChoice == -1) {
				BikesList.add(VehicleSpecs.Vehicle.new BikeSpecs());
				System.out.println("If you do not want to add a specific Wheel or Torque Specification, Enter 0 ");
				for (VehicleSpecs.BikeSpecs i : BikesList) {
					if (i.getVehicleName() == null) {
						System.out.println("Please Enter the Number of Front Wheels this Vehicle has:");
						i.setNumberFrontWheels(InputScanner.nextInt());
						System.out.println("Please Enter the Number of Back Wheels this Vehicle has:");
						i.setNumberofBackWheels(InputScanner.nextInt());
						System.out.println("Please Enter the Number of Lugnuts this Vehicle has:");
						i.setNumberofLugnuts(InputScanner.nextInt());
						System.out.println("Please Enter the TorqueSpec for Front Wheels :");
						i.setLugnutTorqueFront(InputScanner.nextInt());
						System.out.println("Please Enter the TorqueSpec for Rear Wheels :");
						i.setLugnutTorqueBack(InputScanner.nextInt());
						System.out.println("Please Enter a Name for this Vehicle :");
						i.setVehicleName(InputScanner.next());
						UserChoice1.setChosenFrontWheels(i.getNumberFrontWheels());
						UserChoice1.setChosenBackWheels(i.getNumberBackWheels());
						UserChoice1.setChosenFrontTorque(i.getTorqueFront());
						UserChoice1.setChosenBackTorque(i.getTorqueBack());
						UserChoice1.setChosenLugnuts(i.getNumberofLugNuts());
						return UserChoice1;
						}
					}	
				}
				else {
					VehicleSpecs.BikeSpecs ChosenBike = BikesList.get(InterfaceChoice);
					UserChoice1.setChosenFrontWheels(ChosenBike.getNumberFrontWheels());
					UserChoice1.setChosenBackWheels(ChosenBike.getNumberBackWheels());
					UserChoice1.setChosenFrontTorque(ChosenBike.getTorqueFront());
					UserChoice1.setChosenBackTorque(ChosenBike.getTorqueBack());
					UserChoice1.setChosenLugnuts(ChosenBike.getNumberofLugNuts());
					return UserChoice1;
				}
			}
		return UserChoice1;
	}
}
	
	
