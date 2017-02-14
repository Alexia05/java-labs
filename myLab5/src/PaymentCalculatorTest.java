
public class PaymentCalculatorTest
{
    public static void main(String[] args)
    {
        // local vars (NOTE: initial values necessary only to make
        // unfinished program compile and run!)
        int amountBorrowed = 0;
        double interestRate = 0.0;
        int years = 0;

        // insert statements to do input here
        // ----------------------------------





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
