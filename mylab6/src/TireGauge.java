//  Class:  TireGauge.java

//  Purpose:  Evaluates the air pressure in a tire and prints an appropriate
//            message
import javax.swing.JOptionPane;

class TireGauge {

    public static void main(String[] args) {
        double pressure;					// tire pressure, in psi

        String input = JOptionPane.showInputDialog("Enter tire pressure: ");

        pressure = Double.parseDouble(input);

        String tirePressure;

		// Pressure in the range 30 - 35 psi (inclusive) is OK
		// Write code below to display the appropriate message chosen from
		// "OVERinflated"    "UNDERinflated"    "Pressure OK"
        if (pressure < 30) {
            tirePressure = "UNDERinflated";
        } else if (pressure > 35) {
            tirePressure = "OVERinflated";
        }
            else
            {
                tirePressure = "Pressure OK";
        }
        

        System.out.println("The tire pressure is " + tirePressure);

    }
}
