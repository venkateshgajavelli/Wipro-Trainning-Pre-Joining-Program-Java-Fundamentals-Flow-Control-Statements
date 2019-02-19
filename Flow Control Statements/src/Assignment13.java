
public class Assignment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num = Integer.parseInt(args[0]);
		int i=0,flag=0,v=10;
		while(v<=99) {
			flag=0;
		for(i=2;i<=v;i++)
		{
			if(v % i == 0)
			flag++;
		}
		if(flag==1)
			System.out.println(v);
		v++;
		}
	}

	}
