package Commande;

import Visitable.PrePostVisitable;
import Visitors.PrePostVisitor;
import Commande.Client;
import java.util.HashMap;


public class GroupeClient implements PrePostVisitable {
    private String groupeclient;
    private HashMap<Integer,Client> clients = new HashMap();
    Integer a = null;


    GroupeClient(String groupeclient ){
        this.groupeclient=groupeclient;
    }
    void addClient(Client client ){
        clients.put(a,client);
    }
    @Override
    public void accept(PrePostVisitor visiteur) {


    }

}
