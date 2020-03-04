package exercises;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ControlFlow {

	//This is preferred way; When the class can NOT function without the other service, 
	// i.e., echo service, use a constructor. Also makes code readable.
	private EchoServiceExercise2 echoService = null;
	
	public ControlFlow(EchoServiceExercise2 echoService) {
		super();
		this.echoService = echoService;
		System.out.println("echoService from constructor: " + this.echoService);
	} 
	
//	@Autowired
//	private EchoServiceExercise2 echoService;
//	//Constructor not required; 
//	//Spring injects the dependency after the service bean is created.
//	//So here echo service is null.
//	public ControlFlow(EchoServiceExercise2 echoService) {
//		super();
//		System.out.println("echoService= " + this.echoService);
//	}
	
	public void run(String[] args) {
		System.out.println(echoService.echo("Hello from Control Flow"));
		System.out.println("echoService= " + this.echoService);
	}
}
