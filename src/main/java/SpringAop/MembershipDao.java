package SpringAop;

import org.springframework.stereotype.Component;

@Component
public class MembershipDao {

    public String addMember(){
        System.out.println("  its addmember method in  membership dao class");

        return "membership";
    }

    public void gotoSleep(){
        System.out.println("goto sleep in membership dao class");
    }
}
