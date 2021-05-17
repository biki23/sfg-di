package person.biki.learnspring.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import person.biki.learnspring.sfgdi.services.ConstructorGreetingService;

class ConstructorInjectControllerTest {
    ConstructorInjectController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}