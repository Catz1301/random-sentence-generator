//package paraGenerate;

// paraReal.java

/******************************************
_____________________________
|*********** KEY ***********|
|* -D- Debuging info       *|
|* -E- Error info          *|
|* -C- Comment @Deprecated *| <- Deprecated as of writing the key.
|* -*- [ Start of block of *|
|* -*- ] End of block of   *|
|***************************|

Usage of strArray.Read:

requirements: none,

How to use: Should be self explanitory, just look at the paramater names.

Returns: Nothing, just prints the String[] contents without [ someWords, or multiples of words]

[-][-][-][-][-][-][-][-][-][-][-][-][-][-][-][-][-][-][-][-][-][-][-]

Usage of strArray.fileToArray:

Requirements: 1 Initialized String[] array, can be null.

How to use:
[code start]

strArray strarr = new strArray();
String[] example = null;
String[] arrayedString = strarr.fileToArray("path/to/file", example);

[code end]

Returns: A brand new (or not so new) String[] array

******************************************/


import java.util.*;
import java.util.Random;
import java.util.stream.*;
import java.io.*;
import java.lang.reflect.*;
//import this.CATZ; -E- Picky compiler


// Class for String[] functions
class strArray {
		// Create and initialize string
		String mew = "";

		// Function to read and print a String[], but without brackets or commas
		public void Read(String[] toRead, int elemNum, boolean clrConsole) throws IOException {
			
			for (int i = 0; i < elemNum; i++) {
				mew = mew + toRead[i] + " ";
				System.out.println(toRead[i]);
				System.out.println(mew);
			}
		}
		
		// Function to create String[] arrays from file contents
		public String[] fileToArray(String filePath, String[] stringArrayOutput) throws FileNotFoundException, IOException {
			
			BufferedReader in = new BufferedReader(new FileReader(filePath));
			String str;

			List<String> list = new ArrayList<String>();
			
			while((str = in.readLine()) != null) {
	    		list.add(str);
			}

			stringArrayOutput = list.toArray(new String[0]);
			
			return stringArrayOutput;
		}

}

// Main class
public class paraGen {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		// Initialize strArray class
		strArray strArr = new strArray();

		//every word//
		String[] stringA = null;
		String[] stringArr = strArr.fileToArray("../assets/english3.txt", stringA);

		//subjects//
		String[] stringS = null;
		String[] subjects = strArr.fileToArray("../assets/first-names.txt", stringS);

		//nouns//
		String[] stringN = null;
		String[] nouns = strArr.fileToArray("../assets/nouns.txt", stringN);

		//adjectives//
		String[] stringAd = null;
		String[] adjectives = strArr.fileToArray("../assets/adjectives.txt", stringAd);

		//verbs//
		String[] stringV = null;
		String[] verbs = strArr.fileToArray("../assets/verbs.txt", stringV);


		

		// Initialize string 'welts'
		String welts = "";
		
			//for (int jyd = 0; jyd < 5; jyd++) {
				//for (int jlk = 0; jlk < 7; jlk++) {
					welts = welts + sentences(nouns, adjectives, verbs, subjects) + " ";
				//}
				//welts = welts + "\n\n";
			//}
			
			System.out.println(welts);
	}

	
	public static String sentences(String[] n, String[] a, String[] v, String[] s) {
		String mooMewz;
		boolean aUsed = false;
		Random sr = new Random();

		int neel = Array.getLength(n);
		int aeel = Array.getLength(a);
		int veel = Array.getLength(v);
		int seel = Array.getLength(s);

		mooMewz = s[sr.nextInt(seel)] + " " + v[sr.nextInt(veel)];
		int ch0 = sr.nextInt(1);
		if (ch0 == 1) {
			mooMewz = mooMewz + " " + a[sr.nextInt(aeel)];
			aUsed = true;
		}


		int ch1 = sr.nextInt(1);
		if (ch1 == 0) {
			mooMewz = mooMewz + " " + n[sr.nextInt(neel)];
		}
		if (ch1 == 1) {
			mooMewz = mooMewz + " " + s[sr.nextInt(seel)];
		}

		int ch2 = sr.nextInt(1);
		if (ch2 == 1 && aUsed == false) {
			mooMewz = mooMewz + " " + a[sr.nextInt(aeel)];
			aUsed = true;
		}

		int ch3 = sr.nextInt(1);
		if (ch3 == 0) {
			mooMewz = mooMewz + " " + n[sr.nextInt(neel)];
		}
		if (ch3 == 1) {
			mooMewz = mooMewz + " " + s[sr.nextInt(seel)];
		}
		int ch4 = sr.nextInt(1);
		if (ch4 == 1 && ch3 == 1) {
			mooMewz = mooMewz + "s'" + " " + n[sr.nextInt(neel)];
		}
		String punct = "!.?";

		mooMewz = mooMewz + punct.charAt(sr.nextInt(2));


		return mooMewz;


	}


}
/*----------------------------------------------------------Everything after is useless-------------------------------------------------------------------*/
	//This is a function to read an arrayed string, and print it without commas and bra[kets.

//<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>

