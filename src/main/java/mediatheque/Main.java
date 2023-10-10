package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();

        mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem( new CD(12, "Sergeant Peppers"));
        mediatheque.addItem( new CD(24, "Amélie can fly"));
        System.out.println("Catalogue");
        mediatheque.printCatalog();
        System.out.println("Only Books");
        mediatheque.printOnlyBooks();
        System.out.println("Only CDs");
        mediatheque.printOnlyCDs();
    }
}
