package com.SmartSocketWrench;

/**
 * @author Yashmit Nayudu(CFDNIE)
 *
 */

import java.io.IOException;

public class Main {
	public static void main (String[] args) throws IOException{
		int exitFlag=0;
		Interface.UserChoice UserChoice;
		Interface.Initialize();
		Interface.SensorCheck();
		while(exitFlag==0) {
			UserChoice = Interface.getUserChoice();
			Interface.printCurrentVehicleInfo(UserChoice.getChosenFrontWheels(), UserChoice.getChosenMiddleWheels(), UserChoice.getChosenBackWheels(), UserChoice.getChosenLugnuts());
			if (UserChoice.getChosenFrontWheels()!=0) {
				Interface.printMovetoFront();
				for (int i=UserChoice.getChosenFrontWheels(); i>0 ;i--) {					
					Interface.printCurrentTireInfo(UserChoice.getChosenLugnuts(), UserChoice.getChosenFrontTorque());
					for (int j=UserChoice.getChosenLugnuts(); j>0; j--) {
						while (UserChoice.getChosenFrontTorque()>Sensors.TorqueCurrent()) {
						Interface.printStartTightening();
						}
						if (j==1) {continue;}
						Interface.printNextLugnut();
					}
					if (i==1) {continue;}
					Interface.printNextTire();
				}
				Interface.printFrontTireDone();
			}
			if (UserChoice.getChosenMiddleWheels()!=0) {
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
			
			if (UserChoice.getChosenBackWheels()!=0) {
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
			exitFlag = Interface.exitPrompt();			
		}
		Interface.exitThanks();
	}
}	
