package Visitors;

import Commande.Client;
import Commande.Commande;
import Commande.GroupeClient;
import Commande.Ligne;

public interface PrePostVisitor extends AbstractVisitor{

void preVisit(GroupeClient groupeClient);
void preVisit(Client client);
void preVisit(Commande commande);
void preVisit(Ligne ligne);
void postVisit(GroupeClient groupeClient);
void postVisit(Client client);
void postVisit(Commande commande);
void postVisit(Ligne ligne);

}
