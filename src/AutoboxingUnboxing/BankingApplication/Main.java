package AutoboxingUnboxing.BankingApplication;

public class Main {
    // Your job is to create a simple banking application .
    // There should be a Bank class
    //It should have an arrayList of Branches
    //Each Branch should have an arrayList of Customers.
    //The Customer class should have an arrayList of Doubles(Transactions)
    //Customers :
    //Name to be able to add a new customer and initial transaction amount
    // Also needs to add additional transactions for that customer/branch
    //Bank:
    //Add a new branch
    //Add a customer to that branch with initial transaction
    //Add a transaction for an existing customer for that branch
    // Show a list of customers for a particular branch and optionally a list o their transactions
    //Demonstration autoboxing and unboxing in your code
    // Hint : Transactions
    //Add data validation
    // e.g. check if exists ,or does not exists ,etc.
    //Think about where you are adding the code to perform certain actions.
    public static void main(String[] args) {
        Bank bank = new Bank("Reserve Bank Of India ");
        bank.addBranch("Delhi");
        bank.addNewCustomerToBranch("Delhi","Akansha",5000000.00);
        bank.addNewCustomerToBranch("Delhi", "Radhe", 590000000.00);
        bank.addNewCustomerToBranch("Delhi","Krishna", 2789100.00);

        bank.addTransactionToCustomer("Delhi","Akansha",5000000.00);
        bank.addTransactionToCustomer("Delhi","Radhe",590000000.00);
        //bank.listAllCustomersInBranch("Delhi",true);


        System.out.println(bank.listAllCustomersInBranch("Delhi"));
    }


}
