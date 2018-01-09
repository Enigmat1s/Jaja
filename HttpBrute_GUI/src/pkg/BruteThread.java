package pkg;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

public class BruteThread {
	
	public static String Brut(String adress, String log, String passwd) {
		String line = null;
			
		 try {
	            URL url = new URL(adress);
	            String Creds = log + ";" + passwd;
	            byte[] Credb = Creds.getBytes("UTF-8");
	            String encoding = Base64.getEncoder().encodeToString(Credb);

	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            connection.setRequestMethod("POST");
	            connection.setDoOutput(true);
	            connection.setRequestProperty  ("Authorization", "Basic " + encoding);
	            InputStream content = (InputStream)connection.getInputStream();
	            BufferedReader in   = new BufferedReader (new InputStreamReader (content));
	            while ((line = in.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch(Exception e) {
	            e.printStackTrace();
	        }
		return line;
	}


}
