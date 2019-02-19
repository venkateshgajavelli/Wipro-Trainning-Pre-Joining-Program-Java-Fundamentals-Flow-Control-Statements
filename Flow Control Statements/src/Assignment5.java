
public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char var = '$';
		
		if( Character.isAlphabetic(var))
			System.out.println("Alphabetic");
		else if ( Character.isDigit(var))
			System.out.println("Digit");
		else
			System.out.println("Special Character");

	}

}
