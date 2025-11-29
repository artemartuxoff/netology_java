public class Main{
    public static void main(String[] args){

     SimpleLogger simpleLogger = new SimpleLogger();
     SmartLogger smartLogger = new SmartLogger();

        simpleLogger.log("Пишу сообщение симпл логгер");

        smartLogger.log("Пишу сообщение смарт логгер");
        smartLogger.log("Пишу сообщение смарт логгер");
        smartLogger.log("Пишу сообщение смарт логгер error");
        smartLogger.log("Пишу сообщение смарт логгер");


    }
}

