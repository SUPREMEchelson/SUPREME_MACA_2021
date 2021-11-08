package td2.filesystem;

import java.util.Objects;

public class Owner {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Owner)) return false;
        Owner owner = (Owner) o;
        return name.equals(owner.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
