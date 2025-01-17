package strings;

public class TestStringbuilder {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello hey");
		System.out.println("content "+sb);
		System.out.println("len "+sb.length()+"capacity "+sb.capacity());
		StringBuilder sb2=sb.append(1223.154);
		System.out.println(sb);
		System.out.println(sb2);
		System.out.println(sb==sb2);
	    sb.append(true).append('v').append(1254.365).append("manasi");
	    System.out.println(sb);
	    sb.reverse();
	    System.out.println("Reversed SB "+sb);
	    sb.delete(0, sb.length());
	    System.out.println("sb content "+sb);
	    System.out.println(sb.capacity()+" "+sb.length());
		sb.trimToSize();
		System.out.println(sb.capacity()+" "+sb.length());
	}

}
