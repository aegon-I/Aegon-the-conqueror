import javax.swing.JOptionPane;

public class Loan{
    public static void main(String[] args){

        String aString = JOptionPane.showInputDialog("Enter annual Interest rate:");

    double b = Double.parseDouble(aString);

    double c = b/1200;

    String dString= JOptionPane.showInputDialog("Enter amount of loan:");

    double d = Double.parseDouble(dString);

    String eString= JOptionPane.showInputDialog("Enter years:");

    int f = Integer.parseInt(eString);

    double g= (d*c)/(1- (1/Math.pow(1+c, 12*f)));

    double h= g*f*12;

    g= (int) (g*100)/100.0;
    h= (int) (h*100)/100.0;

    String output= "The monthly payment is: " +g+ " INR" +"\nThe total payment is: " +h;

    JOptionPane.showMessageDialog(null, output);





    }
}