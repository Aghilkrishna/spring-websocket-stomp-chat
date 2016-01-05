package hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {


    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        Greeting greet = new Greeting();
//        greet.setContent(message.getName());
        greet.setName(message.getName());
        greet.setMessage(message.getMessage());
        greet.setTime(message.getTime());
        return greet;
    }

}
