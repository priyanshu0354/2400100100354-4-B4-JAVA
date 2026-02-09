class prime
{
    public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		int flag=0;
		for(int i=2;i<num;i++)
			if(num%i==0)
				flag++;
				
		if(flag==0)
			System.out.println("Prime Number");
			
		else	
			System.out.println("Not Prime Number.");
			System.out.println("FLAG="+flag);
    }
}