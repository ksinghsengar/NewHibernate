import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import javax.persistence.Entity;;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.Date;

public class AuthorMain {
/*

    void createQuery(String fname, String lname, int age, java.util.Date date) {
        SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Author author = new Author();
        author.setFirstName(fname);
        author.setLastName(lname);
        author.setAge(age);
        author.setDOB(date);
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        session.close();

    }
*/

   /* void updateQuery() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Author author = session.get(Author.class,3);
        author.setFirstName("Shrey");
        session.update(author);
        session.getTransaction().commit();
        session.close();

    }*/

  /* void readQuery() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Author author = session.get(Author.class,3);
        session.getTransaction().commit();
        session.close();
        System.out.println(author);

    }*/

   /*void deleteQuery() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Author author = session.get(Author.class,4);
        session.delete(author);
        session.getTransaction().commit();
        session.close();
        System.out.println(author);

    }*/

  /* void createQuery(String fname,String lname,int age, java.util.Date dob) {
        SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Author author = new Author();
        author.setFirstName(fname);
        author.setLastName(lname);
        author.setAge(age);
        author.setDOB(dob);
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        session.close();

    }*/

   /* void insertQuery(String fname, String lname, int age, java.util.Date date) {
        SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Author author = new Author();
        author.setFirstName(fname);
        author.setLastName(lname);
        author.setAge(age);
        author.setDOB(date);
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }*/


   /* void createQuery(String fname, String lname, int age, java.util.Date date,List<String> subject) {
        SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Author author = new Author();
        author.setFirstName(fname);
        author.setLastName(lname);
        author.setAge(age);
        author.setDOB(date);
        author.setSubject(subject);
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        session.close();

    }
*/

   /* void createQuery(String fname, String lname, int age, java.util.Date date,List<String> subject,Book book) {
        SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Author author = new Author();
        author.setFirstName(fname);
        author.setLastName(lname);
        author.setAge(age);
        author.setDOB(date);
        author.setSubject(subject);
        author.setBook(book);
        session.beginTransaction();
        session.save(author);
        session.save(book);
        session.getTransaction().commit();
        session.close();

    }*/

   /* void createQuery(String fname, String lname, int age, java.util.Date date,List<String> subject) {
        SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Author author = new Author();
        author.setFirstName(fname);
        author.setLastName(lname);
        author.setAge(age);
        author.setDOB(date);
        author.setSubject(subject);
        Book book1 = new Book();
        book1.setBookName("Introduction to Algorithms");
        book1.setAuthor(author);
        Book book2 = new Book();
        book2.setBookName("Introduction to C++");
        book2.setAuthor(author);
        author.getBooklist().add(book1);
        author.getBooklist().add(book2);
        session.beginTransaction();
        session.persist(author);
//        session.save(author);
        *//*session.save(book1);
        session.save(book2);*//*
        session.getTransaction().commit();
        session.close();

    }
*/

    void createQuery(String fname, String lname, int age, java.util.Date date,List<String> subject) {
        SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Author author = new Author();
        author.setFirstName(fname);
        author.setLastName(lname);
        author.setAge(age);
        author.setDOB(date);
        author.setSubject(subject);
        Book book1 = new Book();
        book1.setBookName("Introduction to Algorithms");
        Book book2 = new Book();
        book2.setBookName("Introduction to C++");
        author.getBooklist().add(book1);
        author.getBooklist().add(book2);

        Author author2 = new Author();
        author2.setFirstName("Shrey");
        author2.setLastName("Singh");
        author2.setAge(23);
        author2.setDOB(date);
        author2.setSubject(subject);
        author2.getBooklist().add(book1);
        session.beginTransaction();
        session.persist(author);
        session.persist(author2);
//        session.save(author);
        /*session.save(book1);
        session.save(book2);*/
        session.getTransaction().commit();
        session.close();

    }


}
class AuthorRunMain {
    public static void main(String[] args) {
        AuthorMain authorMain = new AuthorMain();

        java.util.Date date = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = simpleDateFormat.parse("1996-02-05");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        List<String> subject = new ArrayList<>();
        subject.add("Maths");
        subject.add("English");
        subject.add("Hindi");


//        authorMain.createQuery("Shrey","Singh",24,date);
        authorMain.createQuery("Diksha","Singh",22,date,subject);
    }
}


/* String[] dob = {"1993-09-03", "1996-07-10", "1966-09-10", "1960-05-31"};
        String[] fname = {"Kishan", "Ankita", "Adarsh", "Ranvir"};
        String[] lname = {"Kumar", "Singh", "Kumari", "Singh"};
        int[] age = {25, 22, 50, 57};
        java.util.Date date = null;
        for (int i = 0; i < dob.length; i++) {

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                date = simpleDateFormat.parse(dob[i]);
            } catch (ParseException e) {
                e.printStackTrace();
            }

//        authorMain.createQuery("Shrey","Singh",24,date);
//        authorMain.createQuery("Diksha","Singh",22);
//        authorMain.createQuery("Ankita","Singh",22);
//        authorMain.createQuery("Naman","Singh",20);
//        authorMain.updateQuery();
//        authorMain.readQuery();
//        authorMain.deleteQuery();

            authorMain.insertQuery(fname[i], lname[i], age[i], date);
        }*/