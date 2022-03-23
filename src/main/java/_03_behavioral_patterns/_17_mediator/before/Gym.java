package _03_behavioral_patterns._17_mediator.before;

public class Gym {

    private CleaningService cleaningService;

    public void clean() {
        cleaningService.clean(this);
    }
}
