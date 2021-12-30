package VisitorsImplemen;

import Commande.Client;
import Commande.Commande;
import Commande.GroupeClient;
import Visitors.Visitor;
import Commande.Ligne;

public class PrintRapportCommandes implements Visitor {
    @Override
    public void visit(GroupeClient groupeClient) {

    }

    @Override
    public void visit(Client client) {

    }

    @Override
    public void visit(Commande commande) {

    }

    @Override
    public void visit(Ligne ligne) {

    }
}
