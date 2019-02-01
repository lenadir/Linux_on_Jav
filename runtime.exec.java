// using the java.lang.Runtime.exec class to run a simple code //

import java.io.BufferedReader;
import java.io.InputStreamReader;

/** Reads the standard output directly without having to temporarily store the output on disk
**/

public class testprog {
    public static void main(String args[]) {
        
		String s;
        Process p;
        try {
            p = Runtime.getRuntime().exec("ls -aF");
            BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
            
			while ((s = br.readLine()) != null)
                System.out.println("line: " + s);
            p.waitFor();
            System.out.println ("exit: " + p.exitValue());
            p.destroy();
        } catch (Exception e) {}
    }
}




