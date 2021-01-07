public class fangfaTest {
	 private int 	tpi;
	 int			ti;
	 static int 	tsi;
	 
	 public fangfaTest() {
		 this(5);
		 System.out.println("this is wcgouzaoff");
	 }
	 
	 public fangfaTest(int s){
		 System.out.println("this is ycgouzaoff");
	 }
	 
	 void fangfa(){

		 System.out.println("this is fangfa");
	 }
	 
	 static void sfangfa(){
		 System.out.println("this is static fangfa");
	 }
	 void maindy(){
		 tpi = 3;
		 ti =3;
		 tsi = 3;
		 this.fangfa();
		 fangfaTest.sfangfa();

	 }
	 
	 public static void main(String[] args){
		 /*******调用本类***********/
		 tsi = 3;
		 sfangfa();
		 fangfaTest fft1 = new fangfaTest();
		 fft1.maindy();
		 		 
		 /*******调用它类************/
		 nbfangfaTest nbfft1 = new nbfangfaTest();
		 nbfft1.nbti = 5;
		 nbfangfaTest.nbtsi = 3;
		 
		 nbfft1.nbfangfa();
		 nbfangfaTest.nbsfangfa();
		 
		 
	 }
}
	 
