class AnyThing{

	public AnyThing(){
		this("this diaoyong youcan gouzao fangfa");
		System.out.println("wucan gouzao fangfa");
	}

	public AnyThing(String name){
		System.out.println("youcan gouzao fangfa");
	}
}

public class TestAnyThing{
	public static void main(String[] args)
	{
		System.out.println("this is AnyThing Class");
		AnyThing AT1 = new AnyThing();
		AnyThing AT2 = new AnyThing("100");
        }
}
