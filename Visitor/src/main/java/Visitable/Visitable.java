package Visitable;

import Visitors.Visitor;

public interface Visitable {
    void accept(Visitor visitor);
}
