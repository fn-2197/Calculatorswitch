import java.util.Scanner;


public class charcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select your Operation, Addition, Multiplitcation, Subtraction, or Division");
		Scanner amount = new Scanner(System.in);
		System.out.println("Type the first letter of your selection: ");
		String b =  amount.next();
		b = b.toLowerCase();
		char choice = b.charAt(0);
		
		Scanner operant1 = new Scanner(System.in);
		System.out.println("Type the first number: ");
		double op1 =  operant1.nextDouble();
		
		Scanner operant2 = new Scanner(System.in);
		System.out.println("Type the secound number: ");
		double op2 =  operant2.nextDouble();
		
		switch(choice){
		
		case 'a':
			System.out.println( op1 + " Plus " + op2 + " Equals " + (op1+op2));
			break;
		case 's':
			System.out.println( op1 + " minus " + op2 + " Equals " + (op1-op2));
			break;
		case 'm':
			System.out.println( op1 + " Multiplied by " + op2 + " Equals " + (op1*op2));
			break;
		case 'd':
			System.out.println( op1 + " divided by " + op2 + " Equals " + (op1/op2));
			break;
		default:
			System.out.println("Enter a valid thing!");
			
		
		}
			
		
		
	}

}
