import java.util.ArrayList;

public class BudgetTracker {
    private ArrayList<Expenses> expenses;
    private ArrayList<Incomes> incomes;
    private double balance;

    public BudgetTracker() {
        expenses = new ArrayList<Expenses>();
        incomes = new ArrayList<Incomes>();
        balance = 0;
    }

    public void addExpense(Expenses expense){
        expenses.add(expense);
        balance = balance - expense.getAmount();
    }

    public void addIncome(Incomes income){
        incomes.add(income);
        balance = balance + income.getAmount();
    }

    public double getBalance(){
        return balance;
    }

    public void printExpenses(){
        if (expenses.isEmpty()) {
            System.out.println("No expenses to display. ");
        } else {
            System.out.println("Expenses: ");
            for (Expenses expense : expenses){
                System.out.println("- " + expense.getDescription() + ": " + expense.getAmount());
            }
        }
    }

    public void printIncomes(){
        if (incomes.isEmpty()) {
            System.out.println("No incomes to display.");
        } else {
            System.out.println("Incomes: ");
            for (Incomes income : incomes){
                System.out.println("- " + income.getDescription() + ": " + income.getAmount());
            }
        }
    }
}
