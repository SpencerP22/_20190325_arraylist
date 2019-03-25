public class Classroom implements Comparable<Classroom>{
    private String name;
    private int capacity;

    //constructors

    public Classroom(String name, int capacity) {
        setName(name);
        setCapacity(capacity);
    }
    public Classroom(String name) {
        this(name, 0);
    }
    public Classroom(int capacity) {
        this("Z999", capacity);
    }
    public Classroom() {
        this("Z999", 0);
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    //getters
    public String getName() {
        return name;
    }
    public int getCapacity() {
        return capacity;
    }

    //toString method

    @Override
    public String toString() {
        return "Classroom{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    //compareTo method
    public int compareTo(Classroom other){
        return 1;
    }
}
