package td2.filesystem;

import java.util.List;

public class Repertoire<T> implements Composant, Composite<T> {
    Repertoire(String name, Owner owner){

    }
    @Override
    public String getName() {
        return null;
    }

    @Override
    public Owner getOwner() {
        return null;
    }

    @Override
    public void setOwner(Owner owner, Boolean recursive) {


    }

    @Override
    public Integer getSize() {
        return;
    }

    @Override
    public String getContent() {
        return null;
    }

    @Override
    public void appendContent(String name) {

    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public List<T> getChildren() {
        return null;
    }

    @Override
    public void addChild(T t) {

    }

    @Override
    public boolean removeChild(T t) {
        return false;
    }

    @Override
    public boolean removeChildren(List<T> t) {
        return false;
    }
}
