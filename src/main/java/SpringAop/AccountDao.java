package SpringAop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class AccountDao {

    private String name;

    private String serviceCode;

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
