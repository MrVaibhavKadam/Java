package mostaskedjava8programs;

public class Notes {
	 @Override
	public String toString() {
		return "Notes [id=" + id + ", noteString=" + noteString + ", num=" + num + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNoteString() {
		return noteString;
	}
	public void setNoteString(String noteString) {
		this.noteString = noteString;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	int id;
	 String noteString;
	 int num;
	public Notes(int id, String noteString, int num) {
		super();
		this.id = id;
		this.noteString = noteString;
		this.num = num;
	}
	
	
}
