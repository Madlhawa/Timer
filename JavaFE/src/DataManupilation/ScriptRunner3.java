package DataManupilation;

public class ScriptRunner3 {

	public static void main(String args[]) {
		try{
			String[] command= {"./Run.sh"};
			ProcessBuilder pb = new ProcessBuilder("./Run.sh");
			pb.start();
			
		}catch(Exception e){System.out.println(e);}
			
	}
}
