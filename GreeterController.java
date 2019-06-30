package main.java.hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

   
    @RequestMapping("/greeter")
    public Greeter greeter() {
        return new Greeter();
    }
}