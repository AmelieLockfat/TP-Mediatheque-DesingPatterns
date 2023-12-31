package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
			i.print();
	}
	
	public void printOnlyBooks() {
	BookPrinter bp = new BookPrinter() ;
	for (Item i : items) { i.accept(bp);}

	}

	public void printOnlyCDs() {CDPrintr cdp = new CDPrintr();
		for (Item i : items) { i.accept(cdp);}
	}

}
