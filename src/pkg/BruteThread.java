package pkg;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

public class BruteThread {
	
	public String bruter(String input) {
		String Cred = new String(input);
		String Reply = null;
		 try {
	            URL url = new URL(input);
	            byte[] Credb = Cred.getBytes("UTF-8");
	            String encoding = Base64.getEncoder().encodeToString(Credb);

	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            connection.setRequestMethod("POST");
	            connection.setDoOutput(true);
	            connection.setRequestProperty  ("Authorization", "Basic " + encoding);
	            InputStream content = (InputStream)connection.getInputStream();
	            BufferedReader in   = new BufferedReader (new InputStreamReader (content));
	            String line;
	            while ((line = in.readLine()) != null) {
	                System.out.println(line);
	                return line;
	            }
	        } catch(Exception e) {
	            e.printStackTrace();
	            return "Error";
	        }
		return Reply;
	}


}
