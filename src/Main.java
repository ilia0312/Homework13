public class Main {

    public static void main(String[] args) {
        Author Dostoevsky = new Author("Фёдор", "Достоевский");
        Book CrimeAndPunishment = new Book("Преступление и Наказание", Dostoevsky, 1866);
        {
            System.out.println(CrimeAndPunishment);
        }

        Author Gogol = new Author("Николай", "Гоголь");
        Book Auditor = new Book("Ревизор", Gogol, 1836);
        {
            System.out.println(Auditor);
        }

        CrimeAndPunishment.setAgePublisher(2015);
        {
            System.out.println(CrimeAndPunishment);
        }


    }

}