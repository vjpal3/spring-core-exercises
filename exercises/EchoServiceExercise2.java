package exercises;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
public class EchoServiceExercise2 {
	//You can inject everything which extends the Java object; 
	//so primitives will not work but everything else.
	@Autowired 
	@Qualifier("echoRepeat")
	private Integer echorepeat;
	
	String result = "";
	String echo(String echo) {
		for(int i=0; i < echorepeat; i++) {
			result += echo + " ";
		}
		return result;
	}
}
