package nchervanyuk.springframework.springpetclinic.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServiceEnglish implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello world :]";
    }

}
