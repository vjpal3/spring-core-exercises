package exercises;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Exercise2 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigExercise2.class);
		
		EchoServiceExercise2 echoService = context.getBean(EchoServiceExercise2.class);
		System.out.println(echoService.echo("Hello"));
		
		
		
	}

}
