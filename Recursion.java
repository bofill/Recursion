import java.util.Scanner;

public class Recursion {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number greater than zero\n");
		int num = scan.nextInt();
	
		recursion(num);
		
		scan.close();
	}
	//testing #2 
	public static int recursion(int num){
		System.out.println(num);
		if (num == -1){
			return -1;
		}
		return recursion(num - 1);
	}
}
