import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> time = new ArrayList<>();

        time.add(60);
        time.add(time.get(0)*60);
        time.add(time.get(1)*24);
        time.add(time.get(2)*7);
        time.add(time.get(3)*30);

        for (Integer i : time){
            System.out.println(i);
        }

        Collections.sort(time);
        Collections.reverse(time);

        for (Integer i : time){
            System.out.println(i);
        }

        System.out.println(Collections.min(time));
        System.out.println(Collections.max(time));

        for (int i=0 ; i<5; i++){
            time.set(i, 42);
        }
    }
}
