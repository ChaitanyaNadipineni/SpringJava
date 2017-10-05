package SpringAop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDao {

    private String name;

    private String serviceCode;

    public List<Account> findAccounts(boolean tripwire){


        if(tripwire){
            throw new RuntimeException("run time exception is thrown");
        }
        List<Account> myAccounts= new ArrayList<>();


        Account acc1= new Account("Chatu","gold");
        Account acc2= new Account("bharath","platinum");
        Account acc3= new Account("aditya","diamond");

        myAccounts.add(acc1);
        myAccounts.add(acc2);
        myAccounts.add(acc3);

        return myAccounts;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getServiceCode() {

        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {

        this.serviceCode = serviceCode;
    }

    public void addAccount(Account theAccount, boolean vipFlag){
        System.out.println("  its addAccount method in accountdao class");
    }

    public boolean doWork(){
        System.out.println("do word method in accountdao class");
        return true;
    }
}
