package Question1;

    public abstract class ComposantImpl implements Composant {
        private final String name;
        ComposantImpl(String name, Owner owner){
            this.name=name;
        }
        @Override
        public String getName() {
            return name;
        }
        @Override
        public Owner getOwner() {
            return getOwner();
        }
        @Override
        public void setOwner(Owner owner, Boolean recursive) {

        }
}
