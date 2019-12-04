/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class RangeSensor_sub extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

	public static double distance;


@Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

	  // A sharpIR distance sensor plugged into analog input RobotMap.IR_ID
	  private static final AnalogInput sharpIR = new AnalogInput(RobotMap.IR_ID);
	  
	  // TODO - You will need to determine how to convert voltage to distance
	  // (use information from the data sheet, or your own measurements)
	  // private static final double VOLTS_TO_DIST = 1.0;

		public double infraredDistance() {
			double voltage = sharpIR.getVoltage();

			double distance = 1 * Math.pow(voltage, 1.0);
			SmartDashboard.putNumber("voltage", voltage);
				return distance;

		}
	}

