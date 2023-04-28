import java.util.Objects;

public class Author {
    String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return "Имя автора: " + getName();
    }

    @Override
    public int hashCode(){
        return Objects.hash(getName());
    }
}