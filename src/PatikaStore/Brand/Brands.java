package PatikaStore.Brand;
public class Brands {
    private static int idCount = 1;
    private int id;
    private String name;

    public Brands(String name) {
        this.name = name;
        this.id = idCount;
        idCount++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
