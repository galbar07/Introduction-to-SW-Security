import java.io.File;

public class ERR08_J {

	
	//Non Compliant
	public static boolean ReadFile(File f) {
		
		try {
		if(f.exists()) {//Derefarncing a object file without checking of null
			System.out.println("File name: " + f.getName());	
			return true;
		}
		return false;
		}
		catch (NullPointerException e){//Catching a NullPointerExeption and return false as an answer instead of throw out an error.
			e.printStackTrace();
			return false;
		}
	}
		
	
	

	public static void main(String[] args) {
	//Calling the function read with a null -> will cause NullPointerEcption
	 File myObj =null;
	 ReadFile(myObj);
	}

}

