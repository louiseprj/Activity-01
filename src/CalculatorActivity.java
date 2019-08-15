//Poula Jose//

 import java.util.Scanner;

public class CalculatorActivity {

public static void main (String[]args) {

Scanner Scan = new Scanner (System.in);
	
	int firstnumber;
	int lastnumber;
	
System.out.print("First Number: ");
firstnumber = Scan.nextInt();
	
System.out.print("Last Number: ");
lastnumber = Scan.nextInt();
	
	int sum;
	int diff;
	int prod;
	int quo;
		
	sum = firstnumber + lastnumber;
	diff = firstnumber - lastnumber;
	prod = firstnumber * lastnumber;
	quo = firstnumber / lastnumber;
	
System.out.println ("\nSum of "+firstnumber+" and "+lastnumber+" is " + sum);
System.out.println ("Difference of "+firstnumber+" and "+lastnumber+" is " + diff);
System.out.println ("Prodoct of "+firstnumber+" and "+lastnumber+" is " + prod);
System.out.println ("Quotient of "+firstnumber+" and "+lastnumber+" is " + quo);

    }
}
