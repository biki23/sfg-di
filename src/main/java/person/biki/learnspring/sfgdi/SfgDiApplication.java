package person.biki.learnspring.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import person.biki.learnspring.sfgdi.controllers.ConstructorInjectController;
import person.biki.learnspring.sfgdi.controllers.MyController;
import person.biki.learnspring.sfgdi.controllers.PropertyInjectedController;
import person.biki.learnspring.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController)ctx.getBean("myController");
		String greetings = myController.sayHello();
		System.out.println(greetings);

		System.out.println("----Property----");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		System.out.println("----Setter----");
		SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		System.out.println("----Constructor----");
		ConstructorInjectController constructorInjectController = (ConstructorInjectController) ctx.getBean("constructorInjectController");
		System.out.println(constructorInjectController.getGreeting());

	}

}
