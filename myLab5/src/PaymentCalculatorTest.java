
import javax.swing.JOptionPane;


public class PaymentCalculatorTest
{
    public static void main(String[] args)
    {
        // local vars (NOTE: initial values necessary only to make
        // unfinished program compile and run!)
        int amountBorrowed;
        double interestRate;
        int years;
        

        // insert statements to do input here
        // ----------------------------------
        String input = JOptionPane.showInputDialog("Enter the amount borrowed");

        amountBorrowed = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter the interest rate");

        interestRate = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter the years");

        years = Integer.parseInt(input);




        // create PaymentCalculator object using input values
        PaymentCalculator myCalc = new PaymentCalculator
                                   (amountBorrowed, interestRate, years);

        // print loan data
        System.out.println(myCalc.getData());

        // get payment amount
        double payment = myCalc.computePayment();

        // print payment amount
        System.out.println("Monthly Payment: $" + payment + "\n");
    }
}	// 	end of PaymentCalculatorTest class definition
