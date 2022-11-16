package nchervanyuk.springframework.springpetclinic.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import nchervanyuk.springframework.springpetclinic.services.GreetingService;

@Controller
public class FirstController {
    private final GreetingService greetingService;

    public FirstController( GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }
}
