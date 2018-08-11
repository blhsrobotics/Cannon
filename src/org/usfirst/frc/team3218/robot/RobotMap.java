package org.usfirst.frc.team3218.robot;

import java.nio.charset.MalformedInputException;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	 // Channels for the DriveWheels
    public static final int frontLeftChannel	= 0;//pwm
    public static final int rearLeftChannel	= 2;//pwm
    public static final int frontRightChannel	= 1;//pwm
    public static final int rearRightChannel	= 3;//pwm
	
   
    //Joystick Channel
    public static final int xboxPort	= 0;
    
    //Joystick Button Channels
    public static final int aButtonPort=1;
    public static final int bButtonPort=5;
    public static final int yButtonPort=3;
    public static final int rightBumperPort=4;
    public static final int loadEjectButton=6;
    public static int leftBumperPort=2;
    public static final int startButtonPort = 0;
	public static final int backButtonPort = 0;
  // public static final int compressButton = 7;
    
    //LoaderChannels
    public static final int loaderEjectChannel = 0;//pcm
    public static final int loaderRetractChannel = 3; //pcm
    
    //AngleChannels
    public static final int angleacuatorChannel = 1;//relay
    
    //Firing Solenoid Channels
    public static final int fireChannel=2;//relay
	
	
    

}
