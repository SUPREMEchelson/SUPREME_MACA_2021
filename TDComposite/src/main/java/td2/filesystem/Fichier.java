package td2.filesystem;

public class Fichier extends ComposantImpl implements Composant {
    private StringBuilder content;
    public Fichier(String name, Owner owner){super(name,owner);}
    @Override
    public Integer getSize() {
        return null;
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
}
