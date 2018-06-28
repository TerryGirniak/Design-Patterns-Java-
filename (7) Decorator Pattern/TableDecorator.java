public abstract class TableDecorator implements Table{

    Table decoratedTable;

    TableDecorator(Table decoratedTable){
        this.decoratedTable = decoratedTable;
    }

    public void deck() {
        decoratedTable.deck();
    }

    public void tableLEgs() {
        decoratedTable.tableLegs();
    }

    public boolean ornaments() {
        return decoratedTable.ornaments();
    }

}
