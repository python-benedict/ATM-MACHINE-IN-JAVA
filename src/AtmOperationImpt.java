import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpt implements AtmOperationInterf{
    ATM atm = new ATM();
    Map<Double, String> ministmt = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available balance is "+ atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if((atm.getBalance()) >= withdrawAmount){
            if(withdrawAmount%5 == 0){
                ministmt.put(withdrawAmount, " Amount Withdrawn");
                System.out.println(withdrawAmount + " withdrawn successfully");
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            }else{
                System.out.println("Amount should always be a multiple of 5");
            }
        }else {
            System.out.println("Insufficient fund");
            System.exit(0);
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        if(depositAmount%5 == 0){
            ministmt.put(depositAmount, " Deposited Successfully");
            System.out.println(depositAmount + " Deposited Successfully.");
            atm.setBalance(atm.getBalance()+depositAmount);
            viewBalance();
        }else{
            System.out.println("Amount should always be a multiple of 5");
        }
    }

    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double, String> m:ministmt.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
