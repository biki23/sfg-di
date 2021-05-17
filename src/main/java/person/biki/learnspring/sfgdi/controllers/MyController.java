package person.biki.learnspring.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello worlds");
        return "Hi Folks";
    }
}
