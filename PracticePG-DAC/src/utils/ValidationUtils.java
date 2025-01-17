package utils;

import custome_excs.SpeedOutOfRangeException;

public class ValidationUtils {
	//add speed limits
	public static final int MIN_SPEED, MAX_SPEED;
	
	static {
		MIN_SPEED = 40;
		MAX_SPEED = 80;
	}
	
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException {
		//check for min speed
		if (speed<MIN_SPEED) {
			throw new SpeedOutOfRangeException("You are riding too Slow.");
		}
		
		if (speed>MAX_SPEED) {
			throw new SpeedOutOfRangeException("You are riding too Fast.");
		}
		
		System.out.println("Speed within range Continue Riding..!");
	}
	
}
