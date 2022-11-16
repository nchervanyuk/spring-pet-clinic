package nchervanyuk.springframework.springpetclinic.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("GE")
@Service("i18nService")
public class I18nGermanService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hallo aus Deutschland!";
    }
}

