package SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Autowired
    @Qualifier
    @Override
    public String getFortune() {
        return "you are lucky to have fortune in happy";
    }
}
