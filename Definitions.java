package org.usfirst.frc.team2850.robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.I2C.Port;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;

public class Definitions {
	
	public static final int XBOX1_PORT = 0;
	
	public static final int PCM_0 = 0;
	
	public static final int DRIVE_SHIFTER = 0;
	
	public static final int LEFT_DRIVE_MOTOR1_PORT = 0;
	public static final int LEFT_DRIVE_MOTOR2_PORT = 1;
	public static final int RIGHT_DRIVE_MOTOR1_PORT = 2;
	public static final int RIGHT_DRIVE_MOTOR2_PORT = 3;
	//public static final int LEFT_DRIVE_ENC = 0;
	//public static final int RIGHT_DRIVE_ENC = 1;
	
	public static Compressor compressor;
	
    static Joystick xbox1;
	 
	 public static Spark leftdrive1;
	 public static Spark leftdrive2;
	 public static Spark rightdrive1;
	 public static Spark rightdrive2;
	 
	 public static Solenoid driveshifter;
	 
	 public static RobotDrive drivetrain;
	 
	 //public static Encoder leftdriveencoder;
	 //public static Encoder rightdriveencoder;
	 
	 public static void initPeripherals(){
		 
	 xbox1 = new Joystick(XBOX1_PORT);
	 
	 leftdrive1 = new Spark(LEFT_DRIVE_MOTOR1_PORT);
	 leftdrive2 = new Spark(LEFT_DRIVE_MOTOR2_PORT);
	 rightdrive1 = new Spark(LEFT_DRIVE_MOTOR1_PORT);
	 rightdrive2 = new Spark(LEFT_DRIVE_MOTOR2_PORT);
	 
	 drivetrain = new RobotDrive(leftdrive1, leftdrive2, rightdrive1, rightdrive2);
	 
	 driveshifter = new Solenoid(DRIVE_SHIFTER);
	 compressor = new Compressor();
	 
	 /* leftdriveencoder = new Encoder(LEFT_DRIVE_ENC);
	  * rightdriveencoder = new Encoder(RIGHT_DRIVE_ENC);
	 */
	 }
}
