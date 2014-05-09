import java.util.Scanner;

public class IntToEng implements IntToEngInterface {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        
	        System.out.println(translateEng(input));

	}
	static String translateEng(int n) {
		String[] EngArray = {"zero","one","two","three","four","five","six","seven","eigth","nine","ten"};
        return EngArray[n];
    }
}
