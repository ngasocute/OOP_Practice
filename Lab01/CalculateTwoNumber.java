import javax.swing.JOptionPane;

// calculate sum, difference, product, quotient, remainder
public class CalculateTwoNumber {
    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    public double difference(double num1, double num2) {
        return num1 - num2;
    }

    public double product(double num1, double num2) {
        return num1 * num2;
    }

    public double quotient(double num1, double num2) {
        try {
            return num1 / num2;
        } catch (Exception e) {
            System.out.println("Can't divide by zero");
            return 0;
        }
    }

    public static void main(String[] args) {
        CalculateTwoNumber cal = new CalculateTwoNumber();
        String strNum1, strNum2;
        double num1, num2, calSum, calDiff, calProd, calQuot;
        String strNotification = "";
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);
        num2 = Double.parseDouble(strNum2);
        calSum = cal.sum(num1, num2);
        calDiff = cal.difference(num1, num2);
        calProd = cal.product(num1, num2);
        calQuot = cal.quotient(num1, num2);
        strNotification = "The sum of " + num1 + " and " + num2 + " is " + calSum + "\n";
        strNotification = strNotification + "The difference of " + num1 + " and " + num2 + " is " + calDiff + "\n";
        strNotification = strNotification + "The product of " + num1 + " and " + num2 + " is " + calProd + "\n";
        strNotification = strNotification + "The quotient of " + num1 + " and " + num2 + " is " + calQuot + "\n";
        JOptionPane.showMessageDialog(null, strNotification, "Calculate two number", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }

}
