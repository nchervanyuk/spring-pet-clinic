package nchervanyuk.springframework.springpetclinic;

import nchervanyuk.springframework.springpetclinic.controllers.FirstController;
import nchervanyuk.springframework.springpetclinic.controllers.I18nController;
import nchervanyuk.springframework.springpetclinic.controllers.SecondController;
import nchervanyuk.springframework.springpetclinic.controllers.ThirdController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringPetClinicApplication {
    public static ConfigurableApplicationContext confAppCont;
    public static void main(String[] args) {
        confAppCont = SpringApplication.run(SpringPetClinicApplication.class, args);

        I18nController i18nController = (I18nController) confAppCont.getBean("i18nController");
        System.out.println(i18nController.sayHello());
        //var a = ctx.getBeansWithAnnotation(Controller.class);
        FirstController firstController = (FirstController) confAppCont.getBean("firstController");
        System.out.println(firstController.getGreetingService().sayHello());

        SecondController secondController = (SecondController) confAppCont.getBean("secondController");
        System.out.println(secondController.getGreetingService().sayHello());

        ThirdController thirdController = (ThirdController) confAppCont.getBean("thirdController");
        System.out.println(thirdController.getGreetingService().sayHello());


    }

}
