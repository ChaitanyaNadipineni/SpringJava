package Spring;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService thefortuneService){
        fortuneService=thefortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "i am track coach";
    }

    @Override
    public String getDailyFortune() {
        return "found my fortue on track";
    }

    public void doMyStartupStuff(){
        System.out.println("track caoch init mehtod");
    }

    public void doMyShutdownStuff(){
        System.out.println("track coach shutdown method");
    }
}
