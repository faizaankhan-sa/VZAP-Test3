import com.vzap.ChildrenBook.ChildrenBook;
import com.vzap.MedicalBook.MedicalBooks;
import com.vzap.author.Author;
import com.vzap.books.Books;

public class BookSelf {
    private Books[] booksOnShelf;

    public BookSelf() {
        booksOnShelf = new Books[9];

        Author author1 = new Author("Edid", "Blighton", 'F', "12345");
        ChildrenBook book1 = new ChildrenBook("Noddy goes home", "ISBN:234667", "Fiction", author1, "Children");
        booksOnShelf[0] = book1;

        Author author2 = new Author("Shaun", "Tan", 'M', "777888");
        ChildrenBook book2 = new ChildrenBook("The Arrival", "ISBN:999AD87", "Fiction", author2, "Children");
        booksOnShelf[1] = book2;

        Author author3 = new Author("Edrich", "Louise", 'F', "45025689");
        ChildrenBook book3 = new ChildrenBook("The Birchbark House", "ISBN:00Gh2", "Fiction", author3, "Children");
        booksOnShelf[2] = book3;

        Author author4 = new Author("Crews", "Donald", 'M', "3112009");
        ChildrenBook book4 = new ChildrenBook("Freight Train", "ISBN:7GFB0032", "Fiction", author4, "Children");
        booksOnShelf[3] = book4;

        Author author5 = new Author("Tolkien", "J.R.R", 'M', "99775533");
        ChildrenBook book5 = new ChildrenBook("The Hobbit", "ISBN:0006611", "Fiction", author5, "Children");
        booksOnShelf[4] = book5;

        Author author6 = new Author("Shenasa", "Mohammed", 'F', "45025689");
        MedicalBooks book6 = new MedicalBooks("Cardiac Mapping", "ISBN: 87609","cardiology", author6, "cardiology");
        booksOnShelf[5] = book6;

        Author author7 = new Author("James", "William", 'M', "320001577");
        MedicalBooks book7 = new MedicalBooks("Diseases of skin", "ISBN:472412","reference", author7, "dermatology");
        booksOnShelf[6] = book7;

        Author author8 = new Author("Matar", "Ghassan", 'M', "940311006");
        MedicalBooks book8 = new MedicalBooks("Clinical Cases in Micro Biology", "ISBN: 2019X2132","reference", author8, "microbiology");
        booksOnShelf[7] = book8;

        Author author9 = new Author("Yanof", "Myron", 'M', "8204305004091");
        MedicalBooks book9 = new MedicalBooks("Advances in Opthamology", "ISBN: 1111A2233","refernce ", author9, "opthamology");
        booksOnShelf[8] = book9;


    }

    public void run() {
        for (Books book : booksOnShelf) {
            book.printDetails();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BookSelf bookSelf = new BookSelf();
        bookSelf.run();
    }
}

