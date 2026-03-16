import java.io.*;
import java.lang.*;

class Playroll {
    public static void main(String args[])throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Mohanraj International Pvt Ltd");
        System.out.println("T.Nagar, Chennai, Tamil Nadu");
        System.out.println("----------------------------");
        System.out.println("Employee Payroll System");
        System.out.println("----------------------------");

        System.out.print("Enter the emp id: ");
        String s1 =br.readLine();
        int id = Integer.parseInt(s1);

        System.out.print("Enter the emp name: ");
        String s2 = br.readLine();

        System.out.print("Enter the salary: ");
        String s3 =br.readLine();
        int b = Integer.parseInt(s3);

          int bonus = b * 20 / 100;
        System.out.println("Bonus (20% of salary): " + bonus);

        int inc = b * 10 / 100;
        System.out.println("Increment (10% of salary): " + inc);

        int GP = b + bonus + inc;
        System.out.println("Gross Pay: " + GP);

        System.out.println("Expenditure:");

        int rental = b * 3 / 100;
        System.out.println("Rental (3% of salary): " + rental);

        int lic = b * 2 / 100;
        System.out.println("LIC (2% of salary): " + lic);

        int netpay = GP - (rental + lic);
        System.out.println("Net Pay (InHand): " + netpay);
    }
}