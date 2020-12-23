import java.util.Scanner;

public class scannerdemo{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);


		System.out.println("next scan:");

		if(scan.hasNextLine()){
			String str1 =scan.nextLine();
			System.out.println("putin data is :" + str1);
		}
		scan.close();
	}
}
