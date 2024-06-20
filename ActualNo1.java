import java.util.Scanner;

public class ActualNo1
{
public static void main(String[] args)
	{
	double A1;
	double A2;
	double A3;
	double IR;
	double AW;
	double AD;
	double OC;
	double TD;
	double IAMT;
	double TP;
	double TB;
	double RB;
	
	
	Scanner solverMath = new Scanner(System.in);
	
	System.out.println("Deposits:");
	System.out.print("  Amount 1 (A1): ");
	A1 = solverMath.nextDouble();
	System.out.print("  Amount 2 (A2): ");
	A2 = solverMath.nextDouble();
	System.out.print("  Amount 3 (A3): ");
	A3 = solverMath.nextDouble();
	System.out.println("Interest:");
	System.out.print("  Interest Rate (IR): ");
	IR = solverMath.nextDouble();
	System.out.println("Withdrawals:");
	System.out.print("  Amount Withdrawn (AW): ");
	AW = solverMath.nextDouble();
	System.out.println("Penalties:");
	System.out.print("  Adjustments (AD)  : ");
	AD = solverMath.nextDouble();
	System.out.print("  Other Charges (OC): ");
	OC = solverMath.nextDouble();
	
	TD = A1 + A2 + A3;
	IAMT = TD * IR;
	TP = AD + OC;
	TB = TD + IAMT;
	RB = TB - TP - AW;
	
	System.out.println("\n\nAccount Summary Report");
	System.out.println("Your total balance is: " + TB + "!");
	System.out.println("And your Remaining balance is: " + RB + "!\n");
	System.out.println("Thank you for banking with us...");
	}
}