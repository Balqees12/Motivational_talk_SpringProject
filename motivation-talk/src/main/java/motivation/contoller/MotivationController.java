package motivation.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import motivation.service.Quote;


@RestController

public class MotivationController {

	@GetMapping("/motivation/1")
	
	public String getFirstMotivation(@PathVariable Quote quote){
		
		return "";
	}
	
	
	@GetMapping("/motivation/2")
	public String getSecondMotivation(){
		
		return "";
	}
	
	
	@GetMapping("/motivation/3")
	public String getThirdMotivation(){
		
		return "";
	}
	
	
	public static void error(int[] input) {
		int num=10;
		
		if(num<0 && num>=10) {
			System.out.println("enter number between 0-9");
		}
	}
	
	

	
}
