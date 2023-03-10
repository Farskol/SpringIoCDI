package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook(){
        System.out.println("Мы берём книгу из UniLibrary ");
        System.out.println("-------------------------------------------------------");
    }

    public void returnBook(){
        System.out.println("Мы возращаем книгу в UnitLibrary");
        System.out.println("-------------------------------------------------------");
    }


    public void getMagazine(){
        System.out.println("Мы берём журнал из UniLibrary");
        System.out.println("-------------------------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("Мы возращаем журнал в UniLibrary");
        System.out.println("-------------------------------------------------------");
    }

    public void addBook(String person_name, Book book){
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("-------------------------------------------------------");
    }

    public void addMagazine(){
        System.out.println("Мы добавляем журнал в UniLibrary");
        System.out.println("-------------------------------------------------------");
    }
}
