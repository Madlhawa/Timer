package DataManupilation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ScriptRunner {

	public static void main(String args[]) {
		try {
			//String[] cmd= {"cd PythonBE", "python timeGrabber.py"};
            Runtime r = Runtime.getRuntime();
            Process p = r.exec("python timeGrabber.py");
             
            // I thought using a p.destroy(); right after the waitFor, but, of course, it didn't work,
            // because the thread never ended.
            p.waitFor();
 
            //BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = "";
            BufferedReader br1 =null;
			while ((br1 = new BufferedReader(new InputStreamReader(p.getInputStream())))!= null) {
            	line = br1.readLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
            // e.printStackTrace();
        }
	}
}
