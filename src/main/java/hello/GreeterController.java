package main.java.hello;
import org.igfay.jfig.JFig;
import org.igfay.jfig.JFigException;
import org.igfay.jfig.JFigIF;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {
	private static final JFigIF template;
	
	try {
		 template = JFig.initialize();
	} catch(JFigException e){
		e.printStackTrace();
	}
   

    @RequestMapping("/greeter")
    public Greeter greeter() {
        return new Greeter(template);
    }
}
