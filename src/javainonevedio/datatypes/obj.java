package javainonevedio.datatypes;

public class obj {
    public static void main(String[] args){
         Book book=new Book();
         book.price=100;
         book.name="classmate";
         book.write();
         Book book1=new Book(400,"V");
        System.out.println(book1.name);
        System.out.println(book1.price);

    }
}
