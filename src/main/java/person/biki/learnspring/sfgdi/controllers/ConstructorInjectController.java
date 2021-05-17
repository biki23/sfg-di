package person.biki.learnspring.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import person.biki.learnspring.sfgdi.services.GreetingService;
@Controller
public class ConstructorInjectController {
    private final GreetingService greetingService;
    public ConstructorInjectController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
