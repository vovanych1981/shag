package hw.reader;

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Иванов И.И.", 1, "Мех", "01.01.2000", "111111");
        Reader reader2 = new Reader("Петров П.П.", 2, "Физ", "02.02.2000", "222222");
        Reader reader3 = new Reader("Сидоров С.С.", 3, "Хим", "03.03.2000", "333333");
        Reader[] readers = {reader1, reader2, reader3};

        Book book1 = new Book("Мушкетеры", "Дюма");
        Book book2 = new Book("Незнайка", "Носов");
        Book book3 = new Book("Шерлок Холмс", "Дойл");
        Book[] books = {book1, book2, book3};

        reader1.takeBook(3);
        reader2.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader3.takeBook(book1, book2, book3);

        reader1.returnBook(2);
        reader2.returnBook("Словарь");
        reader3.returnBook(book1);

    }
}
