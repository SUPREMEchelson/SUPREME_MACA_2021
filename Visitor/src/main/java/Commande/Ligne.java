package Commande;

import Visitable.PrePostVisitable;
import Visitors.PrePostVisitor;
import Visitable.Visitable;
import Visitors.Visitor;

public class Ligne implements PrePostVisitable, Visitable {

    private String ligne;
    private int nombre;

    public Ligne(String ligne) {
        this.ligne = ligne;
    }
    public Ligne(String ligne, int nombre){
        this.ligne=ligne;
        this.nombre=nombre;
    }
    @Override
    public void accept(PrePostVisitor visitor) {


    }

    @Override
    public void accept(Visitor visitor) {

    }

}
