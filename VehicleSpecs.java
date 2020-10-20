package com.SmartSocketWrench;

/**
 * @author Yashmit Nayudu(CFDNIE)
 *
 */

import java.util.ArrayList;

class VehicleSpecs implements java.io.Serializable {                                                   //created a new class vehicle in which all Vehicles belong to

	private static final long serialVersionUID = 647455140207721769L;								   //I am not completely sure what this does but eclipse wanted a serial id attached to all classes
	static VehicleSpecs Vehicle = new VehicleSpecs();												   //Create a basic Vehicle which belongs to class VehicleSpecs and will be used to make objects of the subclasses 
	
	
	class CarSpecs extends VehicleSpecs implements java.io.Serializable{							   //Create a class for all Cars	

		private static final long serialVersionUID = 7852158612382656008L;
		private int NumberofFrontWheels = 2;														   //Create all variables associated with Cars, and initialize them to avoid errors
		private int NumberofBackWheels = 2;
		private int NumberofLugNuts = 0;
		private int LugnutTorqueFront = 0;
		private int LugnutTorqueBack = 0;
		private String VehicleName = null;
		
		public CarSpecs() {}																		   //Created Constructor
			
		public int getNumberFrontWheels() {return NumberofFrontWheels;}                                //Create Getter and Setter for all variables of the class
		public int getNumberBackWheels() {return NumberofBackWheels;}
		public int getNumberofLugNuts() {return NumberofLugNuts;}
		public int getTorqueFront() {return LugnutTorqueFront;}
		public int getTorqueBack() {return LugnutTorqueBack;}
		public String getVehicleName() {return VehicleName;}
		public void setNumberofLugnuts(int Lugnuts) {this.NumberofLugNuts = Lugnuts;}
		public void setNumberFrontWheels(int FrontWheel) {this.NumberofFrontWheels = FrontWheel;}
		public void setNumberofBackWheels(int BackWheel) {this.NumberofBackWheels = BackWheel;}
		public void setLugnutTorqueFront(int TorqueFront) {this.LugnutTorqueFront = TorqueFront;}
		public void setLugnutTorqueBack(int TorqueBack) {this.LugnutTorqueBack = TorqueBack;}
		public void setVehicleName (String Name) {this.VehicleName = Name;}
	}
		
	 class TruckSpecs extends VehicleSpecs implements java.io.Serializable{                           //Create a class for all Trucks
		private static final long serialVersionUID = -188298284372495700L;
		private int NumberofFrontWheels = 2;                                                          //Create all variables associated with Trucks, and initialize them to avoid errors
		private int NumberofBackWheels = 2;
		private int NumberofMiddleWheels = 2;
		private int NumberofLugNuts;
		private int LugnutTorqueFront;
		private int LugnutTorqueMiddle;
		private int LugnutTorqueBack;
		private String VehicleName;
		
		public TruckSpecs() {}																         //Created Constructor
		
		public int getNumberFrontWheels() {return NumberofFrontWheels;}                              //Create Getter and Setter for all variables of the class
		public int getNumberMiddleWheels() {return NumberofMiddleWheels;}
		public int getNumberBackWheels() {return NumberofBackWheels;}
		public int getNumberofLugNuts() {return NumberofLugNuts;}
		public int getTorqueFront() {return LugnutTorqueFront;}
		public int getTorqueMiddle() {return LugnutTorqueMiddle;}
		public int getTorqueBack() {return LugnutTorqueBack;}
		public String getVehicleName() {return VehicleName;}
		public void setNumberofLugnuts(int Lugnuts) {this.NumberofLugNuts = Lugnuts;}
		public void setNumberFrontWheels(int FrontWheel) {this.NumberofFrontWheels = FrontWheel;}
		public void setNumberMiddleWheels(int MiddleWheel) {this.NumberofMiddleWheels = MiddleWheel;}
		public void setNumberofBackWheels(int BackWheel) {this.NumberofBackWheels = BackWheel;}
		public void setLugnutTorqueFront(int TorqueFront) {this.LugnutTorqueFront = TorqueFront;}
		public void setLugnutTorqueMiddle(int TorqueMiddle) {this.LugnutTorqueMiddle = TorqueMiddle;}
		public void setLugnutTorqueBack(int TorqueBack) {this.LugnutTorqueBack = TorqueBack;}
		public void setVehicleName (String Name) {this.VehicleName = Name;}
	 }
	 class BikeSpecs extends VehicleSpecs implements java.io.Serializable{					        //Create a class for all Bikes
		static final long serialVersionUID = 3227233657680285111L;
		private int NumberofFrontWheels = 1;                                                        //Create all variables associated with Bikes, and initialize them to avoid errors
		private int NumberofBackWheels = 1;
		private int NumberofLugNuts = 0;
		private int LugnutTorqueFront = 0;
		private int LugnutTorqueBack = 0;
		private String VehicleName = null;
		
		public BikeSpecs() {}                                                                       //Created Constructor
		public int getNumberFrontWheels() {return NumberofFrontWheels;}                             //Create Getter and Setter for all variables of the class
		public int getNumberBackWheels() {return NumberofBackWheels;}
		public int getNumberofLugNuts() {return NumberofLugNuts;}
		public int getTorqueFront() {return LugnutTorqueFront;}
		public int getTorqueBack() {return LugnutTorqueBack;}
		public String getVehicleName() {return VehicleName;}
		public void setNumberofLugnuts(int Lugnuts) {this.NumberofLugNuts = Lugnuts;}
		public void setNumberFrontWheels(int FrontWheel) {this.NumberofFrontWheels = FrontWheel;}
		public void setNumberofBackWheels(int BackWheel) {this.NumberofBackWheels = BackWheel;}
		public void setLugnutTorqueFront(int TorqueFront) {this.LugnutTorqueFront = TorqueFront;}
		public void setLugnutTorqueBack(int TorqueBack) {this.LugnutTorqueBack = TorqueBack;}
		public void setVehicleName (String Name) {this.VehicleName = Name;}
	 }
	 
	 class SpecialVehicle extends VehicleSpecs implements java.io.Serializable{					   //Create a class for all Special vehicles that don't fit into the above classes 
		private static final long serialVersionUID = 1440731119553727152L;
		private int NumberofFrontWheels = 0;													   //Create all variables associated with Bikes, and initialize them to avoid errors
		private int NumberofBackWheels = 0;
		private int NumberofMiddleWheels = 0;
		private int NumberofLugNuts = 0;
		private int LugnutTorqueFront = 0;
		private int LugnutTorqueMiddle = 0;
		private int LugnutTorqueBack = 0;
		private String VehicleName = null;
		
		public SpecialVehicle() {}                                                                 //Created Constructor
		
		public int getNumberFrontWheels() {return NumberofFrontWheels;}							   //Create Getter and Setter for all variables of the class
		public int getNumberMiddleWheels() {return NumberofMiddleWheels;}
		public int getNumberBackWheels() {return NumberofBackWheels;}
		public int getNumberofLugNuts() {return NumberofLugNuts;}
		public int getTorqueFront() {return LugnutTorqueFront;}
		public int getTorqueMiddle() {return LugnutTorqueMiddle;}
		public int getTorqueBack() {return LugnutTorqueBack;}
		public String getVehicleName() {return VehicleName;}
		public void setNumberofLugnuts(int Lugnuts) {this.NumberofLugNuts = Lugnuts;}
		public void setNumberFrontWheels(int FrontWheel) {this.NumberofFrontWheels = FrontWheel;}
		public void setNumberMiddleWheels(int MiddleWheel) {this.NumberofMiddleWheels = MiddleWheel;}
		public void setNumberofBackWheels(int BackWheel) {this.NumberofBackWheels = BackWheel;}
		public void setLugnutTorqueFront(int TorqueFront) {this.LugnutTorqueFront = TorqueFront;}
		public void setLugnutTorqueMiddle(int TorqueMiddle) {this.LugnutTorqueMiddle = TorqueMiddle;}
		public void setLugnutTorqueBack(int TorqueBack) {this.LugnutTorqueBack = TorqueBack;}
		public void setVehicleName (String Name) {this.VehicleName = Name;}
		
	 }
	 
	public static ArrayList<VehicleSpecs.CarSpecs> PopulateCarList() {							//Created and array list for Cars and added 3 basic types using setters
		 ArrayList<CarSpecs> CarsList = new ArrayList<CarSpecs>();								//This is a function as the main class will call this to create all the array lists for the first time, 
		 CarsList.add(Vehicle.new CarSpecs());													//once initialized the Interface class can add more vehicles to the array list 
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
	public static ArrayList<VehicleSpecs.TruckSpecs> PopulateTruckList(){					//Created and array list for Trucks and added 3 basic types using setters
		
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
	public static ArrayList<VehicleSpecs.BikeSpecs> PopulateBikeList(){                    //Created and array list for Bikes and added 3 basic types using setters
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
	public static ArrayList<VehicleSpecs.SpecialVehicle> PupulateSpecialList(){         //Created and array list for Special Vehicles and added 3 basic types using setters
		ArrayList<SpecialVehicle> SpecialList = new ArrayList<SpecialVehicle>();
		SpecialList.add(Vehicle.new SpecialVehicle());
		VehicleSpecs.SpecialVehicle SpecialList1 = SpecialList.get(0);
		SpecialList1.setNumberofLugnuts(3);
		SpecialList1.setLugnutTorqueBack(50);
		SpecialList1.setLugnutTorqueFront(50);
		SpecialList1.setNumberFrontWheels(1);
		SpecialList1.setNumberofBackWheels(2);
		SpecialList1.setVehicleName("Tricycle");

		return SpecialList;
	}
}

