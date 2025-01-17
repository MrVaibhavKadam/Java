package utils;

import custom_exc.SpeedOutOfRangeException;

public class ValidationUtils {
	//Add speed limits
	public static final int MIN_SPEED,MAX_SPEED;
	static {
		MIN_SPEED=40;
		MAX_SPEED=80;
	}
	//validate speed
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException
	{
		//check fir min speed
		if(speed<MIN_SPEED)
			throw new SpeedOutOfRangeException("You are driving too slow..!!");
		if(speed>MAX_SPEED)
			throw new SpeedOutOfRangeException("you are driving too fast..!!");
		System.out.println("Speed within range... continue");
	}
}
