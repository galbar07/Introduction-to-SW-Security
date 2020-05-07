import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class EXP01_J {
	
	//Non Compliant
	public static void ReadFile(File f) {
		
		if(f.exists()) {//Derefarncing a object file without checking of null
			System.out.println("File name: " + f.getName());			
		}
		return ;
		}
		
	
	

	public static void main(String[] args) {
	//Calling the function read with a null -> will cause NullPointerEcption
	 File myObj =null;
	 ReadFile(myObj);
	}

}

