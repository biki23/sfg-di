package person.biki.learnspring.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import person.biki.learnspring.sfgdi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectControllerTest {
    ConstructorInjectController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}