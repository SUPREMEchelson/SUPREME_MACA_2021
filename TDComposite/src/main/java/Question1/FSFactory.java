package Question1;

public class FSFactory {
    private FSFactory() {
    }

    private static FSFactory fsFactory = new FSFactory();

    public static FSFactory getFsFactory() {
        if (fsFactory == null) {
            fsFactory = new FSFactory();
        }
        return fsFactory;
    }
    public Composant createComposant(ComposantType type, String name, Owner owner){
        switch (type){
            case REPERTOIRE:
                return new Repertoire(name, owner);
            case FICHIER:
                return new Fichier(name,owner);
        }

        return null;
    }

}
