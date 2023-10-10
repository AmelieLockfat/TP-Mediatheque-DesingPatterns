package mediatheque;

public class BookPrinter extends ItemPrinter {

    @Override
    public void visit(CD cd) {  }
    @Override
    public void visit(Book bk) { bk.print(); }

}
