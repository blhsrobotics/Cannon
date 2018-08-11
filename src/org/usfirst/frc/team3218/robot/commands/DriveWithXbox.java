package org.usfirst.frc.team3218.robot.commands;

import org.usfirst.frc.team3218.robot.OI;
import org.usfirst.frc.team3218.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveWithXbox extends Command {
	double threshold;
	double z;
	double y;
	double x;
	
    public DriveWithXbox() {
        requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	threshold=0.3;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//if(Math.abs(OI.getXboxZ())>threshold){
    		z=OI.getXboxZ();
    //	}else{
    		//z=0;
    	//}
    	//if(Math.abs(OI.getXboxY())>threshold){
    		y=OI.getXboxY();
    	//}else{
    		//y=0;
    	//}
    	
    	Robot.drive.drive(z, y);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
