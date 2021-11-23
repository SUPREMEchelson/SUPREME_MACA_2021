public class Ampoule implements State{
    Boolean allumer;
    Boolean state=false;

    @Override
    public Boolean allumer() {
        state=true;
        return state;
    }

    @Override
    public Boolean eteinte() {
        state=false;
        return state;
    }

    @Override
    public String toString() {
        return "Ampoule{" +
                ", state=" + state +
                '}';
    }
}
