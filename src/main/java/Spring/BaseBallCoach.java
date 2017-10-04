package Spring;

public class BaseBallCoach implements Coach {

    private FortuneService fortuneService;

    public BaseBallCoach() {
    }

    public BaseBallCoach(FortuneService thefortuneService) {
       fortuneService = thefortuneService;
    }

    @Override
    public String getDailyWorkOut(){
        return " i am the baseball coach";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }
}
