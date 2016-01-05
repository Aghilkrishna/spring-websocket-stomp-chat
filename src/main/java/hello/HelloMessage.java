package hello;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class HelloMessage {

	@Getter @Setter
    private String name;
    
	@Getter @Setter
    private String message;
    
	@Getter @Setter
    private Date time;
    
   /* public String getName() {
        return name;
    }*/
    
    

}
