package exercises;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
public class EchoServiceExercise2 {

	String echo(String echo) {
		return echo;
	}
}
