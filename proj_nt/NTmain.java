package proj_nt;

import java.io.IOException;

public class NTmain {
	public static void main(String[] args) {
	    try (NoteTaking nt = new NoteTaking("notes.txt")) {
	        nt.writeNT("This is the first writing in this notes");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}