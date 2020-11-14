import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main implements Runnable{

    public static void main(String[] args) {
        new Main().run();
    }


    public void run() {

        ArrayList<Data> data= new ArrayList<>();
        data.add(new Data(1, "A"));
        data.add(new Data(1, "C"));
        data.add(new Data(2, "B"));
        data.add(new Data(2, "A"));
        data.add(new Data(3, "A"));
        data.add(new Data(1, "B"));



        for(int i = 0; i < data.size(); i++){
            System.out.println(String.format("Объект с номером %s и именем %s",
                    data.get(i).getNumber(),
                    data.get(i).getName())
            );
        }
        System.out.println();

        Collections.sort(data, new CompNumName());

        for(int i = 0; i < data.size(); i++){
            System.out.println(String.format("Объект с номером %s и именем %s",
                    data.get(i).getNumber(),
                    data.get(i).getName())
            );
        }

    }
}
