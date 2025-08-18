package za.ca.cput.domain;

public class Route {
    private String id;
    private String name;

    public Route() {}

    public Route(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Route{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
