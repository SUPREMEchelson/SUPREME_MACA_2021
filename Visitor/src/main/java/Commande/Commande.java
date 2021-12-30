package Commande;

import Visitable.Visitable;
import Visitors.PrePostVisitor;
import Visitors.Visitor;
import Visitable.PrePostVisitable;

public class Commande implements Visitable, PrePostVisitable {
    private String commande;
    private Ligne ligne;

    Commande(String name){
        this.commande=commande;
    }
    void addLigne(Ligne ligne){
        this.ligne=ligne;

    }

    @Override
    public void accept(Visitor visitor) {

    }

    @Override
    public void accept(PrePostVisitor visiteur) {

    }
}
