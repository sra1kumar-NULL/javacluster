import java.util.Scanner;
public class ExpendituresOrganiser {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Thank you for taking this surver");
		System.out.println("What is your name ? :");
		String name = scan.nextLine();
		System.out.println("How much money do you spend on coffee");
		double coffee = scan.nextDouble();
		System.out.println("How much money do you spend on fastfood");
		double food = scan.nextDouble();
		System.out.println("How much days a week you have a coffee");
		int coffieweek = scan.nextInt();
		System.out.println("How much days a week you have a fastfood");
		int foodweek = scan.nextInt();
		scan.close();
	}
}
