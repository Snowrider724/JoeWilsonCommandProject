/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive_cmd;

/**
 * Add your docs here.
 */
public class DriveTrain_sub extends Subsystem {
  private Spark motorLeft =  new Spark(RobotMap.MOTOR_LEFT_ID);
  private Spark motorRight =  new Spark(RobotMap.MOTOR_RIGHT_ID);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
  setDefaultCommand(new TankDrive_cmd()); //this will be a new instance of the command
                                          // and when this command is finished, it is destroyed.
                                          // note any variables will be destroyed as well.
  }

  public void setLeftMotor(double speed) {
    motorLeft.set(speed);

  }
  public void setRightMotor(double speed) {
    motorRight.set(speed);
  }
}  