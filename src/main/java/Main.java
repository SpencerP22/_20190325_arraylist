import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Classroom csc254 = new Classroom("A126", 35);
        Classroom act311 = new Classroom("A124", 89);
        System.out.println(csc254);

        ArrayList<Classroom> rooms = new ArrayList<>(50);

        rooms.add(csc254);
        rooms.add(act311);
        rooms.add(new Classroom("A127", 25));

        print(rooms);
    }

    public static void print(ArrayList<Classroom> rooms) {
        System.out.println("----------------------------");
        /*for(int i=0; i<rooms.size(); i++) {
            System.out.println(rooms.get(i));
        }*/
        for(Classroom r: rooms) {
            System.out.println(r);
        }
    }
}
