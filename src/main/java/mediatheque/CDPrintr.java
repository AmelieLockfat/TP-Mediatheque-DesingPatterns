package mediatheque;

public class CDPrintr extends  ItemPrinter{

    @Override
    public void visit(Book bk) { }

    @Override
    public void visit(CD cd) { cd.print(); }

}
