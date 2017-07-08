import com.sun.scenario.effect.impl.state.LinearConvolveRenderState;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by krishan on 7/8/2017.
 */
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String bookName;
    /*@ManyToOne
Author author;
*/
    @ManyToMany(mappedBy = "booklist")
    List<Author> authorList = new ArrayList<>();

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    /* public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }
    */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
