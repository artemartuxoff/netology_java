import java.util.*;

public class Main{

    public void main(String[] args){

        List<String> firstClient = List.of("Anya","Sveta","Olya","Alexandra","Ruslana","Olesya","Vika");

        Queue <String> client = new LinkedList<>(firstClient);

        while(! client.isEmpty()){

            String clientNext = client.poll();

            System.out.println(clientNext + " сделал новый маникюр");

            if (Math.random() < 0.5) {
                String nameFriend = "friend of " + clientNext;
                client.offer(nameFriend);
            }

        }
    }
}
