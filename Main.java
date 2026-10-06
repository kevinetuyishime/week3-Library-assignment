public class Main {

    public static void main(String[] args) {

        // Create a book
        Book book = new Book(
                "Introduction to Java",
                "John Smith",
                "ISBN001"
        );

        // Create members
        Member publisher = new PublisherMember(
                "P001",
                "John",
                "ABC Publishers"
        );

        Member student = new StudentMember(
                "S001",
                "Alice",
                "University of Rwanda"
        );

        Member librarian = new LibrarianMember(
                "L001",
                "Kevin",
                "Library Department"
        );

        // Display book
        System.out.println(book);

        System.out.println();

        // Display members and fees
        System.out.println(publisher);
        System.out.println("Publisher fee: " + publisher.calculateFees());

        System.out.println();

        System.out.println(student);
        System.out.println("Student fee: " + student.calculateFees());

        System.out.println();

        System.out.println(librarian);
        System.out.println("Librarian fee: " + librarian.calculateFees());
    }
}