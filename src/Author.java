import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
//    @GeneratedValue (strategy = GenerationType.TABLE)
    @Column(name = "Id")
    Integer id;
    @Column(name = "FirstName")
    String firstName;
//    @Transient
    @Column(name = "LastName")
    String lastName;
    @Column(name = "Age")
    int age;
    @Column(name = "Birthday")
    @Temporal(TemporalType.DATE)
    Date DOB;
    /*@Embedded
    Address address;*/
    @ElementCollection
    List<String> subject = new ArrayList<String>();

//    @OneToOne
//Book book;

//    @OneToMany(mappedBy = "author")
//    @OneToMany(cascade = CascadeType.PERSIST)
//    List<Book> booklist = new ArrayList<>();
    @ManyToMany(cascade = CascadeType.PERSIST)
    List<Book> booklist = new ArrayList<>();

    public List<Book> getBooklist() {
        return booklist;
    }

    public void setBooklist(List<Book> booklist) {
        this.booklist = booklist;
    }

/* public List<Book> getBooklist() {
        return booklist;
    }

    public void setBooklist(List<Book> booklist) {
        this.booklist = booklist;
    }*/

    /*public Book getBook() {
                return book;
            }

            public void setBook(Book book) {
                this.book = book;
            }
        */
    /* public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }
    */
    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
     return "Id: "+id+"\nFirst Name: "+firstName+"\nLast Name: "+lastName+"\nAge: "+age;
    }
}
