package org.usfirst.frc.team3218.robot.subsystems;

import org.usfirst.frc.team3218.robot.Robot;
import org.usfirst.frc.team3218.robot.RobotMap;
import org.usfirst.frc.team3218.robot.commands.DriveWithXbox;
import org.usfirst.frc.team3218.robot.commands.DriveWithXbox;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

/**
 *
 */
public class DriveWheels extends Subsystem {
	
    SpeedController frontLeftMotor = new Jaguar(RobotMap.frontLeftChannel);
    SpeedController rearLeftMotor = new Jaguar(RobotMap.rearLeftChannel);
    SpeedController frontRightMotor = new Jaguar(RobotMap.frontRightChannel);
    SpeedController rearRightMotor = new Jaguar(RobotMap.rearRightChannel);
	MecanumDrive robotDrive = new MecanumDrive (frontLeftMotor,rearLeftMotor,frontRightMotor,rearRightMotor);
	 
	public DriveWheels(){
		
		frontLeftMotor.setInverted(true);
	}
    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithXbox());
      }
    
    public void drive(double z, double y){
   
    	robotDrive.driveCartesian(Robot.oi.getXboxX(),z,-y); //DIFFERENT POWER
    	
   
    }
}

