package hw.reader;

/*ФИО,
номер читательского билета,
факультет,
дата рождения,
телефон.
Методы takeBook(), returnBook().*/
public class Reader {
    private String fio;
    private int number;
    private String fakultet;
    private String data;
    private String phone;

    public Reader(String fio, int number, String fakultet, String data, String phone) {
        this.fio = fio;
        this.number = number;
        this.fakultet = fakultet;
        this.data = data;
        this.phone = phone;
    }

    public Reader() {

    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fio='" + fio + '\'' +
                ", number=" + number +
                ", fakultet='" + fakultet + '\'' +
                ", data='" + data + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    /* 7. Разработать программу, в которой создается массив объектов данного класса.
        8. Перегрузить методы takeBook(), returnBook():
            - takeBook, который будет принимать количество взятых книг.
    Выводит на консоль сообщение "Петров В. В. взял 3 книги".
            - takeBook, который будет принимать переменное количество названий книг.
    Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
            - takeBook, который будет принимать переменное количество объектов
    класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль
    сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".*/

    public void takeBook(int number) {
        System.out.println(this.fio + " взял " + number + " книги. ");

    }

    public void takeBook() {
        System.out.println(this.fio + " взял книги: ");
        for (){
            System.out.println();
        }
        System.out.println();
    }


    public void takeBook() {
        System.out.println(this.fio + " взял книги: ");
        for () {
            System.out.println(book.getName() + " - название книги, " + book.getAutor() + " - автор книги");
        }
        System.out.println();
    }

    public void returnBook(int number) {
        System.out.println(this.fio + " вернул " + number + " книги.");
    }

}
