public class Spring01 {
    int id;
    String name;

    public Spring01(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Spring01() {
    }

    @Override
    public String toString() {
        return "Spring01{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
