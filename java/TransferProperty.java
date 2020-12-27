public class TransferProperty{
	int i = 47;

	public void call()
	{
		System.out.println("call method call()");
		System.out.print(this.i);
		for(i=0;i<3;i++)
		{
			System.out.print(i + "");
			if(i == 2)
			{
				System.out.println("\n");
			}
		}
	}

	public TransferProperty(){
		System.out.println("this is a example for TransferProperty");
		
	}

	public static void main(String[] args){
		TransferProperty t1 = new TransferProperty();
		TransferProperty t2 = new TransferProperty();

		t2.i = 60;

		System.out.println("the result of  first object called i: " + t1.i++);
		t1.call();

		System.out.println("the result of secound object call i: " + t2.i);
		t2.call();
	}

}
