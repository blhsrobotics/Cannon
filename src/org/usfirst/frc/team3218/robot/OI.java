package org.usfirst.frc.team3218.robot;

import org.usfirst.frc.team3218.robot.commands.*;
import org.usfirst.frc.team3218.robot.commands.Angle.AngleDown;
import org.usfirst.frc.team3218.robot.commands.Angle.AngleUp;
import org.usfirst.frc.team3218.robot.commands.Loader.LoadSequence;
import org.usfirst.frc.team3218.robot.commands.Loader.LoaderEject;
import org.usfirst.frc.team3218.robot.commands.Loader.LoaderRetract;
import org.usfirst.frc.team3218.robot.commands.cannon.Fire;
import org.usfirst.frc.team3218.robot.commands.cannon.FireSequence;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	
    private static XboxController xbox = new XboxController(RobotMap.xboxPort);

    private Button aButton = new JoystickButton(xbox, RobotMap.aButtonPort),
    			   bButton = new JoystickButton(xbox, RobotMap.bButtonPort),
    			   yButton = new JoystickButton(xbox, RobotMap.yButtonPort),
    			   xButton = new JoystickButton(xbox, RobotMap.loadEjectButton),
    			   rightBumper = new JoystickButton(xbox, RobotMap.rightBumperPort),
    			   leftBumper = new JoystickButton(xbox, RobotMap.leftBumperPort),
    			   startButton = new JoystickButton(xbox,RobotMap.startButtonPort),
    			   backButton = new JoystickButton(xbox,RobotMap.backButtonPort);
    public OI(){
    	//button actions
    	rightBumper.whenPressed(new FireSequence());
    	yButton.whileHeld(new AngleDown());
    	aButton.whileHeld(new AngleUp());
    	bButton.whenPressed(new LoaderRetract());
    	backButton.whenPressed(new LoaderEject());
    	startButton.whenPressed(new LoadSequence());
    	//compressButton.whenPressed(new PowerSwitch());
    	
    	//Smart Dashboard command data
    	SmartDashboard.putData("Angle Up", new AngleUp());
    	SmartDashboard.putData("Angle Down", new AngleDown());
    	SmartDashboard.putData("FireSequence", new FireSequence());
    	SmartDashboard.putData("Fire", new Fire());
    	SmartDashboard.putData("LoaderEject", new LoaderEject());
    	SmartDashboard.putBoolean("Full Tank",Robot.compressor.full) ;
   

    }
    
    public static double getXboxY(){
    	return xbox.getY(Hand.kLeft);
    }
    public static double getXboxX(){
    	return xbox.getX(Hand.kLeft);
    }
    public static double getXboxZ(){
    	return xbox.getX(Hand.kRight);
    }

}

