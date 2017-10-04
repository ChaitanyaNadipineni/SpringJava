package Spring;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String emailAddress;
    private String team;

    public CricketCoach() {


    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {

        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "practice batting everyday";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
