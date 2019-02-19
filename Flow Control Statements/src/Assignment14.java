
public class Assignment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0)
			System.out.println("Please enter an integer number");
		else {
		int num = Integer.parseInt(args[0]);
		if(num<=1)
			System.out.println(num + " is neither prime nor composite");
		{
		int i=0,flag=0;
		for(i=2;i<num/2;i++)
		{
			if(num % i == 0)
			flag=1;
		}
		if(flag==1)
			System.out.println(num + " is not a prime number");
		else System.out.println(num + " is a prime number");
		}
		
		}
	}

}
