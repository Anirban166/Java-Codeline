package assignmentsByAnirban;

class Account
{
    double balance=0;
     double bc=2;
    boolean withdrawl=false;
    void GetBalance()
    {
         System.out.println(""+"currentBalance:"+balance);
    }  
    Account(double iBalance) 
    {
    
        this.balance = iBalance;
        if(balance<1000)
        {
            this.balance=0;
            System.out.println("Invalied initial balance");
        }
        else
        {
            this.balance = iBalance;
         
        }
     
    }
    void Credit(double p)
    {
        balance=balance+p;
        System.out.println("Credited "+p);
       }
    void Debit(double p)
    {
        if(p<balance)
        {
            balance=balance-p;
            System.out.println("debited "+p);
            withdrawl=true;
        }
        else{
            System.out.println("----------| Not enough money to withdrawl |----------");
              withdrawl=false;
        }
        
    }
      void BankCharge()
        {
            if(withdrawl==true)
            { 
                balance=balance-bc;
                System.out.println("debited for withdrawal "+bc);
                withdrawl=false;
            } 
          }   
}

class SavingsAccount extends Account
{
    double interestRate;
    SavingsAccount(double iBalance,double ir) 
    {
        super(iBalance);
        this.interestRate=ir; 
    }
    double CalculateInterest(double m)
    {
        return interestRate*m;
    }  
}
class CheckingAccount extends Account
{
     double fcpt;
    public CheckingAccount(double iBalance,double fcpt)
    {
        super(iBalance);
        this.fcpt=fcpt;
    }
    
}
