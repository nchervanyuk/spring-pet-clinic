package nchervanyuk.springframework.springpetclinic.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceBulgarian implements GreetingService {
    @Override
    public String sayHello() {
        return "Zdravei svqt :)";
    }

}
