
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length > 0)
		{
			for(int i=0;i<args.length;i++)
			{
				System.out.print(args[0]);
				if( i < (args.length - 1) )
					System.out.print(",");
					
			}
		}
		else System.out.println("No values");

	}

}
