package org.usfirst.frc.team3218.robot.commands.cannon;

import org.usfirst.frc.team3218.robot.Robot;
import org.usfirst.frc.team3218.robot.commands.Loader.LoaderEject;
import org.usfirst.frc.team3218.robot.commands.Loader.LoaderRetract;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class AutoFire extends CommandGroup {
	Timer timer = new Timer();
    
	public AutoFire() {
		requires(Robot.cannon);
		requires(Robot.loader);
		
		addSequential(new Fire());
        
        addSequential(new LoaderEject());
        addSequential(new WaitCommand(.25));
        addSequential(new LoaderRetract());
        addSequential(new WaitCommand(1.25));
    	
		addSequential(new Fire());
        
        addSequential(new LoaderEject());
        addSequential(new WaitCommand(.25));
        addSequential(new LoaderRetract());
        addSequential(new WaitCommand(1.25));
        
		addSequential(new Fire());
        
        addSequential(new LoaderEject());
        addSequential(new WaitCommand(.25));
        addSequential(new LoaderRetract());
        addSequential(new WaitCommand(1.25));
    	
		addSequential(new Fire());
        
        addSequential(new LoaderEject());
        addSequential(new WaitCommand(.25));
        addSequential(new LoaderRetract());
        addSequential(new WaitCommand(1.25));

        
    	// Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
