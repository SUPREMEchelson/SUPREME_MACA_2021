package VisitorsImplemen;

import Commande.Client;
import Commande.Commande;
import Commande.GroupeClient;
import Commande.Ligne;
import Visitors.PrePostVisitor;

public class XMLRapportCommandes implements PrePostVisitor {

    @Override
    public void preVisit(GroupeClient groupeClient) {

    }

    @Override
    public void preVisit(Client client) {

    }

    @Override
    public void preVisit(Commande commande) {

    }

    @Override
    public void postVisit(Ligne ligne) {

    }

    @Override
    public void postVisit(Commande commande) {

    }

    @Override
    public void postVisit(Client client) {

    }

    @Override
    public void postVisit(GroupeClient groupeClient) {

    }

    @Override
    public void preVisit(Ligne ligne) {

    }
}
