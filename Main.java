package com.SmartSocketWrench;

/**
 * @author Yashmit Nayudu(CFDNIE)
 *
 */

import java.io.IOException;

public class Main {	
	//The main function is intentionally kept the way it is so that the sensors class, and interface class can be swapped for functioning Devices.
	public static void main (String[] args) throws IOException{
		int exitFlag=0;                                                //Keeps track of whether the user wants to exit or continue for another vehicle
		Interface.UserChoice UserChoice;							   //Creates new object of class UserChoice to import user choice
		Interface.Initialize();										   //Initializes starting Arraylists with default Vehicle Configs
		Interface.SensorCheck();									   //Makes sure that sensor read values are not above or below what they can actually read to make sure they are not faulty
		while(exitFlag==0) {
			UserChoice = Interface.getUserChoice();                    //Gets the input from user from Interface Class
			Interface.printCurrentVehicleInfo(UserChoice.getChosenFrontWheels(), UserChoice.getChosenMiddleWheels(), UserChoice.getChosenBackWheels(), UserChoice.getChosenLugnuts());
			if (UserChoice.getChosenFrontWheels()!=0) {                //if statement used to skip front wheel if value is 0
				Interface.printMovetoFront();                          //tells interface to show the user that front wheels will be torqued first
				for (int i=UserChoice.getChosenFrontWheels(); i>0 ;i--) { 
					//for loop to keep count of how many wheels exist in the front and how many have been torqued already					
					Interface.printCurrentTireInfo(UserChoice.getChosenLugnuts(), UserChoice.getChosenFrontTorque());
					//prints current tire information for user using Interface class
					for (int j=UserChoice.getChosenLugnuts(); j>0; j--) { //for loop to keep track of number of lugnuts per tire
						while (UserChoice.getChosenFrontTorque()>Sensors.TorqueCurrent()) { //while loop keeps checking TorqueSensor and lets the interface know when desired torque is reached
						Interface.printStartTightening();			   //tells the user to keep increasing the torque until desired value is reached
						}
						if (j==1) {continue;}						   //skips printing of the next lugnut if the current lugnut is the last on the wheel
						Interface.printNextLugnut();				   //asks the interface to show the current lugnut was torqued to spec
					}
					if (i==1) {continue;}							   //skips printing of the next wheel if the current wheel is the last one on the side
					Interface.printNextTire();						   //asks the interface to show the current wheel was torqued to spec
				}
				Interface.printFrontTireDone();						   //asks the interface to show the Front side of vehicle was torqued
			}
			if (UserChoice.getChosenMiddleWheels()!=0) {				//Front side logic is repeated for Middle side of vehicle
				Interface.printMovetoMiddle();
				for (int i=UserChoice.getChosenMiddleWheels(); i>0 ;i--) {
					Interface.printCurrentTireInfo(UserChoice.getChosenLugnuts(), UserChoice.getChosenMiddleTorque());
					for (int j=UserChoice.getChosenLugnuts(); j>0; j--)  {
						while (UserChoice.getChosenMiddleTorque()>Sensors.TorqueCurrent()) {
						Interface.printStartTightening();
						}
						if (j==1) {continue;}
						Interface.printNextLugnut();
					}
					if (i==1) {continue;}
					Interface.printNextTire();
				}
				Interface.printMiddleTireDone();
			}
			
			if (UserChoice.getChosenBackWheels()!=0) {					//Middle side logic is repeated for Rear side of vehicle
				Interface.printMovetoBack();
				for (int i=UserChoice.getChosenBackWheels(); i>0 ;i--) {
					Interface.printCurrentTireInfo(UserChoice.getChosenLugnuts(), UserChoice.getChosenBackTorque());
					for (int j=UserChoice.getChosenLugnuts(); j>0; j--)  {
						while (UserChoice.getChosenBackTorque()>Sensors.TorqueCurrent()) {
						Interface.printStartTightening();
						}
						if (j==1) {continue;}
						Interface.printNextLugnut();
					}
					if (i==1) {continue;}
					Interface.printNextTire();
				}
				Interface.printBackTireDone();
			}
			exitFlag = Interface.exitPrompt();						  //asks the interface whether user wants to exit or repeat logic for another vehicle
		}
		Interface.exitThanks();										  //asks interface to print a thank you note if user is done with all tasks
	}
}	
