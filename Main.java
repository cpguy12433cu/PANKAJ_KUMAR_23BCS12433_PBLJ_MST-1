import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
           
            String balanceLine = sc.nextLine().trim();
            String withdrawalLine = sc.nextLine().trim();

            
            double balance = Double.parseDouble(balanceLine.split(":")[1].trim());
            double withdrawal = Double.parseDouble(withdrawalLine.split(":")[1].trim());

            if (withdrawal <= 0 || withdrawal % 100 != 0) {
                System.out.println("Withdrawal amount must be in multiples of 100.");
            } else if (withdrawal > balance) {
                System.out.println("Insufficient balance. Withdrawal failed.");
            } else {
                balance -= withdrawal;
                System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        } finally {
            sc.close(); 
        }
    }
}
