package td2.filesystem;


public class FSFactory  {
    public static final FSFactory INSTANCE = new FSFactory();
    private FSFactory(){}


    public static FSFactory getInstance() {
        return INSTANCE;
    }
    public Composant createComposant(ComposantType type, String name, Owner owner){
        switch (type){
            case REPERTOIRE:
                return new Repertoire(name, owner);
            case FICHIER:
                return new Fichier(name,owner);
        }

        return null;// chercher le type de retour
    }


}
