import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Scanner;

public class Main implements Runnable {

    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {

        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        AbstractCollection<Character> firstAbstractCollection = new ArrayList<Character>();
        for( int i = 0; i < first.length(); i++){
            firstAbstractCollection.add(first.charAt(i));
        }

        AbstractCollection<Character> secondAbstractCollection = new ArrayList<Character>();
        for (int i = 0; i < second.length(); i++){
            secondAbstractCollection.add(second.charAt(i));
        }

        if (firstAbstractCollection.containsAll(secondAbstractCollection)){
            System.out.println("Yes, it's true");
        }
        else{
            System.out.println("No, it's false");
        }
    }
}
