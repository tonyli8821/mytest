import java.lang.Math;
import java.util.Scanner;
public class jzt{
	
	public static void main(String[] args){
		int raw;  
		System.out.print("please input the raw:");
		Scanner input = new Scanner(System.in);
		raw = input.nextInt();
		for(int n=0;n<(raw+1);n++){
			kongge(raw-n);
			cifang(n);
			System.out.print("\n");
		}
	}
					
	
	static void kongge(int arg){
		for(int n=0;n<arg;n++){ 
		System.out.print("     ");
		}
	}
	
	static void cifang(int arg){
		double r;
		for(int n=0;n<(arg*2-1);n++){		
			if(n<arg){
				r = Math.pow(2,n);
				System.out.print((int)r);
				kongge2((int)r);
			}
			else {
				r = Math.pow(2,arg*2-2-n);
				System.out.print((int)r);
				kongge2((int)r);
				
			}	
		}
	}
	
	
	static void kongge2(int n){
				if(0 == n/10){
					System.out.print("    ");
				}
				else if( 0 == n/100){
					System.out.print("   ");
				}
				else if(0 == n/1000){
					System.out.print("  ");
				}
		
	}
	
	

}