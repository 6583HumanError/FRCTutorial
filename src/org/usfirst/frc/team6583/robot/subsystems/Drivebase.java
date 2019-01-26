package org.usfirst.frc.team6583.robot.subsystems;

import org.usfirst.frc.team6583.robot.*;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.*;

public class Drivebase extends Subsystem {
	
	private Spark LeftMotor;
	private Spark RightMotor;

	public Drivebase ( ) {
		LeftMotor = new Spark(RobotMap.LEFT_MOTOR.value);
		RightMotor = new Spark(RobotMap.RIGHT_MOTOR.value);
	}
	
	public void setRaw(double leftvalue, double rightvalue) {
	LeftMotor.set(-leftvalue);
	RightMotor.set(rightvalue);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
