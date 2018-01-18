package pkg;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import 

public class Analysed {
	
	String paps = null;
	
	

	public Analysed(String login, Integer min, Integer max) {
		
		BruteThread
		
	}
	
	private void passgen(int alp, int min, int max, String curr) {
		String[] numarr = {"0","1","2","3","4","5","6","7","8","9"};
		String[] charr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String[] numcharr = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String[] charr2 = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String[] numcharr2 = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String[] givenArr = {};
		if (alp == 0) {
			givenArr = numarr;
		}
		
		else if (alp == 1) {
			givenArr = numcharr;
		}
		else if (alp == 2){
			givenArr = charr;
		}
		else if (alp == 3) {
			givenArr = numcharr2;
		}
		int paps = min;
		while (paps <= max) {
			for (String c : givenArr) {
				 StringBuilder curpass = new StringBuilder();
				 while (curpass.length() < paps) {
					  curpass.insert(0, "0");
				 }
				 BruteThread()
			}
		}
	}
	
	public void bruter(String adr, String logtxt, Integer min, Integer max) {
		//BruteThread.Brut(adr, logtxt, paps);
	}

}
