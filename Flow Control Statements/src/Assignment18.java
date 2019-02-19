
public class Assignment18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(args[0]);
		int rev=0,rem,v=num;
		while(num!=0) {
			rem = num% 10;
			rev=rev*10+rem;
			num = num/10;
			
		}
		if(v==rev)
		System.out.println(v + " is a palindrome");
		else
			System.out.println(v + " is not a palindrome");
			

	}

}
