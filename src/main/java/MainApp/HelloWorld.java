package MainApp;

/**
 * Created by ahred on 10/10/2016.
 */
public class HelloWorld {
    private String message;
    public void setMessage(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
    public void init(){
        System.out.println("this is the initialization phase");
    }
}
