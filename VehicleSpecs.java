package com.SmartSocketWrench;

/**
 * @author Yashmit Nayudu(CFDNIE)
 *
 */

import java.util.ArrayList;

class VehicleSpecs implements java.io.Serializable {

	private static final long serialVersionUID = 647455140207721769L;
	static VehicleSpecs Vehicle = new VehicleSpecs();
	
	
	class CarSpecs extends VehicleSpecs implements java.io.Serializable{

		private static final long serialVersionUID = 7852158612382656008L;
		private int NumberofFrontWheels = 2;
		private int NumberofRearWheels = 2;
		private int NumberofLugNuts = 0;
		private int LugnutTorqueFront = 0;
		private int LugnutTorqueBack = 0;
		private String VehicleName = "";
		
		public CarSpecs() {}
		
		public int getNumberFrontWheels() {return NumberofFrontWheels;}
		public int getNumberRearWheels() {return NumberofRearWheels;}
		public int getNumberofLugNuts() {return NumberofLugNuts;}
		public int getTorqueFront() {return LugnutTorqueFront;}
		public int getTorqueBack() {return LugnutTorqueBack;}
		public String getVehicleName() {return VehicleName;}
		public void setNumberofLugnuts(int Lugnuts) {this.NumberofLugNuts = Lugnuts;}
		public void setNumberFrontWheels(int FrontWheel) {this.NumberofFrontWheels = FrontWheel;}
		public void setNumberofBackWheels(int BackWheel) {this.NumberofRearWheels = BackWheel;}
		public void setLugnutTorqueFront(int TorqueFront) {this.LugnutTorqueFront = TorqueFront;}
		public void setLugnutTorqueBack(int TorqueBack) {this.LugnutTorqueBack = TorqueBack;}
		public void setVehicleName (String Name) {this.VehicleName = Name;}
	}
		
	 class TruckSpecs extends VehicleSpecs implements java.io.Serializable{
		private static final long serialVersionUID = -188298284372495700L;
		private int NumberofFrontWheels = 2;
		private int NumberofRearWheels = 2;
		private int NumberofMiddleWheels = 2;
		private int NumberofLugNuts;
		private int LugnutTorqueFront;
		private int LugnutTorqueMiddle;
		private int LugnutTorqueBack;
		private String VehicleName;
		
		public TruckSpecs() {}
		
		public int getNumberFrontWheels() {return NumberofFrontWheels;}
		public int getNumberMiddleWheels() {return NumberofMiddleWheels;}
		public int getNumberRearWheels() {return NumberofRearWheels;}
		public int getNumberofLugNuts() {return NumberofLugNuts;}
		public int getTorqueFront() {return LugnutTorqueFront;}
		public int getTorqueMiddle() {return LugnutTorqueMiddle;}
		public int getTorqueBack() {return LugnutTorqueBack;}
		public String getVehicleName() {return VehicleName;}
		public void setNumberofLugnuts(int Lugnuts) {this.NumberofLugNuts = Lugnuts;}
		public void setNumberFrontWheels(int FrontWheel) {this.NumberofFrontWheels = FrontWheel;}
		public void setNumberMiddleWheels(int MiddleWheel) {this.NumberofMiddleWheels = MiddleWheel;}
		public void setNumberofBackWheels(int BackWheel) {this.NumberofRearWheels = BackWheel;}
		public void setLugnutTorqueFront(int TorqueFront) {this.LugnutTorqueFront = TorqueFront;}
		public void setLugnutTorqueMiddle(int TorqueMiddle) {this.LugnutTorqueMiddle = TorqueMiddle;}
		public void setLugnutTorqueBack(int TorqueBack) {this.LugnutTorqueBack = TorqueBack;}
		public void setVehicleName (String Name) {this.VehicleName = Name;}
	 }
	 class BikeSpecs extends VehicleSpecs implements java.io.Serializable{
		static final long serialVersionUID = 3227233657680285111L;
		private int NumberofFrontWheels = 1;
		private int NumberofRearWheels = 1;
		private int NumberofLugNuts;
		private int LugnutTorqueFront;
		private int LugnutTorqueBack;
		private String VehicleName = "";
		
		public BikeSpecs() {}
		public int getNumberFrontWheels() {return NumberofFrontWheels;}
		public int getNumberRearWheels() {return NumberofRearWheels;}
		public int getNumberofLugNuts() {return NumberofLugNuts;}
		public int getTorqueFront() {return LugnutTorqueFront;}
		public int getTorqueBack() {return LugnutTorqueBack;}
		public String getVehicleName() {return VehicleName;}
		public void setNumberofLugnuts(int Lugnuts) {this.NumberofLugNuts = Lugnuts;}
		public void setNumberFrontWheels(int FrontWheel) {this.NumberofFrontWheels = FrontWheel;}
		public void setNumberofBackWheels(int BackWheel) {this.NumberofRearWheels = BackWheel;}
		public void setLugnutTorqueFront(int TorqueFront) {this.LugnutTorqueFront = TorqueFront;}
		public void setLugnutTorqueBack(int TorqueBack) {this.LugnutTorqueBack = TorqueBack;}
		public void setVehicleName (String Name) {this.VehicleName = Name;}
	 }
	 
	 class SpecialVehicle extends VehicleSpecs implements java.io.Serializable{
		private static final long serialVersionUID = 1440731119553727152L;
		private int NumberofFrontWheels = 0;
		private int NumberofRearWheels = 0;
		private int NumberofMiddleWheels = 0;
		private int NumberofLugNuts = 0;
		private int LugnutTorqueFront = 0;
		private int LugnutTorqueMiddle = 0;
		private int LugnutTorqueBack = 0;
		private String VehicleName = "";
		
		public SpecialVehicle() {}
		
		public int getNumberFrontWheels() {return NumberofFrontWheels;}
		public int getNumberMiddleWheels() {return NumberofMiddleWheels;}
		public int getNumberRearWheels() {return NumberofRearWheels;}
		public int getNumberofLugNuts() {return NumberofLugNuts;}
		public int getTorqueFront() {return LugnutTorqueFront;}
		public int getTorqueMiddle() {return LugnutTorqueMiddle;}
		public int getTorqueBack() {return LugnutTorqueBack;}
		public String getVehicleName() {return VehicleName;}
		public void setNumberofLugnuts(int Lugnuts) {this.NumberofLugNuts = Lugnuts;}
		public void setNumberFrontWheels(int FrontWheel) {this.NumberofFrontWheels = FrontWheel;}
		public void setNumberMiddleWheels(int MiddleWheel) {this.NumberofMiddleWheels = MiddleWheel;}
		public void setNumberofBackWheels(int BackWheel) {this.NumberofRearWheels = BackWheel;}
		public void setLugnutTorqueFront(int TorqueFront) {this.LugnutTorqueFront = TorqueFront;}
		public void setLugnutTorqueMiddle(int TorqueMiddle) {this.LugnutTorqueMiddle = TorqueMiddle;}
		public void setLugnutTorqueBack(int TorqueBack) {this.LugnutTorqueBack = TorqueBack;}
		public void setVehicleName (String Name) {this.VehicleName = Name;}
		
	 }
	 
	public static ArrayList<VehicleSpecs.CarSpecs> PopulateCarList() {
		 ArrayList<CarSpecs> CarsList = new ArrayList<CarSpecs>();
		 CarsList.add(Vehicle.new CarSpecs());
		 VehicleSpecs.CarSpecs CarsList1= CarsList.get(0);
		 CarsList1.setVehicleName("Light Car");
		 CarsList1.setLugnutTorqueFront(60);
		 CarsList1.setLugnutTorqueBack(60);
		 CarsList1.setNumberofLugnuts(3);
		 
		 
		 CarsList.add(Vehicle.new CarSpecs());
		 VehicleSpecs.CarSpecs CarsList2= CarsList.get(1);
		 CarsList2.setVehicleName("Medium Car");
		 CarsList2.setLugnutTorqueFront(70);
		 CarsList2.setLugnutTorqueBack(70);
		 CarsList2.setNumberofLugnuts(4);
		 
		 
		 CarsList.add(Vehicle.new CarSpecs());
		 VehicleSpecs.CarSpecs CarsList3= CarsList.get(2);
		 CarsList3.setVehicleName("Heavy Car");
		 CarsList3.setLugnutTorqueFront(75);
		 CarsList3.setLugnutTorqueBack(75);
		 CarsList3.setNumberofLugnuts(5);

		 return CarsList;
	 }	
	public static ArrayList<VehicleSpecs.TruckSpecs> PopulateTruckList(){
		
		ArrayList<TruckSpecs> TrucksList = new ArrayList<TruckSpecs>();
		
		TrucksList.add(Vehicle.new TruckSpecs());
		VehicleSpecs.TruckSpecs TrucksList1= TrucksList.get(0);
		TrucksList1.setVehicleName("Light Truck");
		TrucksList1.setLugnutTorqueFront(120);
		TrucksList1.setLugnutTorqueMiddle(120);
		TrucksList1.setLugnutTorqueBack(120);
		TrucksList1.setNumberofLugnuts(5);
		
		TrucksList.add(Vehicle.new TruckSpecs());
		VehicleSpecs.TruckSpecs TrucksList2= TrucksList.get(1);
		TrucksList2.setVehicleName("Medium Truck");
		TrucksList2.setLugnutTorqueFront(140);
		TrucksList2.setLugnutTorqueMiddle(140);
		TrucksList2.setLugnutTorqueBack(140);
		TrucksList2.setNumberofLugnuts(6);
		
		TrucksList.add(Vehicle.new TruckSpecs());
		VehicleSpecs.TruckSpecs TrucksList3= TrucksList.get(2);
		TrucksList3.setVehicleName("Heavy Truck");
		TrucksList3.setLugnutTorqueFront(200);
		TrucksList3.setLugnutTorqueMiddle(200);
		TrucksList3.setLugnutTorqueBack(200);
		TrucksList3.setNumberofLugnuts(6);
		
		return TrucksList;
	}
	public static ArrayList<VehicleSpecs.BikeSpecs> PopulateBikeList(){
		ArrayList<BikeSpecs> BikesList = new ArrayList<BikeSpecs>();
				
		BikesList.add(Vehicle.new BikeSpecs());
		VehicleSpecs.BikeSpecs BikesList1= BikesList.get(0);
		BikesList1.setLugnutTorqueFront(40);
		BikesList1.setLugnutTorqueBack(40);
		BikesList1.setNumberofLugnuts(3);
		BikesList1.setVehicleName("Light Bike");
		
		BikesList.add(Vehicle.new BikeSpecs());
		VehicleSpecs.BikeSpecs BikesList2= BikesList.get(1);
		BikesList2.setLugnutTorqueFront(50);
		BikesList2.setLugnutTorqueBack(50);
		BikesList2.setNumberofLugnuts(4);
		BikesList2.setVehicleName("Medium Bike");
		
		BikesList.add(Vehicle.new BikeSpecs());
		VehicleSpecs.BikeSpecs BikesList3= BikesList.get(2);
		BikesList3.setLugnutTorqueFront(60);
		BikesList3.setLugnutTorqueBack(60);
		BikesList3.setNumberofLugnuts(5);
		BikesList3.setVehicleName("Heavy Bike");
				
		return BikesList;
	}
	public static ArrayList<VehicleSpecs.SpecialVehicle> PupulateSpecialList(){
		ArrayList<SpecialVehicle> SpecialList = new ArrayList<SpecialVehicle>();
		SpecialList.add(Vehicle.new SpecialVehicle());
		VehicleSpecs.SpecialVehicle SpecialList1 = SpecialList.get(0);
		SpecialList1.setLugnutTorqueBack(50);
		SpecialList1.setLugnutTorqueFront(50);
		SpecialList1.setNumberFrontWheels(1);
		SpecialList1.setNumberofBackWheels(2);
		SpecialList1.setVehicleName("Tricycle");

		return SpecialList;
	}
}

