package Visitors;

import Commande.GroupeClient;

public interface Visitors extends AbstractVisitor{
    void visit(GroupeClient groupeClient);

}
