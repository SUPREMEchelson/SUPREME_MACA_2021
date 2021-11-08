package td2.filesystem;

import java.util.List;

public interface Composite<T> {
    List<T> getChildren();
    void addChild(T t);
   boolean removeChild(T t);
   boolean removeChildren(List<T> t);

}
