package SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortune  implements  FortuneService{


    @Autowired
    @Qualifier
    @Override
    public String getFortune() {
        return "this is Database Fortune";
    }
}
