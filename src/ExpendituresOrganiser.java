import java.util.Scanner;
public class ExpendituresOrganiser {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Thank you for taking this surver");
		System.out.println("What is your name ? :");
		int counter=0;
		String name = scan.nextLine();
		System.out.println("How much money do you spend on coffee");
		double coffee = scan.nextDouble();
		counter++;
		System.out.println("How much money do you spend on fastfood");
		double food = scan.nextDouble();
		counter++;
		System.out.println("How much days a week you have a coffee");
		int coffieweek = scan.nextInt();
		counter++;
		System.out.println("How much days a week you have a fastfood");
		int foodweek = scan.nextInt();
		counter++;
		System.out.println("\nThank you "+name + "for answering "+counter+"questions ");
		System.out.println("\nYour fastfood expenses are "+ (food/coffee)+" times your "+ coffee+ "expenses");
		System.out.println("\nWeekly you spend "+(coffee*coffieweek)+" on coffee");
		System.out.println("\nWeekly you spend "+(food*foodweek)+" on fastfood");
		scan.close();
	}
}
