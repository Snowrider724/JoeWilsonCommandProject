/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static final int MOTOR_LEFT_ID = 0;   //PWM input
  public static final int MOTOR_RIGHT_ID = 1;  //PWM input
  
  public static final int DRIVER_CONTROLLER = 0;  // PC's USB port

  public static final int LEFT_STICK_Y = 1;  //Xbox button mapping
  public static final int RIGHT_STICK_Y = 5; //Xbox button mapping
  public static final int BUTTON_A_ID = 1;   //Xbox button mapping
  public static final int BUTTON_B_ID = 2;  //Xbox button mapping

  public static final double GRAB_TIME = 0.75;
  public static final double GRAB_REVOLUTION = 0.15;
  
  public static final int PDP_CAN_ID = 0;

  public static final int IR_ID = 0; // Analogue input

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
