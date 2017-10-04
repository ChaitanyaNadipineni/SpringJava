package SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("tennisCoach")

public class TennisCoach implements Coach {

@Autowired
@Qualifier
    private FortuneService fortuneService;

   /*@Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    public TennisCoach() {


    }

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("its the startup int method");
    }
    @PreDestroy
    public void shutDownstuff(){
        System.out.println("its the destroy method");
    }

  // @Autowired
  /*  public void setFortuneService(FortuneService fortuneService) {

        this.fortuneService = fortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "practice serving";
    }

    @Override
    public String getDailyFortune() {
        return "this is tennis fortuneService";
    }

   /* @Autowired
    public void anyAutowired(){
        System.out.println("this is used for autowiring any method");
    }*/




}
