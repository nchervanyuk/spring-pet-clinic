package nchervanyuk.springframework.springpetclinic.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import nchervanyuk.springframework.springpetclinic.services.GreetingService;

@Controller
public class ThirdController {

    private final GreetingService greetingService;

    public ThirdController(@Qualifier("greetingServiceBulgarian") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }
}
