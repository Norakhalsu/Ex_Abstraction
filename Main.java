public class Main {
    public static void main(String[] args) {

        Book book1=new Book(" الرحلة ", 29.0," لإدوارد ");
        Book book2=new Book(" السيرة الذاتية", 15.0," لعبد الوهاب ");
        Movie movie1=new Movie(" المصير", 10.5," يوسف");
        Movie movie2=new Movie(" بلا ظل " ,11.0," ريما ");

        System.out.println(book1);
        System.out.println();
        System.out.println(book2);
        System.out.println();
        System.out.println(movie1);
        System.out.println();
        System.out.println(movie2);
    }
}