/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class TankDrive_cmd extends Command {
  public TankDrive_cmd() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.driveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }
     
  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    double leftStickY = Robot.m_oi.GetDriverRawAxis(RobotMap.LEFT_STICK_Y);
    double rightStickY = Robot.m_oi.GetDriverRawAxis(RobotMap.RIGHT_STICK_Y);

    Robot.driveTrain.setLeftMotor(leftStickY);
    Robot.driveTrain.setRightMotor(rightStickY);

   SmartDashboard.putNumber("leftStickY",leftStickY);
   SmartDashboard.putNumber("rightStickY",rightStickY);

   SmartDashboard.putNumber("Infrared Voltage", voltage);

  //  SmartDashboard.putNumber("Total Current", Robot.pdp.getTotalCurrent());
  }

  
  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    //this makes sure the motors are turned off at the end:
    //Joe says if anything happens with the drivetrain, first the motors will stop.
    Robot.driveTrain.setLeftMotor(0.);
    Robot.driveTrain.setRightMotor(0.);

  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
      this.end(); // 
  }
}
