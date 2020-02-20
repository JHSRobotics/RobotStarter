/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.Talon;

public class DriveTrain extends SubsystemBase {
  /**
   * Creates a new DriveTrain.
   */
  private Talon motorLeftTalon;
  private Victor motorLeftVictor;
  private Talon motorRightTalon;
  private Victor motorRightVictor;


  public DriveTrain() {    
    motorLeftTalon = new Talon(Constants.MOTOR_LEFT_TALON);
    motorLeftVictor = new Victor(Constants.MOTOR_LEFT_VICTOR);
    motorRightTalon = new Talon(Constants.MOTOR_RIGHT_TALON);
    motorRightVictor = new Victor(Constants.MOTOR_RIGHT_VICTOR);
  }

  public void setLeftMotor(double speed){
    //***Might want to set inverted instead
    motorLeftTalon.set(-speed);
    motorLeftVictor.set(-speed);
  }

  public void setRightMotor(double speed){
    motorRightTalon.set(speed);
    motorRightVictor.set(speed);
    //System.out.println("SET RIGHT");
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
