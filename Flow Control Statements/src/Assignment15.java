
public class Assignment15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(args[0]);
		int sum=0,rem;
		while(num!=0) {
			rem = num% 10;
			sum=sum+rem;
			num = num/10;
			
		}
		System.out.println(sum);

	}

}
