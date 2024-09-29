import javax.swing.JOptionPane;

public class caculation {
    public static void main(String[] args) {
        String strNum1, strNum2;
        Double sum,difference, product, quotient;

        strNum1 = JOptionPane.showInputDialog(null, 
                    "Please i	nput the first number:", 
                    "Input the first number", 
                    JOptionPane.INFORMATION_MESSAGE);
      

        strNum2 = JOptionPane.showInputDialog(null, 
                    "Please input the second number:", 
                    "Input the second number", 
                    JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
       
        sum=num1 + num2;
        difference= Math.abs(num1-num2);
        product = num1*num2;
        quotient= num1/num2;
        

        String result = "Sum: " + sum + "\n" +
                "Difference: " + difference + "\n" +
                "Product: " + product + "\n" +
                "Quotient: " + quotient;

JOptionPane.showMessageDialog(null, result, 
            "Calculation Result", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
