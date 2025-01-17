package custome_excs;

@SuppressWarnings("serial")
public class SpeedOutOfRangeException extends Exception {
	
	public SpeedOutOfRangeException(String errorMesg) {
		super(errorMesg);//Invokes exception cls's constructor: to init errmesg.
	}

	
	
}
