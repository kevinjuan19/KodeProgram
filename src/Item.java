/**
 * @author Kevin Juan (1972002)
 */
public abstract class Item {
    private String name, description;
    private int weight;

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
