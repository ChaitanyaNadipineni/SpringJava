package SpringAnnotations;

public class SadFortuneService  implements FortuneService {

    @Override
    public String getFortune() {
        return "today is sad day";
    }
}
