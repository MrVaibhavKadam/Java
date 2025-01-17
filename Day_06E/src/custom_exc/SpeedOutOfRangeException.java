package custom_exc;

public class SpeedOutOfRangeException extends Exception {
	public SpeedOutOfRangeException(String errormsg) {
		super(errormsg);//Invokes the exceptioncls's constructor:to initiate error mesg.
		
	}

}
