import java.time.LocalDateTime;

public class SmartLogger implements Logger{

    int count = 1;

    @Override
    public void log(String msg) {

        if (msg.contains("error")){
            System.out.println("ERROR#" + count +"["+ LocalDateTime.now()+"] " + msg);
        }
else{
            System.out.println("INFO#" + count +"["+ LocalDateTime.now()+"] " + msg);
        }

        count++;


    }
}
