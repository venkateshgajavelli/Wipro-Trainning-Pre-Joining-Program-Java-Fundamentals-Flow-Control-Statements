
public class Assignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(args[0]);
		int i=0,flag=0;
		for(i=2;i<num/2;i++)
		{
			if(num % i == 0)
			flag=1;
		}
		if(flag==1)
			System.out.println("Not a Prime Number");
		else System.out.println("Prime Number");
	}

}
