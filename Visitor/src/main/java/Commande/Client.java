package Commande;

import Visitable.Visitable;
import Visitors.PrePostVisitor;
import Visitors.Visitor;
import jdk.jfr.Percentage;

public class Client implements Visitable {
    private String client;
    private String commande;

    Client(String client){
        this.client=client;
    }
    void addCommande(Commande commande){


    }
    @Override
    public void accept(Visitor visitor) {

    }
    @Override
    public void accept(Visitor visitor){
        for(Commande c: commande.values())
            c.accept(visitor);
        visitor.visit(this);
    }

}
