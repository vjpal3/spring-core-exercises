package exercises;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ConfigExercise2 {
	
//	@Bean
//	public EchoServiceExercise2 echoService() {
//		return new EchoServiceExercise2();
//	}

	@Bean
	public Integer echoRepeat() {
		return 4;
	}
}
