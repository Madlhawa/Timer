package DataManupilation;

public class ScriptRunner2 {

	public static void main(String args[]) {
		try{
			ProcessBuilder pb = new ProcessBuilder("python","timeGrabber.py");
			pb.start();
			
		}catch(Exception e){System.out.println(e);}
			
	}
}
