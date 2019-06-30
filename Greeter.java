package main.java.hello;
import org.igfay.jfig.JFig;
import org.igfay.jfig.JFigException;
import org.json.JSONObject;
import org.json.XML;


public class Greeter {

    public Greeter() {
    	   try {
   			JFig.initialize();
   		} catch (JFigException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
    }
	
}
