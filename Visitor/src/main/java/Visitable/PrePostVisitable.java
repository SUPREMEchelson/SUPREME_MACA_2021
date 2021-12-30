package Visitable;

import Visitors.PrePostVisitor;

public interface PrePostVisitable {
 void    accept(PrePostVisitor visiteur);

}
