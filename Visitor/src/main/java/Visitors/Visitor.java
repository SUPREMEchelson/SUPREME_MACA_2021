package Visitors;

import Commande.Client;
import Commande.Commande;
import Commande.GroupeClient;
import Commande.Ligne;

public interface Visitor extends AbstractVisitor{
void visit(GroupeClient groupeClient);
void visit(Client client);
void visit(Commande commande);
void visit(Ligne ligne);


}
