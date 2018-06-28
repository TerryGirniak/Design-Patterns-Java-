public class GlassTableDecorator extends TableDecorator{

    public GlassTableDecorator(Table decoratedTable) {
        super(decoratedTable);
    }

    @Override
    public void deck() {
        decoratedTable.deck();
        setGlassDeck(decoratedTable);
    }

    @Override
    public void tableLegs() {
        decoratedTable.deck();
        setGlassTableLegs(decoratedTable);
    }

    @Override
    public boolean ornaments() {
        decoratedTable.ornaments();
        return setOrnaments(decoratedTable);
    }

    private void setGlassDeck(Table decoratedTable){
        System.out.println("...with a glass edges \n");
    }

    private void setGlassTableLegs(Table decoratedTable){
        System.out.println("...with glass covering \n");
    }

    private boolean setOrnaments(Table decoratedTable){
        return true;
    }
}
