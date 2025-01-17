package test_enum;

public enum Direction {
	EAST,WEST,SOUTH,NORTH;
	//semicolon is not compulsory if we don't written a code after enum.
	//here we are writing the code so ";" is required.
	@Override
	public String toString() {
		return name().toLowerCase()+"@"+ordinal();
	}

}
