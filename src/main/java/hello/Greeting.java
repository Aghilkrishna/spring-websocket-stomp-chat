package hello;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class Greeting {
    
	@Getter @Setter
    private String content;
	
	@Getter @Setter
    private String name;
    
	@Getter @Setter
    private String message;
    
	@Getter @Setter
    private Date time;

   /* public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }*/

}
