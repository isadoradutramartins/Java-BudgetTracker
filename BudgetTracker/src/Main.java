import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BudgetTracker budgetTracker = new BudgetTracker();
        boolean working = true;

        while (working) {

            System.out.println("----------BUDGET TRACKER----------");
            System.out.println("1. Add income;");
            System.out.println("2. Add expense;");
            System.out.println("3. List incomes;");
            System.out.println("4. List Expenses;");
            System.out.println("5. Print balance;");
            System.out.println("6. Exit;");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:{
                    System.out.println("Income description: ");
                    String description = scanner.nextLine();
                    System.out.println("Income amount: ");
                    double amount = scanner.nextDouble();

                    Incomes income = new Incomes("" + description, + amount);
                    budgetTracker.addIncome(income);

                    System.out.println("Income added successfully.");
                    break;
                }
                case 2:{
                    System.out.println("Expense description: ");
                    String description = scanner.nextLine();
                    System.out.println("Expense amount: ");
                    double amount = scanner.nextDouble();

                    Expenses expense = new Expenses("" + description, + amount);
                    budgetTracker.addExpense(expense);

                    System.out.println("Expense added successfully.");
                    break;
                }
                case 3: {
                    budgetTracker.printIncomes();
                    break;
                }
                case 4: {
                    budgetTracker.printExpenses();
                    break;
                }
                case 5: {
                    System.out.println("Your balance is: " + budgetTracker.getBalance());
                    break;
                }
                case 6: {
                    System.out.println("Thank you for using my bugdet tracker! :)");
                    working = false;
                    break;
                }
                default: {
                    System.out.println("Invalid option."); break;
                }
            }

        }
        scanner.close();
    }
}