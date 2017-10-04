package SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomService implements FortuneService {

private String[] data={"honda","toyota","hyundai"};

private Random myRandom= new Random();

@Autowired
@Qualifier
    @Override
    public String getFortune() {

        int index= myRandom.nextInt(data.length);

        String theFortune=data[index];
        return theFortune;
    }
}
