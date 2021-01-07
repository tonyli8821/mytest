public class Compare{
	static int a ;
  public static void main(String[] args){

	a = 3;
	System.out.println(a);
    String c1 = new String("abc");
    String c2 = new String("abc");
    String c3 = c1;
    
    System.out.println("the result c2 == c3 : " + (c2 == c3));
    
    System.out.println("c2.equals(c3) : " +(c2.equals(c3)));
    
    }
 }
